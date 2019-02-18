package com.guzon.serverservice;

/**
 * Created by משה on 17/02/2019.
 */

public class RequestBrodcastManager {
    public final static int TYPE_REQUEST = 1;
    public final static int TYPE_GET_REQUEST = 2;
    public final static int TYPE_UID_ARRAY = 3;
    public final static int TYPE_ASK_UID = 4;
    public final static int TYPE_HAS_UID = 5;

    public final static String EXTRA_REQUEST = "Request";
    public final static String EXTRA_REQUEST_UID = "RequestUid";
    public final static String EXTRA_UID_ARRAY = "UidArray";
    public final static String EXTRA_TARGET_ID = "TargetId";

    public final static String Action_REQUEST = "com.guzon.serverservice.REQUEST";
    public final static String Action_GET_REQUEST = "com.guzon.serverservice.GET_REQUEST";
    public final static String Action_UID_ARRAY = "com.guzon.serverservice.UID_ARRAY";
    public final static String Action_ASK_UID = "com.guzon.serverservice.ASK_UID";
    public final static String Action_HAS_UID = "com.guzon.serverservice.HAS_UID";
}
