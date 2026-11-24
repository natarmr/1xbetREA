package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class hv60 extends i3t0 {
    public static final /* synthetic */ int i0 = 0;
    public final p4u A;
    public final z4u B;
    public final ls C;
    public final kyg0 D;
    public final dcu E;
    public final iqt F;
    public final dmt G;
    public final foi0 H;
    public final uf3 I;
    public final v88 J;
    public final uyn K;
    public final uxs0 L;
    public final duj M;
    public final rjo N;
    public final ctf0 O;
    public final u58 P;
    public final ih5 Q;
    public final ih5 R;
    public final hs60 S;
    public final gg5 T;
    public final l7k U;
    public final ix0 V;
    public final gw60 W;
    public final cmt X;
    public final p7m0 Y;
    public final p7m0 Z;
    public c4m0 a0;
    public bby b0;
    public final c4m0 c0;
    public c4m0 d0;
    public bby e0;
    public bby f0;
    public bby g0;
    public bby h0;
    public final i1w0 o;
    public final ouu p;
    public final oeg0 q;
    public final m1e r;
    public final mne s;
    public final wsf0 t;
    public final kwt u;
    public final o470 v;
    public final zri w;
    public final lbu x;
    public final yoc y;
    public final yoc z;

    /* JADX WARN: Illegal instructions before constructor call */
    public hv60(i1w0 i1w0Var, ouu ouuVar, oeg0 oeg0Var, m1e m1eVar, mne mneVar, wsf0 wsf0Var, kwt kwtVar, o470 o470Var, zri zriVar, lbu lbuVar, yoc yocVar, yoc yocVar2, p4u p4uVar, z4u z4uVar, ls lsVar, kyg0 kyg0Var, dcu dcuVar, iqt iqtVar, jqt jqtVar, dmt dmtVar, foi0 foi0Var, uf3 uf3Var, v88 v88Var, uyn uynVar, uxs0 uxs0Var, duj dujVar, rjo rjoVar, ctf0 ctf0Var, ocl oclVar, u58 u58Var, ih5 ih5Var, ih5 ih5Var2, hs60 hs60Var, gg5 gg5Var, l7k l7kVar, ix0 ix0Var, gw60 gw60Var, cmt cmtVar) {
        i1w0Var.getClass();
        oeg0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        g090 g090VarP = cvm0.p(vs10Var, dvjVar);
        yje yjeVar = null;
        super(new a540((Object) dmtVar, (Object) iqtVar, (byte) 21), g090VarP, new cz(ctf0Var, oclVar, (byte) 22), (yzn0) null);
        this.o = i1w0Var;
        this.p = ouuVar;
        this.q = oeg0Var;
        this.r = m1eVar;
        this.s = mneVar;
        this.t = wsf0Var;
        this.u = kwtVar;
        this.v = o470Var;
        this.w = zriVar;
        this.x = lbuVar;
        this.y = yocVar;
        this.z = yocVar2;
        this.A = p4uVar;
        this.B = z4uVar;
        this.C = lsVar;
        this.D = kyg0Var;
        this.E = dcuVar;
        this.F = iqtVar;
        this.G = dmtVar;
        this.H = foi0Var;
        this.I = uf3Var;
        this.J = v88Var;
        this.K = uynVar;
        this.L = uxs0Var;
        this.M = dujVar;
        this.N = rjoVar;
        this.O = ctf0Var;
        this.P = u58Var;
        this.Q = ih5Var;
        this.R = ih5Var2;
        this.S = hs60Var;
        this.T = gg5Var;
        this.U = l7kVar;
        this.V = ix0Var;
        this.W = gw60Var;
        this.X = cmtVar;
        kat katVar = kat.f17982a;
        this.Y = q7m0.a(katVar);
        this.Z = q7m0.a(katVar);
        c4m0 c4m0Var = this.c0;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.c0 = i3t0.L(this, new fnq(jqtVar.a(), new xu60(this, yjeVar, b), (byte) 4), dvjVar, null, 2);
        }
    }

    public static dza M(a570 a570Var, pbv pbvVar, double d, boolean z, boolean z2) {
        hds hdsVarA;
        long jD = a570Var != null ? x1x.D(a570Var) : 0L;
        String str = pbvVar != null ? pbvVar.c : null;
        if (str == null) {
            str = "";
        }
        if (pbvVar == null || (hdsVarA = pbvVar.n) == null) {
            hds.Companion.getClass();
            hdsVarA = dds.a();
        }
        return new dza(jD, str, hdsVarA, d, z, z2, pbvVar != null, a570Var instanceof z470, pbvVar != null ? pbvVar.p : false);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    public final void N(Throwable th) {
        Object value;
        Object value2;
        String message;
        Object value3;
        if (th instanceof CancellationException) {
            return;
        }
        boolean z = th instanceof j7t0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z || (th instanceof fpd0)) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, ru60.a((ru60) value, null, false, false, false, 0L, null, null, null, null, null, th, 0L, 2047)));
        } else if (th instanceof sq60) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, ru60.a((ru60) value3, null, false, false, false, 0L, null, null, null, null, null, new sq60(), 0L, 2047)));
        } else if (!((ru60) D()).d || (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof el50) || (th instanceof bun) || (th instanceof vub0)) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, ru60.a((ru60) value2, null, false, false, false, 0L, null, null, null, null, null, new SocketTimeoutException(), 0L, 2047)));
        } else {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            while (true) {
                Object value4 = p7m0Var4.getValue();
                value4.getClass();
                p7m0 p7m0Var5 = p7m0Var4;
                oyg0Var.getClass();
                oyg0 oyg0Var2 = oyg0Var;
                if (p7m0Var5.m(value4, ru60.a((ru60) value4, null, false, false, false, 0L, null, null, null, null, null, th, 0L, 2047))) {
                    break;
                }
                p7m0Var4 = p7m0Var5;
                oyg0Var = oyg0Var2;
            }
            if (th != null && ((th instanceof qct) || (th instanceof zhi0))) {
                message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                if (message.length() == 0) {
                    message = null;
                }
            } else {
                message = null;
            }
            if (message != null) {
                G(new pu60(message));
            }
        }
        this.M.b(th, new cr60((byte) 5));
        this.N.a(th);
    }

    public final void O(boolean z) {
        c4m0 c4m0Var = this.d0;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        p7m0 p7m0Var = this.Y;
        pat patVar = (pat) p7m0Var.getValue();
        patVar.getClass();
        boolean z2 = patVar instanceof kat;
        p7m0 p7m0Var2 = this.Z;
        if (z2) {
            pat patVar2 = (pat) p7m0Var2.getValue();
            patVar2.getClass();
            if (patVar2 instanceof kat) {
                G(lu60.f20659a);
            }
        }
        this.d0 = slb.U(new dnq(new fnq(new xu3(new p6d(p7m0Var, p7m0Var2, av60.h, (byte) 1), (byte) 7), new ku60(z, this, (yje) null), (byte) 4), new bv60(this, null, (byte) 0), (byte) 1), d5c.S(jiu0.a(this), this.s.b));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023b  */
    /* JADX WARN: Code duplicated, block: B:107:0x028f  */
    /* JADX WARN: Code duplicated, block: B:110:0x029d  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x0308 A[LOOP:4: B:135:0x0302->B:137:0x0308, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x031c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x02ef A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9 A[LOOP:0: B:38:0x00e3->B:40:0x00e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0163  */
    /* JADX WARN: Code duplicated, block: B:55:0x017b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:59:0x0184  */
    /* JADX WARN: Code duplicated, block: B:62:0x0191  */
    /* JADX WARN: Code duplicated, block: B:63:0x0194  */
    /* JADX WARN: Code duplicated, block: B:66:0x019a  */
    /* JADX WARN: Code duplicated, block: B:67:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01da  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:89:0x0206  */
    /* JADX WARN: Code duplicated, block: B:92:0x020e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0221  */
    /* JADX WARN: Code duplicated, block: B:97:0x022c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0232  */
    public final Object P(zje zjeVar) {
        cv60 cv60Var;
        List list;
        jza jzaVar;
        Object objO;
        jza jzaVar2;
        Map map;
        Serializable serializableA;
        Map map2;
        List list2;
        jza jzaVar3;
        String str;
        int iA;
        LinkedHashMap linkedHashMap;
        Iterator it;
        List list3;
        a570 a570Var;
        double d;
        double d2;
        a570 a570Var2;
        a570 a570Var3;
        long j;
        double d3;
        Double dI;
        String strD;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        Object owaVar;
        double d4;
        boolean z4;
        pbv pbvVar;
        Double d5;
        double dDoubleValue;
        boolean z5;
        pbv pbvVar2;
        boolean z6;
        lc00 lc00VarA;
        ListIterator listIterator;
        paw pawVar;
        a570 a570Var4;
        Iterator it2;
        Object next;
        pbv pbvVar3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it3;
        pbv pbvVar4;
        if (zjeVar instanceof cv60) {
            cv60Var = (cv60) zjeVar;
            int i = cv60Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cv60Var.n = i - Integer.MIN_VALUE;
            } else {
                cv60Var = new cv60(this, zjeVar);
            }
        } else {
            cv60Var = new cv60(this, zjeVar);
        }
        Object objK = cv60Var.l;
        wne wneVar = wne.f39444a;
        int i2 = cv60Var.n;
        ctf0 ctf0Var = this.O;
        if (i2 == 0) {
            z1x.P(objK);
            cv60Var.n = 1;
            objK = lbu.k(this.x, 0, cv60Var, 3);
            if (objK != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objK);
        } else {
            if (i2 == 2) {
                list = cv60Var.i;
                z1x.P(objK);
                jzaVar = (jza) objK;
                String strA = ctf0Var.b.a(R.string.euro_currency, Arrays.copyOf(new Object[0], 0));
                cv60Var.i = list;
                cv60Var.j = jzaVar;
                cv60Var.n = 3;
                objO = this.w.o(jzaVar, strA, cv60Var);
                if (objO != wneVar) {
                    jzaVar2 = jzaVar;
                    objK = objO;
                    map = (Map) objK;
                    nou nouVarE = ((g45) this.t.b).E();
                    cv60Var.i = list;
                    cv60Var.j = jzaVar2;
                    cv60Var.k = map;
                    cv60Var.n = 4;
                    serializableA = nouVarE.a(tl5.c, cv60Var);
                    if (serializableA != wneVar) {
                        map2 = map;
                        objK = serializableA;
                        list2 = list;
                        jzaVar3 = jzaVar2;
                    }
                }
                return wneVar;
            }
            if (i2 == 3) {
                jza jzaVar4 = cv60Var.j;
                List list4 = cv60Var.i;
                z1x.P(objK);
                jzaVar2 = jzaVar4;
                list = list4;
                map = (Map) objK;
                nou nouVarE2 = ((g45) this.t.b).E();
                cv60Var.i = list;
                cv60Var.j = jzaVar2;
                cv60Var.k = map;
                cv60Var.n = 4;
                serializableA = nouVarE2.a(tl5.c, cv60Var);
                if (serializableA != wneVar) {
                    map2 = map;
                    objK = serializableA;
                    list2 = list;
                    jzaVar3 = jzaVar2;
                }
                return wneVar;
            }
            if (i2 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Map map3 = cv60Var.k;
            jza jzaVar5 = cv60Var.j;
            list2 = cv60Var.i;
            z1x.P(objK);
            map2 = map3;
            jzaVar3 = jzaVar5;
        }
        str = ((ql5) objK).f;
        iA = wp20.a(r3d.q(list2, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        for (it = list2.iterator(); it.hasNext(); it = it) {
            Object next2 = it.next();
            linkedHashMap.put(new Long(((pbv) next2).f26728a), next2);
        }
        list3 = jzaVar3.b;
        a570Var = jzaVar3.f17401a;
        List list5 = jzaVar3.f;
        d = jzaVar3.i;
        d2 = jzaVar3.h;
        a570Var2 = (a570) CollectionsKt.W(0, list3);
        a570Var3 = (a570) CollectionsKt.W(1, list3);
        j = jzaVar3.k;
        d3 = jzaVar3.e;
        if (list3.isEmpty()) {
            owaVar = pwa.f27702a;
            list2 = list2;
            a570Var = a570Var;
            d2 = d2;
            map2 = map2;
        } else {
            dI = kotlin.text.b.i(jzaVar3.d);
            if (dI != null) {
                double dDoubleValue2 = dI.doubleValue();
                pn40 pn40Var = pn40.f27267a;
                strD = pn40.d(dDoubleValue2, ctf0Var.b.a(R.string.euro_currency, Arrays.copyOf(new Object[0], 0)), p3u0.c);
            } else {
                strD = null;
            }
            if (dI == null && Intrinsics.a(d3, dI) && d3 != 0.0d) {
                z = true;
            } else {
                z = false;
            }
            if (j > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            pn40 pn40Var2 = pn40.f27267a;
            String strD2 = pn40.d(d3, str, p3u0.c);
            if (z) {
                str2 = null;
            } else {
                str2 = strD;
            }
            if (d2 > 0.0d) {
                z3 = true;
            } else {
                z3 = false;
            }
            owaVar = new owa(z2 ? System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(j) : 0L, strD2, str2, z3);
        }
        pn40 pn40Var3 = pn40.f27267a;
        if (d2 > d) {
            d4 = d;
        } else {
            d4 = d2;
        }
        p3u0 p3u0Var = p3u0.c;
        mza mzaVar = new mza((float) jzaVar3.c, pn40.d(d4, str, p3u0Var), pn40.d(d, str, p3u0Var));
        if (d2 >= d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (a570Var2 != null) {
            pbvVar = (pbv) linkedHashMap.get(new Long(x1x.D(a570Var2)));
        } else {
            pbvVar = null;
        }
        d5 = (Double) CollectionsKt.W(0, list5);
        if (d5 != null) {
            dDoubleValue = d5.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        if (a570Var2 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        dza dzaVarM = M(a570Var2, pbvVar, dDoubleValue, z4, z5);
        if (a570Var3 != null) {
            pbvVar2 = (pbv) linkedHashMap.get(new Long(x1x.D(a570Var3)));
        } else {
            pbvVar2 = null;
        }
        Double d6 = (Double) CollectionsKt.W(1, list5);
        double dDoubleValue3 = d6 != null ? d6.doubleValue() : 0.0d;
        if (a570Var3 != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        a570 a570Var5 = a570Var;
        H(new fn0((Object) jzaVar3, (Object) map2, owaVar, (Object) mzaVar, (Object) dzaVarM, (Object) M(a570Var3, pbvVar2, dDoubleValue3, z4, z6), (Object) M(a570Var5, (pbv) linkedHashMap.get(new Long(x1x.D(a570Var))), jzaVar3.g, true, true), (byte) 11));
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(a570Var5);
        lc00VarB.addAll(list3);
        lc00VarA = kotlin.collections.a.a(lc00VarB);
        if (lc00VarA != null || !lc00VarA.isEmpty()) {
            listIterator = lc00VarA.listIterator(0);
            while (true) {
                pawVar = (paw) listIterator;
                if (pawVar.hasNext()) {
                    a570Var4 = (a570) pawVar.next();
                    it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (((pbv) next).f26728a != x1x.D(a570Var4));
                    pbvVar3 = (pbv) next;
                    if (pbvVar3 != null || !pbvVar3.p) {
                        if (pbvVar3 == null && !pbvVar3.q) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList = new ArrayList();
            for (Object obj : list2) {
                pbvVar4 = (pbv) obj;
                if (!pbvVar4.p || !pbvVar4.q) {
                    arrayList.add(obj);
                }
            }
            arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Long.valueOf(((pbv) it3.next()).f26728a));
            }
            W(arrayList2);
        }
        return Unit.f46060a;
        list = (List) objK;
        cv60Var.i = list;
        cv60Var.n = 2;
        objK = this.u.f19019a.b(list, cv60Var);
        if (objK != wneVar) {
            jzaVar = (jza) objK;
            String strA2 = ctf0Var.b.a(R.string.euro_currency, Arrays.copyOf(new Object[0], 0));
            cv60Var.i = list;
            cv60Var.j = jzaVar;
            cv60Var.n = 3;
            objO = this.w.o(jzaVar, strA2, cv60Var);
            if (objO != wneVar) {
                jzaVar2 = jzaVar;
                objK = objO;
                map = (Map) objK;
                nou nouVarE3 = ((g45) this.t.b).E();
                cv60Var.i = list;
                cv60Var.j = jzaVar2;
                cv60Var.k = map;
                cv60Var.n = 4;
                serializableA = nouVarE3.a(tl5.c, cv60Var);
                if (serializableA != wneVar) {
                    map2 = map;
                    objK = serializableA;
                    list2 = list;
                    jzaVar3 = jzaVar2;
                    str = ((ql5) objK).f;
                    iA = wp20.a(r3d.q(list2, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    while (it.hasNext()) {
                        Object next3 = it.next();
                        linkedHashMap.put(new Long(((pbv) next3).f26728a), next3);
                    }
                    list3 = jzaVar3.b;
                    a570Var = jzaVar3.f17401a;
                    List list6 = jzaVar3.f;
                    d = jzaVar3.i;
                    d2 = jzaVar3.h;
                    a570Var2 = (a570) CollectionsKt.W(0, list3);
                    a570Var3 = (a570) CollectionsKt.W(1, list3);
                    j = jzaVar3.k;
                    d3 = jzaVar3.e;
                    if (list3.isEmpty()) {
                        owaVar = pwa.f27702a;
                        list2 = list2;
                        a570Var = a570Var;
                        d2 = d2;
                        map2 = map2;
                    } else {
                        dI = kotlin.text.b.i(jzaVar3.d);
                        if (dI != null) {
                            double dDoubleValue4 = dI.doubleValue();
                            pn40 pn40Var4 = pn40.f27267a;
                            strD = pn40.d(dDoubleValue4, ctf0Var.b.a(R.string.euro_currency, Arrays.copyOf(new Object[0], 0)), p3u0.c);
                        } else {
                            strD = null;
                        }
                        if (dI == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (j > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        pn40 pn40Var5 = pn40.f27267a;
                        String strD3 = pn40.d(d3, str, p3u0.c);
                        if (z) {
                            str2 = null;
                        } else {
                            str2 = strD;
                        }
                        if (d2 > 0.0d) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        owaVar = new owa(z2 ? System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(j) : 0L, strD3, str2, z3);
                    }
                    pn40 pn40Var6 = pn40.f27267a;
                    if (d2 > d) {
                        d4 = d;
                    } else {
                        d4 = d2;
                    }
                    p3u0 p3u0Var2 = p3u0.c;
                    mza mzaVar2 = new mza((float) jzaVar3.c, pn40.d(d4, str, p3u0Var2), pn40.d(d, str, p3u0Var2));
                    if (d2 >= d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (a570Var2 != null) {
                        pbvVar = (pbv) linkedHashMap.get(new Long(x1x.D(a570Var2)));
                    } else {
                        pbvVar = null;
                    }
                    d5 = (Double) CollectionsKt.W(0, list6);
                    if (d5 != null) {
                        dDoubleValue = d5.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (a570Var2 != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    dza dzaVarM2 = M(a570Var2, pbvVar, dDoubleValue, z4, z5);
                    if (a570Var3 != null) {
                        pbvVar2 = (pbv) linkedHashMap.get(new Long(x1x.D(a570Var3)));
                    } else {
                        pbvVar2 = null;
                    }
                    Double d7 = (Double) CollectionsKt.W(1, list6);
                    if (d7 != null) {
                    }
                    if (a570Var3 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    a570 a570Var6 = a570Var;
                    H(new fn0((Object) jzaVar3, (Object) map2, owaVar, (Object) mzaVar2, (Object) dzaVarM2, (Object) M(a570Var3, pbvVar2, dDoubleValue3, z4, z6), (Object) M(a570Var6, (pbv) linkedHashMap.get(new Long(x1x.D(a570Var))), jzaVar3.g, true, true), (byte) 11));
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    lc00VarB2.add(a570Var6);
                    lc00VarB2.addAll(list3);
                    lc00VarA = kotlin.collections.a.a(lc00VarB2);
                    if (lc00VarA != null) {
                        listIterator = lc00VarA.listIterator(0);
                        while (true) {
                            pawVar = (paw) listIterator;
                            if (pawVar.hasNext()) {
                                a570Var4 = (a570) pawVar.next();
                                it2 = list2.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (((pbv) next).f26728a != x1x.D(a570Var4));
                                pbvVar3 = (pbv) next;
                                if (pbvVar3 != null) {
                                }
                                if (pbvVar3 == null) {
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        while (r2.hasNext()) {
                            pbvVar4 = (pbv) obj;
                            if (!pbvVar4.p) {
                            }
                            arrayList.add(obj);
                        }
                        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Long.valueOf(((pbv) it3.next()).f26728a));
                        }
                        W(arrayList2);
                    } else {
                        listIterator = lc00VarA.listIterator(0);
                        while (true) {
                            pawVar = (paw) listIterator;
                            if (pawVar.hasNext()) {
                                a570Var4 = (a570) pawVar.next();
                                it2 = list2.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (((pbv) next).f26728a != x1x.D(a570Var4));
                                pbvVar3 = (pbv) next;
                                if (pbvVar3 != null) {
                                }
                                if (pbvVar3 == null) {
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        while (r2.hasNext()) {
                            pbvVar4 = (pbv) obj;
                            if (!pbvVar4.p) {
                            }
                            arrayList.add(obj);
                        }
                        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Long.valueOf(((pbv) it3.next()).f26728a));
                        }
                        W(arrayList2);
                    }
                    return Unit.f46060a;
                }
            }
        }
        return wneVar;
    }

    public final void Q() {
        i1w0 i1w0Var = this.o;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void R(dza dzaVar, boolean z, String str) {
        bby bbyVar = this.g0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.g0 = I(this.s.b, new jw50(1, this, hv60.class, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 0, (byte) 25), new lpn(dzaVar, this, str, z, null));
        }
    }

    public final void S(int i, String str) {
        dza dzaVar = (dza) CollectionsKt.W(i, ((ru60) D()).j);
        if (dzaVar == null) {
            return;
        }
        if (dzaVar.f) {
            R(dzaVar, false, str);
        } else {
            this.o.d(new wu60(this, (byte) 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (U(r7, r4, r13, r12) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        if (r1.U(r2, r4, r5, r6) == r0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(long r12, a.zje r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hv60.T(long, a.zje, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(long j, zje zjeVar, String str, boolean z) {
        ev60 ev60Var;
        long j2;
        String str2;
        boolean z2;
        if (zjeVar instanceof ev60) {
            ev60Var = (ev60) zjeVar;
            int i = ev60Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ev60Var.n = i - Integer.MIN_VALUE;
            } else {
                ev60Var = new ev60(this, zjeVar);
            }
        } else {
            ev60Var = new ev60(this, zjeVar);
        }
        Object obj = ev60Var.l;
        wne wneVar = wne.f39444a;
        int i2 = ev60Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            ev60Var.k = str;
            ev60Var.i = j;
            ev60Var.j = z;
            ev60Var.n = 1;
            Object objA = this.B.a(j, ev60Var);
            if (objA == wneVar) {
                return wneVar;
            }
            j2 = j;
            str2 = str;
            obj = objA;
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = ev60Var.j;
            long j3 = ev60Var.i;
            String str3 = ev60Var.k;
            z1x.P(obj);
            z2 = z3;
            str2 = str3;
            j2 = j3;
        }
        this.o.d(new k1b(this, j2, z2, str2, !((Boolean) obj).booleanValue(), (byte) 3));
        return Unit.f46060a;
    }

    public final void V() {
        if (((ru60) D()).c) {
            bby bbyVar = this.b0;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.b0 = I(this.s.b, new jw50(1, this, hv60.class, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 0, (byte) 27), new gv60(this, (yje) null, (byte) 0));
        }
    }

    public final void W(List list) {
        bby bbyVar = this.f0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.f0 = sac.f0(jiu0.a(this), this.z.a(), TimeUnit.MILLISECONDS, this.s.f22085a, new jw50(1, this, hv60.class, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 0, (byte) 28), new ku60(this, list, null, (byte) 2), 32);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        tt60 tt60Var = (tt60) obj;
        tt60Var.getClass();
        super.x(tt60Var);
        if (tt60Var instanceof ft60) {
            Q();
            return;
        }
        boolean z = tt60Var instanceof ot60;
        i1w0 i1w0Var = this.o;
        byte b = 0;
        if (z) {
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI.h(this.K.a(((ru60) D()).g));
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean z2 = tt60Var instanceof nt60;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            byte b2 = 1;
            if (z2) {
                if (!((ru60) D()).d) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value3, ru60.a((ru60) value3, null, false, false, false, 0L, null, null, null, null, null, new SocketTimeoutException(), 0L, 2047)));
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, ru60.a((ru60) value2, null, false, false, false, 0L, null, null, null, iun.f15405a, null, null, 0L, 127)));
                G(mu60.f22400a);
                O(true);
                return;
            }
            if (tt60Var instanceof qt60) {
                this.p.q(new bb50(false), true);
                Q();
                return;
            }
            boolean z3 = tt60Var instanceof st60;
            byte b3 = 4;
            mne mneVar = this.s;
            yje yjeVar = null;
            if (z3) {
                bby bbyVar = this.h0;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.P.f35083a.c("games_cashback_withdraw_call");
                    this.V.f15516a.a(xun.f41520a, 3336L);
                    this.h0 = sac.V(jiu0.a(this), new wu60(this, b), null, mneVar.b, new xu60(this, yjeVar, b3), 10);
                    return;
                }
                return;
            }
            if (tt60Var instanceof lt60) {
                this.Q.f(k7k.OneXCashback);
                y1p y1pVar = y1p.MAIN;
                this.U.b("games_cashback", this.X.g());
                sac.V(jiu0.a(this), new jw50(1, this, hv60.class, "handleErrorSilently", "handleErrorSilently(Ljava/lang/Throwable;)V", 0, (byte) 26), null, mneVar.b, new xu60(this, yjeVar, (byte) 3), 10);
                return;
            }
            if (tt60Var instanceof et60) {
                this.R.c("games_cashback");
                this.T.i("games_cashback");
                G(nu60.f24135a);
                return;
            }
            if (tt60Var instanceof rt60) {
                V();
                return;
            }
            if (tt60Var instanceof gt60) {
                ql5 ql5Var = ((gt60) tt60Var).f11866a;
                long j = ql5Var.f28916a;
                this.D.a(j);
                wsf0 wsf0Var = this.t;
                ot otVarB = wsf0Var.b();
                bm5 bm5Var = bm5.d;
                otVarB.a(bm5Var, ql5Var);
                wsf0Var.q().f17359a.z(bm5Var, j);
                V();
                return;
            }
            boolean z4 = tt60Var instanceof kt60;
            oeg0 oeg0Var = this.q;
            if (z4) {
                i1w0 i1w0VarC = oeg0Var.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0VarC.a((oe50) pawVar2.next());
                    }
                }
            } else if (tt60Var instanceof mt60) {
                i1w0 i1w0VarC2 = oeg0Var.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, o0w0.f24450a)), i1w0VarC2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP2;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0VarC2.a((oe50) pawVar3.next());
                    }
                }
            } else {
                if (tt60Var instanceof it60) {
                    S(0, ((it60) tt60Var).f15341a);
                    return;
                }
                if (tt60Var instanceof pt60) {
                    S(1, ((pt60) tt60Var).f27549a);
                    return;
                }
                if (tt60Var instanceof ht60) {
                    String str = ((ht60) tt60Var).f13619a;
                    dza dzaVar = ((ru60) D()).k;
                    if (dzaVar == null) {
                        return;
                    }
                    R(dzaVar, true, str);
                    return;
                }
                if (!(tt60Var instanceof jt60)) {
                    if (tt60Var instanceof dt60) {
                        c4m0 c4m0Var = this.a0;
                        if (c4m0Var == null || !c4m0Var.isActive()) {
                            this.a0 = slb.U(new dnq(new fnq(i120.W(this.r.b()), new xu60(this, yjeVar, (byte) 2), (byte) 4), new bv60(this, yjeVar, b2), (byte) 1), d5c.S(jiu0.a(this), mneVar.b));
                        }
                        V();
                        O(false);
                        return;
                    }
                    if (tt60Var instanceof ct60) {
                        c4m0 c4m0Var2 = this.a0;
                        if (c4m0Var2 != null) {
                            c4m0Var2.cancel(null);
                        }
                        bby bbyVar2 = this.f0;
                        if (bbyVar2 != null) {
                            v3c.N(bbyVar2);
                        }
                        c4m0 c4m0Var3 = this.d0;
                        if (c4m0Var3 != null) {
                            v3c.N(c4m0Var3);
                        }
                        bby bbyVar3 = this.e0;
                        if (bbyVar3 != null) {
                            v3c.N(bbyVar3);
                        }
                        bby bbyVar4 = this.b0;
                        if (bbyVar4 != null) {
                            v3c.N(bbyVar4);
                            return;
                        }
                        return;
                    }
                    if (tt60Var instanceof xs60) {
                        E();
                        return;
                    }
                    if (tt60Var instanceof zs60) {
                        W(kotlin.collections.a.c(Long.valueOf(((zs60) tt60Var).f44892a)));
                        return;
                    }
                    if (tt60Var instanceof at60) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value = p7m0Var3.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var3.m(value, ru60.a((ru60) value, null, false, false, false, 0L, null, null, null, null, null, new sq60(), 0L, 2047)));
                        return;
                    }
                    if (tt60Var instanceof ys60) {
                        this.Y.n(((ys60) tt60Var).f43155a);
                        return;
                    } else if (!(tt60Var instanceof bt60)) {
                        t9f.b();
                        return;
                    } else {
                        this.Z.n(((bt60) tt60Var).f3167a);
                        return;
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenE = this.I.f35560a.e();
                if (fragmentScreenE instanceof DialogScreen) {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenE)));
                } else {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenE)));
                }
                ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO2;
                    if (!pawVar4.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar4.next());
                    }
                }
            }
        }
    }
}
