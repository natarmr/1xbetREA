package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a.cu;
import a.eps0;
import a.llo;
import a.pwb0;
import a.q55;
import a.wdu;
import a.wnt0;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f45458a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(RemoteMessageConst.Notification.PRIORITY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        eps0.b(getApplicationContext());
        cu cuVarA = q55.a();
        cuVarA.p(string);
        cuVarA.d = pwb0.b(i);
        if (string2 != null) {
            cuVarA.c = Base64.decode(string2, 0);
        }
        wdu wduVar = eps0.a().d;
        ((Executor) wduVar.f).execute(new wnt0(wduVar, cuVarA.c(), i2, new llo(this, jobParameters, (byte) 12)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
