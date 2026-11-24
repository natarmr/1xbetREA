package a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.cloudmessaging.RegisterRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.IOException;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a6u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f333a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public a6u(r2m0 r2m0Var, gst0 gst0Var, zfo zfoVar, edo edoVar, j1q0 j1q0Var) {
        this.f333a = (byte) 12;
        r2m0Var.getClass();
        gst0Var.getClass();
        zfoVar.getClass();
        edoVar.getClass();
        j1q0Var.getClass();
        this.b = r2m0Var;
        this.c = gst0Var;
        this.e = zfoVar;
        this.f = edoVar;
        this.d = j1q0Var;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zlb) it.next()).c);
        }
        return r3d.r(arrayList);
    }

    public static Exception n(Task task) {
        return task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public Object A(long j, d5p d5pVar, zje zjeVar) {
        n9u n9uVar;
        ali aliVar;
        List list;
        long j2;
        long j3;
        long j4;
        long j5;
        n0o0 n0o0Var = (n0o0) this.f;
        viu viuVar = (viu) this.d;
        if (zjeVar instanceof n9u) {
            n9uVar = (n9u) zjeVar;
            int i = n9uVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                n9uVar.q = i - Integer.MIN_VALUE;
            } else {
                n9uVar = new n9u(this, zjeVar);
            }
        } else {
            n9uVar = new n9u(this, zjeVar);
        }
        Object obj = n9uVar.o;
        wne wneVar = wne.f39444a;
        int i2 = n9uVar.q;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            int iOrdinal = d5pVar.ordinal();
            if (iOrdinal == 0) {
                f7u f7uVar = (f7u) this.b;
                boolean z = ((sff0) n0o0Var.getValue()).J1;
                boolean z2 = ((sff0) n0o0Var.getValue()).O1;
                long jF = ynq0.f(viuVar.a());
                n9uVar.i = j;
                n9uVar.q = 3;
                p6d p6dVar = new p6d(f7uVar.l(j, jF, true, z, z2), f7uVar.l(j, jF, false, z, z2), f9u.h, b);
                if (p6dVar != wneVar) {
                    return p6dVar;
                }
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                long jA = viuVar.a();
                long jF2 = ynq0.f(jA);
                aliVar = (ali) this.c;
                List listU = cs0.u(j);
                pmi pmiVar = (pmi) this.e;
                n9uVar.m = aliVar;
                n9uVar.n = listU;
                n9uVar.i = j;
                n9uVar.j = jA;
                n9uVar.k = jF2;
                n9uVar.l = jF2;
                n9uVar.q = 1;
                Serializable serializableX = pmiVar.x(n9uVar);
                if (serializableX != wneVar) {
                    list = listU;
                    j2 = jA;
                    j3 = jF2;
                    obj = serializableX;
                    j4 = j;
                    j5 = j3;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            if (i2 == 3) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j6 = n9uVar.l;
        long j7 = n9uVar.k;
        j2 = n9uVar.j;
        j4 = n9uVar.i;
        List list2 = n9uVar.n;
        aliVar = n9uVar.m;
        z1x.P(obj);
        j3 = j6;
        list = list2;
        j5 = j7;
        int iIntValue = ((Number) obj).intValue();
        boolean z3 = ((sff0) n0o0Var.getValue()).J1;
        boolean z4 = ((sff0) n0o0Var.getValue()).O1;
        n9uVar.m = null;
        n9uVar.n = null;
        n9uVar.i = j4;
        n9uVar.j = j2;
        n9uVar.k = j5;
        n9uVar.q = 2;
        utb utbVarC = aoq.c(((uzc) aliVar.f1068a).c(), new d9u(null, aliVar, list, j3, iIntValue, z3, z4));
        return utbVarC == wneVar ? wneVar : utbVarC;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object B(long j, boolean z, long j2, long j3, boolean z2, boolean z3, int i, zje zjeVar) {
        f5z f5zVar;
        boolean z4;
        long j4;
        boolean z5;
        boolean z6;
        int i2;
        long j5;
        long j6;
        if (zjeVar instanceof f5z) {
            f5zVar = (f5z) zjeVar;
            int i3 = f5zVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f5zVar.r = i3 - Integer.MIN_VALUE;
            } else {
                f5zVar = new f5z(this, zjeVar);
            }
        } else {
            f5zVar = new f5z(this, zjeVar);
        }
        f5z f5zVar2 = f5zVar;
        Object obj = f5zVar2.p;
        Object obj2 = wne.f39444a;
        int i4 = f5zVar2.r;
        if (i4 == 0) {
            z1x.P(obj);
            f5zVar2.i = j;
            f5zVar2.l = z;
            f5zVar2.j = j2;
            f5zVar2.k = j3;
            f5zVar2.m = z2;
            f5zVar2.n = z3;
            f5zVar2.o = i;
            f5zVar2.r = 1;
            if (s(j, j3, f5zVar2, z) == obj2) {
                return obj2;
            }
            z4 = z;
            j4 = j2;
            z5 = z2;
            z6 = z3;
            i2 = i;
            j5 = j;
            j6 = j3;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = f5zVar2.o;
            boolean z7 = f5zVar2.n;
            boolean z8 = f5zVar2.m;
            long j7 = f5zVar2.k;
            long j8 = f5zVar2.j;
            z4 = f5zVar2.l;
            long j9 = f5zVar2.i;
            z1x.P(obj);
            z6 = z7;
            z5 = z8;
            j6 = j7;
            j4 = j8;
            j5 = j9;
            i2 = i5;
        }
        byte b = 22;
        return new i89(aoq.c(new i89((p7m0) this.f, b), new e5z(null, this, z5, z6, i2, j4, j5, z4, j6)), b);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    public Object C(zje zjeVar) {
        z5u z5uVar;
        long j;
        wfu wfuVar;
        yje yjeVar = null;
        byte b = 1;
        switch (this.f333a) {
            case 0:
                j1q0 j1q0Var = (j1q0) this.d;
                if (zjeVar instanceof z5u) {
                    z5uVar = (z5u) zjeVar;
                    int i = z5uVar.l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        z5uVar.l = i - Integer.MIN_VALUE;
                    } else {
                        z5uVar = new z5u(this, zjeVar);
                    }
                } else {
                    z5uVar = new z5u(this, zjeVar);
                }
                Object objR = z5uVar.j;
                Object obj = wne.f39444a;
                int i2 = z5uVar.l;
                if (i2 == 0) {
                    z1x.P(objR);
                    long jE = ((gst0) this.c).e();
                    z5uVar.i = jE;
                    z5uVar.l = 1;
                    objR = r(z5uVar);
                    if (objR == obj) {
                        return obj;
                    }
                    j = jE;
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = z5uVar.i;
                    z1x.P(objR);
                }
                ((yfu) this.f).j();
                String str = "1_Android_" + j + BundleUtil.UNDERLINE_TAG + ((String) objR);
                if (j1q0Var.f15748a.l()) {
                    return str.concat("_CRMTST");
                }
                return j1q0Var.f15748a.m() ? str.concat("_CRMTSTV2") : str;
            default:
                if (zjeVar instanceof wfu) {
                    wfuVar = (wfu) zjeVar;
                    int i3 = wfuVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wfuVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        wfuVar = new wfu(this, zjeVar);
                    }
                } else {
                    wfuVar = new wfu(this, zjeVar);
                }
                wfu wfuVar2 = wfuVar;
                Object objA = wfuVar2.i;
                wne wneVar = wne.f39444a;
                int i4 = wfuVar2.k;
                if (i4 == 0) {
                    z1x.P(objA);
                    j3c j3cVar = (j3c) this.b;
                    wfuVar2.k = 1;
                    objA = j3cVar.a(189L, -1L, wfuVar2);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objA);
                }
                ypl0 ypl0Var = (ypl0) objA;
                return new p6d(i(sip.c, ypl0Var), i(sip.b, ypl0Var), new wx4((Object) ypl0Var, yjeVar, (byte) 16), b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x035d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0360  */
    /* JADX WARN: Code duplicated, block: B:110:0x0363  */
    /* JADX WARN: Code duplicated, block: B:111:0x036a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0370  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:116:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:118:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:123:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:125:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:129:0x0400  */
    /* JADX WARN: Code duplicated, block: B:130:0x0405  */
    /* JADX WARN: Code duplicated, block: B:132:0x0408  */
    /* JADX WARN: Code duplicated, block: B:136:0x044e  */
    /* JADX WARN: Code duplicated, block: B:139:0x049c  */
    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX WARN: Code duplicated, block: B:143:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:148:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:152:0x04db  */
    /* JADX WARN: Code duplicated, block: B:154:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:156:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:158:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:160:0x0509  */
    /* JADX WARN: Code duplicated, block: B:162:0x0514  */
    /* JADX WARN: Code duplicated, block: B:164:0x051e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0529  */
    /* JADX WARN: Code duplicated, block: B:168:0x0533  */
    /* JADX WARN: Code duplicated, block: B:170:0x053e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0548  */
    /* JADX WARN: Code duplicated, block: B:178:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:180:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x04ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:202:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:46:0x0147  */
    /* JADX WARN: Code duplicated, block: B:48:0x014a  */
    /* JADX WARN: Code duplicated, block: B:52:0x018a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x020a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0214  */
    /* JADX WARN: Code duplicated, block: B:68:0x021d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0227  */
    /* JADX WARN: Code duplicated, block: B:72:0x0232  */
    /* JADX WARN: Code duplicated, block: B:74:0x0245  */
    /* JADX WARN: Code duplicated, block: B:76:0x024f  */
    /* JADX WARN: Code duplicated, block: B:78:0x025a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0264  */
    /* JADX WARN: Code duplicated, block: B:82:0x026f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0279  */
    /* JADX WARN: Code duplicated, block: B:86:0x0284  */
    /* JADX WARN: Code duplicated, block: B:88:0x028e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0299  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a3  */
    public Object D(List list, ynb0 ynb0Var, int i, boolean z, boolean z2, zje zjeVar) {
        Object obj;
        o4v o4vVar;
        wne wneVar;
        Object obj2;
        int i2;
        ArrayList arrayList;
        Object obj3;
        ArrayList arrayList2;
        Iterator it;
        i2q i2qVar;
        String str;
        xsu xsuVar;
        List listL0;
        cne0 cne0VarP;
        String str2;
        Object objA;
        boolean z3;
        cne0 cne0Var;
        String str3;
        int i3;
        Object next;
        String strE;
        jo20 jo20Var;
        ArrayList arrayList3;
        i2q i2qVar2;
        Object objD0;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Object obj4;
        p4v p4vVar;
        Object obj5;
        wne wneVar2;
        int i4;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList4;
        String str10;
        s1q s1qVar;
        ArrayList arrayList5;
        ArrayList arrayList6;
        i2q i2qVar3;
        String str11;
        g2v g2vVar;
        List listL1;
        cne0 cne0VarP2;
        Object objA2;
        String str12;
        boolean z4;
        g2v g2vVar2;
        List list2;
        Object obj6;
        int i5;
        String strE2;
        jo20 jo20Var2;
        ArrayList arrayList7;
        i2q i2qVar4;
        Object objD1;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        ynb0 ynb0Var2 = ynb0Var;
        int i6 = i;
        boolean z5 = z;
        boolean z6 = z2;
        String str20 = "SocialApp";
        String str21 = "SocialNetId";
        String str22 = "SocialTokenSecret";
        switch (this.f333a) {
            case 20:
                Object obj7 = "Surname";
                if (zjeVar instanceof o4v) {
                    o4vVar = (o4v) zjeVar;
                    obj = "Date";
                    int i7 = o4vVar.t;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        o4vVar.t = i7 - Integer.MIN_VALUE;
                    }
                    Object obj8 = o4vVar.r;
                    wneVar = wne.f39444a;
                    obj2 = obj8;
                    i2 = o4vVar.t;
                    if (i2 != 0) {
                        z1x.P(obj2);
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        linkedHashSet2.addAll(list);
                        arrayList = new ArrayList();
                        for (Object obj9 : list) {
                            Object obj10 = obj7;
                            if (obj9 instanceof j1q) {
                                arrayList.add(obj9);
                            }
                            obj7 = obj10;
                        }
                        obj3 = obj7;
                        arrayList2 = new ArrayList();
                        it = list.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            Iterator it2 = it;
                            if (next instanceof i2q) {
                                arrayList2.add(next);
                            }
                            it = it2;
                        }
                        i2qVar = (i2q) CollectionsKt.firstOrNull(arrayList2);
                        if (i2qVar != null) {
                            str = i2qVar.c.i;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        ((l1f0) ((pmi0) this.c).f27236a).f19249a.getClass();
                        xsuVar = (xsu) this.b;
                        listL0 = CollectionsKt.L0(linkedHashSet2);
                        cne0VarP = ((f7u) this.f).p();
                        umt umtVar = (umt) this.e;
                        o4vVar.i = str;
                        o4vVar.j = xsuVar;
                        o4vVar.k = listL0;
                        o4vVar.l = cne0VarP;
                        o4vVar.m = ynb0Var2;
                        o4vVar.n = i6;
                        o4vVar.p = z5;
                        o4vVar.q = z6;
                        o4vVar.o = i6;
                        str2 = str;
                        o4vVar.t = 1;
                        objA = umtVar.a(o4vVar);
                        if (objA != wneVar) {
                            obj2 = objA;
                            z3 = z5;
                            cne0Var = cne0VarP;
                            str3 = str2;
                            i3 = i6;
                        }
                        return wneVar;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            z1x.P(obj2);
                            return obj2;
                        }
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = o4vVar.o;
                    boolean z7 = o4vVar.q;
                    boolean z8 = o4vVar.p;
                    i3 = o4vVar.n;
                    ynb0 ynb0Var3 = o4vVar.m;
                    cne0 cne0Var2 = o4vVar.l;
                    List list3 = o4vVar.k;
                    xsu xsuVar2 = o4vVar.j;
                    String str23 = o4vVar.i;
                    z1x.P(obj2);
                    z6 = z7;
                    ynb0Var2 = ynb0Var3;
                    obj3 = obj7;
                    listL0 = list3;
                    str3 = str23;
                    z3 = z8;
                    cne0Var = cne0Var2;
                    i6 = i8;
                    xsuVar = xsuVar2;
                    String str24 = (String) obj2;
                    ynb0 ynb0Var4 = ynb0Var2;
                    int i9 = i6;
                    strE = ((bst) this.d).e(System.currentTimeMillis() / 1000, str3);
                    o4vVar.i = null;
                    o4vVar.j = null;
                    o4vVar.k = null;
                    o4vVar.l = null;
                    o4vVar.m = null;
                    o4vVar.n = i3;
                    o4vVar.p = z3;
                    o4vVar.q = z6;
                    o4vVar.t = 2;
                    y1f0 y1f0Var = (y1f0) xsuVar.f41434a;
                    y1f0Var.getClass();
                    q7f0 q7f0Var = q7f0.REGULATOR;
                    listL0.getClass();
                    cne0Var.getClass();
                    jo20Var = new jo20();
                    n6x.O(jo20Var, q7f0Var);
                    if (strE.length() > 0) {
                        jo20Var.put("SocialToken", ncy.c(strE));
                    }
                    arrayList3 = new ArrayList();
                    for (Object obj11 : listL0) {
                        if (obj11 instanceof i2q) {
                            arrayList3.add(obj11);
                        }
                    }
                    i2qVar2 = (i2q) ((j2q) CollectionsKt.firstOrNull(arrayList3));
                    if (i2qVar2 != null) {
                        str9 = i2qVar2.c.f6191a;
                        if (str9.length() > 0) {
                            jo20Var.put("AuthCode", ncy.c(str9));
                        }
                    }
                    if (i2qVar2 != null) {
                        str8 = i2qVar2.c.c;
                        if (str8.length() > 0) {
                            jo20Var.put("SocialTokenSecret", ncy.c(str8));
                        }
                    }
                    if (i2qVar2 != null) {
                        jo20Var.put("SocialNetId", ncy.b(Integer.valueOf(i2qVar2.c.b)));
                    }
                    if (i2qVar2 != null) {
                        str7 = i2qVar2.c.d;
                        if (str7.length() > 0) {
                            jo20Var.put("SocialApp", ncy.c(str7));
                        }
                    }
                    if (i2qVar2 != null) {
                        str6 = i2qVar2.c.e;
                        if (str6.length() > 0) {
                            jo20Var.put("Name", ncy.c(str6));
                        }
                    }
                    if (i2qVar2 != null) {
                        str5 = i2qVar2.c.f;
                        if (str5.length() > 0) {
                            jo20Var.put(obj3, ncy.c(str5));
                        }
                    }
                    if (i2qVar2 != null) {
                        str4 = i2qVar2.c.h;
                        if (str4.length() > 0) {
                            jo20Var.put("Phone", ncy.c(str4));
                        }
                    }
                    n6x.M(jo20Var, listL0, z3, cne0Var.f4650a);
                    n6x.u(jo20Var, listL0);
                    n6x.v(jo20Var, listL0);
                    n6x.t(jo20Var, listL0);
                    n6x.q(jo20Var, listL0);
                    n6x.x0(jo20Var, listL0);
                    n6x.z(jo20Var, listL0, i9);
                    n6x.j0(jo20Var, listL0);
                    n6x.Z(jo20Var, listL0);
                    n6x.a0(jo20Var, listL0);
                    n6x.I(jo20Var, listL0);
                    n6x.x(jo20Var, listL0);
                    n6x.l(jo20Var, listL0);
                    n6x.H(jo20Var, listL0);
                    n6x.E(jo20Var, listL0);
                    n6x.N(jo20Var, cne0Var);
                    n6x.f0(jo20Var, listL0);
                    n6x.P(jo20Var, listL0);
                    n6x.j(jo20Var, listL0);
                    n6x.L(jo20Var, listL0);
                    n6x.W(jo20Var, listL0);
                    n6x.X(jo20Var, listL0);
                    n6x.K(jo20Var, listL0);
                    n6x.g0(jo20Var, listL0);
                    jo20Var.put(obj, ncy.b(Long.valueOf(System.currentTimeMillis() / 1000)));
                    n6x.l0(jo20Var);
                    boolean z9 = z6;
                    objD0 = qjj.d0(y1f0Var.b.b, new x1f0(z9, y1f0Var, str24, new d2f0(jo20Var.b(), ynb0Var4.f42933a, ynb0Var4.b), null, (byte) 0), o4vVar);
                    if (objD0 != wneVar) {
                        return objD0;
                    }
                    return wneVar;
                }
                obj = "Date";
                o4vVar = new o4v(this, zjeVar);
                Object obj12 = o4vVar.r;
                wneVar = wne.f39444a;
                obj2 = obj12;
                i2 = o4vVar.t;
                if (i2 != 0) {
                    z1x.P(obj2);
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    linkedHashSet3.addAll(list);
                    arrayList = new ArrayList();
                    while (r17.hasNext()) {
                        Object obj13 = obj7;
                        if (obj9 instanceof j1q) {
                            arrayList.add(obj9);
                        }
                        obj7 = obj13;
                    }
                    obj3 = obj7;
                    arrayList2 = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        Iterator it3 = it;
                        if (next instanceof i2q) {
                            arrayList2.add(next);
                        }
                        it = it3;
                    }
                    i2qVar = (i2q) CollectionsKt.firstOrNull(arrayList2);
                    if (i2qVar != null) {
                        str = i2qVar.c.i;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    ((l1f0) ((pmi0) this.c).f27236a).f19249a.getClass();
                    xsuVar = (xsu) this.b;
                    listL0 = CollectionsKt.L0(linkedHashSet3);
                    cne0VarP = ((f7u) this.f).p();
                    umt umtVar2 = (umt) this.e;
                    o4vVar.i = str;
                    o4vVar.j = xsuVar;
                    o4vVar.k = listL0;
                    o4vVar.l = cne0VarP;
                    o4vVar.m = ynb0Var2;
                    o4vVar.n = i6;
                    o4vVar.p = z5;
                    o4vVar.q = z6;
                    o4vVar.o = i6;
                    str2 = str;
                    o4vVar.t = 1;
                    objA = umtVar2.a(o4vVar);
                    if (objA != wneVar) {
                        obj2 = objA;
                        z3 = z5;
                        cne0Var = cne0VarP;
                        str3 = str2;
                        i3 = i6;
                    }
                    return wneVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        z1x.P(obj2);
                        return obj2;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = o4vVar.o;
                boolean z10 = o4vVar.q;
                boolean z11 = o4vVar.p;
                i3 = o4vVar.n;
                ynb0 ynb0Var5 = o4vVar.m;
                cne0 cne0Var3 = o4vVar.l;
                List list4 = o4vVar.k;
                xsu xsuVar3 = o4vVar.j;
                String str25 = o4vVar.i;
                z1x.P(obj2);
                z6 = z10;
                ynb0Var2 = ynb0Var5;
                obj3 = obj7;
                listL0 = list4;
                str3 = str25;
                z3 = z11;
                cne0Var = cne0Var3;
                i6 = i10;
                xsuVar = xsuVar3;
                String str26 = (String) obj2;
                ynb0 ynb0Var6 = ynb0Var2;
                int i11 = i6;
                strE = ((bst) this.d).e(System.currentTimeMillis() / 1000, str3);
                o4vVar.i = null;
                o4vVar.j = null;
                o4vVar.k = null;
                o4vVar.l = null;
                o4vVar.m = null;
                o4vVar.n = i3;
                o4vVar.p = z3;
                o4vVar.q = z6;
                o4vVar.t = 2;
                y1f0 y1f0Var2 = (y1f0) xsuVar.f41434a;
                y1f0Var2.getClass();
                q7f0 q7f0Var2 = q7f0.REGULATOR;
                listL0.getClass();
                cne0Var.getClass();
                jo20Var = new jo20();
                n6x.O(jo20Var, q7f0Var2);
                if (strE.length() > 0) {
                    jo20Var.put("SocialToken", ncy.c(strE));
                }
                arrayList3 = new ArrayList();
                while (r4.hasNext()) {
                    if (obj11 instanceof i2q) {
                        arrayList3.add(obj11);
                    }
                }
                i2qVar2 = (i2q) ((j2q) CollectionsKt.firstOrNull(arrayList3));
                if (i2qVar2 != null) {
                    str9 = i2qVar2.c.f6191a;
                    if (str9.length() > 0) {
                        jo20Var.put("AuthCode", ncy.c(str9));
                    }
                }
                if (i2qVar2 != null) {
                    str8 = i2qVar2.c.c;
                    if (str8.length() > 0) {
                        jo20Var.put("SocialTokenSecret", ncy.c(str8));
                    }
                }
                if (i2qVar2 != null) {
                    jo20Var.put("SocialNetId", ncy.b(Integer.valueOf(i2qVar2.c.b)));
                }
                if (i2qVar2 != null) {
                    str7 = i2qVar2.c.d;
                    if (str7.length() > 0) {
                        jo20Var.put("SocialApp", ncy.c(str7));
                    }
                }
                if (i2qVar2 != null) {
                    str6 = i2qVar2.c.e;
                    if (str6.length() > 0) {
                        jo20Var.put("Name", ncy.c(str6));
                    }
                }
                if (i2qVar2 != null) {
                    str5 = i2qVar2.c.f;
                    if (str5.length() > 0) {
                        jo20Var.put(obj3, ncy.c(str5));
                    }
                }
                if (i2qVar2 != null) {
                    str4 = i2qVar2.c.h;
                    if (str4.length() > 0) {
                        jo20Var.put("Phone", ncy.c(str4));
                    }
                }
                n6x.M(jo20Var, listL0, z3, cne0Var.f4650a);
                n6x.u(jo20Var, listL0);
                n6x.v(jo20Var, listL0);
                n6x.t(jo20Var, listL0);
                n6x.q(jo20Var, listL0);
                n6x.x0(jo20Var, listL0);
                n6x.z(jo20Var, listL0, i11);
                n6x.j0(jo20Var, listL0);
                n6x.Z(jo20Var, listL0);
                n6x.a0(jo20Var, listL0);
                n6x.I(jo20Var, listL0);
                n6x.x(jo20Var, listL0);
                n6x.l(jo20Var, listL0);
                n6x.H(jo20Var, listL0);
                n6x.E(jo20Var, listL0);
                n6x.N(jo20Var, cne0Var);
                n6x.f0(jo20Var, listL0);
                n6x.P(jo20Var, listL0);
                n6x.j(jo20Var, listL0);
                n6x.L(jo20Var, listL0);
                n6x.W(jo20Var, listL0);
                n6x.X(jo20Var, listL0);
                n6x.K(jo20Var, listL0);
                n6x.g0(jo20Var, listL0);
                jo20Var.put(obj, ncy.b(Long.valueOf(System.currentTimeMillis() / 1000)));
                n6x.l0(jo20Var);
                boolean z12 = z6;
                objD0 = qjj.d0(y1f0Var2.b.b, new x1f0(z12, y1f0Var2, str26, new d2f0(jo20Var.b(), ynb0Var6.f42933a, ynb0Var6.b), null, (byte) 0), o4vVar);
                if (objD0 != wneVar) {
                    return objD0;
                }
                return wneVar;
            default:
                bst bstVar = (bst) this.c;
                if (zjeVar instanceof p4v) {
                    p4vVar = (p4v) zjeVar;
                    obj4 = "Surname";
                    int i12 = p4vVar.t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        p4vVar.t = i12 - Integer.MIN_VALUE;
                    }
                    obj5 = p4vVar.r;
                    wneVar2 = wne.f39444a;
                    i4 = p4vVar.t;
                    if (i4 != 0) {
                        z1x.P(obj5);
                        linkedHashSet = new LinkedHashSet();
                        linkedHashSet.addAll(list);
                        arrayList4 = new ArrayList();
                        for (Object obj14 : linkedHashSet) {
                            String str27 = str20;
                            if (obj14 instanceof s1q) {
                                arrayList4.add(obj14);
                            }
                            str20 = str27;
                        }
                        str10 = str20;
                        s1qVar = (s1q) CollectionsKt.firstOrNull(arrayList4);
                        if (s1qVar == null) {
                            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                            String strG = wxs0.g(jCurrentTimeMillis, s1qVar.b);
                            linkedHashSet.remove(s1qVar);
                            linkedHashSet.add(new t1q(jCurrentTimeMillis));
                            linkedHashSet.add(new s1q(strG, s1qVar.f31470a));
                        }
                        arrayList5 = new ArrayList();
                        for (Object obj15 : list) {
                            if (obj15 instanceof j1q) {
                                arrayList5.add(obj15);
                            }
                        }
                        arrayList6 = new ArrayList();
                        for (Object obj16 : list) {
                            if (obj16 instanceof i2q) {
                                arrayList6.add(obj16);
                            }
                        }
                        i2qVar3 = (i2q) CollectionsKt.firstOrNull(arrayList6);
                        if (i2qVar3 != null) {
                            str11 = i2qVar3.c.i;
                        } else {
                            str11 = null;
                        }
                        if (str11 == null) {
                            str11 = "";
                        }
                        ((l1f0) ((pmi0) this.d).f27236a).f19249a.getClass();
                        g2vVar = (g2v) this.b;
                        listL1 = CollectionsKt.L0(linkedHashSet);
                        cne0VarP2 = ((f7u) this.f).p();
                        umt umtVar3 = (umt) this.e;
                        p4vVar.i = str11;
                        p4vVar.j = g2vVar;
                        p4vVar.k = listL1;
                        p4vVar.l = cne0VarP2;
                        p4vVar.m = ynb0Var2;
                        p4vVar.n = i6;
                        p4vVar.p = z5;
                        p4vVar.q = z6;
                        p4vVar.o = i6;
                        p4vVar.t = 1;
                        objA2 = umtVar3.a(p4vVar);
                        if (objA2 != wneVar2) {
                            str12 = str11;
                            z4 = z6;
                            g2vVar2 = g2vVar;
                            list2 = listL1;
                            obj6 = objA2;
                            i5 = i6;
                        }
                        return wneVar2;
                    }
                    if (i4 != 1) {
                        if (i4 == 2) {
                            z1x.P(obj5);
                            return obj5;
                        }
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i13 = p4vVar.o;
                    z4 = p4vVar.q;
                    boolean z13 = p4vVar.p;
                    int i14 = p4vVar.n;
                    ynb0 ynb0Var7 = p4vVar.m;
                    cne0 cne0Var4 = p4vVar.l;
                    List list5 = p4vVar.k;
                    g2v g2vVar3 = p4vVar.j;
                    String str28 = p4vVar.i;
                    z1x.P(obj5);
                    z5 = z13;
                    ynb0Var2 = ynb0Var7;
                    str10 = "SocialApp";
                    str21 = "SocialNetId";
                    str22 = "SocialTokenSecret";
                    cne0VarP2 = cne0Var4;
                    g2vVar2 = g2vVar3;
                    str12 = str28;
                    i5 = i14;
                    list2 = list5;
                    i6 = i13;
                    obj6 = obj5;
                    String str29 = (String) obj6;
                    ynb0 ynb0Var8 = ynb0Var2;
                    int i15 = i6;
                    strE2 = bstVar.e(System.currentTimeMillis() / 1000, str12);
                    p4vVar.i = null;
                    p4vVar.j = null;
                    p4vVar.k = null;
                    p4vVar.l = null;
                    p4vVar.m = null;
                    p4vVar.n = i5;
                    p4vVar.p = z5;
                    p4vVar.q = z4;
                    p4vVar.t = 2;
                    y1f0 y1f0Var3 = (y1f0) g2vVar2.f10580a;
                    y1f0Var3.getClass();
                    q7f0 q7f0Var3 = q7f0.SOCIAL;
                    list2.getClass();
                    cne0VarP2.getClass();
                    jo20Var2 = new jo20();
                    n6x.O(jo20Var2, q7f0Var3);
                    n6x.u(jo20Var2, list2);
                    n6x.v(jo20Var2, list2);
                    if (strE2.length() > 0) {
                        jo20Var2.put("SocialToken", ncy.c(strE2));
                    }
                    n6x.M(jo20Var2, list2, z5, cne0VarP2.f4650a);
                    arrayList7 = new ArrayList();
                    for (Object obj17 : list2) {
                        if (obj17 instanceof i2q) {
                            arrayList7.add(obj17);
                        }
                    }
                    i2qVar4 = (i2q) ((j2q) CollectionsKt.firstOrNull(arrayList7));
                    if (i2qVar4 != null) {
                        str19 = i2qVar4.c.f6191a;
                        if (str19.length() > 0) {
                            jo20Var2.put("AuthCode", ncy.c(str19));
                        }
                    }
                    if (i2qVar4 != null) {
                        str18 = i2qVar4.c.c;
                        if (str18.length() > 0) {
                            jo20Var2.put(str22, ncy.c(str18));
                        }
                    }
                    if (i2qVar4 != null) {
                        jo20Var2.put(str21, ncy.b(Integer.valueOf(i2qVar4.c.b)));
                    }
                    if (i2qVar4 != null) {
                        str17 = i2qVar4.c.d;
                        if (str17.length() > 0) {
                            jo20Var2.put(str10, ncy.c(str17));
                        }
                    }
                    if (i2qVar4 != null) {
                        str16 = i2qVar4.c.e;
                        if (str16.length() > 0) {
                            jo20Var2.put("Name", ncy.c(str16));
                        }
                    }
                    if (i2qVar4 != null) {
                        str15 = i2qVar4.c.f;
                        if (str15.length() > 0) {
                            jo20Var2.put(obj4, ncy.c(str15));
                        }
                    }
                    if (i2qVar4 != null) {
                        str14 = i2qVar4.c.h;
                        if (str14.length() > 0) {
                            jo20Var2.put("Phone", ncy.c(str14));
                        }
                    }
                    if (i2qVar4 != null) {
                        str13 = i2qVar4.c.g;
                        if (str13.length() > 0) {
                            jo20Var2.put("Email", ncy.c(str13));
                        }
                    }
                    n6x.t(jo20Var2, list2);
                    n6x.q(jo20Var2, list2);
                    n6x.x0(jo20Var2, list2);
                    n6x.Z(jo20Var2, list2);
                    n6x.a0(jo20Var2, list2);
                    n6x.I(jo20Var2, list2);
                    n6x.z(jo20Var2, list2, i15);
                    n6x.j0(jo20Var2, list2);
                    jo20Var2.put("Date", ncy.b(Long.valueOf(System.currentTimeMillis() / 1000)));
                    n6x.P(jo20Var2, list2);
                    n6x.K(jo20Var2, list2);
                    n6x.f0(jo20Var2, list2);
                    n6x.j(jo20Var2, list2);
                    n6x.L(jo20Var2, list2);
                    n6x.W(jo20Var2, list2);
                    n6x.X(jo20Var2, list2);
                    n6x.g0(jo20Var2, list2);
                    n6x.l0(jo20Var2);
                    n6x.E(jo20Var2, list2);
                    n6x.l(jo20Var2, list2);
                    n6x.H(jo20Var2, list2);
                    n6x.N(jo20Var2, cne0VarP2);
                    boolean z14 = z4;
                    objD1 = qjj.d0(y1f0Var3.b.b, new x1f0(z14, y1f0Var3, str29, new d2f0(jo20Var2.b(), ynb0Var8.f42933a, ynb0Var8.b), null, (byte) 1), p4vVar);
                    if (objD1 != wneVar2) {
                        return objD1;
                    }
                    return wneVar2;
                }
                obj4 = "Surname";
                p4vVar = new p4v(this, zjeVar);
                obj5 = p4vVar.r;
                wneVar2 = wne.f39444a;
                i4 = p4vVar.t;
                if (i4 != 0) {
                    z1x.P(obj5);
                    linkedHashSet = new LinkedHashSet();
                    linkedHashSet.addAll(list);
                    arrayList4 = new ArrayList();
                    while (r17.hasNext()) {
                        String str210 = str20;
                        if (obj14 instanceof s1q) {
                            arrayList4.add(obj14);
                        }
                        str20 = str210;
                    }
                    str10 = str20;
                    s1qVar = (s1q) CollectionsKt.firstOrNull(arrayList4);
                    if (s1qVar == null) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                        String strG2 = wxs0.g(jCurrentTimeMillis2, s1qVar.b);
                        linkedHashSet.remove(s1qVar);
                        linkedHashSet.add(new t1q(jCurrentTimeMillis2));
                        linkedHashSet.add(new s1q(strG2, s1qVar.f31470a));
                    }
                    arrayList5 = new ArrayList();
                    while (r11.hasNext()) {
                        if (obj15 instanceof j1q) {
                            arrayList5.add(obj15);
                        }
                    }
                    arrayList6 = new ArrayList();
                    while (r11.hasNext()) {
                        if (obj16 instanceof i2q) {
                            arrayList6.add(obj16);
                        }
                    }
                    i2qVar3 = (i2q) CollectionsKt.firstOrNull(arrayList6);
                    if (i2qVar3 != null) {
                        str11 = i2qVar3.c.i;
                    } else {
                        str11 = null;
                    }
                    if (str11 == null) {
                        str11 = "";
                    }
                    ((l1f0) ((pmi0) this.d).f27236a).f19249a.getClass();
                    g2vVar = (g2v) this.b;
                    listL1 = CollectionsKt.L0(linkedHashSet);
                    cne0VarP2 = ((f7u) this.f).p();
                    umt umtVar4 = (umt) this.e;
                    p4vVar.i = str11;
                    p4vVar.j = g2vVar;
                    p4vVar.k = listL1;
                    p4vVar.l = cne0VarP2;
                    p4vVar.m = ynb0Var2;
                    p4vVar.n = i6;
                    p4vVar.p = z5;
                    p4vVar.q = z6;
                    p4vVar.o = i6;
                    p4vVar.t = 1;
                    objA2 = umtVar4.a(p4vVar);
                    if (objA2 != wneVar2) {
                        str12 = str11;
                        z4 = z6;
                        g2vVar2 = g2vVar;
                        list2 = listL1;
                        obj6 = objA2;
                        i5 = i6;
                    }
                    return wneVar2;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        z1x.P(obj5);
                        return obj5;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i16 = p4vVar.o;
                z4 = p4vVar.q;
                boolean z15 = p4vVar.p;
                int i17 = p4vVar.n;
                ynb0 ynb0Var9 = p4vVar.m;
                cne0 cne0Var5 = p4vVar.l;
                List list6 = p4vVar.k;
                g2v g2vVar4 = p4vVar.j;
                String str211 = p4vVar.i;
                z1x.P(obj5);
                z5 = z15;
                ynb0Var2 = ynb0Var9;
                str10 = "SocialApp";
                str21 = "SocialNetId";
                str22 = "SocialTokenSecret";
                cne0VarP2 = cne0Var5;
                g2vVar2 = g2vVar4;
                str12 = str211;
                i5 = i17;
                list2 = list6;
                i6 = i16;
                obj6 = obj5;
                String str212 = (String) obj6;
                ynb0 ynb0Var10 = ynb0Var2;
                int i18 = i6;
                strE2 = bstVar.e(System.currentTimeMillis() / 1000, str12);
                p4vVar.i = null;
                p4vVar.j = null;
                p4vVar.k = null;
                p4vVar.l = null;
                p4vVar.m = null;
                p4vVar.n = i5;
                p4vVar.p = z5;
                p4vVar.q = z4;
                p4vVar.t = 2;
                y1f0 y1f0Var4 = (y1f0) g2vVar2.f10580a;
                y1f0Var4.getClass();
                q7f0 q7f0Var4 = q7f0.SOCIAL;
                list2.getClass();
                cne0VarP2.getClass();
                jo20Var2 = new jo20();
                n6x.O(jo20Var2, q7f0Var4);
                n6x.u(jo20Var2, list2);
                n6x.v(jo20Var2, list2);
                if (strE2.length() > 0) {
                    jo20Var2.put("SocialToken", ncy.c(strE2));
                }
                n6x.M(jo20Var2, list2, z5, cne0VarP2.f4650a);
                arrayList7 = new ArrayList();
                while (r4.hasNext()) {
                    if (obj17 instanceof i2q) {
                        arrayList7.add(obj17);
                    }
                }
                i2qVar4 = (i2q) ((j2q) CollectionsKt.firstOrNull(arrayList7));
                if (i2qVar4 != null) {
                    str19 = i2qVar4.c.f6191a;
                    if (str19.length() > 0) {
                        jo20Var2.put("AuthCode", ncy.c(str19));
                    }
                }
                if (i2qVar4 != null) {
                    str18 = i2qVar4.c.c;
                    if (str18.length() > 0) {
                        jo20Var2.put(str22, ncy.c(str18));
                    }
                }
                if (i2qVar4 != null) {
                    jo20Var2.put(str21, ncy.b(Integer.valueOf(i2qVar4.c.b)));
                }
                if (i2qVar4 != null) {
                    str17 = i2qVar4.c.d;
                    if (str17.length() > 0) {
                        jo20Var2.put(str10, ncy.c(str17));
                    }
                }
                if (i2qVar4 != null) {
                    str16 = i2qVar4.c.e;
                    if (str16.length() > 0) {
                        jo20Var2.put("Name", ncy.c(str16));
                    }
                }
                if (i2qVar4 != null) {
                    str15 = i2qVar4.c.f;
                    if (str15.length() > 0) {
                        jo20Var2.put(obj4, ncy.c(str15));
                    }
                }
                if (i2qVar4 != null) {
                    str14 = i2qVar4.c.h;
                    if (str14.length() > 0) {
                        jo20Var2.put("Phone", ncy.c(str14));
                    }
                }
                if (i2qVar4 != null) {
                    str13 = i2qVar4.c.g;
                    if (str13.length() > 0) {
                        jo20Var2.put("Email", ncy.c(str13));
                    }
                }
                n6x.t(jo20Var2, list2);
                n6x.q(jo20Var2, list2);
                n6x.x0(jo20Var2, list2);
                n6x.Z(jo20Var2, list2);
                n6x.a0(jo20Var2, list2);
                n6x.I(jo20Var2, list2);
                n6x.z(jo20Var2, list2, i18);
                n6x.j0(jo20Var2, list2);
                jo20Var2.put("Date", ncy.b(Long.valueOf(System.currentTimeMillis() / 1000)));
                n6x.P(jo20Var2, list2);
                n6x.K(jo20Var2, list2);
                n6x.f0(jo20Var2, list2);
                n6x.j(jo20Var2, list2);
                n6x.L(jo20Var2, list2);
                n6x.W(jo20Var2, list2);
                n6x.X(jo20Var2, list2);
                n6x.g0(jo20Var2, list2);
                n6x.l0(jo20Var2);
                n6x.E(jo20Var2, list2);
                n6x.l(jo20Var2, list2);
                n6x.H(jo20Var2, list2);
                n6x.N(jo20Var2, cne0VarP2);
                boolean z16 = z4;
                objD1 = qjj.d0(y1f0Var4.b.b, new x1f0(z16, y1f0Var4, str212, new d2f0(jo20Var2.b(), ynb0Var10.f42933a, ynb0Var10.b), null, (byte) 1), p4vVar);
                if (objD1 != wneVar2) {
                    return objD1;
                }
                return wneVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r10 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(boolean r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.c6u
            if (r0 == 0) goto L13
            r0 = r10
            a.c6u r0 = (a.c6u) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.c6u r0 = new a.c6u
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.z1x.P(r10)
            goto La3
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r6
        L35:
            a.z1x.P(r10)
            goto L8b
        L39:
            boolean r9 = r0.i
            a.j910 r8 = r0.k
            a.v8d r2 = r0.j
            a.z1x.P(r10)
            goto L78
        L43:
            a.z1x.P(r10)
            java.lang.Object r10 = r8.e
            a.bzt r10 = (a.bzt) r10
            a.fsd r10 = r10.f3488a
            a.v8d r2 = r10.a()
            java.lang.Object r10 = r8.f
            a.n0o0 r10 = (a.n0o0) r10
            java.lang.Object r10 = r10.getValue()
            a.sff0 r10 = (a.sff0) r10
            boolean r10 = r10.H1
            if (r10 == 0) goto L8e
            java.lang.Object r10 = r8.c
            a.j910 r10 = (a.j910) r10
            java.lang.Object r8 = r8.d
            a.x0u r8 = (a.x0u) r8
            r0.j = r2
            r0.k = r10
            r0.i = r9
            r0.n = r5
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L75
            goto La2
        L75:
            r7 = r10
            r10 = r8
            r8 = r7
        L78:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r2 = r2.b
            r0.j = r6
            r0.k = r6
            r0.i = r9
            r0.n = r4
            java.lang.Object r10 = r8.r(r0, r10, r2, r9)
            if (r10 != r1) goto L8b
            goto La2
        L8b:
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L8e:
            java.lang.Object r8 = r8.b
            a.a7q r8 = (a.a7q) r8
            int r10 = r2.f36976a
            java.lang.String r2 = r2.b
            r0.j = r6
            r0.i = r9
            r0.n = r3
            java.lang.Object r10 = r8.d(r10, r0, r2, r9)
            if (r10 != r1) goto La3
        La2:
            return r1
        La3:
            java.lang.String r10 = (java.lang.String) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6u.E(boolean, a.zje):java.lang.Object");
    }

    public List F() {
        boolean zJ = ((lbu) this.d).j();
        sff0 sff0VarA = ((pru) this.c).a();
        if (zJ || !sff0VarA.b.f13233a.b) {
            return iun.f15405a;
        }
        sx3 sx3VarI = CollectionsKt.I(((f4u) this.b).b().f);
        r9u r9uVar = (r9u) this.e;
        ygp ygpVar = ygp.E1;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return pgi0.t(pgi0.p(qbc.N(sx3VarI, sff0VarA, ((epc) this.f).a().f13512a, j1q0Var.f15748a.d(ygpVar), false, false, false, 48), new eo0((byte) 17)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r1 == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r3.f(a.ame.f1102a, r4) == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        if (r3.f(a.zle.f44577a, r4) == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        if (r3.f(a.yle.f42835a, r4) == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
    
        if (r3.f(a.py5.f27790a, r4) == r5) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(double r17, a.zje r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6u.G(double, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object H(long j, zje zjeVar, String str) {
        v4z v4zVar;
        ljg ljgVar;
        long j2;
        ueh uehVar;
        a6u a6uVar;
        long j3;
        ypl0 ypl0Var;
        Object objP;
        ueh uehVar2;
        ypl0 ypl0Var2;
        a6u a6uVar2;
        ljg ljgVar2;
        q310 q310Var;
        Object objD;
        ypl0 ypl0Var3;
        q310 q310Var2;
        ueh uehVar3;
        ljg ljgVar3;
        if (zjeVar instanceof v4z) {
            v4zVar = (v4z) zjeVar;
            int i = v4zVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                v4zVar.r = i - Integer.MIN_VALUE;
            } else {
                v4zVar = new v4z(this, zjeVar);
            }
        } else {
            v4zVar = new v4z(this, zjeVar);
        }
        v4z v4zVar2 = v4zVar;
        Object objK = v4zVar2.p;
        wne wneVar = wne.f39444a;
        int i2 = v4zVar2.r;
        try {
            if (i2 == 0) {
                z1x.P(objK);
                e0g0 e0g0Var = j0g0.b;
                v4zVar2.i = str;
                v4zVar2.j = this;
                v4zVar2.o = j;
                v4zVar2.r = 1;
                objK = k(str, v4zVar2);
                if (objK == wneVar) {
                }
                return wneVar;
            }
            if (i2 == 1) {
                j = v4zVar2.o;
                this = v4zVar2.j;
                str = v4zVar2.i;
                z1x.P(objK);
            } else {
                if (i2 == 2) {
                    long j4 = v4zVar2.o;
                    ljg ljgVar4 = v4zVar2.k;
                    a6u a6uVar3 = v4zVar2.j;
                    z1x.P(objK);
                    j2 = j4;
                    this = a6uVar3;
                    ljgVar = ljgVar4;
                    uehVar = (ueh) objK;
                    j3c j3cVar = (j3c) this.f;
                    v4zVar2.i = null;
                    v4zVar2.j = this;
                    v4zVar2.k = ljgVar;
                    v4zVar2.l = uehVar;
                    v4zVar2.o = j2;
                    v4zVar2.r = 3;
                    objK = j3cVar.a(40L, j2, v4zVar2);
                    if (objK == wneVar) {
                        a6uVar = this;
                        j3 = j2;
                        ypl0Var = (ypl0) objK;
                        String str2 = ljgVar.b.c;
                        String str3 = ljgVar.c.c;
                        long j5 = ljgVar.f.f44687a;
                        v4zVar2.i = null;
                        v4zVar2.j = a6uVar;
                        v4zVar2.k = ljgVar;
                        v4zVar2.l = uehVar;
                        v4zVar2.m = ypl0Var;
                        v4zVar2.o = j3;
                        v4zVar2.r = 4;
                        objP = a6uVar.p(str2, str3, j5, v4zVar2);
                        if (objP != wneVar) {
                            ljg ljgVar5 = ljgVar;
                            uehVar2 = uehVar;
                            ypl0Var2 = ypl0Var;
                            objK = objP;
                            a6uVar2 = a6uVar;
                            ljgVar2 = ljgVar5;
                            q310Var = (q310) objK;
                            String str4 = ljgVar2.b.c;
                            String str5 = ljgVar2.c.c;
                            v4zVar2.i = null;
                            v4zVar2.j = null;
                            v4zVar2.k = ljgVar2;
                            v4zVar2.l = uehVar2;
                            v4zVar2.m = ypl0Var2;
                            v4zVar2.n = q310Var;
                            v4zVar2.o = j3;
                            v4zVar2.r = 5;
                            objD = a6uVar2.d(str4, str5, v4zVar2);
                            if (objD != wneVar) {
                                ypl0Var3 = ypl0Var2;
                                q310Var2 = q310Var;
                                uehVar3 = uehVar2;
                                ljgVar3 = ljgVar2;
                                objK = objD;
                            }
                        }
                    }
                    return wneVar;
                }
                if (i2 == 3) {
                    j3 = v4zVar2.o;
                    uehVar = v4zVar2.l;
                    ljgVar = v4zVar2.k;
                    a6uVar = v4zVar2.j;
                    z1x.P(objK);
                    ypl0Var = (ypl0) objK;
                    String str6 = ljgVar.b.c;
                    String str7 = ljgVar.c.c;
                    long j6 = ljgVar.f.f44687a;
                    v4zVar2.i = null;
                    v4zVar2.j = a6uVar;
                    v4zVar2.k = ljgVar;
                    v4zVar2.l = uehVar;
                    v4zVar2.m = ypl0Var;
                    v4zVar2.o = j3;
                    v4zVar2.r = 4;
                    objP = a6uVar.p(str6, str7, j6, v4zVar2);
                    if (objP != wneVar) {
                        ljg ljgVar6 = ljgVar;
                        uehVar2 = uehVar;
                        ypl0Var2 = ypl0Var;
                        objK = objP;
                        a6uVar2 = a6uVar;
                        ljgVar2 = ljgVar6;
                        q310Var = (q310) objK;
                        String str8 = ljgVar2.b.c;
                        String str9 = ljgVar2.c.c;
                        v4zVar2.i = null;
                        v4zVar2.j = null;
                        v4zVar2.k = ljgVar2;
                        v4zVar2.l = uehVar2;
                        v4zVar2.m = ypl0Var2;
                        v4zVar2.n = q310Var;
                        v4zVar2.o = j3;
                        v4zVar2.r = 5;
                        objD = a6uVar2.d(str8, str9, v4zVar2);
                        if (objD != wneVar) {
                            ypl0Var3 = ypl0Var2;
                            q310Var2 = q310Var;
                            uehVar3 = uehVar2;
                            ljgVar3 = ljgVar2;
                            objK = objD;
                        }
                    }
                    return wneVar;
                }
                if (i2 == 4) {
                    j3 = v4zVar2.o;
                    ypl0Var2 = v4zVar2.m;
                    uehVar2 = v4zVar2.l;
                    ljgVar2 = v4zVar2.k;
                    a6uVar2 = v4zVar2.j;
                    z1x.P(objK);
                    q310Var = (q310) objK;
                    String str10 = ljgVar2.b.c;
                    String str11 = ljgVar2.c.c;
                    v4zVar2.i = null;
                    v4zVar2.j = null;
                    v4zVar2.k = ljgVar2;
                    v4zVar2.l = uehVar2;
                    v4zVar2.m = ypl0Var2;
                    v4zVar2.n = q310Var;
                    v4zVar2.o = j3;
                    v4zVar2.r = 5;
                    objD = a6uVar2.d(str10, str11, v4zVar2);
                    if (objD != wneVar) {
                        ypl0Var3 = ypl0Var2;
                        q310Var2 = q310Var;
                        uehVar3 = uehVar2;
                        ljgVar3 = ljgVar2;
                        objK = objD;
                    }
                    return wneVar;
                }
                if (i2 != 5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                q310 q310Var3 = v4zVar2.n;
                ypl0 ypl0Var4 = v4zVar2.m;
                ueh uehVar4 = v4zVar2.l;
                ljg ljgVar7 = v4zVar2.k;
                z1x.P(objK);
                q310Var2 = q310Var3;
                ypl0Var3 = ypl0Var4;
                uehVar3 = uehVar4;
                ljgVar3 = ljgVar7;
            }
            y3h y3hVar = (y3h) objK;
            y3hVar.getClass();
            n210 n210Var = new n210(ljgVar3, uehVar3, y3hVar, q310Var2, new ic6(uc9.T(y3hVar.f41953a, y3hVar.c), uc9.T(y3hVar.e, y3hVar.g)), ypl0Var3);
            e0g0 e0g0Var2 = j0g0.b;
            return n210Var;
            ljg ljgVar8 = (ljg) objK;
            v4zVar2.i = null;
            v4zVar2.j = this;
            v4zVar2.k = ljgVar8;
            v4zVar2.o = j;
            v4zVar2.r = 2;
            Object objF = this.f(str, v4zVar2);
            if (objF != wneVar) {
                ljgVar = ljgVar8;
                objK = objF;
                j2 = j;
                uehVar = (ueh) objK;
                j3c j3cVar2 = (j3c) this.f;
                v4zVar2.i = null;
                v4zVar2.j = this;
                v4zVar2.k = ljgVar;
                v4zVar2.l = uehVar;
                v4zVar2.o = j2;
                v4zVar2.r = 3;
                objK = j3cVar2.a(40L, j2, v4zVar2);
                if (objK == wneVar) {
                    a6uVar = this;
                    j3 = j2;
                    ypl0Var = (ypl0) objK;
                    String str12 = ljgVar.b.c;
                    String str13 = ljgVar.c.c;
                    long j7 = ljgVar.f.f44687a;
                    v4zVar2.i = null;
                    v4zVar2.j = a6uVar;
                    v4zVar2.k = ljgVar;
                    v4zVar2.l = uehVar;
                    v4zVar2.m = ypl0Var;
                    v4zVar2.o = j3;
                    v4zVar2.r = 4;
                    objP = a6uVar.p(str12, str13, j7, v4zVar2);
                    if (objP != wneVar) {
                        ljg ljgVar9 = ljgVar;
                        uehVar2 = uehVar;
                        ypl0Var2 = ypl0Var;
                        objK = objP;
                        a6uVar2 = a6uVar;
                        ljgVar2 = ljgVar9;
                        q310Var = (q310) objK;
                        String str14 = ljgVar2.b.c;
                        String str15 = ljgVar2.c.c;
                        v4zVar2.i = null;
                        v4zVar2.j = null;
                        v4zVar2.k = ljgVar2;
                        v4zVar2.l = uehVar2;
                        v4zVar2.m = ypl0Var2;
                        v4zVar2.n = q310Var;
                        v4zVar2.o = j3;
                        v4zVar2.r = 5;
                        objD = a6uVar2.d(str14, str15, v4zVar2);
                        if (objD != wneVar) {
                            ypl0Var3 = ypl0Var2;
                            q310Var2 = q310Var;
                            uehVar3 = uehVar2;
                            ljgVar3 = ljgVar2;
                            objK = objD;
                            y3h y3hVar2 = (y3h) objK;
                            y3hVar2.getClass();
                            n210 n210Var2 = new n210(ljgVar3, uehVar3, y3hVar2, q310Var2, new ic6(uc9.T(y3hVar2.f41953a, y3hVar2.c), uc9.T(y3hVar2.e, y3hVar2.g)), ypl0Var3);
                            e0g0 e0g0Var3 = j0g0.b;
                            return n210Var2;
                        }
                    }
                }
            }
            return wneVar;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            return new g0g0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object I(vwd0 vwd0Var, zje zjeVar) {
        c5z c5zVar;
        Object g0g0Var;
        Throwable thA;
        vwd0 vwd0Var2;
        ljg ljgVar;
        ueh uehVar;
        Object objA;
        a6u a6uVar;
        ueh uehVar2;
        ypl0 ypl0Var;
        Object objP;
        ljg ljgVar2;
        ypl0 ypl0Var2;
        a6u a6uVar2;
        g0e0 g0e0Var;
        Object objD;
        ueh uehVar3;
        g0e0 g0e0Var2;
        if (zjeVar instanceof c5z) {
            c5zVar = (c5z) zjeVar;
            int i = c5zVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5zVar.q = i - Integer.MIN_VALUE;
            } else {
                c5zVar = new c5z(this, zjeVar);
            }
        } else {
            c5zVar = new c5z(this, zjeVar);
        }
        c5z c5zVar2 = c5zVar;
        Object objJ = c5zVar2.o;
        wne wneVar = wne.f39444a;
        int i2 = c5zVar2.q;
        try {
            if (i2 == 0) {
                z1x.P(objJ);
                e0g0 e0g0Var = j0g0.b;
                c5zVar2.i = vwd0Var;
                c5zVar2.j = this;
                c5zVar2.q = 1;
                objJ = j(vwd0Var, c5zVar2);
                if (objJ == wneVar) {
                }
                return wneVar;
            }
            if (i2 == 1) {
                this = c5zVar2.j;
                vwd0Var = c5zVar2.i;
                z1x.P(objJ);
            } else {
                if (i2 == 2) {
                    ljg ljgVar3 = c5zVar2.k;
                    a6u a6uVar3 = c5zVar2.j;
                    vwd0Var2 = c5zVar2.i;
                    z1x.P(objJ);
                    ljgVar = ljgVar3;
                    this = a6uVar3;
                    uehVar = (ueh) objJ;
                    j3c j3cVar = (j3c) this.d;
                    long j = vwd0Var2.b;
                    c5zVar2.i = null;
                    c5zVar2.j = this;
                    c5zVar2.k = ljgVar;
                    c5zVar2.l = uehVar;
                    c5zVar2.q = 3;
                    objA = j3cVar.a(40L, j, c5zVar2);
                    if (objA == wneVar) {
                        a6uVar = this;
                        uehVar2 = uehVar;
                        objJ = objA;
                        ypl0Var = (ypl0) objJ;
                        String str = ljgVar.b.c;
                        String str2 = ljgVar.c.c;
                        long j2 = ljgVar.f.f44687a;
                        c5zVar2.i = null;
                        c5zVar2.j = a6uVar;
                        c5zVar2.k = ljgVar;
                        c5zVar2.l = uehVar2;
                        c5zVar2.m = ypl0Var;
                        c5zVar2.q = 4;
                        objP = a6uVar.p(str, str2, j2, c5zVar2);
                        if (objP != wneVar) {
                            a6u a6uVar4 = a6uVar;
                            ljgVar2 = ljgVar;
                            ypl0Var2 = ypl0Var;
                            objJ = objP;
                            a6uVar2 = a6uVar4;
                            g0e0Var = (g0e0) objJ;
                            String str3 = ljgVar2.b.c;
                            String str4 = ljgVar2.c.c;
                            c5zVar2.i = null;
                            c5zVar2.j = null;
                            c5zVar2.k = ljgVar2;
                            c5zVar2.l = uehVar2;
                            c5zVar2.m = ypl0Var2;
                            c5zVar2.n = g0e0Var;
                            c5zVar2.q = 5;
                            objD = a6uVar2.d(str3, str4, c5zVar2);
                            if (objD != wneVar) {
                                uehVar3 = uehVar2;
                                g0e0Var2 = g0e0Var;
                                objJ = objD;
                            }
                        }
                    }
                    return wneVar;
                }
                if (i2 == 3) {
                    uehVar2 = c5zVar2.l;
                    ljgVar = c5zVar2.k;
                    a6uVar = c5zVar2.j;
                    z1x.P(objJ);
                    ypl0Var = (ypl0) objJ;
                    String str5 = ljgVar.b.c;
                    String str6 = ljgVar.c.c;
                    long j3 = ljgVar.f.f44687a;
                    c5zVar2.i = null;
                    c5zVar2.j = a6uVar;
                    c5zVar2.k = ljgVar;
                    c5zVar2.l = uehVar2;
                    c5zVar2.m = ypl0Var;
                    c5zVar2.q = 4;
                    objP = a6uVar.p(str5, str6, j3, c5zVar2);
                    if (objP != wneVar) {
                        a6u a6uVar5 = a6uVar;
                        ljgVar2 = ljgVar;
                        ypl0Var2 = ypl0Var;
                        objJ = objP;
                        a6uVar2 = a6uVar5;
                        g0e0Var = (g0e0) objJ;
                        String str7 = ljgVar2.b.c;
                        String str8 = ljgVar2.c.c;
                        c5zVar2.i = null;
                        c5zVar2.j = null;
                        c5zVar2.k = ljgVar2;
                        c5zVar2.l = uehVar2;
                        c5zVar2.m = ypl0Var2;
                        c5zVar2.n = g0e0Var;
                        c5zVar2.q = 5;
                        objD = a6uVar2.d(str7, str8, c5zVar2);
                        if (objD != wneVar) {
                            uehVar3 = uehVar2;
                            g0e0Var2 = g0e0Var;
                            objJ = objD;
                        }
                    }
                    return wneVar;
                }
                if (i2 == 4) {
                    ypl0 ypl0Var3 = c5zVar2.m;
                    ueh uehVar4 = c5zVar2.l;
                    ljgVar2 = c5zVar2.k;
                    a6uVar2 = c5zVar2.j;
                    z1x.P(objJ);
                    ypl0Var2 = ypl0Var3;
                    uehVar2 = uehVar4;
                    g0e0Var = (g0e0) objJ;
                    String str9 = ljgVar2.b.c;
                    String str10 = ljgVar2.c.c;
                    c5zVar2.i = null;
                    c5zVar2.j = null;
                    c5zVar2.k = ljgVar2;
                    c5zVar2.l = uehVar2;
                    c5zVar2.m = ypl0Var2;
                    c5zVar2.n = g0e0Var;
                    c5zVar2.q = 5;
                    objD = a6uVar2.d(str9, str10, c5zVar2);
                    if (objD != wneVar) {
                        uehVar3 = uehVar2;
                        g0e0Var2 = g0e0Var;
                        objJ = objD;
                    }
                    return wneVar;
                }
                if (i2 != 5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g0e0 g0e0Var3 = c5zVar2.n;
                ypl0Var2 = c5zVar2.m;
                ueh uehVar5 = c5zVar2.l;
                ljgVar2 = c5zVar2.k;
                z1x.P(objJ);
                g0e0Var2 = g0e0Var3;
                uehVar3 = uehVar5;
            }
            g0g0Var = new uwd0(ljgVar2, uehVar3, ypl0Var2, g0e0Var2, (oxd0) objJ);
            e0g0 e0g0Var2 = j0g0.b;
            thA = j0g0.a(g0g0Var);
            if (thA != null) {
                thA.printStackTrace();
            }
            return g0g0Var;
            ljg ljgVar4 = (ljg) objJ;
            String str11 = vwd0Var.f38146a;
            c5zVar2.i = vwd0Var;
            c5zVar2.j = this;
            c5zVar2.k = ljgVar4;
            c5zVar2.q = 2;
            Object objF = this.f(str11, c5zVar2);
            if (objF != wneVar) {
                vwd0Var2 = vwd0Var;
                ljgVar = ljgVar4;
                objJ = objF;
                uehVar = (ueh) objJ;
                j3c j3cVar2 = (j3c) this.d;
                long j4 = vwd0Var2.b;
                c5zVar2.i = null;
                c5zVar2.j = this;
                c5zVar2.k = ljgVar;
                c5zVar2.l = uehVar;
                c5zVar2.q = 3;
                objA = j3cVar2.a(40L, j4, c5zVar2);
                if (objA == wneVar) {
                    a6uVar = this;
                    uehVar2 = uehVar;
                    objJ = objA;
                    ypl0Var = (ypl0) objJ;
                    String str12 = ljgVar.b.c;
                    String str13 = ljgVar.c.c;
                    long j5 = ljgVar.f.f44687a;
                    c5zVar2.i = null;
                    c5zVar2.j = a6uVar;
                    c5zVar2.k = ljgVar;
                    c5zVar2.l = uehVar2;
                    c5zVar2.m = ypl0Var;
                    c5zVar2.q = 4;
                    objP = a6uVar.p(str12, str13, j5, c5zVar2);
                    if (objP != wneVar) {
                        a6u a6uVar6 = a6uVar;
                        ljgVar2 = ljgVar;
                        ypl0Var2 = ypl0Var;
                        objJ = objP;
                        a6uVar2 = a6uVar6;
                        g0e0Var = (g0e0) objJ;
                        String str14 = ljgVar2.b.c;
                        String str15 = ljgVar2.c.c;
                        c5zVar2.i = null;
                        c5zVar2.j = null;
                        c5zVar2.k = ljgVar2;
                        c5zVar2.l = uehVar2;
                        c5zVar2.m = ypl0Var2;
                        c5zVar2.n = g0e0Var;
                        c5zVar2.q = 5;
                        objD = a6uVar2.d(str14, str15, c5zVar2);
                        if (objD != wneVar) {
                            uehVar3 = uehVar2;
                            g0e0Var2 = g0e0Var;
                            objJ = objD;
                            g0g0Var = new uwd0(ljgVar2, uehVar3, ypl0Var2, g0e0Var2, (oxd0) objJ);
                            e0g0 e0g0Var3 = j0g0.b;
                            thA = j0g0.a(g0g0Var);
                            if (thA != null) {
                                thA.printStackTrace();
                            }
                            return g0g0Var;
                        }
                    }
                }
            }
            return wneVar;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
    }

    public boolean J() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        nfq nfqVar = (nfq) this.c;
        nfqVar.a();
        Context context = nfqVar.f23449a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object K(zje zjeVar) {
        h4v h4vVar;
        if (zjeVar instanceof h4v) {
            h4vVar = (h4v) zjeVar;
            int i = h4vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4vVar.k = i - Integer.MIN_VALUE;
            } else {
                h4vVar = new h4v(this, zjeVar);
            }
        } else {
            h4vVar = new h4v(this, zjeVar);
        }
        Object objG = h4vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = h4vVar.k;
        if (i2 == 0) {
            z1x.P(objG);
            khf0 khf0Var = (khf0) this.c;
            bm5 bm5Var = bm5.c;
            h4vVar.k = 1;
            objG = khf0.G(khf0Var, bm5Var, h4vVar);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        ((trm0) this.d).l(bm5.c, (ql5) objG);
        return objG;
    }

    public Task L() {
        Task taskForException;
        int i;
        boolean zJ = J();
        final byte b = 1;
        if (zJ && ((fd40) this.f).c() >= 261200000) {
            final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new n950("Firebase-Messaging-Network-Io"));
            final byte b2 = 0;
            return ((cgq) ((dgq) this.d)).d().continueWithTask(executorServiceNewSingleThreadExecutor, new Continuation(this) { // from class: a.c9v
                public final /* synthetic */ a6u b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    byte b3 = b;
                    ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                    a6u a6uVar = this.b;
                    switch (b3) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(a6u.n(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            nfq nfqVar = (nfq) a6uVar.c;
                            nfqVar.a();
                            mgq mgqVar = nfqVar.c;
                            String str3 = mgqVar.f21755a;
                            nfqVar.a();
                            RegisterRequest registerRequest = new RegisterRequest(fd40.b(nfqVar), mgqVar.b, str3, str, str2);
                            mmx mmxVar = (mmx) a6uVar.b;
                            euo0 euo0VarA = s9w0.a();
                            euo0VarA.d = new Feature[]{rsr0.h};
                            euo0VarA.f8431a = new afm0(mmxVar, registerRequest, (byte) 25);
                            euo0VarA.e = (char) 39001;
                            return mmxVar.b(0, euo0VarA.a()).continueWith(executorService, new d9v(str, (byte) 0));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(a6u.n(task));
                            }
                            return ((cgq) ((dgq) a6uVar.d)).c().continueWithTask(executorService, new d9v(a6uVar, ((d45) task.getResult()).f5438a));
                    }
                }
            }).continueWithTask(executorServiceNewSingleThreadExecutor, new Continuation(this) { // from class: a.c9v
                public final /* synthetic */ a6u b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    byte b3 = b2;
                    ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                    a6u a6uVar = this.b;
                    switch (b3) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(a6u.n(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            nfq nfqVar = (nfq) a6uVar.c;
                            nfqVar.a();
                            mgq mgqVar = nfqVar.c;
                            String str3 = mgqVar.f21755a;
                            nfqVar.a();
                            RegisterRequest registerRequest = new RegisterRequest(fd40.b(nfqVar), mgqVar.b, str3, str, str2);
                            mmx mmxVar = (mmx) a6uVar.b;
                            euo0 euo0VarA = s9w0.a();
                            euo0VarA.d = new Feature[]{rsr0.h};
                            euo0VarA.f8431a = new afm0(mmxVar, registerRequest, (byte) 25);
                            euo0VarA.e = (char) 39001;
                            return mmxVar.b(0, euo0VarA.a()).continueWith(executorService, new d9v(str, (byte) 0));
                        default:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(a6u.n(task));
                            }
                            return ((cgq) ((dgq) a6uVar.d)).c().continueWithTask(executorService, new d9v(a6uVar, ((d45) task.getResult()).f5438a));
                    }
                }
            });
        }
        pzu pzuVar = (pzu) this.e;
        String strB = fd40.b((nfq) pzuVar.f27863a);
        Bundle bundle = new Bundle();
        try {
            pzuVar.p0(strB, bundle, zJ);
            cig0 cig0Var = (cig0) pzuVar.c;
            haw0 haw0Var = haw0.d;
            cf60 cf60Var = cig0Var.c;
            if (cf60Var.t() < 12000000) {
                taskForException = cf60Var.r() != 0 ? cig0Var.b(bundle).continueWithTask(haw0Var, new afm0((Object) cig0Var, (Object) bundle, (byte) 28)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            } else {
                sbx0 sbx0VarM = sbx0.m(cig0Var.b);
                synchronized (sbx0VarM) {
                    i = sbx0VarM.b;
                    sbx0VarM.b = i + 1;
                }
                taskForException = sbx0VarM.n(new f8x0(i, 1, bundle, (byte) 1)).continueWith(haw0Var, sxs0.c);
            }
        } catch (InterruptedException | ExecutionException e) {
            taskForException = Tasks.forException(e);
        }
        return taskForException.continueWith(new ew3((byte) 1), new ohq(pzuVar));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009c -> B:32:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object M(a.yeu r12, int r13, int r14, a.zje r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof a.hfu
            if (r0 == 0) goto L13
            r0 = r15
            a.hfu r0 = (a.hfu) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            a.hfu r0 = new a.hfu
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.n
            a.wne r1 = a.wne.f39444a
            int r2 = r0.p
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L54
            if (r2 == r5) goto L43
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            a.z1x.P(r15)
            return r15
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r6
        L34:
            int r12 = r0.l
            int r13 = r0.k
            int r14 = r0.j
            a.yeu r2 = r0.i
            a.z1x.P(r15)
            r15 = r13
            r13 = r2
            goto L9f
        L43:
            int r12 = r0.m
            int r13 = r0.l
            int r14 = r0.k
            int r2 = r0.j
            a.yeu r7 = r0.i
            a.z1x.P(r15)
            r10 = r13
            r13 = r12
            r12 = r10
            goto L78
        L54:
            a.z1x.P(r15)
            r15 = 0
            r10 = r13
            r13 = r12
            r12 = r15
            r15 = r14
            r14 = r10
        L5d:
            if (r12 >= r15) goto La1
            r0.i = r13
            r0.j = r14
            r0.k = r15
            r0.l = r12
            r0.m = r12
            r0.p = r5
            java.lang.Object r2 = r11.N(r13, r14, r0)
            if (r2 != r1) goto L72
            goto Laf
        L72:
            r7 = r2
            r2 = r14
            r14 = r15
            r15 = r7
            r7 = r13
            r13 = r12
        L78:
            a.cfu r15 = (a.cfu) r15
            boolean r8 = r15 instanceof a.afu
            if (r8 != 0) goto L7f
            return r15
        L7f:
            a.uen r15 = a.wen.b
            r8 = 3
            a.bfn r15 = a.bfn.SECONDS
            long r8 = a.ibc.w0(r8, r15)
            r0.i = r7
            r0.j = r2
            r0.k = r14
            r0.l = r12
            r0.m = r13
            r0.p = r4
            java.lang.Object r13 = a.qcc.P(r8, r0)
            if (r13 != r1) goto L9c
            goto Laf
        L9c:
            r15 = r14
            r14 = r2
            r13 = r7
        L9f:
            int r12 = r12 + r5
            goto L5d
        La1:
            r0.i = r6
            r0.j = r14
            r0.k = r15
            r0.p = r3
            java.lang.Object r11 = r11.N(r13, r14, r0)
            if (r11 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6u.M(a.yeu, int, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object N(yeu yeuVar, int i, zje zjeVar) {
        ifu ifuVar;
        if (zjeVar instanceof ifu) {
            ifuVar = (ifu) zjeVar;
            int i2 = ifuVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ifuVar.k = i2 - Integer.MIN_VALUE;
            } else {
                ifuVar = new ifu(this, zjeVar);
            }
        } else {
            ifuVar = new ifu(this, zjeVar);
        }
        Object obj = ifuVar.i;
        wne wneVar = wne.f39444a;
        int i3 = ifuVar.k;
        try {
            if (i3 == 0) {
                z1x.P(obj);
                e1u e1uVar = (e1u) this.b;
                boolean z = yeuVar == yeu.f42508a;
                ifuVar.k = 1;
                if (((f7u) e1uVar.b).f(i, ifuVar, z) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            return bfu.f2521a;
        } catch (Throwable th) {
            return ((th instanceof zhi0) && th.e) ? new zeu(th) : new afu(th);
        }
    }

    public void a(yeu yeuVar) {
        do20 do20Var = (do20) this.e;
        boolean z = yeuVar == yeu.f42508a;
        lxv lxvVar = (lxv) ((f7u) do20Var.f6397a).c;
        if (z) {
            lxvVar.f20834a.a();
        } else {
            lxvVar.b.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006e -> B:24:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.io.Serializable c(a.zje r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof a.ffu
            if (r0 == 0) goto L13
            r0 = r10
            a.ffu r0 = (a.ffu) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.ffu r0 = new a.ffu
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2e
            java.util.Iterator r2 = r0.j
            java.util.Collection r5 = r0.i
            java.util.Collection r5 = (java.util.Collection) r5
            a.z1x.P(r10)
            goto L71
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L35:
            a.z1x.P(r10)
            a.c0o r10 = a.yeu.c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.getClass()
            a.y2 r5 = new a.y2
            r5.<init>(r10, r3)
            r8 = r5
            r5 = r2
            r2 = r8
        L4a:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L7b
            java.lang.Object r10 = r2.next()
            a.yeu r10 = (a.yeu) r10
            java.lang.Object r6 = r9.d
            a.bwl r6 = (a.bwl) r6
            a.yeu r7 = a.yeu.f42508a
            if (r10 != r7) goto L60
            r10 = r4
            goto L61
        L60:
            r10 = r3
        L61:
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            r0.i = r7
            r0.j = r2
            r0.m = r4
            java.lang.Object r10 = r6.i(r10, r0)
            if (r10 != r1) goto L71
            return r1
        L71:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L77
            a.iun r10 = a.iun.f15405a
        L77:
            a.w3d.u(r5, r10)
            goto L4a
        L7b:
            java.util.List r5 = (java.util.List) r5
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r5.iterator()
        L8b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            r2 = r1
            a.kxv r2 = (a.kxv) r2
            long r2 = r2.f19077a
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            boolean r2 = r9.add(r4)
            if (r2 == 0) goto L8b
            r10.add(r1)
            goto L8b
        La9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6u.c(a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public Object d(String str, String str2, zje zjeVar) {
        r4z r4zVar;
        Object g0g0Var;
        y4z y4zVar;
        Object g0g0Var2;
        switch (this.f333a) {
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (zjeVar instanceof r4z) {
                    r4zVar = (r4z) zjeVar;
                    int i = r4zVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        r4zVar.k = i - Integer.MIN_VALUE;
                    } else {
                        r4zVar = new r4z(this, zjeVar);
                    }
                } else {
                    r4zVar = new r4z(this, zjeVar);
                }
                Object objB = r4zVar.i;
                wne wneVar = wne.f39444a;
                int i2 = r4zVar.k;
                try {
                    if (i2 == 0) {
                        z1x.P(objB);
                        e0g0 e0g0Var = j0g0.b;
                        fzt fztVar = (fzt) this.e;
                        r4zVar.k = 1;
                        objB = fztVar.f10426a.b(str, str2, r4zVar);
                        if (objB == wneVar) {
                            return wneVar;
                        }
                    } else {
                        if (i2 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(objB);
                    }
                    g0g0Var = (y3h) objB;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null) {
                    thA.printStackTrace();
                }
                iun iunVar = iun.f15405a;
                return g0g0Var instanceof g0g0 ? new y3h("", "", iunVar, new c110(-1, -1, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f), "", "", iunVar, new c110(-1, -1, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f)) : g0g0Var;
            default:
                if (zjeVar instanceof y4z) {
                    y4zVar = (y4z) zjeVar;
                    int i3 = y4zVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        y4zVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        y4zVar = new y4z(this, zjeVar);
                    }
                } else {
                    y4zVar = new y4z(this, zjeVar);
                }
                Object objC = y4zVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = y4zVar.k;
                try {
                    if (i4 == 0) {
                        z1x.P(objC);
                        e0g0 e0g0Var4 = j0g0.b;
                        ezt eztVar = (ezt) this.f;
                        y4zVar.k = 1;
                        objC = eztVar.f8685a.c(str, str2, y4zVar);
                        if (objC == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (i4 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(objC);
                    }
                    g0g0Var2 = (oxd0) objC;
                    e0g0 e0g0Var5 = j0g0.b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var6 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                Throwable thA2 = j0g0.a(g0g0Var2);
                if (thA2 != null) {
                    thA2.printStackTrace();
                }
                iun iunVar2 = iun.f15405a;
                return g0g0Var2 instanceof g0g0 ? new oxd0("", "", iunVar2, "", "", iunVar2) : g0g0Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public Object e(zje zjeVar) {
        gfu gfuVar;
        Object g0g0Var;
        tzu tzuVar;
        e2v e2vVar;
        int iIntValue = 225;
        switch (this.f333a) {
            case 7:
                if (zjeVar instanceof gfu) {
                    gfuVar = (gfu) zjeVar;
                    int i = gfuVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gfuVar.k = i - Integer.MIN_VALUE;
                    } else {
                        gfuVar = new gfu(this, zjeVar);
                    }
                } else {
                    gfuVar = new gfu(this, zjeVar);
                }
                Object objA = gfuVar.i;
                wne wneVar = wne.f39444a;
                int i2 = gfuVar.k;
                try {
                    if (i2 == 0) {
                        z1x.P(objA);
                        e0g0 e0g0Var = j0g0.b;
                        reu reuVar = (reu) this.f;
                        gfuVar.k = 1;
                        objA = ((b3c0) reuVar.b).a(false, gfuVar);
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
                    g0g0Var = ((m2c0) objA).c;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = "0";
                }
                Integer intOrNull = StringsKt.toIntOrNull((String) g0g0Var);
                return new Integer(intOrNull != null ? intOrNull.intValue() : 225);
            case 14:
                if (zjeVar instanceof tzu) {
                    tzuVar = (tzu) zjeVar;
                    int i3 = tzuVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        tzuVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        tzuVar = new tzu(this, zjeVar);
                    }
                } else {
                    tzuVar = new tzu(this, zjeVar);
                }
                Object objA2 = tzuVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = tzuVar.k;
                if (i4 == 0) {
                    z1x.P(objA2);
                    if (((gst0) this.c).a()) {
                        b3c0 b3c0Var = (b3c0) this.e;
                        tzuVar.k = 1;
                        objA2 = b3c0Var.a(false, tzuVar);
                        if (objA2 == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        iIntValue = 0;
                    }
                    return new Integer(iIntValue);
                }
                if (i4 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA2);
                Integer intOrNull2 = StringsKt.toIntOrNull(((m2c0) objA2).c);
                if (intOrNull2 != null) {
                    iIntValue = intOrNull2.intValue();
                }
                return new Integer(iIntValue);
            default:
                if (zjeVar instanceof e2v) {
                    e2vVar = (e2v) zjeVar;
                    int i5 = e2vVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        e2vVar.k = i5 - Integer.MIN_VALUE;
                    } else {
                        e2vVar = new e2v(this, zjeVar);
                    }
                } else {
                    e2vVar = new e2v(this, zjeVar);
                }
                Object objA3 = e2vVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = e2vVar.k;
                if (i6 == 0) {
                    z1x.P(objA3);
                    if (((gst0) this.c).a()) {
                        b3c0 b3c0Var2 = (b3c0) this.e;
                        e2vVar.k = 1;
                        objA3 = b3c0Var2.a(false, e2vVar);
                        if (objA3 == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        iIntValue = 0;
                    }
                    return new Integer(iIntValue);
                }
                if (i6 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA3);
                Integer intOrNull3 = StringsKt.toIntOrNull(((m2c0) objA3).c);
                if (intOrNull3 != null) {
                    iIntValue = intOrNull3.intValue();
                }
                return new Integer(iIntValue);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public Object f(String str, zje zjeVar) {
        s4z s4zVar;
        Object g0g0Var;
        z4z z4zVar;
        Object g0g0Var2;
        switch (this.f333a) {
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (zjeVar instanceof s4z) {
                    s4zVar = (s4z) zjeVar;
                    int i = s4zVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        s4zVar.k = i - Integer.MIN_VALUE;
                    } else {
                        s4zVar = new s4z(this, zjeVar);
                    }
                } else {
                    s4zVar = new s4z(this, zjeVar);
                }
                Object objF = s4zVar.i;
                wne wneVar = wne.f39444a;
                int i2 = s4zVar.k;
                try {
                    if (i2 == 0) {
                        z1x.P(objF);
                        e0g0 e0g0Var = j0g0.b;
                        uyn uynVar = (uyn) this.c;
                        s4zVar.k = 1;
                        objF = ((xex) uynVar.f36498a).F(str, s4zVar);
                        if (objF == wneVar) {
                            return wneVar;
                        }
                    } else {
                        if (i2 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(objF);
                    }
                    g0g0Var = (ueh) objF;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                iun iunVar = iun.f15405a;
                return g0g0Var instanceof g0g0 ? new ueh(0, iunVar, new qeh(iunVar, new ieh(iunVar, iunVar))) : g0g0Var;
            default:
                if (zjeVar instanceof z4z) {
                    z4zVar = (z4z) zjeVar;
                    int i3 = z4zVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z4zVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        z4zVar = new z4z(this, zjeVar);
                    }
                } else {
                    z4zVar = new z4z(this, zjeVar);
                }
                Object objF2 = z4zVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = z4zVar.k;
                try {
                    if (i4 == 0) {
                        z1x.P(objF2);
                        e0g0 e0g0Var4 = j0g0.b;
                        uyn uynVar2 = (uyn) this.c;
                        z4zVar.k = 1;
                        objF2 = ((xex) uynVar2.f36498a).F(str, z4zVar);
                        if (objF2 == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (i4 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(objF2);
                    }
                    g0g0Var2 = (ueh) objF2;
                    e0g0 e0g0Var5 = j0g0.b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var6 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                iun iunVar2 = iun.f15405a;
                return g0g0Var2 instanceof g0g0 ? new ueh(0, iunVar2, new qeh(iunVar2, new ieh(iunVar2, iunVar2))) : g0g0Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:192:0x0423  */
    /* JADX WARN: Code duplicated, block: B:202:0x045b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0465  */
    /* JADX WARN: Code duplicated, block: B:205:0x0468  */
    /* JADX WARN: Code duplicated, block: B:211:0x0489  */
    /* JADX WARN: Code duplicated, block: B:215:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:217:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:220:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:222:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:230:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:235:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:239:0x0503  */
    /* JADX WARN: Code duplicated, block: B:27:0x00de  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:354:0x0762  */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:372:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x046c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0455 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0125  */
    /* JADX WARN: Code duplicated, block: B:42:0x0132  */
    /* JADX WARN: Code duplicated, block: B:45:0x0141  */
    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    /* JADX WARN: Code duplicated, block: B:52:0x015a  */
    /* JADX WARN: Code duplicated, block: B:55:0x015f  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0522, code lost:
    
        if (r0 == r3) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a2, code lost:
    
        if (r0 == r3) goto L242;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r40v5 */
    /* JADX WARN: Type inference failed for: r40v6, types: [a.tas] */
    /* JADX WARN: Type inference failed for: r40v7 */
    /* JADX WARN: Type inference failed for: r50v3 */
    /* JADX WARN: Type inference failed for: r50v4, types: [a.ufs] */
    /* JADX WARN: Type inference failed for: r50v5 */
    /* JADX WARN: Type inference failed for: r53v3 */
    /* JADX WARN: Type inference failed for: r53v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r53v5 */
    /* JADX WARN: Type inference failed for: r56v1 */
    /* JADX WARN: Type inference failed for: r56v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r56v3 */
    /* JADX WARN: Type inference failed for: r57v3 */
    /* JADX WARN: Type inference failed for: r57v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r57v5 */
    /* JADX WARN: Type inference failed for: r59v3 */
    /* JADX WARN: Type inference failed for: r59v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r59v5 */
    /* JADX WARN: Type inference failed for: r66v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r67v5 */
    /* JADX WARN: Type inference failed for: r67v6 */
    /* JADX WARN: Type inference failed for: r67v7 */
    /* JADX WARN: Type inference failed for: r67v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:241:0x0522 -> B:243:0x0525). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01a2 -> B:68:0x01a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(long r65, a.zje r67, a.sip r68, a.jo20 r69) {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6u.g(long, a.zje, a.sip, a.jo20):java.lang.Object");
    }

    public dnq h(sip sipVar, c3c0 c3c0Var, long j, boolean z, boolean z2) {
        or30 or30Var;
        long jF = ynq0.f(((viu) this.f).a());
        zri zriVar = (zri) this.d;
        c3c0Var.getClass();
        pmi pmiVar = (pmi) zriVar.b;
        jvn jvnVarB = ((uzc) zriVar.c).b();
        lnf0 lnf0VarD = ((knf0) pmiVar.b).d();
        jo20 jo20Var = new jo20();
        qbt.a(jo20Var, jvnVarB);
        qbt.c(c3c0Var.f3668a, jo20Var);
        qbt.g(lnf0VarD.b, jo20Var);
        qbt.h(jo20Var);
        qbt.j(lnf0VarD.f20342a, jo20Var);
        qbt.k(jo20Var, j);
        qbt.l(jo20Var);
        qbt.o(jo20Var, c3c0Var.b, c3c0Var.c);
        qbt.p(jo20Var);
        jo20 jo20VarB = jo20Var.b();
        o8o o8oVar = (o8o) pmiVar.d;
        int iOrdinal = sipVar.ordinal();
        byte b = 1;
        if (iOrdinal == 0) {
            or30Var = o8oVar.b;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            or30Var = o8oVar.f24840a;
        }
        yje yjeVar = null;
        return new dnq(aoq.c(gfx.R(or30Var, kpb.v(sipVar), null, new qvp(pmiVar, sipVar, jo20VarB, jF, null), 252), new b9u((byte) 2, yjeVar, this, z, z2)), new rl2(3, yjeVar, (byte) 20), b);
    }

    public dnq i(sip sipVar, ypl0 ypl0Var) {
        yje yjeVar = null;
        byte b = 7;
        return new dnq(aoq.c(aoq.c(new vsg0(new o3s(this, sipVar, yjeVar, b)), new fe0(yjeVar, (Object) this, (Object) sipVar, (byte) 6)), new fe0(yjeVar, ypl0Var, this, b)), new rl2(3, yjeVar, (byte) 22), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(vwd0 vwd0Var, zje zjeVar) {
        a5z a5zVar;
        if (zjeVar instanceof a5z) {
            a5zVar = (a5z) zjeVar;
            int i = a5zVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5zVar.l = i - Integer.MIN_VALUE;
            } else {
                a5zVar = new a5z(this, zjeVar);
            }
        } else {
            a5zVar = new a5z(this, zjeVar);
        }
        Object objA = a5zVar.j;
        wne wneVar = wne.f39444a;
        int i2 = a5zVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            reu reuVar = (reu) this.b;
            String str = vwd0Var.f38146a;
            a5zVar.i = vwd0Var;
            a5zVar.l = 1;
            objA = ((njg) reuVar.b).a(str, a5zVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vwd0Var = a5zVar.i;
            z1x.P(objA);
        }
        ljg ljgVar = (ljg) objA;
        if (ljgVar.b.c.length() != 0 && ljgVar.c.c.length() != 0) {
            return ljgVar;
        }
        vwd0Var.getClass();
        iun iunVar = iun.f15405a;
        return new ljg(iunVar, new f2h(0L, "", vwd0Var.c, vwd0Var.e), new f2h(0L, "", vwd0Var.d, vwd0Var.f), new v1h(0, 0, 0, iunVar, iunVar, iunVar, iunVar, iunVar), iunVar, new znq0(vwd0Var.g), vwd0Var.h, "", 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, zje zjeVar) {
        t4z t4zVar;
        if (zjeVar instanceof t4z) {
            t4zVar = (t4z) zjeVar;
            int i = t4zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t4zVar.k = i - Integer.MIN_VALUE;
            } else {
                t4zVar = new t4z(this, zjeVar);
            }
        } else {
            t4zVar = new t4z(this, zjeVar);
        }
        Object objA = t4zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = t4zVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            reu reuVar = (reu) this.b;
            t4zVar.k = 1;
            objA = ((njg) reuVar.b).a(str, t4zVar);
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
        ljg ljgVar = (ljg) objA;
        if (ljgVar.b.c.length() != 0 && ljgVar.c.c.length() != 0) {
            return ljgVar;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(zje zjeVar) {
        uzu uzuVar;
        w5z w5zVar;
        jvn jvnVar;
        if (zjeVar instanceof uzu) {
            uzuVar = (uzu) zjeVar;
            int i = uzuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzuVar.m = i - Integer.MIN_VALUE;
            } else {
                uzuVar = new uzu(this, zjeVar);
            }
        } else {
            uzuVar = new uzu(this, zjeVar);
        }
        Object obj = uzuVar.k;
        Object obj2 = wne.f39444a;
        int i2 = uzuVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            w5zVar = (w5z) this.b;
            jvn jvnVarB = ((uzc) this.f).b();
            uzuVar.i = w5zVar;
            uzuVar.j = jvnVarB;
            uzuVar.m = 1;
            Object objE = e(uzuVar);
            if (objE != obj2) {
                obj = objE;
                jvnVar = jvnVarB;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jvnVar = uzuVar.j;
        w5zVar = uzuVar.i;
        z1x.P(obj);
        int iIntValue = ((Number) obj).intValue();
        uzuVar.i = null;
        uzuVar.j = null;
        uzuVar.m = 2;
        Object objB = w5zVar.B(jvnVar, iIntValue, uzuVar);
        return objB == obj2 ? obj2 : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(zje zjeVar) {
        vzu vzuVar;
        w5z w5zVar;
        jvn jvnVar;
        if (zjeVar instanceof vzu) {
            vzuVar = (vzu) zjeVar;
            int i = vzuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzuVar.m = i - Integer.MIN_VALUE;
            } else {
                vzuVar = new vzu(this, zjeVar);
            }
        } else {
            vzuVar = new vzu(this, zjeVar);
        }
        Object obj = vzuVar.k;
        Object obj2 = wne.f39444a;
        int i2 = vzuVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            w5zVar = (w5z) this.b;
            jvn jvnVarB = ((uzc) this.f).b();
            vzuVar.i = w5zVar;
            vzuVar.j = jvnVarB;
            vzuVar.m = 1;
            Object objE = e(vzuVar);
            if (objE != obj2) {
                obj = objE;
                jvnVar = jvnVarB;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jvnVar = vzuVar.j;
        w5zVar = vzuVar.i;
        z1x.P(obj);
        int iIntValue = ((Number) obj).intValue();
        vzuVar.i = null;
        vzuVar.j = null;
        vzuVar.m = 2;
        Object objC = w5zVar.C(jvnVar, iIntValue, vzuVar);
        return objC == obj2 ? obj2 : objC;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:39:0x00a5->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable o(s77 s77Var, zje zjeVar) {
        g4v g4vVar;
        bm5 bm5Var;
        ql5 ql5Var;
        Object obj;
        bm5 bm5Var2;
        bsu bsuVar;
        Object objB;
        ql5 ql5Var2;
        List list;
        ql5 ql5Var3;
        if (zjeVar instanceof g4v) {
            g4vVar = (g4v) zjeVar;
            int i = g4vVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                g4vVar.o = i - Integer.MIN_VALUE;
            } else {
                g4vVar = new g4v(this, zjeVar);
            }
        } else {
            g4vVar = new g4v(this, zjeVar);
        }
        Object objK = g4vVar.m;
        wne wneVar = wne.f39444a;
        int i2 = g4vVar.o;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objK);
            bm5Var = (s77Var == s77.TOTO || s77Var == s77.AUTO || s77Var == s77.JACKPOT) ? bm5.f2822a : bm5.c;
            g4vVar.i = bm5Var;
            g4vVar.o = 1;
            objK = K(g4vVar);
            if (objK != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            bm5Var = g4vVar.i;
            z1x.P(objK);
        } else {
            if (i2 == 2) {
                bm5Var2 = g4vVar.l;
                bsuVar = g4vVar.k;
                ql5 ql5Var4 = g4vVar.j;
                z1x.P(objK);
                obj = objK;
                ql5Var = ql5Var4;
                g4vVar.i = null;
                g4vVar.j = ql5Var;
                g4vVar.k = null;
                g4vVar.l = null;
                g4vVar.o = 3;
                objB = bsu.b(bsuVar, bm5Var2, (List) obj, g4vVar);
                if (objB != wneVar) {
                    ql5 ql5Var5 = ql5Var;
                    objK = objB;
                    ql5Var2 = ql5Var5;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var2 = g4vVar.j;
            z1x.P(objK);
        }
        list = (List) objK;
        for (Object obj3 : list) {
            if (((ql5) obj3).f28916a == ql5Var2.f28916a) {
                obj2 = obj3;
                break;
            }
        }
        ql5Var3 = (ql5) obj2;
        if (ql5Var3 == null) {
            return (ql5) CollectionsKt.U(list);
        }
        return ql5Var3;
        ql5Var = (ql5) objK;
        bsu bsuVar2 = (bsu) this.f;
        urt urtVar = (urt) this.e;
        g4vVar.i = null;
        g4vVar.j = ql5Var;
        g4vVar.k = bsuVar2;
        g4vVar.l = bm5Var;
        g4vVar.o = 2;
        Object objA = urt.a(urtVar, g4vVar);
        if (objA != wneVar) {
            obj = objA;
            bm5Var2 = bm5Var;
            bsuVar = bsuVar2;
            g4vVar.i = null;
            g4vVar.j = ql5Var;
            g4vVar.k = null;
            g4vVar.l = null;
            g4vVar.o = 3;
            objB = bsu.b(bsuVar, bm5Var2, (List) obj, g4vVar);
            if (objB != wneVar) {
                ql5 ql5Var6 = ql5Var;
                objK = objB;
                ql5Var2 = ql5Var6;
                list = (List) objK;
                while (r9.hasNext()) {
                    if (((ql5) obj3).f28916a == ql5Var2.f28916a) {
                        obj2 = obj3;
                        break;
                    }
                }
                ql5Var3 = (ql5) obj2;
                if (ql5Var3 == null) {
                    return (ql5) CollectionsKt.U(list);
                }
                return ql5Var3;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public Object p(String str, String str2, long j, zje zjeVar) {
        u4z u4zVar;
        Object g0g0Var;
        b5z b5zVar;
        Object g0g0Var2;
        switch (this.f333a) {
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (zjeVar instanceof u4z) {
                    u4zVar = (u4z) zjeVar;
                    int i = u4zVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u4zVar.k = i - Integer.MIN_VALUE;
                    } else {
                        u4zVar = new u4z(this, zjeVar);
                    }
                } else {
                    u4zVar = new u4z(this, zjeVar);
                }
                Object objA = u4zVar.i;
                wne wneVar = wne.f39444a;
                int i2 = u4zVar.k;
                try {
                    if (i2 == 0) {
                        z1x.P(objA);
                        e0g0 e0g0Var = j0g0.b;
                        n4u n4uVar = (n4u) this.d;
                        znq0 znq0Var = new znq0(j);
                        dfj dfjVar = dfj.UNIQUE_4;
                        Locale.ENGLISH.getClass();
                        String strK0 = jtv.K0(znq0Var, dfjVar, 4);
                        u4zVar.k = 1;
                        objA = ((m4h) n4uVar.b).a(str, str2, strK0, u4zVar);
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
                    g0g0Var = (q310) objA;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null) {
                    thA.printStackTrace();
                }
                return g0g0Var instanceof g0g0 ? new q310(-1, -1L, new r510(-1, -1L, "", ""), new r510(-1, -1L, "", ""), "", -1, -1, "", -1L, iun.f15405a) : g0g0Var;
            default:
                if (zjeVar instanceof b5z) {
                    b5zVar = (b5z) zjeVar;
                    int i3 = b5zVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b5zVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        b5zVar = new b5z(this, zjeVar);
                    }
                } else {
                    b5zVar = new b5z(this, zjeVar);
                }
                Object objA2 = b5zVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = b5zVar.k;
                try {
                    if (i4 == 0) {
                        z1x.P(objA2);
                        e0g0 e0g0Var4 = j0g0.b;
                        n4u n4uVar2 = (n4u) this.e;
                        znq0 znq0Var2 = new znq0(j);
                        dfj dfjVar2 = dfj.UNIQUE_4;
                        Locale.ENGLISH.getClass();
                        String strK1 = jtv.K0(znq0Var2, dfjVar2, 4);
                        b5zVar.k = 1;
                        objA2 = ((xvd0) n4uVar2.b).a(str, str2, strK1, b5zVar);
                        if (objA2 == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (i4 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(objA2);
                    }
                    g0g0Var2 = (g0e0) objA2;
                    e0g0 e0g0Var5 = j0g0.b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var6 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                Throwable thA2 = j0g0.a(g0g0Var2);
                if (thA2 != null) {
                    thA2.printStackTrace();
                }
                k0e0 k0e0Var = new k0e0(-1, -1L, "", "");
                k0e0 k0e0Var2 = new k0e0(-1, -1L, "", "");
                iun iunVar = iun.f15405a;
                return g0g0Var2 instanceof g0g0 ? new g0e0(-1, -1L, false, k0e0Var, k0e0Var2, iunVar, new syd0(new ezd0(-1, -1, -1, -1, iunVar, iunVar), new ezd0(-1, -1, -1, -1, iunVar, iunVar)), iunVar) : g0g0Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(List list, zje zjeVar) {
        k2v k2vVar;
        Object g0g0Var;
        if (zjeVar instanceof k2v) {
            k2vVar = (k2v) zjeVar;
            int i = k2vVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                k2vVar.l = i - Integer.MIN_VALUE;
            } else {
                k2vVar = new k2v(this, zjeVar);
            }
        } else {
            k2vVar = new k2v(this, zjeVar);
        }
        Object objK = k2vVar.j;
        wne wneVar = wne.f39444a;
        int i2 = k2vVar.l;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objK);
                e0g0 e0g0Var = j0g0.b;
                a1g a1gVarQ = uvw.Q(new vsg0(new atj(list, this, yjeVar, (byte) 23)), true);
                k2vVar.i = list;
                k2vVar.l = 1;
                objK = ntb.K(a1gVarQ, k2vVar);
                if (objK == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = k2vVar.i;
                z1x.P(objK);
            }
            g0g0Var = (List) objK;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof UnknownHostException) || (th instanceof CancellationException) || (th instanceof u660)) {
                throw th;
            }
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        if (agc.N(thA)) {
            list = tnq0.p(list);
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r8 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r8 == r2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(a.zje r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            a.ieu r0 = (a.ieu) r0
            boolean r1 = r8 instanceof a.y5u
            if (r1 == 0) goto L17
            r1 = r8
            a.y5u r1 = (a.y5u) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.y5u r1 = new a.y5u
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.i
            a.wne r2 = a.wne.f39444a
            int r3 = r1.k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L40
            if (r3 == r6) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L31
            a.z1x.P(r8)
            goto L7c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L38:
            a.z1x.P(r8)
            goto L6e
        L3c:
            a.z1x.P(r8)
            goto L5b
        L40:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.c
            a.gst0 r8 = (a.gst0) r8
            boolean r8 = r8.a()
            if (r8 == 0) goto L73
            java.lang.Object r7 = r7.b
            a.rou r7 = (a.rou) r7
            r1.k = r6
            r8 = 0
            java.lang.Object r8 = r7.a(r8, r1)
            if (r8 != r2) goto L5b
            goto L7b
        L5b:
            a.m2c0 r8 = (a.m2c0) r8
            java.lang.String r7 = r8.C
            int r8 = r7.length()
            if (r8 != 0) goto L72
            r1.k = r5
            java.lang.Object r8 = r0.i(r1)
            if (r8 != r2) goto L6e
            goto L7b
        L6e:
            a.elt r8 = (a.elt) r8
            java.lang.String r7 = r8.f8017a
        L72:
            return r7
        L73:
            r1.k = r4
            java.lang.Object r8 = r0.i(r1)
            if (r8 != r2) goto L7c
        L7b:
            return r2
        L7c:
            a.elt r8 = (a.elt) r8
            java.lang.String r7 = r8.f8017a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6u.r(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010a, code lost:
    
        if (kotlin.Unit.f46060a == r6) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(long r25, long r27, a.zje r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a6u.s(long, long, a.zje, boolean):java.lang.Object");
    }

    public utb t() {
        String strA = ((ntu) this.d).a();
        sff0 sff0VarA = ((pru) this.f).a();
        return aoq.a(((jtj) this.b).i(strA, ((iqt) this.e).f15225a.a(), sff0VarA.b.N), new wmq((Object) this, (Object) strA, (Object) sff0VarA, (yje) null, (byte) 5));
    }

    public String toString() {
        switch (this.f333a) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                nqy nqyVar = (nqy) this.b;
                if (nqyVar == null) {
                    Intrinsics.h("kind");
                    throw null;
                }
                sb.append(nqyVar);
                sb.append(", level=");
                mqy mqyVar = (mqy) this.c;
                if (mqyVar == null) {
                    Intrinsics.h("level");
                    throw null;
                }
                sb.append(mqyVar);
                sb.append(", version=");
                lqy lqyVar = (lqy) this.f;
                if (lqyVar == null) {
                    Intrinsics.h("version");
                    throw null;
                }
                sb.append(lqyVar);
                sb.append(", errorCode=");
                sb.append((Integer) this.d);
                sb.append(", message=");
                return axq.m(sb, (String) this.e, ')');
            default:
                return super.toString();
        }
    }

    public utb u(qmu0 qmu0Var) {
        gmq gmqVarL;
        ntu ntuVar = (ntu) this.e;
        sff0 sff0VarA = ((pru) this.f).a();
        boolean z = sff0VarA.b.N;
        if (sff0VarA.L1) {
            abu abuVar = (abu) this.c;
            String strA = ntuVar.a();
            strA.getClass();
            gmqVarL = new vsg0(new m5v(abuVar, qmu0Var, strA, z, null));
        } else {
            j5v j5vVar = (j5v) this.d;
            String strA2 = ntuVar.a();
            strA2.getClass();
            svu svuVar = j5vVar.c;
            txy txyVar = txy.SPORT_LINE;
            gmqVarL = ulb.L(new i5v(new nnt(svuVar.e(1), (byte) 1), j5vVar, qmu0Var, strA2, z), j5vVar.d.b);
        }
        return aoq.c(gmqVarL, new eh2(this, null, (byte) 4));
    }

    public p6d v() {
        yje yjeVar = null;
        return new p6d(((kc60) this.b).a(), uvw.Q(new vsg0(new kv(this, yjeVar, (byte) 11)), true), new sot((Object) this, yjeVar, (byte) 17), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable w(zje zjeVar, String str, List list) {
        npu npuVar;
        String str2;
        List list2;
        String str3;
        List list3;
        List<vrc0> list4;
        List list5;
        boolean z;
        ArrayList arrayList;
        String strValueOf;
        vrc0 vrc0VarA;
        long j;
        Iterator it;
        Object next;
        pbv pbvVar;
        Iterator it2;
        Object next2;
        pe8 pe8Var;
        hds hdsVarA;
        if (zjeVar instanceof npu) {
            npuVar = (npu) zjeVar;
            int i = npuVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                npuVar.o = i - Integer.MIN_VALUE;
            } else {
                npuVar = new npu(this, zjeVar);
            }
        } else {
            npuVar = new npu(this, zjeVar);
        }
        Object obj = npuVar.m;
        wne wneVar = wne.f39444a;
        int i2 = npuVar.o;
        if (i2 == 0) {
            z1x.P(obj);
            String strA = ((ntu) this.b).a();
            cdu cduVar = (cdu) this.d;
            npuVar.i = list;
            npuVar.j = str;
            npuVar.k = strA;
            npuVar.o = 1;
            Serializable serializableC = cdu.c(cduVar, 0, strA, npuVar, 11);
            if (serializableC != wneVar) {
                str2 = strA;
                obj = serializableC;
                list2 = list;
            }
            return wneVar;
        }
        if (i2 == 1) {
            String str4 = npuVar.k;
            String str5 = npuVar.j;
            list2 = npuVar.i;
            z1x.P(obj);
            str2 = str4;
            str = str5;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = npuVar.l;
            str2 = npuVar.k;
            str3 = npuVar.j;
            list4 = npuVar.i;
            z1x.P(obj);
        }
        list5 = (List) obj;
        z = ((pru) this.c).a().l.x;
        arrayList = new ArrayList(r3d.q(list4, 10));
        for (vrc0 vrc0Var : list4) {
            if (vrc0Var == null) {
                if (vrc0Var instanceof urc0) {
                    urc0 urc0Var = (urc0) vrc0Var;
                    j = urc0Var.k;
                    it = list3.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((pbv) next).f26728a != j);
                    pbvVar = (pbv) next;
                    if (pbvVar != null || (hdsVarA = pbvVar.n) == null) {
                        it2 = list5.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (((pe8) next2).f26839a != j);
                        pe8Var = (pe8) next2;
                        if (pe8Var != null) {
                            hdsVarA = pe8Var.j;
                        } else {
                            hds.Companion.getClass();
                            hdsVarA = dds.a();
                        }
                    }
                    vrc0VarA = urc0.a(urc0Var, null, hdsVarA, 2047);
                } else if (vrc0Var instanceof trc0) {
                    if (z) {
                        strValueOf = vrc0Var.t0();
                        if (strValueOf == null) {
                            strValueOf = "0";
                        }
                    } else {
                        strValueOf = String.valueOf(vrc0Var.getId());
                    }
                    vrc0VarA = trc0.a((trc0) vrc0Var, null, str2 + Separators.SLASH + str3 + Separators.SLASH + strValueOf + ".webp", kng0.m(str2, "/static/img/android/promo_store/showcase/", strValueOf, ".webp"), 1023);
                }
                arrayList.add(vrc0VarA);
            }
            t9f.b();
            return null;
        }
        return arrayList;
        List list6 = (List) obj;
        fhj fhjVar = (fhj) this.e;
        ((k9c) this.f).a();
        npuVar.i = list2;
        npuVar.j = str;
        npuVar.k = str2;
        npuVar.l = list6;
        npuVar.o = 2;
        Object objX = fhjVar.x(str2, npuVar);
        if (objX != wneVar) {
            str3 = str;
            list3 = list6;
            obj = objX;
            list4 = list2;
            list5 = (List) obj;
            z = ((pru) this.c).a().l.x;
            arrayList = new ArrayList(r3d.q(list4, 10));
            while (r0.hasNext()) {
                if (vrc0Var == null) {
                    if (vrc0Var instanceof urc0) {
                        urc0 urc0Var2 = (urc0) vrc0Var;
                        j = urc0Var2.k;
                        it = list3.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((pbv) next).f26728a != j);
                        pbvVar = (pbv) next;
                        if (pbvVar != null) {
                            it2 = list5.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (((pe8) next2).f26839a != j);
                            pe8Var = (pe8) next2;
                            if (pe8Var != null) {
                                hdsVarA = pe8Var.j;
                            } else {
                                hds.Companion.getClass();
                                hdsVarA = dds.a();
                            }
                        } else {
                            it2 = list5.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (((pe8) next2).f26839a != j);
                            pe8Var = (pe8) next2;
                            if (pe8Var != null) {
                                hdsVarA = pe8Var.j;
                            } else {
                                hds.Companion.getClass();
                                hdsVarA = dds.a();
                            }
                        }
                        vrc0VarA = urc0.a(urc0Var2, null, hdsVarA, 2047);
                    } else if (vrc0Var instanceof trc0) {
                        if (z) {
                            strValueOf = vrc0Var.t0();
                            if (strValueOf == null) {
                                strValueOf = "0";
                            }
                        } else {
                            strValueOf = String.valueOf(vrc0Var.getId());
                        }
                        vrc0VarA = trc0.a((trc0) vrc0Var, null, str2 + Separators.SLASH + str3 + Separators.SLASH + strValueOf + ".webp", kng0.m(str2, "/static/img/android/promo_store/showcase/", strValueOf, ".webp"), 1023);
                    }
                    arrayList.add(vrc0VarA);
                }
                t9f.b();
                return null;
            }
            return arrayList;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0115  */
    /* JADX WARN: Code duplicated, block: B:36:0x013b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object x(double d, double d2, zje zjeVar) throws Throwable {
        jxu jxuVar;
        double d3;
        hru hruVar;
        double d4;
        long j;
        double d5;
        qvo0 qvo0Var;
        hru hruVar2;
        double d6;
        int iIntValue;
        long j2;
        Object objA;
        qvo0 qvo0Var2;
        double d7;
        double d8;
        hru hruVar3;
        double d9;
        int i;
        double d10;
        long j3;
        Serializable serializableC;
        double d11 = d;
        double d12 = d2;
        if (zjeVar instanceof jxu) {
            jxuVar = (jxu) zjeVar;
            int i2 = jxuVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jxuVar.s = i2 - Integer.MIN_VALUE;
            } else {
                jxuVar = new jxu(this, zjeVar);
            }
        } else {
            jxuVar = new jxu(this, zjeVar);
        }
        Object obj = jxuVar.q;
        wne wneVar = wne.f39444a;
        int i3 = jxuVar.s;
        if (i3 == 0) {
            z1x.P(obj);
            hru hruVar4 = (hru) this.c;
            khf0 khf0Var = (khf0) this.d;
            bm5 bm5Var = bm5.b;
            jxuVar.m = hruVar4;
            jxuVar.i = d11;
            jxuVar.j = d12;
            jxuVar.k = d11;
            jxuVar.l = d12;
            jxuVar.s = 1;
            Serializable serializableG = khf0.G(khf0Var, bm5Var, jxuVar);
            if (serializableG != wneVar) {
                d3 = d11;
                hruVar = hruVar4;
                obj = serializableG;
                d4 = d12;
            }
            return wneVar;
        }
        if (i3 == 1) {
            double d13 = jxuVar.l;
            double d14 = jxuVar.k;
            d4 = jxuVar.j;
            d3 = jxuVar.i;
            hruVar = jxuVar.m;
            z1x.P(obj);
            d12 = d13;
            d11 = d14;
        } else {
            if (i3 == 2) {
                j = jxuVar.o;
                d12 = jxuVar.l;
                d6 = jxuVar.k;
                d5 = jxuVar.j;
                double d15 = jxuVar.i;
                qvo0Var = jxuVar.n;
                hru hruVar5 = jxuVar.m;
                z1x.P(obj);
                hruVar2 = hruVar5;
                d3 = d15;
                iIntValue = ((Number) obj).intValue();
                rou rouVar = (rou) this.b;
                jxuVar.m = hruVar2;
                jxuVar.n = qvo0Var;
                jxuVar.i = d3;
                jxuVar.j = d5;
                jxuVar.k = d6;
                jxuVar.l = d12;
                jxuVar.o = j;
                jxuVar.p = iIntValue;
                j2 = j;
                jxuVar.s = 3;
                objA = rouVar.a(false, jxuVar);
                if (objA != wneVar) {
                    qvo0Var2 = qvo0Var;
                    obj = objA;
                    d7 = d3;
                    d8 = d12;
                    hruVar3 = hruVar2;
                    d9 = d6;
                    i = iIntValue;
                    d10 = d5;
                    j3 = j2;
                }
                return wneVar;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = jxuVar.p;
            long j4 = jxuVar.o;
            double d16 = jxuVar.l;
            double d17 = jxuVar.k;
            double d18 = jxuVar.j;
            double d19 = jxuVar.i;
            qvo0 qvo0Var3 = jxuVar.n;
            hru hruVar6 = jxuVar.m;
            z1x.P(obj);
            qvo0Var2 = qvo0Var3;
            d9 = d17;
            i = i4;
            hruVar3 = hruVar6;
            j3 = j4;
            d7 = d19;
            d10 = d18;
            d8 = d16;
        }
        int i5 = ((m2c0) obj).F;
        jxuVar.m = null;
        jxuVar.n = null;
        jxuVar.i = d7;
        jxuVar.j = d10;
        jxuVar.s = 4;
        serializableC = hruVar3.c(d9, d8, i, i5, j3, jxuVar, qvo0Var2);
        if (serializableC == wneVar) {
            return wneVar;
        }
        return serializableC;
        ql5 ql5Var = (ql5) obj;
        ((ot) this.e).a(bm5.b, ql5Var);
        long j5 = ql5Var.e;
        qvo0 qvo0Var4 = qvo0.b;
        pmi pmiVar = (pmi) this.f;
        jxuVar.m = hruVar;
        jxuVar.n = qvo0Var4;
        jxuVar.i = d3;
        jxuVar.j = d4;
        jxuVar.k = d11;
        jxuVar.l = d12;
        jxuVar.o = j5;
        double d20 = d11;
        jxuVar.s = 2;
        Serializable serializableX = pmiVar.x(jxuVar);
        if (serializableX != wneVar) {
            obj = serializableX;
            j = j5;
            d5 = d4;
            qvo0Var = qvo0Var4;
            hruVar2 = hruVar;
            d6 = d20;
            iIntValue = ((Number) obj).intValue();
            rou rouVar2 = (rou) this.b;
            jxuVar.m = hruVar2;
            jxuVar.n = qvo0Var;
            jxuVar.i = d3;
            jxuVar.j = d5;
            jxuVar.k = d6;
            jxuVar.l = d12;
            jxuVar.o = j;
            jxuVar.p = iIntValue;
            j2 = j;
            jxuVar.s = 3;
            objA = rouVar2.a(false, jxuVar);
            if (objA != wneVar) {
                qvo0Var2 = qvo0Var;
                obj = objA;
                d7 = d3;
                d8 = d12;
                hruVar3 = hruVar2;
                d9 = d6;
                i = iIntValue;
                d10 = d5;
                j3 = j2;
                int i6 = ((m2c0) obj).F;
                jxuVar.m = null;
                jxuVar.n = null;
                jxuVar.i = d7;
                jxuVar.j = d10;
                jxuVar.s = 4;
                serializableC = hruVar3.c(d9, d8, i, i6, j3, jxuVar, qvo0Var2);
                if (serializableC == wneVar) {
                    return wneVar;
                }
                return serializableC;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object y(long j, long j2, long j3, long j4, boolean z, zje zjeVar) {
        mru mruVar;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z2;
        boolean z3;
        long j9;
        long j10;
        long j11;
        long j12;
        gst0 gst0Var;
        boolean zA;
        long j13;
        if (zjeVar instanceof mru) {
            mruVar = (mru) zjeVar;
            int i = mruVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                mruVar.p = i - Integer.MIN_VALUE;
            } else {
                mruVar = new mru(this, zjeVar);
            }
        } else {
            mruVar = new mru(this, zjeVar);
        }
        Object objI = mruVar.n;
        wne wneVar = wne.f39444a;
        int i2 = mruVar.p;
        if (i2 == 0) {
            z1x.P(objI);
            ieu ieuVar = (ieu) this.e;
            j5 = j;
            mruVar.i = j5;
            j6 = j2;
            mruVar.j = j6;
            j7 = j3;
            mruVar.k = j7;
            j8 = j4;
            mruVar.l = j8;
            z2 = z;
            mruVar.m = z2;
            mruVar.p = 1;
            objI = ieuVar.i(mruVar);
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z2 = mruVar.m;
            long j14 = mruVar.l;
            long j15 = mruVar.k;
            long j16 = mruVar.j;
            long j17 = mruVar.i;
            z1x.P(objI);
            j8 = j14;
            j5 = j17;
            j7 = j15;
            j6 = j16;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = mruVar.m;
            long j18 = mruVar.l;
            long j19 = mruVar.k;
            long j20 = mruVar.j;
            long j21 = mruVar.i;
            z1x.P(objI);
            j12 = j18;
            j11 = j19;
            j10 = j20;
            j9 = j21;
        }
        int i3 = ((c3c0) objI).f3668a;
        edu eduVar = (edu) this.c;
        gst0Var = (gst0) eduVar.b;
        zA = gst0Var.a();
        if (zA) {
            j13 = gst0Var.f11847a.a().f18785a;
        } else {
            j13 = 0;
        }
        return aoq.c(n4c.P(bkb.h0(8L, TimeUnit.SECONDS, new nru(zA, eduVar, j9, j10, j11, j12, i3, j13, null)), new umu((byte) 3), new jcs(eduVar, (byte) 24)), new xpp((yje) null, (Object) this, z3, (byte) 6));
        int i4 = ((elt) objI).e;
        rtu rtuVar = (rtu) this.d;
        mruVar.i = j5;
        mruVar.j = j6;
        mruVar.k = j7;
        mruVar.l = j8;
        mruVar.m = z2;
        mruVar.p = 2;
        objI = rtuVar.a(true, i4, mruVar);
        if (objI != wneVar) {
            z3 = z2;
            j9 = j5;
            j10 = j6;
            j11 = j7;
            j12 = j8;
            int i5 = ((c3c0) objI).f3668a;
            edu eduVar2 = (edu) this.c;
            gst0Var = (gst0) eduVar2.b;
            zA = gst0Var.a();
            if (zA) {
                j13 = gst0Var.f11847a.a().f18785a;
            } else {
                j13 = 0;
            }
            return aoq.c(n4c.P(bkb.h0(8L, TimeUnit.SECONDS, new nru(zA, eduVar2, j9, j10, j11, j12, i5, j13, null)), new umu((byte) 3), new jcs(eduVar2, (byte) 24)), new xpp((yje) null, (Object) this, z3, (byte) 6));
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(long j, zje zjeVar) {
        thu thuVar;
        g0f g0fVarA;
        if (zjeVar instanceof thu) {
            thuVar = (thu) zjeVar;
            int i = thuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                thuVar.k = i - Integer.MIN_VALUE;
            } else {
                thuVar = new thu(this, zjeVar);
            }
        } else {
            thuVar = new thu(this, zjeVar);
        }
        Object objC = thuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = thuVar.k;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objC);
            m0u m0uVar = (m0u) this.c;
            thuVar.k = 1;
            objC = m0uVar.f20973a.c(j, thuVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        xuf xufVar = (xuf) objC;
        if (((j9c) this.e).a() != q4f.m) {
            g0fVarA = ((ert) this.b).a();
        } else {
            ArrayList arrayList = ((m0f) ((ni9) this.f).f23572a.b).f20951a;
            for (Object obj2 : CollectionsKt.A0(arrayList, new vvt((byte) 15))) {
                if (((g0f) obj2).e > 0.0d) {
                    obj = obj2;
                    break;
                }
            }
            g0f g0fVar = (g0f) obj;
            g0fVarA = g0fVar == null ? (g0f) CollectionsKt.U(arrayList) : g0fVar;
        }
        return o2e.h0(g0fVarA, xufVar.f, ((zlt0) this.d).j());
    }

    public /* synthetic */ a6u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f333a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public a6u(Context context, nfq nfqVar, dgq dgqVar, pzu pzuVar, fd40 fd40Var) {
        this.f333a = (byte) 23;
        this.b = new mmx(context, mmx.q, ea3.D, mav.c);
        this.c = nfqVar;
        this.d = dgqVar;
        this.e = pzuVar;
        this.f = fd40Var;
    }

    public a6u(rou rouVar, gst0 gst0Var, j1q0 j1q0Var, ieu ieuVar, yfu yfuVar) {
        this.f333a = (byte) 0;
        gst0Var.getClass();
        j1q0Var.getClass();
        this.b = rouVar;
        this.c = gst0Var;
        this.d = j1q0Var;
        this.e = ieuVar;
        this.f = yfuVar;
    }

    public a6u(yyb yybVar, gmt gmtVar, wsf0 wsf0Var, lg60 lg60Var, fq fqVar) {
        this.f333a = (byte) 25;
        yybVar.getClass();
        gmtVar.getClass();
        lg60Var.getClass();
        fqVar.getClass();
        this.b = yybVar;
        this.c = gmtVar;
        this.d = wsf0Var;
        this.e = lg60Var;
        this.f = fqVar;
    }

    public a6u(a7q a7qVar, j910 j910Var, x0u x0uVar, pru pruVar, bzt bztVar) {
        this.f333a = (byte) 1;
        this.b = a7qVar;
        this.c = j910Var;
        this.d = x0uVar;
        this.e = bztVar;
        this.f = maz.b(new b6u(pruVar, (byte) 0));
    }

    public a6u(hru hruVar, khf0 khf0Var, ot otVar, pmi pmiVar, rou rouVar) {
        this.f333a = (byte) 13;
        this.c = hruVar;
        this.d = khf0Var;
        this.e = otVar;
        this.f = pmiVar;
        this.b = rouVar;
    }

    public a6u(f4u f4uVar, pru pruVar, lbu lbuVar, r9u r9uVar, epc epcVar) {
        this.f333a = (byte) 5;
        pruVar.getClass();
        lbuVar.getClass();
        r9uVar.getClass();
        this.b = f4uVar;
        this.c = pruVar;
        this.d = lbuVar;
        this.e = r9uVar;
        this.f = epcVar;
    }

    public a6u(f7u f7uVar, ali aliVar, viu viuVar, pmi pmiVar, pru pruVar) {
        this.f333a = (byte) 3;
        this.b = f7uVar;
        this.c = aliVar;
        this.d = viuVar;
        this.e = pmiVar;
        this.f = maz.b(new b6u(pruVar, (byte) 1));
    }

    public /* synthetic */ a6u() {
        this.f333a = (byte) 26;
    }

    public a6u(vsc vscVar, xzp xzpVar, xru xruVar, ani0 ani0Var) {
        this.f333a = (byte) 19;
        this.b = vscVar;
        this.c = xzpVar;
        this.d = xruVar;
        this.e = ani0Var;
    }

    public a6u(uzc uzcVar, uqe uqeVar, v7i v7iVar, w5z w5zVar, b3c0 b3c0Var, gst0 gst0Var) {
        this.f333a = (byte) 16;
        b3c0Var.getClass();
        gst0Var.getClass();
        this.b = w5zVar;
        this.d = uzcVar;
        this.e = b3c0Var;
        this.c = gst0Var;
        this.f = v7iVar;
    }

    public a6u(pyu pyuVar, ocl oclVar, hnu hnuVar, reu reuVar, k7u k7uVar) {
        this.f333a = (byte) 15;
        k7uVar.getClass();
        this.b = pyuVar;
        this.c = oclVar;
        this.d = hnuVar;
        this.e = reuVar;
        this.f = k7uVar;
    }

    public a6u(pru pruVar, j3c j3cVar, rtu rtuVar, v7i v7iVar, u8u u8uVar) {
        this.f333a = (byte) 8;
        this.b = j3cVar;
        this.c = rtuVar;
        this.d = v7iVar;
        this.e = u8uVar;
        this.f = maz.b(new b6u(pruVar, (byte) 3));
    }

    public a6u(w5z w5zVar, m0o0 m0o0Var, b3c0 b3c0Var, gst0 gst0Var, uzc uzcVar) {
        this.f333a = (byte) 14;
        b3c0Var.getClass();
        gst0Var.getClass();
        uzcVar.getClass();
        this.b = w5zVar;
        this.d = m0o0Var;
        this.e = b3c0Var;
        this.c = gst0Var;
        this.f = uzcVar;
    }

    public a6u(knf0 knf0Var, zpu zpuVar, iiw iiwVar, jtj jtjVar, khf0 khf0Var) {
        this.f333a = (byte) 24;
        knf0Var.getClass();
        iiwVar.getClass();
        this.b = knf0Var;
        this.c = zpuVar;
        this.d = iiwVar;
        this.e = jtjVar;
        this.f = khf0Var;
    }

    public a6u(abu abuVar, gxu gxuVar, ort ortVar, pmi pmiVar) {
        this.f333a = (byte) 29;
        this.b = abuVar;
        this.c = gxuVar;
        this.d = ortVar;
        this.e = pmiVar;
        this.f = q7m0.a(null);
    }
}
