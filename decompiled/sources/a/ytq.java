package a;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ytq implements Runnable {
    public static final String e = wv00.h("ForceStopRunnable");
    public static final long f = 315360000000L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43233a;
    public final cpv0 b;
    public final o470 c;
    public int d = 0;

    public ytq(Context context, cpv0 cpv0Var) {
        this.f43233a = context.getApplicationContext();
        this.b = cpv0Var;
        this.c = cpv0Var.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f1  */
    public final void a() throws Throwable {
        boolean z;
        o470 o470Var = this.c;
        cpv0 cpv0Var = this.b;
        wsd wsdVar = cpv0Var.b;
        o470 o470Var2 = cpv0Var.g;
        WorkDatabase workDatabase = cpv0Var.c;
        String str = x9o0.e;
        Context context = this.f43233a;
        JobScheduler jobSchedulerB = fby.b(context);
        ArrayList<JobInfo> arrayListC = x9o0.c(context, jobSchedulerB);
        List list = (List) kpb.h0(workDatabase.v().f31856a, true, false, new rgn0((byte) 21));
        HashSet hashSet = new HashSet(arrayListC != null ? arrayListC.size() : 0);
        if (arrayListC != null && !arrayListC.isEmpty()) {
            for (JobInfo jobInfo : arrayListC) {
                xov0 xov0VarF = x9o0.f(jobInfo);
                if (xov0VarF != null) {
                    hashSet.add(xov0VarF.f41241a);
                } else {
                    x9o0.a(jobSchedulerB, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    wv00.f().a(x9o0.e, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                upv0 upv0VarY = workDatabase.y();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    upv0VarY.g(-1L, (String) it2.next());
                }
                workDatabase.q();
                workDatabase.m();
            } catch (Throwable th) {
                workDatabase.m();
                throw th;
            }
        }
        upv0 upv0VarY2 = workDatabase.y();
        ipv0 ipv0VarX = workDatabase.x();
        workDatabase.b();
        try {
            List<ppv0> list2 = (List) kpb.h0(upv0VarY2.f36087a, true, false, new ejv0((byte) 14));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (ppv0 ppv0Var : list2) {
                    zov0 zov0Var = zov0.f44733a;
                    String str2 = ppv0Var.f27390a;
                    upv0VarY2.j(zov0Var, str2);
                    upv0VarY2.k(-512, str2);
                    upv0VarY2.g(-1L, str2);
                }
            }
            kpb.h0(ipv0VarX.f15182a, false, true, new ejv0((byte) 6));
            workDatabase.q();
            workDatabase.m();
            boolean z3 = z2 || z;
            Long lA = ((WorkDatabase) o470Var2.f24619a).t().a("reschedule_needed");
            String str3 = e;
            if (lA != null && lA.longValue() == 1) {
                wv00.f().a(str3, "Rescheduling Workers.");
                cpv0Var.g();
                o470Var2.getClass();
                usb0 usb0Var = new usb0("reschedule_needed", 0L);
                vsb0 vsb0VarT = ((WorkDatabase) o470Var2.f24619a).t();
                kpb.h0(vsb0VarT.f37942a, false, true, new zga0((Object) vsb0VarT, (Object) usb0Var, (byte) 21));
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                int i2 = i >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
                if (i < 30) {
                    if (broadcast == null) {
                        c(context);
                        wv00.f().a(str3, "Application was force-stopped, rescheduling.");
                        cpv0Var.g();
                        s2m0 s2m0Var = wsdVar.d;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        o470Var.getClass();
                        usb0 usb0Var2 = new usb0("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        vsb0 vsb0VarT2 = ((WorkDatabase) o470Var.f24619a).t();
                        kpb.h0(vsb0VarT2.f37942a, false, true, new zga0((Object) vsb0VarT2, (Object) usb0Var2, (byte) 21));
                        return;
                    }
                    if (z3) {
                        wv00.f().a(str3, "Found unfinished work, scheduling it.");
                        m2h0.b(wsdVar, workDatabase, cpv0Var.e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = ((WorkDatabase) o470Var.f24619a).t().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        ApplicationExitInfo applicationExitInfoE = a7.e(historicalProcessExitReasons.get(i3));
                        if (applicationExitInfoE.getReason() == 10 && applicationExitInfoE.getTimestamp() >= jLongValue) {
                            wv00.f().a(str3, "Application was force-stopped, rescheduling.");
                            cpv0Var.g();
                            s2m0 s2m0Var2 = wsdVar.d;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            o470Var.getClass();
                            usb0 usb0Var3 = new usb0("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            vsb0 vsb0VarT3 = ((WorkDatabase) o470Var.f24619a).t();
                            kpb.h0(vsb0VarT3.f37942a, false, true, new zga0((Object) vsb0VarT3, (Object) usb0Var3, (byte) 21));
                            return;
                        }
                    }
                }
                if (z3) {
                    wv00.f().a(str3, "Found unfinished work, scheduling it.");
                    m2h0.b(wsdVar, workDatabase, cpv0Var.e);
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                wv00.f().i(e, str3, "Ignoring exception");
            } catch (SecurityException e3) {
                e = e3;
                wv00.f().i(e, str3, "Ignoring exception");
            }
        } catch (Throwable th2) {
            workDatabase.m();
            throw th2;
        }
    }

    public final boolean b() {
        wsd wsdVar = this.b.b;
        wsdVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = e;
        if (zIsEmpty) {
            wv00.f().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = zyb0.a(this.f43233a, wsdVar);
        wv00.f().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f43233a;
        cpv0 cpv0Var = this.b;
        wsd wsdVar = cpv0Var.b;
        try {
            if (!b()) {
                cpv0Var.f();
                return;
            }
            boolean zN = tnq0.n(context);
            String str = e;
            if (!zN) {
                wv00.f().d(str, "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                wsdVar.getClass();
                throw illegalStateException;
            }
            while (true) {
                try {
                    iom0.p(context);
                    wv00.f().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        cpv0Var.f();
                        return;
                    } catch (SQLiteException e2) {
                        this.d++;
                        if (this.d >= 3) {
                            if (!(e2 instanceof SQLiteAccessPermException) && !(e2 instanceof SQLiteCantOpenDatabaseException) && !(e2 instanceof SQLiteConstraintException) && !(e2 instanceof SQLiteDatabaseCorruptException) && !(e2 instanceof SQLiteDatabaseLockedException) && !(e2 instanceof SQLiteDiskIOException) && !(e2 instanceof SQLiteFullException) && !(e2 instanceof SQLiteTableLockedException)) {
                                throw e2;
                            }
                            wv00.f().e(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            wsdVar.getClass();
                            throw illegalStateException2;
                        }
                        long j = ((long) this.d) * 300;
                        wv00.f().c(str, "Retrying after " + j, e2);
                        try {
                            Thread.sleep(((long) this.d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    wv00.f().d(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    wsdVar.getClass();
                    throw illegalStateException3;
                }
            }
        } catch (Throwable th) {
            cpv0Var.f();
            throw th;
        }
    }
}
