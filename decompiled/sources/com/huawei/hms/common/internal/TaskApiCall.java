package com.huawei.hms.common.internal;

import a.fuo0;
import a.u5a;
import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45802a;
    private final String b;
    private Parcelable c;
    private String d;
    private u5a e;
    private int f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f = 1;
        this.f45802a = str;
        this.b = str2;
        this.c = null;
        this.d = null;
    }

    public abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var);

    public int getApiLevel() {
        return this.f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.c;
    }

    public String getRequestJson() {
        return this.b;
    }

    public u5a getToken() {
        return null;
    }

    public String getTransactionId() {
        return this.d;
    }

    public String getUri() {
        return this.f45802a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        HMSLog.i("TaskApiCall", "doExecute, uri:" + this.f45802a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.d);
        doExecute(clientt, responseErrorCode, str, fuo0Var);
    }

    public void setApiLevel(int i) {
        this.f = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.c = parcelable;
    }

    public void setTransactionId(String str) {
        this.d = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f = 1;
        this.f45802a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.f45802a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
        this.f = i;
    }

    public void setToken(u5a u5aVar) {
    }
}
