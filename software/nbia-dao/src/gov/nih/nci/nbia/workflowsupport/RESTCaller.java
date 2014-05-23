package gov.nih.nci.nbia.workflowsupport;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.client.params.*;
import org.apache.http.impl.client.*;
import org.apache.http.client.utils.URIBuilder;
import java.util.*;
import java.net.URLEncoder;
public class RESTCaller {

    public static void requestNewSeriesWorkflow(WorkflowNewSeriesDTO workflowDTO) throws Exception
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append(workflowDTO.getwDTO().getUrl()).append("?");
    	sb.append("collection=").append(URLEncoder.encode(workflowDTO.getwDTO().getCollection(), "UTF-8")).append("&");
    	sb.append("site=").append(URLEncoder.encode(workflowDTO.getwDTO().getSite(), "UTF-8")).append("&");
    	sb.append("seriesUID=").append(URLEncoder.encode(workflowDTO.getSeriesUID(), "UTF-8")).append("&");
    	sb.append("patientUID=").append(URLEncoder.encode(workflowDTO.getPatientUID(), "UTF-8"));
    	restCall(sb.toString());
    }
    public static void requestVisibilityUpdateWorkflow(WorkflowVisibilityUpdateDTO workflowDTO) throws Exception
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append(workflowDTO.getwDTO().getUrl()).append("?");
    	sb.append("collection=").append(URLEncoder.encode(workflowDTO.getwDTO().getCollection(), "UTF-8")).append("&");
    	sb.append("site=").append(URLEncoder.encode(workflowDTO.getwDTO().getSite(), "UTF-8")).append("&");
    	sb.append("seriesUID=").append(URLEncoder.encode(workflowDTO.getSeriesUID(), "UTF-8")).append("&");
    	sb.append("patientUID=").append(URLEncoder.encode(workflowDTO.getPatientUID(), "UTF-8")).append("&");
    	sb.append("visibility=").append(URLEncoder.encode(workflowDTO.getNewVisibility(), "UTF-8"));
    	restCall(sb.toString());
    }
	private static void restCall(String urlString)
	{
        HttpClient client = null;
        HttpGet getMethod = null;
        int responseCode = -1;
        byte[] responseStream = null;
        try
        {
        	
            // Creating the GetMethod instance
            getMethod = new HttpGet(urlString);
 
            // Retries to establish a successful connection the specified number
            // of times if the initial attempts are not successful.
            //getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                  //  new DefaultHttpMethodRetryHandler(1, false));
            getMethod.getParams().setParameter("http.socket.timeout", new Integer(5000));

 
            // Creating an HttpClient instance
            client = new DefaultHttpClient();
 

            // Sets the user-agent for the client instance
            client.getParams().setParameter("http.useragent", "<USER_AGENT>");
 
            // Sends the GET request and gets the response
            client.execute(getMethod);
    

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            getMethod.releaseConnection();
            client = null;
        }
    }

}
