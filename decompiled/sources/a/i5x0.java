package a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class i5x0 extends u5x0 {
    public final AlarmManager e;
    public q4x0 f;
    public Integer g;

    public i5x0(m6x0 m6x0Var) {
        super(m6x0Var);
        this.e = (AlarmManager) ((kxw0) this.b).f19080a.getSystemService("alarm");
    }

    @Override // a.u5x0
    public final void p1() {
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            Context context = ((kxw0) this.b).f19080a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), fow0.f9904a));
        }
        r1();
    }

    public final void q1() {
        n1();
        kxw0 kxw0Var = (kxw0) this.b;
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.o.a("Unscheduling upload");
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            Context context = kxw0Var.f19080a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), fow0.f9904a));
        }
        q4x0 q4x0Var = this.f;
        if (q4x0Var == null) {
            q4x0Var = new q4x0(this, this.c.l, (byte) 1);
            this.f = q4x0Var;
        }
        q4x0Var.c();
        r1();
    }

    public final void r1() {
        JobScheduler jobScheduler = (JobScheduler) ((kxw0) this.b).f19080a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(s1());
        }
    }

    public final int s1() {
        Integer numValueOf = this.g;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf("measurement".concat(String.valueOf(((kxw0) this.b).f19080a.getPackageName())).hashCode());
            this.g = numValueOf;
        }
        return numValueOf.intValue();
    }
}
