package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a.cu;
import a.d12;
import a.eps0;
import a.pwb0;
import a.q55;
import a.wdu;
import a.wnt0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f45457a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(RemoteMessageConst.Notification.PRIORITY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        eps0.b(context);
        cu cuVarA = q55.a();
        cuVarA.p(queryParameter);
        cuVarA.d = pwb0.b(iIntValue);
        if (queryParameter2 != null) {
            cuVarA.c = Base64.decode(queryParameter2, 0);
        }
        wdu wduVar = eps0.a().d;
        ((Executor) wduVar.f).execute(new wnt0(wduVar, cuVarA.c(), i, new d12((byte) 0)));
    }
}
