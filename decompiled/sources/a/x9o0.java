package a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class x9o0 implements j2h0 {
    public static final String e = wv00.h("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40518a;
    public final JobScheduler b;
    public final w9o0 c;
    public final WorkDatabase d;

    public x9o0(Context context, WorkDatabase workDatabase, wsd wsdVar) {
        JobScheduler jobSchedulerB = fby.b(context);
        w9o0 w9o0Var = new w9o0(context, wsdVar.d);
        this.f40518a = context;
        this.b = jobSchedulerB;
        this.c = w9o0Var;
        this.d = workDatabase;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            wv00.f().e(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = fby.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static xov0 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new xov0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // a.j2h0
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.f40518a;
        JobScheduler jobScheduler = this.b;
        ArrayList<JobInfo> arrayListC = c(context, jobScheduler);
        if (arrayListC == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListC) {
                xov0 xov0VarF = f(jobInfo);
                if (xov0VarF != null && str.equals(xov0VarF.f41241a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            wv00.f().a(e, "Cancelling work ID " + str + ", Job ID " + iIntValue);
            a(jobScheduler, iIntValue);
        }
        s9o0 s9o0VarV = this.d.v();
        s9o0VarV.getClass();
        str.getClass();
        kpb.h0(s9o0VarV.f31856a, false, true, new ka6(str, (byte) 16));
    }

    @Override // a.j2h0
    public final void d(ppv0... ppv0VarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.d;
        jru jruVar = new jru((Object) workDatabase, (byte) 19);
        for (ppv0 ppv0Var : ppv0VarArr) {
            workDatabase.b();
            try {
                upv0 upv0VarY = workDatabase.y();
                String str = ppv0Var.f27390a;
                ppv0 ppv0VarE = upv0VarY.e(str);
                String str2 = e;
                if (ppv0VarE == null) {
                    wv00.f().j(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.q();
                } else if (ppv0VarE.b != zov0.f44733a) {
                    wv00.f().j(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.q();
                } else {
                    xov0 xov0VarK = jpm0.k(ppv0Var);
                    int i = xov0VarK.b;
                    String str3 = xov0VarK.f41241a;
                    s9o0 s9o0VarV = workDatabase.v();
                    s9o0VarV.getClass();
                    str3.getClass();
                    r9o0 r9o0Var = (r9o0) kpb.h0(s9o0VarV.f31856a, true, false, new e6n((byte) 2, i, str3));
                    if (r9o0Var != null) {
                        iIntValue = r9o0Var.c;
                    } else {
                        Object objO = ((WorkDatabase) jruVar.b).o(new hrd(jruVar, (byte) 3));
                        objO.getClass();
                        iIntValue = ((Number) objO).intValue();
                    }
                    if (r9o0Var == null) {
                        r9o0 r9o0Var2 = new r9o0(str3, i, iIntValue);
                        s9o0 s9o0VarV2 = workDatabase.v();
                        s9o0VarV2.getClass();
                        kpb.h0(s9o0VarV2.f31856a, false, true, new itn0(s9o0VarV2, r9o0Var2, (byte) 5));
                    }
                    g(ppv0Var, iIntValue);
                    workDatabase.q();
                }
                workDatabase.m();
            } catch (Throwable th) {
                workDatabase.m();
                throw th;
            }
        }
    }

    @Override // a.j2h0
    public final boolean e() {
        return true;
    }

    public final void g(ppv0 ppv0Var, int i) {
        int i2;
        String str;
        o4e o4eVar = ppv0Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = ppv0Var.f27390a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", ppv0Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", ppv0Var.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.c.f38789a);
        boolean z = o4eVar.c;
        Set<m4e> set = o4eVar.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = o4eVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = o4eVar.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            sl50 sl50Var = o4eVar.f24629a;
            if (i3 < 30 || sl50Var != sl50.f) {
                int iOrdinal = sl50Var.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4 || i3 < 26) {
                                wv00.f().a(w9o0.b, "API version too low. Cannot convert network type value " + sl50Var);
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(ppv0Var.m, ppv0Var.l == af5.b ? 0 : 1);
        }
        long jMax = Math.max(ppv0Var.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!ppv0Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (m4e m4eVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(m4eVar.f21165a, m4eVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(o4eVar.g);
            extras.setTriggerContentMaxDelay(o4eVar.h);
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            extras.setRequiresBatteryNotLow(o4eVar.e);
            extras.setRequiresStorageNotLow(o4eVar.f);
        }
        boolean z3 = ppv0Var.k > 0;
        boolean z4 = jMax > 0;
        if (i4 >= 31 && ppv0Var.q && !z3 && !z4) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = ppv0Var.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        wv00 wv00VarF = wv00.f();
        StringBuilder sbT = kng0.t("Scheduling work ID ", str2, " (");
        sbT.append(ppv0Var.c);
        sbT.append("), Job ID ");
        sbT.append(i);
        String string = sbT.toString();
        String str3 = e;
        wv00VarF.a(str3, string);
        try {
            if (this.b.schedule(jobInfoBuild) == 0) {
                wv00.f().j(str3, "Unable to schedule work ID " + str2);
                if (ppv0Var.q && ppv0Var.r == od80.f25065a) {
                    ppv0Var.q = false;
                    wv00.f().a(str3, "Scheduling a non-expedited job (work ID " + str2 + Separators.RPAREN);
                    g(ppv0Var, i);
                }
            }
        } catch (IllegalStateException e2) {
            String str4 = fby.f9283a;
            int i5 = Build.VERSION.SDK_INT;
            int i6 = i5 >= 31 ? 150 : 100;
            int size = ((List) kpb.h0(this.d.y().f36087a, true, false, new ejv0((byte) 9))).size();
            Context context = this.f40518a;
            String strI = "<faulty JobScheduler failed to getPendingJobs>";
            if (i5 >= 34) {
                JobScheduler jobSchedulerB = fby.b(context);
                List listA = fby.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListC = c(context, jobSchedulerB);
                    int size2 = arrayListC != null ? listA.size() - arrayListC.size() : 0;
                    String strI2 = size2 == 0 ? null : f140.i(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListC2 = c(context, (JobScheduler) systemService);
                    int size3 = arrayListC2 != null ? arrayListC2.size() : 0;
                    strI = CollectionsKt.b0(tx3.z(new String[]{f140.i(listA.size(), " jobs in \"androidx.work.systemjobscheduler\" namespace"), strI2, size3 != 0 ? f140.i(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListC3 = c(context, fby.b(context));
                if (arrayListC3 != null) {
                    strI = f140.i(arrayListC3.size(), " jobs from WorkManager");
                }
            }
            String strJ = rz4.j(size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.", vqd.r(i6, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", strI, ".\nThere are "));
            wv00.f().d(str3, strJ);
            hny.q(strJ, e2);
        } catch (Throwable th) {
            wv00.f().e(str3, "Unable to schedule " + ppv0Var, th);
        }
    }
}
