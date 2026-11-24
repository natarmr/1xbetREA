package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class abu implements tj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f597a;
    public Object b;
    public Object c;

    public abu(gii0 gii0Var, byte b) {
        this.f597a = b;
        gii0Var.getClass();
        switch (b) {
            case 16:
                this.b = gii0Var;
                this.c = new bdv(this, (byte) 9);
                break;
            case 18:
                this.b = gii0Var;
                this.c = new y2x(this, (byte) 4);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.b = gii0Var;
                this.c = new rcz(this, (byte) 15);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.b = gii0Var;
                this.c = maz.b(new rx00(this, (byte) 16));
                break;
            default:
                this.b = gii0Var;
                this.c = new jcs(this, (byte) 29);
                break;
        }
    }

    @Override // a.tj9
    public boolean a() {
        return !l().l.isEmpty();
    }

    @Override // a.tj9
    public List b(int i, Function2 function2) {
        jru jruVar = (jru) this.c;
        if (jruVar != null) {
            return kotlin.collections.a.c(jruVar.j(i, new nrk(function2, (byte) 3)));
        }
        Intrinsics.h("prefetchScope");
        throw null;
    }

    @Override // a.tj9
    public int c() {
        return ((ncz) CollectionsKt.U(l().l)).f23317a;
    }

    @Override // a.tj9
    public int d(int i) {
        return ((ncz) l().l.get(i)).f23317a;
    }

    @Override // a.tj9
    public int e() {
        return l().l.size();
    }

    @Override // a.tj9
    public int g() {
        return ((ncz) CollectionsKt.d0(l().l)).f23317a;
    }

    @Override // a.tj9
    public w6k getDensity() {
        return l().i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object h(String str, zje zjeVar) {
        how howVar;
        List listS;
        ksd0 ksd0Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof how) {
            howVar = (how) zjeVar;
            int i = howVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                howVar.k = i - Integer.MIN_VALUE;
            } else {
                howVar = new how(this, zjeVar);
            }
        } else {
            howVar = new how(this, zjeVar);
        }
        Object objA = howVar.i;
        wne wneVar = wne.f39444a;
        int i2 = howVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            ieu ieuVar = (ieu) this.b;
            LinkedHashMap linkedHashMapO = ofm0.o(knf0Var.b(), str, knf0Var.c());
            howVar.k = 1;
            objA = ((ynw) ((bdv) ieuVar.c).invoke()).a(linkedHashMapO, "application/vnd.xenvelop+json", howVar);
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
        List<osd0> list = ((kow) ((dx5) objA).a()).f18650a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (osd0 osd0Var : list) {
                Long l = osd0Var.f25779a;
                if (l == null) {
                    ksd0Var = null;
                } else {
                    long jLongValue = l.longValue();
                    String str2 = osd0Var.b;
                    String str3 = str2 == null ? "-" : str2;
                    String str4 = osd0Var.c;
                    String str5 = str4 == null ? "-" : str4;
                    String str6 = osd0Var.d;
                    String str7 = str6 == null ? "-" : str6;
                    List list2 = osd0Var.e;
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    ksd0Var = new ksd0(jLongValue, str3, str5, str7, list2);
                }
                arrayList.add(ksd0Var);
            }
            listS = CollectionsKt.S(arrayList);
        } else {
            listS = iun.f15405a;
        }
        return new gow(listS);
    }

    @Override // a.tj9
    public int i() {
        int i = ((ncz) CollectionsKt.U(l().l)).p + (-l().m);
        if (i > 0) {
            i = 0;
        }
        return Math.abs(i);
    }

    @Override // a.tj9
    public int j(int i) {
        return ((ncz) l().l.get(i)).q;
    }

    @Override // a.tj9
    public int k() {
        return vdx.L(l());
    }

    public mcz l() {
        mcz mczVar = (mcz) this.b;
        if (mczVar != null) {
            return mczVar;
        }
        Intrinsics.h("layoutInfo");
        throw null;
    }

    public m520 m() {
        return (m520) ((n0o0) this.c).getValue();
    }

    @Override // a.tj9
    public int n() {
        ncz nczVar = (ncz) CollectionsKt.d0(l().l);
        return Math.abs(((nczVar.p + nczVar.q) + l().s) - l().n);
    }

    public p6d o() {
        return new p6d(vtb.N(((kym0) this.b).c.b), ((n730) this.c).f23022a.f17290a, new y0g(3, (yje) null, (byte) 5), (byte) 1);
    }

    @Override // a.tj9
    public int p() {
        return l().o;
    }

    @Override // a.tj9
    public int q() {
        if (l().o == 0) {
            return -1;
        }
        return l().o - 1;
    }

    @Override // a.tj9
    public Object r(int i) {
        return ((ncz) l().l.get(i)).l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable s(z7b[] z7bVarArr, zje zjeVar) {
        qnu qnuVar;
        if (zjeVar instanceof qnu) {
            qnuVar = (qnu) zjeVar;
            int i = qnuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnuVar.l = i - Integer.MIN_VALUE;
            } else {
                qnuVar = new qnu(this, zjeVar);
            }
        } else {
            qnuVar = new qnu(this, zjeVar);
        }
        Object objE = qnuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = qnuVar.l;
        if (i2 == 0) {
            z1x.P(objE);
            lhf0 lhf0Var = (lhf0) this.c;
            boolean zA = ((j1q0) this.b).f15748a.a();
            qnuVar.i = z7bVarArr;
            qnuVar.l = 1;
            objE = lhf0Var.e(zA, qnuVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z7bVarArr = qnuVar.i;
            z1x.P(objE);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objE) {
            vh0 vh0Var = (vh0) obj;
            int length = z7bVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    arrayList.add(obj);
                    break;
                }
                if (z7bVarArr[i3].f43909a == vh0Var.f) {
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x021b  */
    /* JADX WARN: Code duplicated, block: B:59:0x025d  */
    /* JADX WARN: Code duplicated, block: B:62:0x028c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0297  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0176 -> B:38:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x028c -> B:63:0x0292). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0297 -> B:64:0x0295). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object t(long r25, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.abu.t(long, a.zje):java.lang.Object");
    }

    public String toString() {
        switch (this.f597a) {
            case 22:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(long j, zje zjeVar, String str) {
        c3v c3vVar;
        if (zjeVar instanceof c3v) {
            c3vVar = (c3v) zjeVar;
            int i = c3vVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3vVar.m = i - Integer.MIN_VALUE;
            } else {
                c3vVar = new c3v(this, zjeVar);
            }
        } else {
            c3vVar = new c3v(this, zjeVar);
        }
        Object objA = c3vVar.k;
        Object obj = wne.f39444a;
        int i2 = c3vVar.m;
        if (i2 == 0) {
            z1x.P(objA);
            nrt nrtVar = (nrt) this.c;
            c3vVar.j = str;
            c3vVar.i = j;
            c3vVar.m = 1;
            objA = nrt.a(nrtVar, j, c3vVar);
            if (objA != obj) {
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
        j = c3vVar.i;
        str = c3vVar.j;
        z1x.P(objA);
        ql5 ql5Var = (ql5) objA;
        fck0 fck0Var = (fck0) this.b;
        String strValueOf = ql5Var.i == txs0.g ? String.valueOf(ql5Var.f28916a) : null;
        c3vVar.j = null;
        c3vVar.i = j;
        c3vVar.m = 2;
        Object objF = fck0Var.f(str, strValueOf, c3vVar);
        return objF == obj ? obj : objF;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object v(long j, zje zjeVar, String str, boolean z) {
        xcu xcuVar;
        Object g0g0Var;
        if (zjeVar instanceof xcu) {
            xcuVar = (xcu) zjeVar;
            int i = xcuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xcuVar.k = i - Integer.MIN_VALUE;
            } else {
                xcuVar = new xcu(this, zjeVar);
            }
        } else {
            xcuVar = new xcu(this, zjeVar);
        }
        xcu xcuVar2 = xcuVar;
        Object objD = xcuVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = xcuVar2.k;
        try {
            if (i2 == 0) {
                z1x.P(objD);
                e0g0 e0g0Var = j0g0.b;
                dn0 dn0Var = (dn0) this.c;
                Set setB = cui0.b(new Long(j));
                boolean zA = ((j1q0) this.b).f15748a.a();
                xcuVar2.k = 1;
                objD = dn0Var.d(setB, zA, str, z, false, xcuVar2);
                if (objD == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD);
            }
            g0g0Var = (List) objD;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = iun.f15405a;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        return CollectionsKt.firstOrNull((List) g0g0Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:71:0x010a  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public Object w(zje zjeVar) {
        wju wjuVar;
        gqu gquVar;
        Object g0g0Var;
        lqx lqxVar;
        sff0 sff0Var;
        boolean z = false;
        Integer num = null;
        switch (this.f597a) {
            case 4:
                if (zjeVar instanceof wju) {
                    wjuVar = (wju) zjeVar;
                    int i = wjuVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wjuVar.k = i - Integer.MIN_VALUE;
                    } else {
                        wjuVar = new wju(this, zjeVar);
                    }
                } else {
                    wjuVar = new wju(this, zjeVar);
                }
                Object objA = wjuVar.i;
                Object obj = wne.f39444a;
                int i2 = wjuVar.k;
                if (i2 == 0) {
                    z1x.P(objA);
                    nrt nrtVar = (nrt) this.c;
                    long j = ((gst0) this.b).f11847a.a().f18785a;
                    wjuVar.k = 1;
                    objA = nrt.a(nrtVar, j, wjuVar);
                    if (objA == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objA);
                }
                return ((ql5) objA).f;
            case 8:
                if (zjeVar instanceof gqu) {
                    gquVar = (gqu) zjeVar;
                    int i3 = gquVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gquVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        gquVar = new gqu(this, zjeVar);
                    }
                } else {
                    gquVar = new gqu(this, zjeVar);
                }
                Object objA2 = gquVar.i;
                wne wneVar = wne.f39444a;
                int i4 = gquVar.k;
                try {
                    if (i4 == 0) {
                        z1x.P(objA2);
                        e0g0 e0g0Var = j0g0.b;
                        reu reuVar = (reu) this.c;
                        gquVar.k = 1;
                        objA2 = ((b3c0) reuVar.b).a(false, gquVar);
                        if (objA2 == wneVar) {
                        }
                        return wneVar;
                    }
                    if (i4 != 1) {
                        if (i4 == 2) {
                            z1x.P(objA2);
                            return objA2;
                        }
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objA2);
                    g0g0Var = ((m2c0) objA2).c;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = "0";
                }
                xfu xfuVar = (xfu) this.b;
                gquVar.k = 2;
                cyu cyuVar = (cyu) xfuVar.f40810a;
                Integer intOrNull = StringsKt.toIntOrNull((String) g0g0Var);
                if (intOrNull != null && intOrNull.intValue() != 0) {
                    num = intOrNull;
                }
                Serializable serializableP = cyuVar.p(num, gquVar);
                if (serializableP != wneVar) {
                    return serializableP;
                }
                return wneVar;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ort) this.c).f25751a.a() ? y(zjeVar) : Boolean.TRUE;
            default:
                if (zjeVar instanceof lqx) {
                    lqxVar = (lqx) zjeVar;
                    int i5 = lqxVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lqxVar.l = i5 - Integer.MIN_VALUE;
                    } else {
                        lqxVar = new lqx(this, zjeVar);
                    }
                } else {
                    lqxVar = new lqx(this, zjeVar);
                }
                Object obj2 = lqxVar.j;
                wne wneVar2 = wne.f39444a;
                int i6 = lqxVar.l;
                if (i6 == 0) {
                    z1x.P(obj2);
                    sff0 sff0VarA = ((pru) this.b).a();
                    rou rouVar = (rou) this.c;
                    lqxVar.i = sff0VarA;
                    lqxVar.l = 1;
                    Object objA3 = rouVar.a(false, lqxVar);
                    if (objA3 == wneVar2) {
                        return wneVar2;
                    }
                    obj2 = objA3;
                    sff0Var = sff0VarA;
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sff0Var = lqxVar.i;
                    z1x.P(obj2);
                }
                m2c0 m2c0Var = (m2c0) obj2;
                if (sff0Var.t0 && m2c0Var.e0 != cau0.h) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public Object x(ynb0 ynb0Var, bnn0 bnn0Var) {
        Object objE = ((khf0) this.b).e(ua80.x(((vlk) this.c).f37628a, "restrictEmail", false) ? 1 : 0, bnn0Var, ynb0Var);
        return objE == wne.f39444a ? objE : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[LOOP:0: B:26:0x008d->B:28:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object y(zje zjeVar) {
        bpx bpxVar;
        bsu bsuVar;
        bm5 bm5Var;
        ArrayList arrayList;
        Iterator it;
        xru xruVarF;
        bm5 bm5Var2;
        List list;
        wsf0 wsf0Var = (wsf0) this.b;
        g45 g45Var = (g45) wsf0Var.b;
        if (zjeVar instanceof bpx) {
            bpxVar = (bpx) zjeVar;
            int i = bpxVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                bpxVar.m = i - Integer.MIN_VALUE;
            } else {
                bpxVar = new bpx(this, zjeVar);
            }
        } else {
            bpxVar = new bpx(this, zjeVar);
        }
        Object objB = bpxVar.k;
        wne wneVar = wne.f39444a;
        int i2 = bpxVar.m;
        if (i2 == 0) {
            z1x.P(objB);
            bsuVar = new bsu();
            bm5 bm5Var3 = bm5.d;
            urt urtVarG = wsf0Var.g();
            bpxVar.i = bsuVar;
            bpxVar.j = bm5Var3;
            bpxVar.m = 1;
            Object objA = urt.a(urtVarG, bpxVar);
            if (objA != wneVar) {
                bm5Var = bm5Var3;
                objB = objA;
            }
            return wneVar;
        }
        if (i2 == 1) {
            bm5Var = bpxVar.j;
            bsuVar = (bsu) bpxVar.i;
            z1x.P(objB);
        } else {
            if (i2 == 2) {
                z1x.P(objB);
                Iterable iterable = (Iterable) objB;
                arrayList = new ArrayList(r3d.q(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ql5) it.next()).i);
                }
                ahu ahuVarY = g45Var.y();
                xruVarF = g45Var.F();
                bm5Var2 = bm5.d;
                if (xruVarF.f41388a.p(bm5Var2) <= 0) {
                    bm5Var2 = bm5.f2822a;
                }
                bpxVar.i = arrayList;
                bpxVar.m = 3;
                objB = ahuVarY.b(bm5Var2, bpxVar);
                if (objB != wneVar) {
                    list = arrayList;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) bpxVar.i;
            z1x.P(objB);
        }
        return Boolean.valueOf(list.contains(((ql5) objB).i));
        bpxVar.i = null;
        bpxVar.j = null;
        bpxVar.m = 2;
        objB = bsu.b(bsuVar, bm5Var, (List) objB, bpxVar);
        if (objB != wneVar) {
            Iterable iterable2 = (Iterable) objB;
            arrayList = new ArrayList(r3d.q(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ql5) it.next()).i);
            }
            ahu ahuVarY2 = g45Var.y();
            xruVarF = g45Var.F();
            bm5Var2 = bm5.d;
            if (xruVarF.f41388a.p(bm5Var2) <= 0) {
                bm5Var2 = bm5.f2822a;
            }
            bpxVar.i = arrayList;
            bpxVar.m = 3;
            objB = ahuVarY2.b(bm5Var2, bpxVar);
            if (objB != wneVar) {
                list = arrayList;
                return Boolean.valueOf(list.contains(((ql5) objB).i));
            }
        }
        return wneVar;
    }

    @Override // a.tj9
    public int f(int i) {
        return i;
    }

    public /* synthetic */ abu(Object obj, Object obj2, byte b) {
        this.f597a = b;
        this.b = obj;
        this.c = obj2;
    }

    public abu(gst0 gst0Var, nrt nrtVar) {
        this.f597a = (byte) 4;
        gst0Var.getClass();
        this.b = gst0Var;
        this.c = nrtVar;
    }

    public abu(pyu pyuVar, k7u k7uVar) {
        this.f597a = (byte) 11;
        k7uVar.getClass();
        this.b = pyuVar;
        this.c = k7uVar;
    }

    public abu(j1q0 j1q0Var, dn0 dn0Var) {
        this.f597a = (byte) 1;
        j1q0Var.getClass();
        dn0Var.getClass();
        this.b = j1q0Var;
        this.c = dn0Var;
    }

    public /* synthetic */ abu() {
        this.f597a = (byte) 24;
    }

    public abu(j1q0 j1q0Var, n31 n31Var) {
        this.f597a = (byte) 3;
        j1q0Var.getClass();
        this.b = j1q0Var;
        this.c = n31Var;
    }

    public abu(j1q0 j1q0Var, lhf0 lhf0Var) {
        this.f597a = (byte) 6;
        j1q0Var.getClass();
        this.b = j1q0Var;
        this.c = lhf0Var;
    }

    public abu(h7q h7qVar, uzc uzcVar) {
        this.f597a = (byte) 0;
        h7qVar.getClass();
        this.b = h7qVar;
        this.c = uzcVar;
    }

    public abu(ieu ieuVar, knf0 knf0Var) {
        this.f597a = (byte) 17;
        knf0Var.getClass();
        this.b = ieuVar;
        this.c = knf0Var;
    }

    public abu(b3c0 b3c0Var, gst0 gst0Var) {
        this.f597a = (byte) 5;
        b3c0Var.getClass();
        gst0Var.getClass();
        this.b = b3c0Var;
        this.c = gst0Var;
    }

    public abu(kym0 kym0Var, n730 n730Var) {
        this.f597a = (byte) 9;
        kym0Var.getClass();
        n730Var.getClass();
        this.b = kym0Var;
        this.c = n730Var;
    }

    public abu(xx0 xx0Var, j1q0 j1q0Var) {
        this.f597a = (byte) 14;
        j1q0Var.getClass();
        this.b = xx0Var;
        this.c = j1q0Var;
    }

    public abu(tdl0 tdl0Var, gst0 gst0Var) {
        this.f597a = (byte) 23;
        tdl0Var.getClass();
        gst0Var.getClass();
        this.b = tdl0Var;
        this.c = gst0Var;
    }

    public abu(ieu ieuVar, btt0 btt0Var) {
        this.f597a = (byte) 28;
        btt0Var.getClass();
        this.b = ieuVar;
        this.c = btt0Var;
    }

    public abu(String str) {
        this.f597a = (byte) 22;
        str.getClass();
        this.b = str;
        this.c = new ArrayList(0);
        kd40.f18088a.getClass();
        List listA = jd40.a();
        new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((kd40) it.next()).getClass();
        }
    }
}
