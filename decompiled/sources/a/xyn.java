package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class xyn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f41712a = wv00.h("EnqueueRunnable");

    public static final void a(qov0 qov0Var) {
        boolean z;
        cpv0 cpv0Var = qov0Var.f29087a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(qov0Var.e);
        HashSet hashSetB = qov0.b(qov0Var);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(qov0Var.e);
                z = false;
                break;
            } else if (hashSetB.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            c99.t(qov0Var, Separators.RPAREN, "WorkContinuation has cycles (");
            return;
        }
        cpv0Var.getClass();
        wsd wsdVar = cpv0Var.b;
        WorkDatabase workDatabase = cpv0Var.c;
        workDatabase.getClass();
        workDatabase.b();
        try {
            wsdVar.getClass();
            slb.M(workDatabase, wsdVar, qov0Var);
            boolean zB = b(qov0Var);
            workDatabase.q();
            workDatabase.m();
            if (zB) {
                m2h0.b(wsdVar, workDatabase, cpv0Var.e);
            }
        } catch (Throwable th) {
            workDatabase.m();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0281  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    public static boolean b(qov0 qov0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        WorkDatabase workDatabase;
        boolean z4;
        boolean z5;
        boolean z6;
        ppv0 ppv0VarB;
        ppv0 ppv0VarB2;
        HashSet hashSetB = qov0.b(qov0Var);
        cpv0 cpv0Var = qov0Var.f29087a;
        cpv0Var.getClass();
        wsd wsdVar = cpv0Var.b;
        List list = qov0Var.d;
        list.getClass();
        String[] strArr = (String[]) hashSetB.toArray(new String[0]);
        String str = qov0Var.b;
        zko zkoVar = qov0Var.c;
        zkoVar.getClass();
        wsdVar.getClass();
        cpv0Var.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = cpv0Var.c;
        workDatabase2.getClass();
        boolean z7 = strArr.length == 0;
        boolean z8 = !z7;
        if (!z7) {
            int length = strArr.length;
            int i = 0;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    ppv0 ppv0VarE = workDatabase2.y().e(str2);
                    if (ppv0VarE == null) {
                        wv00.f().d(f41712a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        zov0 zov0Var = ppv0VarE.b;
                        z &= zov0Var == zov0.c;
                        if (zov0Var == zov0.d) {
                            z3 = true;
                        } else if (zov0Var == zov0.f) {
                            z2 = true;
                        }
                        i++;
                    }
                }
                z6 = false;
                z5 = true;
                qov0Var.g = z5;
                return z6;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || !z7) {
            workDatabase = workDatabase2;
            z4 = false;
        } else {
            upv0 upv0VarY = workDatabase2.y();
            str.getClass();
            List<npv0> listF = upv0VarY.f(str);
            if (listF.isEmpty()) {
                workDatabase = workDatabase2;
            } else if (zkoVar == zko.c || zkoVar == zko.d) {
                g7k g7kVarS = workDatabase2.s();
                ArrayList arrayList = new ArrayList();
                for (npv0 npv0Var : listF) {
                    String str3 = npv0Var.f23930a;
                    g7kVarS.getClass();
                    str3.getClass();
                    g7k g7kVar = g7kVarS;
                    WorkDatabase workDatabase3 = workDatabase2;
                    if (!((Boolean) kpb.h0(g7kVarS.f10818a, true, false, new ka6(str3, (byte) 4))).booleanValue()) {
                        zov0 zov0Var2 = npv0Var.b;
                        z &= zov0Var2 == zov0.c;
                        if (zov0Var2 == zov0.d) {
                            z3 = true;
                        } else if (zov0Var2 == zov0.f) {
                            z2 = true;
                        }
                        arrayList.add(npv0Var.f23930a);
                    }
                    g7kVarS = g7kVar;
                    workDatabase2 = workDatabase3;
                }
                workDatabase = workDatabase2;
                if (zkoVar == zko.d && (z2 || z3)) {
                    upv0 upv0VarY2 = workDatabase.y();
                    List listF2 = upv0VarY2.f(str);
                    ArrayList arrayList2 = new ArrayList(r3d.q(listF2, 10));
                    Iterator it = listF2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((npv0) it.next()).f23930a);
                    }
                    Iterator it2 = listF2.iterator();
                    while (it2.hasNext()) {
                        upv0VarY2.c(((npv0) it2.next()).f23930a);
                    }
                    arrayList = new ArrayList();
                    z2 = false;
                    z3 = false;
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
                z8 = strArr.length > 0;
            } else {
                if (zkoVar == zko.b) {
                    Iterator it3 = listF.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            zov0 zov0Var3 = ((npv0) it3.next()).b;
                            if (zov0Var3 == zov0.f44733a || zov0Var3 == zov0.b) {
                                z6 = false;
                                z5 = true;
                                qov0Var.g = z5;
                                return z6;
                            }
                        }
                    }
                }
                workDatabase2.getClass();
                workDatabase2.p(new i5a(workDatabase2, str, cpv0Var, (byte) 1));
                upv0 upv0VarY3 = workDatabase2.y();
                Iterator it4 = listF.iterator();
                while (it4.hasNext()) {
                    upv0VarY3.c(((npv0) it4.next()).f23930a);
                }
                workDatabase = workDatabase2;
                z4 = true;
            }
            z4 = false;
        }
        Iterator it5 = list.iterator();
        boolean z9 = z4;
        while (it5.hasNext()) {
            lpv0 lpv0Var = (lpv0) it5.next();
            ppv0 ppv0Var = lpv0Var.b;
            UUID uuid = lpv0Var.f20459a;
            if (!z8 || z) {
                ppv0Var.n = jCurrentTimeMillis;
            } else if (z3) {
                ppv0Var.b = zov0.d;
            } else if (z2) {
                ppv0Var.b = zov0.f;
            } else {
                ppv0Var.b = zov0.e;
            }
            if (ppv0Var.b == zov0.f44733a) {
                z9 = true;
            }
            upv0 upv0VarY4 = workDatabase.y();
            List list2 = cpv0Var.e;
            list2.getClass();
            list2.getClass();
            cpv0 cpv0Var2 = cpv0Var;
            boolean zC = ppv0Var.e.c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            Iterator it6 = it5;
            boolean z10 = zIsEmpty;
            boolean zC2 = ppv0Var.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zC3 = ppv0Var.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zC && zC2 && zC3) {
                String str4 = ppv0Var.c;
                laj lajVar = new laj((byte) 0);
                maj majVar = ppv0Var.e;
                majVar.getClass();
                lajVar.c(majVar.f21460a);
                lajVar.f19707a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str4);
                ppv0VarB = ppv0.b(ppv0Var, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", lajVar.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
            } else {
                ppv0VarB = ppv0Var;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                o4e o4eVar = ppv0VarB.j;
                String str5 = ppv0VarB.c;
                if (Intrinsics.d(str5, ConstraintTrackingWorker.class.getName()) || !(o4eVar.e || o4eVar.f)) {
                    ppv0VarB2 = ppv0VarB;
                } else {
                    laj lajVar2 = new laj((byte) 0);
                    maj majVar2 = ppv0VarB.e;
                    majVar2.getClass();
                    lajVar2.c(majVar2.f21460a);
                    lajVar2.f19707a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str5);
                    ppv0VarB2 = ppv0.b(ppv0VarB, null, null, ConstraintTrackingWorker.class.getName(), lajVar2.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
                }
            } else {
                ppv0VarB2 = ppv0VarB;
            }
            upv0VarY4.getClass();
            kpb.h0(upv0VarY4.f36087a, false, true, new zfv0(upv0VarY4, ppv0VarB2, (byte) 10));
            byte b = 11;
            if (z8) {
                int length2 = strArr.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str6 = strArr[i2];
                    String string = uuid.toString();
                    string.getClass();
                    b7k b7kVar = new b7k(string, str6);
                    g7k g7kVarS2 = workDatabase.s();
                    g7kVarS2.getClass();
                    kpb.h0(g7kVarS2.f10818a, false, true, new ngh(g7kVarS2, b7kVar, b));
                    i2++;
                    strArr = strArr;
                }
            }
            String[] strArr2 = strArr;
            zpv0 zpv0VarZ = workDatabase.z();
            String string2 = uuid.toString();
            string2.getClass();
            Set set = lpv0Var.c;
            zpv0VarZ.getClass();
            string2.getClass();
            Iterator it7 = set.iterator();
            while (it7.hasNext()) {
                kpb.h0(zpv0VarZ.f44780a, false, true, new zfv0(zpv0VarZ, new ypv0((String) it7.next(), string2), b));
            }
            if (!z10) {
                hpv0 hpv0VarW = workDatabase.w();
                str.getClass();
                String string3 = uuid.toString();
                string3.getClass();
                gpv0 gpv0Var = new gpv0(str, string3);
                hpv0VarW.getClass();
                kpb.h0(hpv0VarW.f13461a, false, true, new zfv0(hpv0VarW, gpv0Var, (byte) 7));
            }
            cpv0Var = cpv0Var2;
            strArr = strArr2;
            it5 = it6;
            zIsEmpty = z10;
        }
        z5 = true;
        z6 = z9;
        qov0Var.g = z5;
        return z6;
    }
}
