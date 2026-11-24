package a;

import a.fpk0;
import a.iiy;
import a.m1r;
import a.y82;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.zip.Adler32;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class y3v implements cfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41971a;
    public final Object b;
    public final Object c;
    public Object d;

    public y3v(vwb0 vwb0Var, vby vbyVar) {
        this.f41971a = (byte) 15;
        vwb0Var.getClass();
        vbyVar.getClass();
        this.b = vwb0Var;
        this.c = vbyVar;
        this.d = q3d.j(nev0.LIVE, nev0.RESULTS, nev0.CYBER, nev0.SEARCH, nev0.AGGREGATOR, nev0.XGAMES);
    }

    public static y3v a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        y3v y3vVar = new y3v(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) y3vVar.c)) {
            try {
                ((ArrayDeque) y3vVar.c).clear();
                String string = ((SharedPreferences) y3vVar.b).getString("topic_operation_queue", "");
                if (!TextUtils.isEmpty(string) && string.contains(Separators.COMMA)) {
                    String[] strArrSplit = string.split(Separators.COMMA, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) y3vVar.c).add(str);
                        }
                    }
                    return y3vVar;
                }
                return y3vVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(huo huoVar, zrs0 zrs0Var) {
        ncs0[] ncs0VarArr = (ncs0[]) this.c;
        for (int i = 0; i < ncs0VarArr.length; i++) {
            zrs0Var.a();
            zrs0Var.b();
            ncs0 ncs0VarQ = huoVar.q(zrs0Var.d, 3);
            androidx.media3.common.b bVar = (androidx.media3.common.b) ((List) this.b).get(i);
            String str = bVar.p;
            x0x.y("Invalid closed caption MIME type provided: %s", str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = bVar.f45386a;
            if (str2 == null) {
                zrs0Var.b();
                str2 = zrs0Var.e;
            }
            awq awqVar = new awq();
            awqVar.f1587a = str2;
            awqVar.n = mg40.n("video/mp2t");
            awqVar.o = mg40.n(str);
            awqVar.e = bVar.e;
            awqVar.d = bVar.d;
            awqVar.O = bVar.P;
            awqVar.r = bVar.s;
            ohs0.w(awqVar, ncs0VarQ);
            ncs0VarArr[i] = ncs0VarQ;
        }
    }

    public boolean c(iz30 iz30Var) {
        if (!((lbu) this.c).j()) {
            return true;
        }
        int iOrdinal = iz30Var.ordinal();
        if (iOrdinal == 7 || iOrdinal == 9 || iOrdinal == 46 || iOrdinal == 56 || iOrdinal == 38 || iOrdinal == 39 || iOrdinal == 42 || iOrdinal == 43 || iOrdinal == 50 || iOrdinal == 51) {
            return false;
        }
        switch (iOrdinal) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object d(zje zjeVar) {
        twv twvVar;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof twv) {
            twvVar = (twv) zjeVar;
            int i = twvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                twvVar.k = i - Integer.MIN_VALUE;
            } else {
                twvVar = new twv(this, zjeVar);
            }
        } else {
            twvVar = new twv(this, zjeVar);
        }
        twv twvVar2 = twvVar;
        Object objA = twvVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = twvVar2.k;
        if (i2 == 0) {
            z1x.P(objA);
            xsu xsuVar = (xsu) this.c;
            knf0Var.getClass();
            String strC = knf0Var.c();
            twvVar2.k = 1;
            objA = ((nwv) ((tpv) xsuVar.f41434a).invoke()).a(1, 1357, strC, "application/vnd.xenvelop+json", twvVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        lwv lwvVar = (lwv) objA;
        lwvVar.getClass();
        kwv kwvVar = lwvVar.f20782a;
        String str = kwvVar != null ? kwvVar.f19021a : null;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object e(sip sipVar, String str, zje zjeVar) throws Throwable {
        qy80 qy80Var;
        if (zjeVar instanceof qy80) {
            qy80Var = (qy80) zjeVar;
            int i = qy80Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy80Var.m = i - Integer.MIN_VALUE;
            } else {
                qy80Var = new qy80(this, zjeVar);
            }
        } else {
            qy80Var = new qy80(this, zjeVar);
        }
        qy80 qy80Var2 = qy80Var;
        Object objA = qy80Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = qy80Var2.m;
        if (i2 == 0) {
            z1x.P(objA);
            rtu rtuVar = (rtu) this.b;
            boolean zU = kpb.u(sipVar);
            qy80Var2.i = sipVar;
            qy80Var2.j = str;
            qy80Var2.m = 1;
            objA = rtuVar.a(zU, 0, qy80Var2);
            if (objA != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objA);
                return objA;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = qy80Var2.j;
        sipVar = qy80Var2.i;
        z1x.P(objA);
        String str2 = str;
        c3c0 c3c0Var = (c3c0) objA;
        lbu lbuVar = (lbu) this.c;
        int i3 = c3c0Var.f3668a;
        boolean z = c3c0Var.b;
        long j = c3c0Var.c;
        qy80Var2.i = null;
        qy80Var2.j = null;
        qy80Var2.m = 2;
        Serializable serializableK = ((nw20) lbuVar.c).k(sipVar, str2, ((uzc) lbuVar.b).b(), i3, z, j, qy80Var2);
        return serializableK == wneVar ? wneVar : serializableK;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v10 java.lang.String) binds: [B:26:0x0091, B:30:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public Serializable f(int i, zje zjeVar, String str, String str2) {
        cor0 cor0Var;
        String str3;
        String str4;
        List list;
        List list2;
        if (zjeVar instanceof cor0) {
            cor0Var = (cor0) zjeVar;
            int i2 = cor0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cor0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                cor0Var = new cor0(this, zjeVar);
            }
        } else {
            cor0Var = new cor0(this, zjeVar);
        }
        cor0 cor0Var2 = cor0Var;
        Object objD = cor0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = cor0Var2.l;
        List list3 = null;
        if (i3 == 0) {
            z1x.P(objD);
            dpi0 dpi0Var = (dpi0) this.c;
            String strA = ((btt0) this.b).a();
            String strC = ((knf0) this.d).c();
            cor0Var2.i = str2;
            cor0Var2.l = 1;
            objD = ((tor0) ((lkr0) dpi0Var.f6468a).invoke()).d(strA, strC, str, str2, i, cor0Var2);
            if (objD == wneVar) {
                return wneVar;
            }
            str3 = str2;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = cor0Var2.i;
            z1x.P(objD);
            str3 = str5;
        }
        o0y o0yVar = (o0y) ((dx5) objD).a();
        str3.getClass();
        n3w n3wVar = n3w.Q1;
        String str6 = o0yVar.c;
        Double d = o0yVar.j;
        if (str6 == null) {
            jf4.k(null);
            return null;
        }
        bj5 bj5Var = s77.b;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String strValueOf = o0yVar.k;
        if (strValueOf != null) {
            str4 = strValueOf;
        } else {
            strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
            if (strValueOf == null) {
                str4 = "";
            } else {
                str4 = strValueOf;
            }
        }
        Long l = o0yVar.f24452a;
        long jLongValue = l != null ? l.longValue() : 0L;
        qud qudVar = e4f.f7178a;
        Integer num = o0yVar.b;
        int iIntValue = num != null ? num.intValue() : 0;
        qudVar.getClass();
        e4f e4fVarE = qud.e(iIntValue);
        Double d2 = o0yVar.d;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = o0yVar.e;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        String str7 = o0yVar.m;
        String str8 = str7 == null ? "" : str7;
        String str9 = o0yVar.g;
        String str10 = str9 == null ? "" : str9;
        q4f q4fVar = q4f.y;
        String str11 = str9 == null ? "" : str9;
        List<i0y> list4 = o0yVar.o;
        if (list4 != null) {
            ArrayList arrayList = new ArrayList();
            for (i0y i0yVar : list4) {
                List<f2y> list5 = i0yVar.i;
                if (list5 != null) {
                    ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                    for (f2y f2yVar : list5) {
                        mvn mvnVar = mvn.f22465a;
                        iun iunVar = iun.f15405a;
                        iunVar.getClass();
                        Long l2 = i0yVar.f13969a;
                        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                        String str12 = i0yVar.b;
                        String str13 = str12 == null ? "" : str12;
                        Long l3 = f2yVar.b;
                        Long l4 = f2yVar.s;
                        List list6 = list3;
                        Long l5 = f2yVar.f8837a;
                        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                        long jLongValue4 = l5 != null ? l5.longValue() : 0L;
                        long jLongValue5 = l5 != null ? l5.longValue() : 0L;
                        Integer num2 = f2yVar.r;
                        if (num2 != null && num2.intValue() == 0) {
                            mvnVar = mvn.b;
                        } else if (num2 != null && num2.intValue() == 1) {
                            mvnVar = mvn.c;
                        } else if (num2 != null && num2.intValue() == -1) {
                            mvnVar = mvn.e;
                        }
                        mvn mvnVar2 = mvnVar;
                        String str14 = f2yVar.k;
                        String str15 = str14 == null ? "" : str14;
                        long jLongValue6 = l4 != null ? l4.longValue() : 0L;
                        String str16 = f2yVar.u;
                        if (str16 == null) {
                            str16 = "";
                        }
                        List listC = kotlin.collections.a.c(str16);
                        String str17 = f2yVar.l;
                        String str18 = str17 == null ? "" : str17;
                        long jLongValue7 = l4 != null ? l4.longValue() : 0L;
                        String str19 = f2yVar.v;
                        if (str19 == null) {
                            str19 = "";
                        }
                        List listC2 = kotlin.collections.a.c(str19);
                        String str20 = f2yVar.h;
                        String str21 = str20 == null ? "" : str20;
                        Long l6 = f2yVar.i;
                        long jLongValue8 = l6 != null ? l6.longValue() : 0L;
                        List list7 = f2yVar.p;
                        Object objB0 = list7 != null ? CollectionsKt.b0(list7, null, null, null, null, 63) : list6;
                        String str22 = objB0 == null ? "" : objB0;
                        String str23 = f2yVar.c;
                        String str24 = str23 == null ? "" : str23;
                        String str25 = f2yVar.n;
                        String str26 = str25 == null ? "" : str25;
                        listC.getClass();
                        listC2.getClass();
                        arrayList2.add(new su6(jLongValue2, str13, 0, 0.0d, "", jLongValue3, false, jLongValue4, jLongValue5, "", mvnVar2, false, str15, jLongValue6, listC, str18, jLongValue7, listC2, str21, jLongValue8, str22, 0, 0, str24, 0L, false, "", "", str26, false, 0.0d, 0L, 0L, "", 0, 0, -1, 0.0d, 0.0d, "", false, "", "", false, iunVar, iunVar));
                        list3 = list6;
                    }
                    list = list3;
                    list2 = arrayList2;
                } else {
                    list = list3;
                    list2 = list;
                }
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                w3d.u(arrayList, list2);
                list3 = list;
            }
            list3 = arrayList;
        }
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        List list8 = list3;
        pxu pxuVar = o0yVar.p;
        return n3w.d(n3wVar, str6, dDoubleValue, str4, str3, jLongValue, e4fVarE, dDoubleValue2, dDoubleValue3, str8, str10, q4fVar, false, str11, pxuVar != null ? dyb.n0(pxuVar) : hxu.h, list8, -59820662, 2146434941);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:53|151|54|142|55|56|136|57|58|156|59|60|147|61|62|138|63|64|(1:67)|123) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(5:154|(1:(3:13|14|15)(2:18|19))(3:20|21|22)|153|94|(20:53|151|54|142|55|56|136|57|58|156|59|60|147|61|62|138|63|64|(1:67)|123)(2:128|(2:130|131)(1:132)))(4:23|140|24|25)|149|68|69|70|134|135) */
    /* JADX WARN: Code duplicated, block: B:100:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b1 A[Catch: all -> 0x029e, TRY_LEAVE, TryCatch #12 {all -> 0x029e, blocks: (B:90:0x0282, B:93:0x028a, B:97:0x02a3, B:101:0x02ad, B:103:0x02b1), top: B:159:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f5 A[Catch: all -> 0x02f2, TryCatch #4 {all -> 0x02f2, blocks: (B:105:0x02b5, B:111:0x02f5, B:113:0x0315, B:115:0x0322, B:119:0x032e, B:121:0x0332, B:125:0x0377, B:126:0x0397), top: B:144:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0315 A[Catch: all -> 0x02f2, TryCatch #4 {all -> 0x02f2, blocks: (B:105:0x02b5, B:111:0x02f5, B:113:0x0315, B:115:0x0322, B:119:0x032e, B:121:0x0332, B:125:0x0377, B:126:0x0397), top: B:144:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0322 A[Catch: all -> 0x02f2, TryCatch #4 {all -> 0x02f2, blocks: (B:105:0x02b5, B:111:0x02f5, B:113:0x0315, B:115:0x0322, B:119:0x032e, B:121:0x0332, B:125:0x0377, B:126:0x0397), top: B:144:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x032b  */
    /* JADX WARN: Code duplicated, block: B:118:0x032d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0332 A[Catch: all -> 0x02f2, TryCatch #4 {all -> 0x02f2, blocks: (B:105:0x02b5, B:111:0x02f5, B:113:0x0315, B:115:0x0322, B:119:0x032e, B:121:0x0332, B:125:0x0377, B:126:0x0397), top: B:144:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0365  */
    /* JADX WARN: Code duplicated, block: B:125:0x0377 A[Catch: all -> 0x02f2, TryCatch #4 {all -> 0x02f2, blocks: (B:105:0x02b5, B:111:0x02f5, B:113:0x0315, B:115:0x0322, B:119:0x032e, B:121:0x0332, B:125:0x0377, B:126:0x0397), top: B:144:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0397 A[Catch: all -> 0x02f2, TRY_LEAVE, TryCatch #4 {all -> 0x02f2, blocks: (B:105:0x02b5, B:111:0x02f5, B:113:0x0315, B:115:0x0322, B:119:0x032e, B:121:0x0332, B:125:0x0377, B:126:0x0397), top: B:144:0x02b5 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:130:0x03b7 A[Catch: all -> 0x0232, TRY_ENTER, TryCatch #5 {all -> 0x0232, blocks: (B:69:0x022c, B:130:0x03b7, B:131:0x03be, B:132:0x03bf), top: B:146:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x03bf A[Catch: all -> 0x0232, TRY_LEAVE, TryCatch #5 {all -> 0x0232, blocks: (B:69:0x022c, B:130:0x03b7, B:131:0x03be, B:132:0x03bf), top: B:146:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01da  */
    /* JADX WARN: Code duplicated, block: B:67:0x0217  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:92:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x028a A[Catch: all -> 0x029e, TryCatch #12 {all -> 0x029e, blocks: (B:90:0x0282, B:93:0x028a, B:97:0x02a3, B:101:0x02ad, B:103:0x02b1), top: B:159:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02a3 A[Catch: all -> 0x029e, TryCatch #12 {all -> 0x029e, blocks: (B:90:0x0282, B:93:0x028a, B:97:0x02a3, B:101:0x02ad, B:103:0x02b1), top: B:159:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02aa  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0237, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0238, code lost:
    
        r25 = r5;
        r5 = r7;
        r6 = r11;
        r17 = r18;
        r11 = r0;
        r12 = r3;
        r3 = r10;
        r0 = r13;
        r13 = r14;
        r10 = r2;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0244, code lost:
    
        r1 = r20;
        r5 = r5;
        r8 = r8;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0247, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0248, code lost:
    
        r4 = r17;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024a, code lost:
    
        r1 = r11;
        r11 = r0;
        r0 = r1;
        r16 = r2;
        r25 = r14;
        r17 = r18;
        r15 = r19;
        r5 = r5;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0256, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0257, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025b, code lost:
    
        r20 = r1;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x025f, code lost:
    
        r2 = r32;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0263, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0264, code lost:
    
        r2 = r32;
        r19 = r1;
        r4 = r17;
        r20 = r23;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x026e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x026f, code lost:
    
        r19 = r1;
        r18 = r2;
        r20 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0278, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0279, code lost:
    
        r19 = r1;
        r18 = r2;
        r20 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x0233: MOVE (r15 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]) (LINE:564), block:B:72:0x0233 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [a.y3v] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r34v0, types: [int] */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0217 -> B:149:0x0226). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x024a -> B:75:0x0244). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(int r33, int r34, long r35, a.zje r37, java.util.Date r38) {
        /*
            Method dump skipped, instruction units count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y3v.g(int, int, long, a.zje, java.util.Date):java.lang.Object");
    }

    public FragmentScreen h(final int i, final String str) {
        str.getClass();
        int iOrdinal = ((kuu) this.d).a(i).e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                final a92 a92Var = (a92) this.c;
                a92Var.getClass();
                return new FragmentScreen() { // from class: org.xplatform.special_event.impl.main.alt_design_l.navigation.AltDesignLSpecialEventMainScreenFactoryImpl$getAltDesignLSpecialEventMainScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        y82.V1.getClass();
                        String str2 = str;
                        str2.getClass();
                        y82 y82Var = new y82();
                        iiy[] iiyVarArr = y82.W1;
                        y82Var.N1.I(y82Var, iiyVarArr[0], i);
                        y82Var.O1.x(y82Var, iiyVarArr[1], str2);
                        return y82Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        a92Var.getClass();
                        y82.V1.getClass();
                        return y82.X1;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
            }
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                t9f.b();
                return null;
            }
        }
        final gpk0 gpk0Var = (gpk0) this.b;
        gpk0Var.getClass();
        return new FragmentScreen() { // from class: org.xplatform.special_event.impl.main.navigation.SpecialEventMainScreenFactoryImpl$getSpecialEventMainScreen$1
            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                fpk0.V1.getClass();
                String str2 = str;
                str2.getClass();
                fpk0 fpk0Var = new fpk0();
                iiy[] iiyVarArr = fpk0.W1;
                fpk0Var.N1.I(fpk0Var, iiyVarArr[0], i);
                fpk0Var.O1.x(fpk0Var, iiyVarArr[1], str2);
                return fpk0Var;
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF45455a() {
                gpk0Var.getClass();
                fpk0.V1.getClass();
                return fpk0.X1;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            /* JADX INFO: renamed from: g */
            public final /* bridge */ boolean getB() {
                return true;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    public Serializable i(int i, long j, long j2, boolean z, jvn jvnVar, zje zjeVar) {
        ox20 ox20Var;
        long j3;
        ?? arrayList;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof ox20) {
            ox20Var = (ox20) zjeVar;
            int i2 = ox20Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ox20Var.l = i2 - Integer.MIN_VALUE;
            } else {
                ox20Var = new ox20(this, zjeVar);
            }
        } else {
            ox20Var = new ox20(this, zjeVar);
        }
        Object objB = ox20Var.j;
        wne wneVar = wne.f39444a;
        int i3 = ox20Var.l;
        if (i3 == 0) {
            z1x.P(objB);
            knf0Var.getClass();
            jo20 jo20VarV = n7x.v(j, j2, z, jvnVar, i, knf0Var.b());
            onv onvVar = (onv) this.c;
            ox20Var.i = j;
            ox20Var.l = 1;
            objB = ((vx20) ((tpv) onvVar.f25567a).invoke()).b(jo20VarV, ox20Var);
            if (objB == wneVar) {
                return wneVar;
            }
            j3 = j;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = ox20Var.i;
            z1x.P(objB);
        }
        List list = ((xs20) ((dx5) objB).a()).f41394a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList.add(efx.L((dt20) obj, i4));
                i4 = i5;
            }
        } else {
            arrayList = iun.f15405a;
        }
        nx20 nx20Var = (nx20) this.b;
        nx20Var.getClass();
        arrayList.getClass();
        nx20Var.b.d(new Pair(Long.valueOf(j3), arrayList));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    public Serializable j(int i, long j, long j2, boolean z, jvn jvnVar, zje zjeVar) {
        px20 px20Var;
        long j3;
        ?? arrayList;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof px20) {
            px20Var = (px20) zjeVar;
            int i2 = px20Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                px20Var.l = i2 - Integer.MIN_VALUE;
            } else {
                px20Var = new px20(this, zjeVar);
            }
        } else {
            px20Var = new px20(this, zjeVar);
        }
        Object objA = px20Var.j;
        wne wneVar = wne.f39444a;
        int i3 = px20Var.l;
        if (i3 == 0) {
            z1x.P(objA);
            knf0Var.getClass();
            jo20 jo20VarV = n7x.v(j, j2, z, jvnVar, i, knf0Var.b());
            onv onvVar = (onv) this.c;
            px20Var.i = j;
            px20Var.l = 1;
            objA = ((vx20) ((tpv) onvVar.f25567a).invoke()).a(jo20VarV, px20Var);
            if (objA == wneVar) {
                return wneVar;
            }
            j3 = j;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = px20Var.i;
            z1x.P(objA);
        }
        List list = ((xs20) ((dx5) objA).a()).f41394a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList.add(efx.L((dt20) obj, i4));
                i4 = i5;
            }
        } else {
            arrayList = iun.f15405a;
        }
        nx20 nx20Var = (nx20) this.b;
        nx20Var.getClass();
        arrayList.getClass();
        nx20Var.f24263a.d(new Pair(Long.valueOf(j3), arrayList));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable k(int i, zje zjeVar, String str, String str2) {
        dor0 dor0Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof dor0) {
            dor0Var = (dor0) zjeVar;
            int i2 = dor0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dor0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                dor0Var = new dor0(this, zjeVar);
            }
        } else {
            dor0Var = new dor0(this, zjeVar);
        }
        dor0 dor0Var2 = dor0Var;
        Object objC = dor0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = dor0Var2.l;
        if (i3 == 0) {
            z1x.P(objC);
            dpi0 dpi0Var = (dpi0) this.c;
            String strA = ((btt0) this.b).a();
            knf0Var.getClass();
            String strC = knf0Var.c();
            dor0Var2.i = str2;
            dor0Var2.l = 1;
            objC = ((tor0) ((lkr0) dpi0Var.f6468a).invoke()).c(strA, "application/vnd.xenvelop+json", 1, 22, strC, str, i, dor0Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = dor0Var2.i;
            z1x.P(objC);
        }
        return s7n0.B((kor0) ((dx5) objC).a(), str2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object l(int i, zje zjeVar, String str) {
        eor0 eor0Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof eor0) {
            eor0Var = (eor0) zjeVar;
            int i2 = eor0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eor0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                eor0Var = new eor0(this, zjeVar);
            }
        } else {
            eor0Var = new eor0(this, zjeVar);
        }
        eor0 eor0Var2 = eor0Var;
        Object objC = eor0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = eor0Var2.k;
        if (i3 == 0) {
            z1x.P(objC);
            dpi0 dpi0Var = (dpi0) this.c;
            String strA = ((btt0) this.b).a();
            knf0Var.getClass();
            String strC = knf0Var.c();
            eor0Var2.k = 1;
            objC = ((tor0) ((lkr0) dpi0Var.f6468a).invoke()).c(strA, "application/vnd.xenvelop+json", 1, 22, strC, str, i, eor0Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        kor0 kor0Var = (kor0) ((dx5) objC).a();
        n3w n3wVarB = s7n0.B(kor0Var, "");
        String str2 = kor0Var.c;
        return new vor0(n3wVarB, str2 != null ? str2 : "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object m(long j, Date date, int i, zje zjeVar) {
        x3v x3vVar;
        Object obj;
        int i2;
        if (zjeVar instanceof x3v) {
            x3vVar = (x3v) zjeVar;
            int i3 = x3vVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x3vVar.n = i3 - Integer.MIN_VALUE;
            } else {
                x3vVar = new x3v(this, zjeVar);
            }
        } else {
            x3vVar = new x3v(this, zjeVar);
        }
        Object obj2 = x3vVar.l;
        wne wneVar = wne.f39444a;
        int i4 = x3vVar.n;
        if (i4 == 0) {
            z1x.P(obj2);
            pmi pmiVar = (pmi) this.c;
            x3vVar.j = date;
            x3vVar.i = j;
            x3vVar.k = i;
            x3vVar.n = 1;
            Serializable serializableX = pmiVar.x(x3vVar);
            i2 = i;
            obj = serializableX;
            if (serializableX == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = x3vVar.k;
            j = x3vVar.i;
            date = x3vVar.j;
            z1x.P(obj2);
            i2 = i5;
            obj = obj2;
        }
        int i6 = i2;
        return new q3v(((eat0) ((epi0) ((uyn) this.b).f36498a).b).f7486a, date, this, j, ((Number) obj).intValue(), i6 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r8 == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(a.zje r8) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            a.wsf0 r0 = (a.wsf0) r0
            boolean r1 = r8 instanceof a.q6v
            if (r1 == 0) goto L17
            r1 = r8
            a.q6v r1 = (a.q6v) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.q6v r1 = new a.q6v
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.i
            a.wne r2 = a.wne.f39444a
            int r3 = r1.k
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L39
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2e
            a.z1x.P(r8)
            return r8
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L35:
            a.z1x.P(r8)
            goto L5b
        L39:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.c
            a.gmt r8 = (a.gmt) r8
            a.ql5 r8 = r8.a()
            if (r8 != 0) goto L66
            java.lang.Object r8 = r0.b
            a.g45 r8 = (a.g45) r8
            a.khf0 r8 = r8.G()
            a.bm5 r3 = a.bm5.d
            r1.k = r5
            a.tl5 r5 = a.tl5.c
            java.io.Serializable r8 = r8.A(r3, r5, r1)
            if (r8 != r2) goto L5b
            goto L74
        L5b:
            a.ql5 r8 = (a.ql5) r8
            a.trm0 r0 = r0.s()
            a.bm5 r3 = a.bm5.d
            r0.l(r3, r8)
        L66:
            java.lang.Object r7 = r7.b
            a.go10 r7 = (a.go10) r7
            long r5 = r8.f28916a
            r1.k = r4
            java.lang.Object r7 = r7.a(r5, r1)
            if (r7 != r2) goto L75
        L74:
            return r2
        L75:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y3v.n(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f3 -> B:41:0x00f4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object o(java.lang.String r18, a.zje r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y3v.o(java.lang.String, a.zje):java.lang.Object");
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        ((zub0) this.d).e = null;
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n0a) ((j0a) this.c)).f((vx9) it.next());
        }
        arrayList.clear();
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
        ((zub0) this.d).e = null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r2.k(r9, r10, r11, r12, r13) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, a.zje r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof a.ute0
            if (r0 == 0) goto L14
            r0 = r13
            a.ute0 r0 = (a.ute0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.o = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            a.ute0 r0 = new a.ute0
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.m
            a.wne r1 = a.wne.f39444a
            int r2 = r13.o
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            a.z1x.P(r0)
            goto L7e
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L33:
            java.lang.String r12 = r13.l
            java.lang.String r11 = r13.k
            java.lang.String r10 = r13.j
            java.lang.String r9 = r13.i
            a.z1x.P(r0)
            goto L58
        L3f:
            a.z1x.P(r0)
            java.lang.Object r0 = r8.d
            a.rou r0 = (a.rou) r0
            r13.i = r9
            r13.j = r10
            r13.k = r11
            r13.l = r12
            r13.o = r4
            r2 = 0
            java.lang.Object r0 = r0.a(r2, r13)
            if (r0 != r1) goto L58
            goto L7d
        L58:
            a.m2c0 r0 = (a.m2c0) r0
            long r6 = r0.S
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.Object r2 = r8.b
            a.ts4 r2 = (a.ts4) r2
            java.lang.Object r8 = r8.c
            a.do20 r8 = (a.do20) r8
            java.lang.String r10 = r8.o(r0, r10)
            r13.i = r5
            r13.j = r5
            r13.k = r5
            r13.l = r5
            r13.o = r3
            r8 = r2
            java.lang.Object r8 = r8.k(r9, r10, r11, r12, r13)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y3v.p(java.lang.String, java.lang.String, java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    public Unit q() {
        long jB = ((ort) this.c).b();
        rkc0 rkc0Var = (rkc0) this.d;
        long jA = ((s470) this.b).a();
        bby bbyVar = rkc0Var.g;
        if (bbyVar == null || !bbyVar.isActive()) {
            rkc0Var.g = sac.V(rkc0Var.f, new ppb0(rkc0Var, (byte) 18), null, null, new qkc0(rkc0Var, jA, jB, null), 14);
        }
        return Unit.f46060a;
    }

    public boolean r() {
        if (((l7m0) this.b).getValue() != this.d) {
            return true;
        }
        y3v y3vVar = (y3v) this.c;
        return y3vVar != null && y3vVar.r();
    }

    public void s(String str) {
        str.getClass();
        i8i.D("error_code", str, (kt2) this.b, "login_error");
    }

    public Object t(String str, int i, hae0 hae0Var, zje zjeVar) {
        Object objA = ((cst0) ((wq10) this.c).f39569a.b(sre0.f32672a.b(cst0.class))).a(((btt0) this.d).a(), new wyg0(i, hae0Var, str), zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public String toString() {
        switch (this.f41971a) {
            case 10:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                zn00 zn00Var = (zn00) ((zn00) this.c).b;
                String str = "";
                while (zn00Var != null) {
                    Object obj = zn00Var.f44650a;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    zn00Var = (zn00) zn00Var.b;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Object u(String str, hae0 hae0Var, zje zjeVar) {
        Object objB = ((cst0) ((wq10) this.c).f39569a.b(sre0.f32672a.b(cst0.class))).b(((btt0) this.d).a(), new zyg0(str, hae0Var), zjeVar);
        wne wneVar = wne.f39444a;
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        return objB == wneVar ? objB : Unit.f46060a;
    }

    public void v(q55 q55Var, int i, boolean z) {
        y45 y45Var = (y45) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = q55Var.f28133a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        mwb0 mwb0Var = q55Var.c;
        adler32.update(byteBufferAllocate.putInt(pwb0.a(mwb0Var)).array());
        byte[] bArr = q55Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    m8x.N(q55Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((wpg0) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(pwb0.a(mwb0Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(y45Var.a(mwb0Var, jLongValue, i));
            Set set = ((z45) y45Var.b.get(mwb0Var)).c;
            if (set.contains(k2h0.f17572a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(k2h0.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(k2h0.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(RemoteMessageConst.Notification.PRIORITY, pwb0.a(mwb0Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {q55Var, Integer.valueOf(value), Long.valueOf(y45Var.a(mwb0Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strY = m8x.Y("JobInfoScheduler");
            if (Log.isLoggable(strY, 3)) {
                Log.d(strY, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object w(knb knbVar, zje zjeVar) {
        ql00 ql00Var;
        imb imbVar = (imb) ((pzu) this.c).c;
        if (zjeVar instanceof ql00) {
            ql00Var = (ql00) zjeVar;
            int i = ql00Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ql00Var.l = i - Integer.MIN_VALUE;
            } else {
                ql00Var = new ql00(this, zjeVar);
            }
        } else {
            ql00Var = new ql00(this, zjeVar);
        }
        Object objK = ql00Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ql00Var.l;
        if (i2 == 0) {
            z1x.P(objK);
            List list = knbVar.f18576a;
            list.getClass();
            imbVar.f15016a.o(null, list);
            p7m0 p7m0Var = imbVar.f15016a;
            ql00Var.i = knbVar;
            ql00Var.l = 1;
            objK = ntb.K(p7m0Var, ql00Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            knbVar = ql00Var.i;
            z1x.P(objK);
        }
        return knb.a(knbVar, (List) objK);
    }

    public Object x(List list, zje zjeVar) {
        Object objC = ((z9n0) ((enj0) ((epi0) this.c).b).invoke()).c(((btt0) this.d).a(), new k6k(list), zjeVar);
        wne wneVar = wne.f39444a;
        if (objC != wneVar) {
            objC = Unit.f46060a;
        }
        return objC == wneVar ? objC : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public Serializable y(zje zjeVar) {
        sdn0 sdn0Var;
        if (zjeVar instanceof sdn0) {
            sdn0Var = (sdn0) zjeVar;
            int i = sdn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdn0Var.k = i - Integer.MIN_VALUE;
            } else {
                sdn0Var = new sdn0(this, zjeVar);
            }
        } else {
            sdn0Var = new sdn0(this, zjeVar);
        }
        Object objA = sdn0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = sdn0Var.k;
        ?? r3 = 0;
        if (i2 == 0) {
            z1x.P(objA);
            epi0 epi0Var = (epi0) this.c;
            String strA = ((btt0) this.d).a();
            sdn0Var.k = 1;
            objA = ((z9n0) ((enj0) epi0Var.b).invoke()).a(strA, sdn0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List<zst0> list = ((att0) ((dx5) objA).a()).f1449a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (zst0 zst0Var : list) {
                zst0Var.getClass();
                Long l = zst0Var.f44922a;
                if (l == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue = l.longValue();
                String str = zst0Var.b;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Long l2 = zst0Var.c;
                if (l2 == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue2 = l2.longValue();
                List list2 = zst0Var.d;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                arrayList.add(new mmp0(jLongValue, jLongValue2, str2, list2));
            }
            r3 = arrayList;
        }
        if (r3 == 0) {
            r3 = iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(r3, 10));
        Iterator it = r3.iterator();
        while (it.hasNext()) {
            axq.t(((mmp0) it.next()).f22052a, arrayList2);
        }
        y9n0 y9n0Var = (y9n0) this.b;
        y9n0Var.getClass();
        y9n0Var.f42258a.n(CollectionsKt.P0(arrayList2));
        return r3;
    }

    public y3v(kt2 kt2Var) {
        this.f41971a = (byte) 25;
        kt2Var.getClass();
        this.b = kt2Var;
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public y3v(kt2 kt2Var, peg0 peg0Var, yk50 yk50Var) {
        this.f41971a = (byte) 7;
        kt2Var.getClass();
        this.b = kt2Var;
        this.c = peg0Var;
        this.d = yk50Var;
    }

    public y3v(s470 s470Var, ort ortVar, rkc0 rkc0Var) {
        this.f41971a = (byte) 28;
        rkc0Var.getClass();
        this.b = s470Var;
        this.c = ortVar;
        this.d = rkc0Var;
    }

    public /* synthetic */ y3v(Object obj, Object obj2, Object obj3, byte b) {
        this.f41971a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public y3v(fsd fsdVar, uuz uuzVar, lbu lbuVar, f4u f4uVar) {
        this.f41971a = (byte) 9;
        fsdVar.getClass();
        this.b = fsdVar;
        this.c = lbuVar;
        this.d = f4uVar;
    }

    public y3v(knf0 knf0Var, xsu xsuVar, q7d0 q7d0Var) {
        this.f41971a = (byte) 2;
        knf0Var.getClass();
        q7d0Var.getClass();
        this.b = knf0Var;
        this.c = xsuVar;
        this.d = q7d0Var;
    }

    public y3v(zto0 zto0Var, wq10 wq10Var, btt0 btt0Var) {
        this.f41971a = (byte) 23;
        zto0Var.getClass();
        btt0Var.getClass();
        this.b = zto0Var;
        this.c = wq10Var;
        this.d = btt0Var;
    }

    public y3v(go10 go10Var, gmt gmtVar, wsf0 wsf0Var) {
        this.f41971a = (byte) 1;
        go10Var.getClass();
        gmtVar.getClass();
        this.b = go10Var;
        this.c = gmtVar;
        this.d = wsf0Var;
    }

    public y3v(gpk0 gpk0Var, a92 a92Var, kuu kuuVar) {
        this.f41971a = (byte) 20;
        gpk0Var.getClass();
        a92Var.getClass();
        this.b = gpk0Var;
        this.c = a92Var;
        this.d = kuuVar;
    }

    public y3v(mne mneVar, ljf0 ljf0Var, knf0 knf0Var) {
        this.f41971a = (byte) 21;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = ljf0Var;
        this.d = knf0Var;
    }

    public y3v(mne mneVar, fck0 fck0Var, knf0 knf0Var) {
        this.f41971a = (byte) 24;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = fck0Var;
        this.d = knf0Var;
    }

    public y3v(zn00 zn00Var, knf0 knf0Var, mne mneVar) {
        this.f41971a = (byte) 13;
        knf0Var.getClass();
        this.b = zn00Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public y3v(nx20 nx20Var, onv onvVar, knf0 knf0Var) {
        this.f41971a = (byte) 8;
        nx20Var.getClass();
        knf0Var.getClass();
        this.b = nx20Var;
        this.c = onvVar;
        this.d = knf0Var;
    }

    public y3v(btt0 btt0Var, dpi0 dpi0Var, knf0 knf0Var) {
        this.f41971a = (byte) 26;
        btt0Var.getClass();
        knf0Var.getClass();
        this.b = btt0Var;
        this.c = dpi0Var;
        this.d = knf0Var;
    }

    public y3v(y9n0 y9n0Var, epi0 epi0Var, btt0 btt0Var) {
        this.f41971a = (byte) 22;
        y9n0Var.getClass();
        btt0Var.getClass();
        this.b = y9n0Var;
        this.c = epi0Var;
        this.d = btt0Var;
    }

    public y3v(laj lajVar, do20 do20Var, knf0 knf0Var) {
        this.f41971a = (byte) 17;
        knf0Var.getClass();
        this.b = lajVar;
        this.c = do20Var;
        this.d = knf0Var;
    }

    public y3v(age0 age0Var) {
        this.f41971a = (byte) 11;
        this.b = new a14(0);
        this.c = new gr00();
        this.d = new a540((Object) this, (Object) age0Var, (byte) 12);
    }

    public y3v(List list) {
        this.f41971a = (byte) 18;
        this.b = list;
        this.c = new ncs0[list.size()];
        this.d = new fp(new ex60(this, (byte) 27));
    }

    public y3v(View view) {
        this.f41971a = (byte) 4;
        this.b = view;
        this.c = maz.a(wez.b, new y2x(this, (byte) 5));
        this.d = new ani0(view);
    }

    public y3v(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f41971a = (byte) 19;
        this.c = new ArrayDeque();
        this.b = sharedPreferences;
        this.d = scheduledThreadPoolExecutor;
    }

    public y3v(zub0 zub0Var, ArrayList arrayList, j0a j0aVar) {
        this.f41971a = (byte) 14;
        this.d = zub0Var;
        this.b = arrayList;
        this.c = j0aVar;
    }

    public y3v(String str) {
        this.f41971a = (byte) 10;
        zn00 zn00Var = new zn00();
        this.c = zn00Var;
        this.d = zn00Var;
        this.b = str;
    }

    public y3v(b1t0 b1t0Var, y3v y3vVar) {
        this.f41971a = (byte) 27;
        this.b = b1t0Var;
        this.c = y3vVar;
        this.d = b1t0Var.getValue();
    }
}
