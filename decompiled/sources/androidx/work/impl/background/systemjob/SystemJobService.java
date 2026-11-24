package androidx.work.impl.background.systemjob;

import a.afm0;
import a.cpv0;
import a.ea70;
import a.ezb0;
import a.gy2;
import a.h6m0;
import a.hny;
import a.ia3;
import a.jf4;
import a.kng0;
import a.okt0;
import a.wv00;
import a.xov0;
import a.zjo;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements zjo {
    public static final String e = wv00.h("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cpv0 f45418a;
    public final HashMap b = new HashMap();
    public final ea70 c = new ea70((byte) 3);
    public okt0 d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        jf4.n(kng0.l("Cannot invoke ", str, " on a background thread"));
    }

    public static xov0 b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new xov0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // a.zjo
    public final void c(xov0 xov0Var, boolean z) {
        a("onExecuted");
        JobParameters jobParameters = (JobParameters) this.b.remove(xov0Var);
        this.c.c(xov0Var);
        if (jobParameters != null) {
            wv00.f().a(e, xov0Var.f41241a + " executed on JobScheduler");
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            cpv0 cpv0VarD = cpv0.d(getApplicationContext());
            this.f45418a = cpv0VarD;
            ezb0 ezb0Var = cpv0VarD.f;
            this.d = new okt0(ezb0Var, cpv0VarD.d);
            ezb0Var.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                wv00.f().j(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                hny.q("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        cpv0 cpv0Var = this.f45418a;
        if (cpv0Var != null) {
            ezb0 ezb0Var = cpv0Var.f;
            synchronized (ezb0Var.k) {
                ezb0Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        cpv0 cpv0Var = this.f45418a;
        String str = e;
        if (cpv0Var == null) {
            wv00.f().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        xov0 xov0VarB = b(jobParameters);
        if (xov0VarB == null) {
            wv00.f().d(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.b;
        if (map.containsKey(xov0VarB)) {
            wv00.f().a(str, "Job is already being executed by SystemJobService: " + xov0VarB);
            return false;
        }
        wv00.f().a(str, "onStartJob for " + xov0VarB);
        map.put(xov0VarB, jobParameters);
        afm0 afm0Var = new afm0();
        if (jobParameters.getTriggeredContentUris() != null) {
            afm0Var.c = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            afm0Var.b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ia3.p(jobParameters);
        }
        this.d.j(this.c.e(xov0VarB), afm0Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.f45418a == null) {
            wv00.f().a(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        xov0 xov0VarB = b(jobParameters);
        if (xov0VarB == null) {
            wv00.f().d(e, "WorkSpec id not found!");
            return false;
        }
        wv00.f().a(e, "onStopJob for " + xov0VarB);
        this.b.remove(xov0VarB);
        h6m0 h6m0VarC = this.c.c(xov0VarB);
        if (h6m0VarC != null) {
            int iG = Build.VERSION.SDK_INT >= 31 ? gy2.g(jobParameters) : -512;
            okt0 okt0Var = this.d;
            okt0Var.getClass();
            okt0Var.k(h6m0VarC, iG);
        }
        ezb0 ezb0Var = this.f45418a.f;
        String str = xov0VarB.f41241a;
        synchronized (ezb0Var.k) {
            zContains = ezb0Var.i.contains(str);
        }
        return !zContains;
    }
}
