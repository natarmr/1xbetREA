package a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes2.dex */
public final class o1x0 extends etw0 {
    public JobScheduler d;

    @Override // a.etw0
    public final boolean o1() {
        return true;
    }

    public final void p1(long j) {
        kxw0 kxw0Var = (kxw0) this.b;
        n1();
        m1();
        JobScheduler jobScheduler = this.d;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(kxw0Var.f19080a.getPackageName())).hashCode()) != null) {
            uuw0 uuw0Var = kxw0Var.f;
            kxw0.g(uuw0Var);
            uuw0Var.o.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iQ1 = q1();
        if (iQ1 != 2) {
            uuw0 uuw0Var2 = kxw0Var.f;
            kxw0.g(uuw0Var2);
            uuw0Var2.o.b(esw0.m(iQ1), "[sgtm] Not eligible for Scion upload");
            return;
        }
        uuw0 uuw0Var3 = kxw0Var.f;
        kxw0.g(uuw0Var3);
        uuw0Var3.o.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(kxw0Var.f19080a.getPackageName())).hashCode(), new ComponentName(kxw0Var.f19080a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.d;
        s0x.H(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        uuw0 uuw0Var4 = kxw0Var.f;
        kxw0.g(uuw0Var4);
        uuw0Var4.o.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int q1() {
        kxw0 kxw0Var = (kxw0) this.b;
        n1();
        m1();
        if (this.d == null) {
            return 7;
        }
        Boolean boolZ1 = kxw0Var.d.z1("google_analytics_sgtm_upload_enabled");
        if (!(boolZ1 == null ? false : boolZ1.booleanValue())) {
            return 8;
        }
        if (kxw0Var.k().k < 119000) {
            return 6;
        }
        if (x6x0.H1(kxw0Var.f19080a)) {
            return !kxw0Var.i().s1() ? 5 : 2;
        }
        return 3;
    }
}
