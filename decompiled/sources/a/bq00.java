package a;

import android.os.SystemClock;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.blocking.GeoBlockScreenProviderImpl$screen$1;
import org.xplatform.client1.features.main.MainScreenProviderImpl$screen$1;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class bq00 extends i3t0 {
    public static final /* synthetic */ int n0 = 0;
    public final tti0 A;
    public final i9c B;
    public final nff0 C;
    public final kyb D;
    public final nkt E;
    public final azb F;
    public final zql0 G;
    public final rnf0 H;
    public final who I;
    public final udo J;
    public final vpe K;
    public final ouf L;
    public final xqt0 M;
    public final cg5 N;
    public final ltm0 O;
    public final k1f0 P;
    public final g5t Q;
    public final jat R;
    public final sgb0 S;
    public final ugq0 T;
    public final czq0 U;
    public final trc V;
    public final rkt0 W;
    public final j910 X;
    public final n4u Y;
    public final ag3 Z;
    public final m1e a0;
    public final x20 b0;
    public final cmt c0;
    public final nnt0 d0;
    public final jbx e0;
    public final ony f0;
    public final o470 g0;
    public final cad h0;
    public final ljf0 i0;
    public final p7m0 j0;
    public c4m0 k0;
    public final ArrayList l0;
    public final jo20 m0;
    public final vzg0 o;
    public final gr00 p;
    public final pru q;
    public final mne r;
    public final wti s;
    public final nmo t;
    public final evt u;
    public final evt v;
    public final do20 w;
    public final pyu x;
    public final psf0 y;
    public final ql40 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public bq00(vzg0 vzg0Var, gr00 gr00Var, pru pruVar, mne mneVar, uyn uynVar, svu svuVar, bzu bzuVar, ctf0 ctf0Var, wti wtiVar, nmo nmoVar, evt evtVar, evt evtVar2, do20 do20Var, pyu pyuVar, psf0 psf0Var, ql40 ql40Var, tti0 tti0Var, i9c i9cVar, nff0 nff0Var, kyb kybVar, nkt nktVar, azb azbVar, zql0 zql0Var, rnf0 rnf0Var, who whoVar, udo udoVar, vpe vpeVar, ouf oufVar, xqt0 xqt0Var, cg5 cg5Var, ltm0 ltm0Var, k1f0 k1f0Var, g5t g5tVar, jat jatVar, sgb0 sgb0Var, ugq0 ugq0Var, czq0 czq0Var, trc trcVar, bb6 bb6Var, rkt0 rkt0Var, j1q0 j1q0Var, j910 j910Var, n4u n4uVar, ag3 ag3Var, m1e m1eVar, x20 x20Var, cmt cmtVar, nnt0 nnt0Var, jbx jbxVar, n4u n4uVar2, uxs0 uxs0Var, kys0 kys0Var, gst gstVar, bzt bztVar, ony onyVar, o470 o470Var, cad cadVar, ljf0 ljf0Var) {
        Object value;
        cp00 cp00Var;
        Object value2;
        cp00 cp00Var2;
        ctf0Var.getClass();
        psf0Var.getClass();
        tti0Var.getClass();
        i9cVar.getClass();
        nff0Var.getClass();
        kybVar.getClass();
        nktVar.getClass();
        azbVar.getClass();
        zql0Var.getClass();
        rnf0Var.getClass();
        whoVar.getClass();
        udoVar.getClass();
        vpeVar.getClass();
        oufVar.getClass();
        xqt0Var.getClass();
        cg5Var.getClass();
        ltm0Var.getClass();
        k1f0Var.getClass();
        g5tVar.getClass();
        jatVar.getClass();
        sgb0Var.getClass();
        ugq0Var.getClass();
        czq0Var.getClass();
        trcVar.getClass();
        j1q0Var.getClass();
        m1eVar.getClass();
        nnt0Var.getClass();
        onyVar.getClass();
        vs10 vs10Var = mneVar.c;
        super(new b87(pruVar, bztVar, uynVar, ctf0Var, evtVar2, n4uVar2, svuVar, bzuVar, j1q0Var), cvm0.p(vs10Var, vs10Var), new u400(ctf0Var, bb6Var, (byte) 13), (yzn0) null);
        this.o = vzg0Var;
        this.p = gr00Var;
        this.q = pruVar;
        this.r = mneVar;
        this.s = wtiVar;
        this.t = nmoVar;
        this.u = evtVar;
        this.v = evtVar2;
        this.w = do20Var;
        this.x = pyuVar;
        this.y = psf0Var;
        this.z = ql40Var;
        this.A = tti0Var;
        this.B = i9cVar;
        this.C = nff0Var;
        this.D = kybVar;
        this.E = nktVar;
        this.F = azbVar;
        this.G = zql0Var;
        this.H = rnf0Var;
        this.I = whoVar;
        this.J = udoVar;
        this.K = vpeVar;
        this.L = oufVar;
        this.M = xqt0Var;
        this.N = cg5Var;
        this.O = ltm0Var;
        this.P = k1f0Var;
        this.Q = g5tVar;
        this.R = jatVar;
        this.S = sgb0Var;
        this.T = ugq0Var;
        this.U = czq0Var;
        this.V = trcVar;
        this.W = rkt0Var;
        this.X = j910Var;
        this.Y = n4uVar;
        this.Z = ag3Var;
        this.a0 = m1eVar;
        this.b0 = x20Var;
        this.c0 = cmtVar;
        this.d0 = nnt0Var;
        this.e0 = jbxVar;
        this.f0 = onyVar;
        this.g0 = o470Var;
        this.h0 = cadVar;
        this.i0 = ljf0Var;
        this.j0 = q7m0.a(nf50.f23419a);
        this.l0 = new ArrayList();
        jo20 jo20Var = new jo20();
        final byte b = 0;
        final byte b2 = 1;
        jo20Var.put(kh3.RESOLVE, new g8d(q3d.j(tti0Var, psf0Var)));
        jo20Var.put(kh3.CONFIG, new g8d(q3d.j(nktVar, i9cVar, nff0Var, ql40Var, kybVar)));
        jo20Var.put(kh3.CHECK_GEO, new g8d(kotlin.collections.a.c(azbVar)));
        jo20Var.put(kh3.SPORT_DICTIONARY, new g8d(q3d.j(zql0Var, whoVar, udoVar)));
        jo20Var.put(kh3.COUNTRIES_DICTIONARY, new g8d(q3d.j(vpeVar, oufVar)));
        jo20Var.put(kh3.USER, new g8d(q3d.j(xqt0Var, cg5Var)));
        jo20Var.put(kh3.STRINGS, new g8d(kotlin.collections.a.c(ltm0Var)));
        kh3 kh3Var = kh3.OTHER;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(k1f0Var);
        lc00VarB.add(g5tVar);
        lc00VarB.add(jatVar);
        lc00VarB.add(ugq0Var);
        lc00VarB.add(czq0Var);
        lc00VarB.add(sgb0Var);
        lc00VarB.add(trcVar);
        jo20Var.put(kh3Var, new g8d(kotlin.collections.a.a(lc00VarB)));
        jo20 jo20VarB = jo20Var.b();
        this.m0 = jo20VarB;
        i3t0.K(this, null, null, new vp00(this, null, (byte) 2), 3);
        Iterator it = jo20VarB.values().iterator();
        while (it.hasNext()) {
            for (vw5 vw5Var : ((g8d) it.next()).f10858a) {
                if (Intrinsics.d(this.o.a(vw5Var.e().a()), Boolean.TRUE)) {
                    vw5Var.g();
                }
            }
        }
        vzg0 vzg0Var2 = this.o;
        Object objA = vzg0Var2.a(veo.class.getName());
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.d(objA, bool)) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                cp00Var2 = (cp00) value2;
                this.f.getClass();
            } while (!p7m0Var.m(value2, cp00.a(cp00Var2, null, null, null, null, null, eui0.h(cp00Var2.j, veo.f37295a), false, false, 130559)));
        }
        rlt rltVar = rlt.c;
        if (Intrinsics.d(vzg0Var2.a(weo.class.getName()), bool)) {
            rlt rltVar2 = (rlt) vzg0Var2.a("ShowGeoBlockGeoState");
            rltVar = rltVar2 != null ? rltVar2 : rltVar;
            Boolean bool2 = (Boolean) vzg0Var2.a("ShowGeoBlockNeedGeo");
            boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            p7m0 p7m0Var2 = this.i.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                cp00Var = (cp00) value;
                this.f.getClass();
            } while (!p7m0Var2.m(value, cp00.a(cp00Var, null, null, null, null, null, eui0.h(cp00Var.j, new weo(rltVar, zBooleanValue)), false, false, 130559)));
        }
        rnf0 rnf0Var2 = this.H;
        M(rnf0Var2);
        rnf0Var2.h = new up00(this, (byte) 4);
        M(this.A);
        psf0 psf0Var2 = this.y;
        M(psf0Var2);
        psf0Var2.s = new Function2(this) { // from class: a.tp00
            public final /* synthetic */ bq00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value3;
                cp00 cp00Var3;
                byte b3 = b2;
                bq00 bq00Var = this.b;
                switch (b3) {
                    case 0:
                        rlt rltVar3 = (rlt) obj;
                        Boolean bool3 = (Boolean) obj2;
                        boolean zBooleanValue2 = bool3.booleanValue();
                        rltVar3.getClass();
                        weo weoVar = new weo(rltVar3, zBooleanValue2);
                        vzg0 vzg0Var3 = bq00Var.o;
                        vzg0Var3.e(weo.class.getName(), Boolean.TRUE);
                        vzg0Var3.e("ShowGeoBlockGeoState", rltVar3);
                        vzg0Var3.e("ShowGeoBlockNeedGeo", bool3);
                        p7m0 p7m0Var3 = bq00Var.i.f25029a;
                        do {
                            value3 = p7m0Var3.getValue();
                            value3.getClass();
                            cp00Var3 = (cp00) value3;
                            bq00Var.f.getClass();
                        } while (!p7m0Var3.m(value3, cp00.a(cp00Var3, null, null, null, null, null, eui0.h(cp00Var3.j, weoVar), false, false, 130559)));
                        break;
                    case 1:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        String str = (String) obj2;
                        str.getClass();
                        bq00Var.G(new uo00(str, zBooleanValue3));
                        break;
                    default:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                        p7m0 p7m0Var4 = bq00Var.j0;
                        qf50 qf50Var = new qf50(zBooleanValue4, zBooleanValue5);
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, qf50Var);
                        break;
                }
                return Unit.f46060a;
            }
        };
        psf0Var2.t = new up00(this, (byte) 5);
        i9c i9cVar2 = this.B;
        M(i9cVar2);
        i9cVar2.k = new Function1(this) { // from class: a.sp00
            public final /* synthetic */ bq00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value3;
                byte b3 = b2;
                yje yjeVar = null;
                bq00 bq00Var = this.b;
                switch (b3) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        i3t0.K(bq00Var, null, null, new wp00(bq00Var, str, yjeVar, (byte) 0), 3);
                        i3t0.K(bq00Var, null, null, new wp00(bq00Var, str, yjeVar, (byte) 1), 3);
                        break;
                    case 1:
                        im3 im3Var = (im3) obj;
                        im3Var.getClass();
                        p7m0 p7m0Var3 = bq00Var.j0;
                        pf50 pf50Var = new pf50(im3Var);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, pf50Var);
                        break;
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        p7m0 p7m0Var4 = bq00Var.i.f25029a;
                        do {
                            value3 = p7m0Var4.getValue();
                            value3.getClass();
                            bq00Var.f.getClass();
                        } while (!p7m0Var4.m(value3, cp00.a((cp00) value3, null, null, null, null, null, null, false, zBooleanValue2, 129023)));
                        if (zBooleanValue2) {
                            ArrayList arrayList = bq00Var.l0;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                v3c.N((bby) it2.next());
                            }
                            arrayList.clear();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        };
        nff0 nff0Var2 = this.C;
        M(nff0Var2);
        nff0Var2.p = new up00(this, (byte) 3);
        kyb kybVar2 = this.D;
        M(kybVar2);
        final byte b3 = 2;
        kybVar2.i = new Function1(this) { // from class: a.sp00
            public final /* synthetic */ bq00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value3;
                byte b4 = b3;
                yje yjeVar = null;
                bq00 bq00Var = this.b;
                switch (b4) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        i3t0.K(bq00Var, null, null, new wp00(bq00Var, str, yjeVar, (byte) 0), 3);
                        i3t0.K(bq00Var, null, null, new wp00(bq00Var, str, yjeVar, (byte) 1), 3);
                        break;
                    case 1:
                        im3 im3Var = (im3) obj;
                        im3Var.getClass();
                        p7m0 p7m0Var3 = bq00Var.j0;
                        pf50 pf50Var = new pf50(im3Var);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, pf50Var);
                        break;
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        p7m0 p7m0Var4 = bq00Var.i.f25029a;
                        do {
                            value3 = p7m0Var4.getValue();
                            value3.getClass();
                            bq00Var.f.getClass();
                        } while (!p7m0Var4.m(value3, cp00.a((cp00) value3, null, null, null, null, null, null, false, zBooleanValue2, 129023)));
                        if (zBooleanValue2) {
                            ArrayList arrayList = bq00Var.l0;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                v3c.N((bby) it2.next());
                            }
                            arrayList.clear();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        };
        M(this.z);
        nkt nktVar2 = this.E;
        M(nktVar2);
        nktVar2.j = new Function1(this) { // from class: a.sp00
            public final /* synthetic */ bq00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value3;
                byte b4 = b;
                yje yjeVar = null;
                bq00 bq00Var = this.b;
                switch (b4) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        i3t0.K(bq00Var, null, null, new wp00(bq00Var, str, yjeVar, (byte) 0), 3);
                        i3t0.K(bq00Var, null, null, new wp00(bq00Var, str, yjeVar, (byte) 1), 3);
                        break;
                    case 1:
                        im3 im3Var = (im3) obj;
                        im3Var.getClass();
                        p7m0 p7m0Var3 = bq00Var.j0;
                        pf50 pf50Var = new pf50(im3Var);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, pf50Var);
                        break;
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        p7m0 p7m0Var4 = bq00Var.i.f25029a;
                        do {
                            value3 = p7m0Var4.getValue();
                            value3.getClass();
                            bq00Var.f.getClass();
                        } while (!p7m0Var4.m(value3, cp00.a((cp00) value3, null, null, null, null, null, null, false, zBooleanValue2, 129023)));
                        if (zBooleanValue2) {
                            ArrayList arrayList = bq00Var.l0;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                v3c.N((bby) it2.next());
                            }
                            arrayList.clear();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        };
        azb azbVar2 = this.F;
        M(azbVar2);
        azbVar2.r = new Function2(this) { // from class: a.tp00
            public final /* synthetic */ bq00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value3;
                cp00 cp00Var3;
                byte b4 = b;
                bq00 bq00Var = this.b;
                switch (b4) {
                    case 0:
                        rlt rltVar3 = (rlt) obj;
                        Boolean bool3 = (Boolean) obj2;
                        boolean zBooleanValue2 = bool3.booleanValue();
                        rltVar3.getClass();
                        weo weoVar = new weo(rltVar3, zBooleanValue2);
                        vzg0 vzg0Var3 = bq00Var.o;
                        vzg0Var3.e(weo.class.getName(), Boolean.TRUE);
                        vzg0Var3.e("ShowGeoBlockGeoState", rltVar3);
                        vzg0Var3.e("ShowGeoBlockNeedGeo", bool3);
                        p7m0 p7m0Var3 = bq00Var.i.f25029a;
                        do {
                            value3 = p7m0Var3.getValue();
                            value3.getClass();
                            cp00Var3 = (cp00) value3;
                            bq00Var.f.getClass();
                        } while (!p7m0Var3.m(value3, cp00.a(cp00Var3, null, null, null, null, null, eui0.h(cp00Var3.j, weoVar), false, false, 130559)));
                        break;
                    case 1:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        String str = (String) obj2;
                        str.getClass();
                        bq00Var.G(new uo00(str, zBooleanValue3));
                        break;
                    default:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                        p7m0 p7m0Var4 = bq00Var.j0;
                        qf50 qf50Var = new qf50(zBooleanValue4, zBooleanValue5);
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, qf50Var);
                        break;
                }
                return Unit.f46060a;
            }
        };
        M(this.G);
        M(this.I);
        M(this.J);
        M(this.K);
        M(this.L);
        xqt0 xqt0Var2 = this.M;
        M(xqt0Var2);
        xqt0Var2.s = new up00(this, (byte) 6);
        final byte b4 = 2;
        xqt0Var2.t = new Function2(this) { // from class: a.tp00
            public final /* synthetic */ bq00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value3;
                cp00 cp00Var3;
                byte b5 = b4;
                bq00 bq00Var = this.b;
                switch (b5) {
                    case 0:
                        rlt rltVar3 = (rlt) obj;
                        Boolean bool3 = (Boolean) obj2;
                        boolean zBooleanValue2 = bool3.booleanValue();
                        rltVar3.getClass();
                        weo weoVar = new weo(rltVar3, zBooleanValue2);
                        vzg0 vzg0Var3 = bq00Var.o;
                        vzg0Var3.e(weo.class.getName(), Boolean.TRUE);
                        vzg0Var3.e("ShowGeoBlockGeoState", rltVar3);
                        vzg0Var3.e("ShowGeoBlockNeedGeo", bool3);
                        p7m0 p7m0Var3 = bq00Var.i.f25029a;
                        do {
                            value3 = p7m0Var3.getValue();
                            value3.getClass();
                            cp00Var3 = (cp00) value3;
                            bq00Var.f.getClass();
                        } while (!p7m0Var3.m(value3, cp00.a(cp00Var3, null, null, null, null, null, eui0.h(cp00Var3.j, weoVar), false, false, 130559)));
                        break;
                    case 1:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        String str = (String) obj2;
                        str.getClass();
                        bq00Var.G(new uo00(str, zBooleanValue3));
                        break;
                    default:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                        p7m0 p7m0Var4 = bq00Var.j0;
                        qf50 qf50Var = new qf50(zBooleanValue4, zBooleanValue5);
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, qf50Var);
                        break;
                }
                return Unit.f46060a;
            }
        };
        M(this.N);
        M(this.O);
        M(this.P);
        M(this.Q);
        M(this.S);
        M(this.T);
        M(this.U);
        M(this.R);
        M(this.V);
        yje yjeVar = null;
        i3t0.K(this, null, null, new vp00(this, yjeVar, (byte) 1), 3);
        this.X.t();
        this.e0.a();
        i3t0.L(this, new fnq(this.j0, new kaw(this, yjeVar, (byte) 24), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(new i89(((crq) ((ocl) this.Y.b).f25032a).f4857a, (byte) 22), new atj(this, null, (byte) 29), (byte) 4), null, null, 3);
    }

    public final void M(vw5 vw5Var) {
        i3t0.L(this, new fnq(vw5Var.c(), new khx((Object) this, (Object) vw5Var, (yje) null, (byte) 5), (byte) 4), null, null, 3);
    }

    public final void N() {
        if (((cp00) D()).l) {
            return;
        }
        xeo xeoVar = (xeo) CollectionsKt.V(((cp00) D()).j);
        byte b = 0;
        gr00 gr00Var = this.p;
        if (xeoVar != null) {
            yje yjeVar = null;
            if (xeoVar instanceof weo) {
                weo weoVar = (weo) xeoVar;
                rlt rltVar = weoVar.f39027a;
                boolean z = weoVar.b;
                i1w0 i1w0Var = (i1w0) gr00Var.f11760a;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen geoBlockScreenProviderImpl$screen$1 = new GeoBlockScreenProviderImpl$screen$1(rltVar, z);
                if (geoBlockScreenProviderImpl$screen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) geoBlockScreenProviderImpl$screen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(geoBlockScreenProviderImpl$screen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        break;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
                P(veo.f37295a);
            } else {
                if (!(xeoVar instanceof veo)) {
                    t9f.b();
                    return;
                }
                i3t0.K(this, null, null, new vp00(this, yjeVar, b), 3);
            }
            P(xeoVar);
            Object obj = ((cp00) D()).j.isEmpty() ? nf50.f23419a : of50.f25149a;
            p7m0 p7m0Var = this.j0;
            p7m0Var.getClass();
            p7m0Var.o(null, obj);
            return;
        }
        e6m0 e6m0VarB = this.h0.b();
        if (e6m0VarB instanceof c6m0) {
            long j = ((c6m0) e6m0VarB).f3824a;
            String strG = this.c0.g();
            h97.x("loadTimeMs", Long.valueOf(j), this.Z.f809a, "start_screen_load_time");
            this.b0.f40143a.a(tx3.l0(new k1p[]{new i1p((int) j, (byte) 2), new j1p(strG, (byte) 2)}), 10561L);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("loadingTimeValue", ncy.b(Long.valueOf(j)));
            ((rny) this.f0).a("loadingTime", new tny("checkLoading", xp20.n(linkedHashMap)));
        } else if (!e6m0VarB.equals(d6m0.f5556a)) {
            t9f.b();
            return;
        }
        i1w0 i1w0Var2 = (i1w0) gr00Var.f11760a;
        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new y0w0(new MainScreenProviderImpl$screen$1())), i1w0Var2, copyOnWriteArrayListQ2, 0);
        while (true) {
            paw pawVar2 = (paw) listIteratorP;
            if (!pawVar2.hasNext()) {
                return;
            } else {
                i1w0Var2.a((oe50) pawVar2.next());
            }
        }
    }

    public final void O(g8d g8dVar, Function0 function0) {
        this.l0.add(i3t0.L(this, new fnq(g8dVar.c, new ah0(g8dVar, this, function0, null, (byte) 10), (byte) 4), null, null, 3));
    }

    public final void P(xeo xeoVar) {
        H(new g2z((Object) xeoVar, (byte) 17));
        boolean zEquals = xeoVar.equals(veo.f37295a);
        vzg0 vzg0Var = this.o;
        if (zEquals) {
        } else {
            if (!(xeoVar instanceof weo)) {
                t9f.b();
                return;
            }
            vzg0Var.d(weo.class.getName());
            vzg0Var.d("ShowGeoBlockGeoState");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(zje zjeVar) {
        zp00 zp00Var;
        if (zjeVar instanceof zp00) {
            zp00Var = (zp00) zjeVar;
            int i = zp00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zp00Var.k = i - Integer.MIN_VALUE;
            } else {
                zp00Var = new zp00(this, zjeVar);
            }
        } else {
            zp00Var = new zp00(this, zjeVar);
        }
        Object objO = zp00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zp00Var.k;
        if (i2 == 0) {
            z1x.P(objO);
            ed5 ed5Var = ed5.f7601a;
            iy3 iy3Var = ((cp00) D()).b;
            zp00Var.k = 1;
            objO = this.s.o(ed5Var, iy3Var, zp00Var);
            if (objO == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objO);
        }
        Iterator it = ((List) objO).iterator();
        while (it.hasNext()) {
            this.w.p(org.xplatform.background_video.api.presentation.m.a((be5) it.next()));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(zje zjeVar) {
        aq00 aq00Var;
        if (zjeVar instanceof aq00) {
            aq00Var = (aq00) zjeVar;
            int i = aq00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                aq00Var.k = i - Integer.MIN_VALUE;
            } else {
                aq00Var = new aq00(this, zjeVar);
            }
        } else {
            aq00Var = new aq00(this, zjeVar);
        }
        Object objO = aq00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = aq00Var.k;
        if (i2 == 0) {
            z1x.P(objO);
            ed5 ed5Var = ed5.b;
            iy3 iy3Var = ((cp00) D()).b;
            aq00Var.k = 1;
            objO = this.s.o(ed5Var, iy3Var, aq00Var);
            if (objO == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objO);
        }
        Iterator it = ((List) objO).iterator();
        while (it.hasNext()) {
            this.w.p(org.xplatform.background_video.api.presentation.n.a((be5) it.next()));
        }
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        wk00 wk00Var = (wk00) obj;
        wk00Var.getClass();
        boolean z = wk00Var instanceof sk00;
        rf50 rf50Var = rf50.f30370a;
        p7m0 p7m0Var = this.j0;
        yje yjeVar = null;
        if (!z) {
            if (!(wk00Var instanceof vk00)) {
                t9f.b();
                return;
            }
            vk00 vk00Var = (vk00) wk00Var;
            if (vk00Var instanceof tk00) {
                throw null;
            }
            if (!vk00Var.equals(uk00.f35804a)) {
                t9f.b();
                return;
            } else {
                p7m0Var.getClass();
                p7m0Var.o(null, rf50Var);
                return;
            }
        }
        sk00 sk00Var = (sk00) wk00Var;
        if (sk00Var.equals(jk00.f16642a)) {
            c4m0 c4m0Var = this.k0;
            if (c4m0Var != null) {
                v3c.N(c4m0Var);
            }
            ArrayList arrayList = this.l0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v3c.N((bby) it.next());
            }
            arrayList.clear();
            return;
        }
        boolean zEquals = sk00Var.equals(kk00.f18413a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, cp00.a((cp00) value2, null, null, null, null, null, null, false, false, 130047)));
            f6m0 f6m0Var = ((g6m0) this.i0.f20148a).f10774a;
            f6m0Var.f9020a.set(-1L);
            f6m0Var.b.set(false);
            return;
        }
        if (sk00Var.equals(lk00.f20176a)) {
            E();
            return;
        }
        if (sk00Var.equals(mk00.f21920a)) {
            this.Z.f809a.c("app_loading");
            this.b0.f40143a.a(cui0.b(new j1p(this.c0.g(), (byte) 2)), 11318L);
            return;
        }
        if (sk00Var.equals(nk00.f23659a)) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, cp00.a((cp00) value, null, null, null, null, null, null, true, false, 130047)));
            return;
        }
        if (sk00Var.equals(ok00.f25383a)) {
            f6m0 f6m0Var2 = ((g6m0) this.g0.f24619a).f10774a;
            f6m0Var2.f9020a.compareAndSet(-1L, SystemClock.elapsedRealtime());
            return;
        }
        if (!sk00Var.equals(pk00.f27113a)) {
            if (sk00Var.equals(qk00.f28864a)) {
                c4m0 c4m0Var2 = this.k0;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    this.k0 = i3t0.L(this, new fnq(this.a0.a(), new slx(this, yjeVar, (byte) 18), (byte) 4), null, null, 3);
                    return;
                }
                return;
            }
            if (!(sk00Var instanceof rk00)) {
                t9f.b();
                return;
            }
            String str = ((rk00) sk00Var).f30623a;
            v6j0 v6j0Var = this.d0.f23840a;
            v6j0Var.getClass();
            v6j0Var.f36880a.g("WEB_VIEW_USER_AGENT", str);
            return;
        }
        sf50 sf50Var = (sf50) p7m0Var.getValue();
        nf50 nf50Var = nf50.f23419a;
        if (Intrinsics.d(sf50Var, nf50Var)) {
            return;
        }
        if (Intrinsics.d(sf50Var, rf50Var)) {
            g8d g8dVar = (g8d) this.m0.get(kh3.RESOLVE);
            if (g8dVar == null) {
                itt0.a();
                return;
            } else {
                g8dVar.a(this.r);
                p7m0Var.o(null, nf50Var);
                return;
            }
        }
        if (sf50Var instanceof pf50) {
            this.B.g();
            p7m0Var.o(null, nf50Var);
            return;
        }
        if (!(sf50Var instanceof qf50)) {
            if (!(sf50Var instanceof of50)) {
                t9f.b();
                return;
            } else {
                N();
                p7m0Var.o(null, nf50Var);
                return;
            }
        }
        qf50 qf50Var = (qf50) sf50Var;
        if (qf50Var.f28614a) {
            p7m0Var.o(null, qf50.a(qf50Var, 2));
        } else if (qf50Var.b) {
            p7m0Var.o(null, qf50.a(qf50Var, 1));
        }
    }
}
