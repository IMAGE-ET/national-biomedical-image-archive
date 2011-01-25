package gov.nih.nci.cagrid.enumeration.common;

import java.rmi.RemoteException;

/** 
 * This class is autogenerated, DO NOT EDIT.
 * 
 * This interface represents the API which is accessible on the grid service from the client. 
 * 
 * @created by Introduce Toolkit version 1.4
 * 
 */
public interface CaGridEnumerationI {

  public org.xmlsoap.schemas.ws._2004._09.enumeration.PullResponse pullOp(org.xmlsoap.schemas.ws._2004._09.enumeration.Pull params) throws RemoteException ;

  public org.xmlsoap.schemas.ws._2004._09.enumeration.RenewResponse renewOp(org.xmlsoap.schemas.ws._2004._09.enumeration.Renew params) throws RemoteException ;

  public org.xmlsoap.schemas.ws._2004._09.enumeration.GetStatusResponse getStatusOp(org.xmlsoap.schemas.ws._2004._09.enumeration.GetStatus params) throws RemoteException ;

  public void releaseOp(org.xmlsoap.schemas.ws._2004._09.enumeration.Release params) throws RemoteException ;

}

