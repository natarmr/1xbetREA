package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.share.AppsFlyerConsent;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1eSDK {
    public String AFKeystoreWrapper;
    public String AFLogger;
    public String AFLoggerLogLevel;
    public String AppsFlyerLib;
    public Boolean afDebugLog;
    public boolean afErrorLog;
    public boolean afInfoLog;
    public boolean afWarnLog;
    public String clearUserPii;
    public String d;
    public String e;
    public String force;
    public boolean getEntries;
    public String getLevel;
    public String getOutOfStore;
    public String getSdkVersion;
    public Long i;
    public String registerClient;
    public boolean setAndroidIdData;
    public boolean setCustomerUserId;
    public AppsFlyerConsent setImeiData;
    public AFd1nSDK setOaidData;
    public AFc1rSDK setUserEmail;
    public boolean setUserFirstName;
    public String setUserLastName;
    public boolean setUserPhone;
    public String stop;
    public String unregisterClient;
    public AFh1qSDK updateServerUninstallToken;
    public AFb1qSDK v;
    public String valueOf;
    public String values;
    public AFb1rSDK w;
    public AFLogger.LogLevel enableTCFDataCollection = AFLogger.LogLevel.NONE;
    public long getInstance = -1;
    public long onPause = -1;
    public long setDebugLog = 5000;

    public final synchronized void registerClient(AFd1nSDK aFd1nSDK) {
        this.setOaidData = aFd1nSDK;
    }
}
