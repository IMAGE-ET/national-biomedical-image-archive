package gov.nih.nci.nbia.deletion;

import gov.nih.nci.nbia.deletion.DeletionDisplayObject;

import java.util.List;
import java.util.Map;

/**
 * This is an interface for Image Deletion Service. It declares API for this service.
 * @author zhoujim
 *
 */
public interface ImageDeletionService {
	/*
	 * Remove all series which are marked as deleted
	 */
	public Map<String, List<String>> removeSeries(String str) throws Exception;
	/**
	 * Recording all image files from all deleting series
	 * @param files
	 */

	public void setImageFileNames(List<String> files);
	/**
	 * recording all annotation files from all deleting series if they have.
	 * @param files
	 */
	public void setAnnotationFile(List<String> files);
	
	/**
	 * When online deletion page displays, this list will hold all information
	 * that need to display on GUI
	 * @return
	 */
	public List<DeletionDisplayObject> getDeletionDisplayObject();
}