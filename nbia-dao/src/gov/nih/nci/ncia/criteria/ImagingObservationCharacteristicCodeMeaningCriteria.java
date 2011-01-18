package gov.nih.nci.ncia.criteria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import gov.nih.nci.ncia.querystorage.QueryAttributeWrapper;


public class ImagingObservationCharacteristicCodeMeaningCriteria extends MultipleValuePersistentCriteria
                                                                 implements Serializable {

    public ImagingObservationCharacteristicCodeMeaningCriteria() {
    }


    public Collection<String> getImagingObservationCharacteristicCodeMeaningNames() {
        return imagingObservationCharacteristicCodeMeaningNames;
    }

    public void setImagingObservationCharacteristicCodeMeaningNames(Collection<String> codeMeaningNames) {
        for (String codeMeaningName : codeMeaningNames) {
            getCreateCollectionObjects().add(codeMeaningName);
        }
    }


    public void addValueFromQueryAttribute(QueryAttributeWrapper attr) {
    	this.getCreateCollectionObjects().add(attr.getAttributeValue());
    }


    /////////////////////////////////PROTECTED//////////////////////////////////////

    protected Collection<String> getMultipleValues() {
        return getImagingObservationCharacteristicCodeMeaningNames();
    }

    /////////////////////////////PRIVATE//////////////////////////////////
    private Collection<String> imagingObservationCharacteristicCodeMeaningNames;

    private Collection<String> getCreateCollectionObjects() {
        if (imagingObservationCharacteristicCodeMeaningNames == null) {
        	imagingObservationCharacteristicCodeMeaningNames = new ArrayList<String>();
        }

        return imagingObservationCharacteristicCodeMeaningNames;
    }

}