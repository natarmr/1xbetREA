package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
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
public final class ij3 extends w46 {
    public final ouf A;
    public final xqt0 B;
    public final cg5 C;
    public final ltm0 D;
    public final k1f0 E;
    public final g5t F;
    public final jat G;
    public final sgb0 H;
    public final ugq0 I;
    public final czq0 J;
    public final trc K;
    public final bb6 L;
    public final rkt0 M;
    public final j1q0 N;
    public final j910 O;
    public final n4u P;
    public final ag3 Q;
    public final m1e R;
    public final x20 S;
    public final cmt T;
    public final nnt0 U;
    public final jbx V;
    public final n4u W;
    public final uxs0 X;
    public final kys0 Y;
    public final ony Z;
    public final o470 a0;
    public final vzg0 b;
    public final cad b0;
    public final gr00 c;
    public final ljf0 c0;
    public final pru d;
    public final n0o0 d0;
    public final mne e;
    public final iy3 e0;
    public final ctf0 f;
    public final p7m0 f0;
    public final jfu g;
    public final boolean g0;
    public final wti h;
    public c4m0 h0;
    public final nmo i;
    public final ArrayList i0;
    public final evt j;
    public final p7m0 j0;
    public final evt k;
    public final p7m0 k0;
    public final do20 l;
    public final p7m0 l0;
    public final pyu m;
    public final jo20 m0;
    public final psf0 n;
    public final ql40 o;
    public final tti0 p;
    public final i9c q;
    public final nff0 r;
    public final kyb s;
    public final nkt t;
    public final azb u;
    public final zql0 v;
    public final rnf0 w;
    public final who x;
    public final udo y;
    public final vpe z;

    public ij3(vzg0 vzg0Var, gr00 gr00Var, pru pruVar, mne mneVar, uyn uynVar, ctf0 ctf0Var, jfu jfuVar, wti wtiVar, nmo nmoVar, evt evtVar, evt evtVar2, do20 do20Var, pyu pyuVar, psf0 psf0Var, ql40 ql40Var, tti0 tti0Var, i9c i9cVar, nff0 nff0Var, kyb kybVar, nkt nktVar, azb azbVar, zql0 zql0Var, rnf0 rnf0Var, who whoVar, udo udoVar, vpe vpeVar, ouf oufVar, xqt0 xqt0Var, cg5 cg5Var, ltm0 ltm0Var, k1f0 k1f0Var, g5t g5tVar, jat jatVar, sgb0 sgb0Var, ugq0 ugq0Var, czq0 czq0Var, trc trcVar, bb6 bb6Var, rkt0 rkt0Var, j1q0 j1q0Var, j910 j910Var, n4u n4uVar, ag3 ag3Var, m1e m1eVar, x20 x20Var, cmt cmtVar, nnt0 nnt0Var, jbx jbxVar, n4u n4uVar2, uxs0 uxs0Var, kys0 kys0Var, gst gstVar, bzt bztVar, ony onyVar, o470 o470Var, cad cadVar, ljf0 ljf0Var) {
        final byte b;
        Object value;
        Object value2;
        Object value3;
        jh3 jh3Var;
        Set set;
        rlt rltVar;
        Boolean bool;
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
        this.b = vzg0Var;
        this.c = gr00Var;
        this.d = pruVar;
        this.e = mneVar;
        this.f = ctf0Var;
        this.g = jfuVar;
        this.h = wtiVar;
        this.i = nmoVar;
        this.j = evtVar;
        this.k = evtVar2;
        this.l = do20Var;
        this.m = pyuVar;
        this.n = psf0Var;
        this.o = ql40Var;
        this.p = tti0Var;
        this.q = i9cVar;
        this.r = nff0Var;
        this.s = kybVar;
        this.t = nktVar;
        this.u = azbVar;
        this.v = zql0Var;
        this.w = rnf0Var;
        this.x = whoVar;
        this.y = udoVar;
        this.z = vpeVar;
        this.A = oufVar;
        this.B = xqt0Var;
        this.C = cg5Var;
        this.D = ltm0Var;
        this.E = k1f0Var;
        this.F = g5tVar;
        this.G = jatVar;
        this.H = sgb0Var;
        this.I = ugq0Var;
        this.J = czq0Var;
        this.K = trcVar;
        this.L = bb6Var;
        this.M = rkt0Var;
        this.N = j1q0Var;
        this.O = j910Var;
        this.P = n4uVar;
        this.Q = ag3Var;
        this.R = m1eVar;
        this.S = x20Var;
        this.T = cmtVar;
        this.U = nnt0Var;
        this.V = jbxVar;
        this.W = n4uVar2;
        this.X = uxs0Var;
        this.Y = kys0Var;
        this.Z = onyVar;
        this.a0 = o470Var;
        this.b0 = cadVar;
        this.c0 = ljf0Var;
        this.d0 = maz.b(new rh3(this, (byte) 5));
        iy3 iy3VarK0 = jd8.k0(i120.a0(ctf0Var.e.f14784a));
        this.e0 = iy3VarK0;
        this.f0 = q7m0.a(kg3.f18222a);
        this.g0 = bztVar.f3488a.a().N;
        this.i0 = new ArrayList();
        String strB = ((us3) ((peg0) uynVar.f36498a).b).b();
        hh3 hh3Var = y().Q0;
        c0o c0oVar = kh3.m;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        Iterator it = c0oVar.iterator();
        while (true) {
            b = 0;
            if (!it.hasNext()) {
                break;
            }
            kh3 kh3Var = (kh3) it.next();
            List list = kh3Var.f18270a;
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new mpm0((fnf0) it2.next(), false));
            }
            arrayList.add(new npm0(kh3Var, arrayList2));
        }
        p7m0 p7m0VarA = q7m0.a(new jh3(strB, iy3VarK0, hh3Var, arrayList, null, null, null, null, yfw.DEFAULT, xun.f41520a, false, y().G1));
        this.j0 = p7m0VarA;
        this.k0 = q7m0.a(nf50.f23419a);
        this.l0 = q7m0.a(hbv.f12790a);
        jo20 jo20Var = new jo20();
        final byte b2 = 2;
        final byte b3 = 1;
        jo20Var.put(kh3.RESOLVE, new g8d(q3d.j(this.p, this.n)));
        byte b4 = 4;
        jo20Var.put(kh3.CONFIG, new g8d(q3d.j(this.t, this.q, this.r, this.o, this.s)));
        jo20Var.put(kh3.CHECK_GEO, new g8d(kotlin.collections.a.c(this.u)));
        jo20Var.put(kh3.SPORT_DICTIONARY, new g8d(q3d.j(this.v, this.x, this.y)));
        jo20Var.put(kh3.COUNTRIES_DICTIONARY, new g8d(q3d.j(this.z, this.A)));
        jo20Var.put(kh3.USER, new g8d(q3d.j(this.B, this.C)));
        jo20Var.put(kh3.STRINGS, new g8d(kotlin.collections.a.c(this.D)));
        kh3 kh3Var2 = kh3.OTHER;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(this.E);
        lc00VarB.add(this.F);
        lc00VarB.add(this.G);
        lc00VarB.add(this.I);
        lc00VarB.add(this.J);
        lc00VarB.add(this.H);
        lc00VarB.add(this.K);
        jo20Var.put(kh3Var2, new g8d(kotlin.collections.a.a(lc00VarB)));
        this.m0 = jo20Var.b();
        zfw zfwVar = this.g.f16447a.a().t1;
        do {
            value = p7m0VarA.getValue();
        } while (!p7m0VarA.m(value, jh3.a((jh3) value, null, null, null, null, null, null, zfwVar.f44319a, null, false, false, 3839)));
        yje yjeVar = null;
        sac.V(jiu0.a(this), bj3.f2685a, null, null, new wn2(this, yjeVar, b2), 14);
        if (y().Q0.b == eh3.REMOTE_IMAGE) {
            sac.V(jiu0.a(this), aj3.f954a, null, null, new wa(this, yjeVar, (byte) 8), 14);
        }
        Iterator it3 = this.m0.values().iterator();
        while (it3.hasNext()) {
            for (vw5 vw5Var : ((g8d) it3.next()).f10858a) {
                if (Intrinsics.d(this.b.a(vw5Var.e().a()), Boolean.TRUE)) {
                    vw5Var.g();
                }
            }
        }
        vzg0 vzg0Var2 = this.b;
        p7m0 p7m0Var = this.j0;
        weo weoVar = new weo(rlt.c, false);
        veo veoVar = veo.f37295a;
        for (xeo xeoVar : q3d.j(veoVar, weoVar)) {
            if (!Intrinsics.d(xeoVar, veoVar)) {
                if (!(xeoVar instanceof weo)) {
                    t9f.b();
                    throw null;
                }
                if (Intrinsics.d(vzg0Var2.a(weo.class.getName()), Boolean.TRUE)) {
                    do {
                        value3 = p7m0Var.getValue();
                        jh3Var = (jh3) p7m0Var.getValue();
                        set = ((jh3) p7m0Var.getValue()).j;
                        rltVar = (rlt) vzg0Var2.a("ShowGeoBlockGeoState");
                        rltVar = rltVar == null ? rlt.c : rltVar;
                        bool = (Boolean) vzg0Var2.a("ShowGeoBlockNeedGeo");
                    } while (!p7m0Var.m(value3, jh3.a(jh3Var, null, null, null, null, null, null, null, eui0.g(set, cui0.b(new weo(rltVar, bool != null ? bool.booleanValue() : false))), false, false, 3583)));
                }
            } else if (Intrinsics.d(vzg0Var2.a(veo.class.getName()), Boolean.TRUE)) {
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, jh3.a((jh3) p7m0Var.getValue(), null, null, null, null, null, null, null, eui0.g(((jh3) p7m0Var.getValue()).j, cui0.b(veoVar)), false, false, 3583)));
            }
        }
        rnf0 rnf0Var2 = this.w;
        w(rnf0Var2);
        rnf0Var2.h = new rh3(this, b2);
        w(this.p);
        psf0 psf0Var2 = this.n;
        w(psf0Var2);
        psf0Var2.s = new Function2(this) { // from class: a.qh3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value4;
                byte b5 = b2;
                ij3 ij3Var = this.b;
                switch (b5) {
                    case 0:
                        rlt rltVar2 = (rlt) obj;
                        Boolean bool2 = (Boolean) obj2;
                        boolean zBooleanValue = bool2.booleanValue();
                        rltVar2.getClass();
                        weo weoVar2 = new weo(rltVar2, zBooleanValue);
                        vzg0 vzg0Var3 = ij3Var.b;
                        vzg0Var3.e(weo.class.getName(), Boolean.TRUE);
                        vzg0Var3.e("ShowGeoBlockGeoState", rltVar2);
                        vzg0Var3.e("ShowGeoBlockNeedGeo", bool2);
                        p7m0 p7m0Var2 = ij3Var.j0;
                        do {
                            value4 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value4, jh3.a((jh3) p7m0Var2.getValue(), null, null, null, null, null, null, null, eui0.g(((jh3) p7m0Var2.getValue()).j, cui0.b(weoVar2)), false, false, 3583)));
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        p7m0 p7m0Var3 = ij3Var.k0;
                        qf50 qf50Var = new qf50(zBooleanValue2, zBooleanValue3);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, qf50Var);
                        break;
                    default:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        String str = (String) obj2;
                        str.getClass();
                        p7m0 p7m0Var4 = ij3Var.f0;
                        mg3 mg3Var = new mg3(str, zBooleanValue4);
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, mg3Var);
                        break;
                }
                return Unit.f46060a;
            }
        };
        psf0Var2.t = new rh3(this, (byte) 6);
        i9c i9cVar2 = this.q;
        w(i9cVar2);
        i9cVar2.k = new Function1(this) { // from class: a.sh3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value4;
                byte b5 = b;
                yje yjeVar2 = null;
                ij3 ij3Var = this.b;
                switch (b5) {
                    case 0:
                        im3 im3Var = (im3) obj;
                        im3Var.getClass();
                        p7m0 p7m0Var2 = ij3Var.k0;
                        pf50 pf50Var = new pf50(im3Var);
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, pf50Var);
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        p7m0 p7m0Var3 = ij3Var.j0;
                        do {
                            value4 = p7m0Var3.getValue();
                        } while (!p7m0Var3.m(value4, jh3.a((jh3) value4, null, null, null, null, null, null, null, null, false, zBooleanValue, 2047)));
                        if (zBooleanValue) {
                            ArrayList arrayList3 = ij3Var.i0;
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                v3c.N((bby) it4.next());
                            }
                            arrayList3.clear();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        str.getClass();
                        bvc bvcVarA = jiu0.a(ij3Var);
                        mne mneVar2 = ij3Var.e;
                        sac.V(bvcVarA, oi3.f25292a, null, mneVar2.c, new pi3(ij3Var, str, yjeVar2, (byte) 0), 10);
                        sac.V(jiu0.a(ij3Var), qi3.f28770a, null, mneVar2.c, new pi3(ij3Var, str, yjeVar2, (byte) 1), 10);
                        break;
                }
                return Unit.f46060a;
            }
        };
        nff0 nff0Var2 = this.r;
        w(nff0Var2);
        nff0Var2.p = new rh3(this, b3);
        kyb kybVar2 = this.s;
        w(kybVar2);
        kybVar2.i = new Function1(this) { // from class: a.sh3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value4;
                byte b5 = b3;
                yje yjeVar2 = null;
                ij3 ij3Var = this.b;
                switch (b5) {
                    case 0:
                        im3 im3Var = (im3) obj;
                        im3Var.getClass();
                        p7m0 p7m0Var2 = ij3Var.k0;
                        pf50 pf50Var = new pf50(im3Var);
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, pf50Var);
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        p7m0 p7m0Var3 = ij3Var.j0;
                        do {
                            value4 = p7m0Var3.getValue();
                        } while (!p7m0Var3.m(value4, jh3.a((jh3) value4, null, null, null, null, null, null, null, null, false, zBooleanValue, 2047)));
                        if (zBooleanValue) {
                            ArrayList arrayList3 = ij3Var.i0;
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                v3c.N((bby) it4.next());
                            }
                            arrayList3.clear();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        str.getClass();
                        bvc bvcVarA = jiu0.a(ij3Var);
                        mne mneVar2 = ij3Var.e;
                        sac.V(bvcVarA, oi3.f25292a, null, mneVar2.c, new pi3(ij3Var, str, yjeVar2, (byte) 0), 10);
                        sac.V(jiu0.a(ij3Var), qi3.f28770a, null, mneVar2.c, new pi3(ij3Var, str, yjeVar2, (byte) 1), 10);
                        break;
                }
                return Unit.f46060a;
            }
        };
        w(this.o);
        nkt nktVar2 = this.t;
        w(nktVar2);
        nktVar2.j = new Function1(this) { // from class: a.sh3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value4;
                byte b5 = b2;
                yje yjeVar2 = null;
                ij3 ij3Var = this.b;
                switch (b5) {
                    case 0:
                        im3 im3Var = (im3) obj;
                        im3Var.getClass();
                        p7m0 p7m0Var2 = ij3Var.k0;
                        pf50 pf50Var = new pf50(im3Var);
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, pf50Var);
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        p7m0 p7m0Var3 = ij3Var.j0;
                        do {
                            value4 = p7m0Var3.getValue();
                        } while (!p7m0Var3.m(value4, jh3.a((jh3) value4, null, null, null, null, null, null, null, null, false, zBooleanValue, 2047)));
                        if (zBooleanValue) {
                            ArrayList arrayList3 = ij3Var.i0;
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                v3c.N((bby) it4.next());
                            }
                            arrayList3.clear();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        str.getClass();
                        bvc bvcVarA = jiu0.a(ij3Var);
                        mne mneVar2 = ij3Var.e;
                        sac.V(bvcVarA, oi3.f25292a, null, mneVar2.c, new pi3(ij3Var, str, yjeVar2, (byte) 0), 10);
                        sac.V(jiu0.a(ij3Var), qi3.f28770a, null, mneVar2.c, new pi3(ij3Var, str, yjeVar2, (byte) 1), 10);
                        break;
                }
                return Unit.f46060a;
            }
        };
        azb azbVar2 = this.u;
        w(azbVar2);
        azbVar2.r = new Function2(this) { // from class: a.qh3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value4;
                byte b5 = b;
                ij3 ij3Var = this.b;
                switch (b5) {
                    case 0:
                        rlt rltVar2 = (rlt) obj;
                        Boolean bool2 = (Boolean) obj2;
                        boolean zBooleanValue = bool2.booleanValue();
                        rltVar2.getClass();
                        weo weoVar2 = new weo(rltVar2, zBooleanValue);
                        vzg0 vzg0Var3 = ij3Var.b;
                        vzg0Var3.e(weo.class.getName(), Boolean.TRUE);
                        vzg0Var3.e("ShowGeoBlockGeoState", rltVar2);
                        vzg0Var3.e("ShowGeoBlockNeedGeo", bool2);
                        p7m0 p7m0Var2 = ij3Var.j0;
                        do {
                            value4 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value4, jh3.a((jh3) p7m0Var2.getValue(), null, null, null, null, null, null, null, eui0.g(((jh3) p7m0Var2.getValue()).j, cui0.b(weoVar2)), false, false, 3583)));
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        p7m0 p7m0Var3 = ij3Var.k0;
                        qf50 qf50Var = new qf50(zBooleanValue2, zBooleanValue3);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, qf50Var);
                        break;
                    default:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        String str = (String) obj2;
                        str.getClass();
                        p7m0 p7m0Var4 = ij3Var.f0;
                        mg3 mg3Var = new mg3(str, zBooleanValue4);
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, mg3Var);
                        break;
                }
                return Unit.f46060a;
            }
        };
        w(this.v);
        w(this.x);
        w(this.y);
        w(this.z);
        w(this.A);
        xqt0 xqt0Var2 = this.B;
        w(xqt0Var2);
        xqt0Var2.s = new rh3(this, b);
        xqt0Var2.t = new Function2(this) { // from class: a.qh3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object value4;
                byte b5 = b3;
                ij3 ij3Var = this.b;
                switch (b5) {
                    case 0:
                        rlt rltVar2 = (rlt) obj;
                        Boolean bool2 = (Boolean) obj2;
                        boolean zBooleanValue = bool2.booleanValue();
                        rltVar2.getClass();
                        weo weoVar2 = new weo(rltVar2, zBooleanValue);
                        vzg0 vzg0Var3 = ij3Var.b;
                        vzg0Var3.e(weo.class.getName(), Boolean.TRUE);
                        vzg0Var3.e("ShowGeoBlockGeoState", rltVar2);
                        vzg0Var3.e("ShowGeoBlockNeedGeo", bool2);
                        p7m0 p7m0Var2 = ij3Var.j0;
                        do {
                            value4 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value4, jh3.a((jh3) p7m0Var2.getValue(), null, null, null, null, null, null, null, eui0.g(((jh3) p7m0Var2.getValue()).j, cui0.b(weoVar2)), false, false, 3583)));
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                        p7m0 p7m0Var3 = ij3Var.k0;
                        qf50 qf50Var = new qf50(zBooleanValue2, zBooleanValue3);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, qf50Var);
                        break;
                    default:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        String str = (String) obj2;
                        str.getClass();
                        p7m0 p7m0Var4 = ij3Var.f0;
                        mg3 mg3Var = new mg3(str, zBooleanValue4);
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, mg3Var);
                        break;
                }
                return Unit.f46060a;
            }
        };
        w(this.C);
        w(this.D);
        w(this.E);
        w(this.F);
        w(this.H);
        w(this.I);
        w(this.J);
        w(this.G);
        w(this.K);
        sac.V(jiu0.a(this), ri3.f30519a, null, this.e.c, new vh3(this, yjeVar, b3), 10);
        this.O.t();
        this.V.a();
        sac.T(new fnq(this.k0, new qa(this, yjeVar, (byte) 29), b4), d5c.S(jiu0.a(this), this.e.c), vi3.h);
        slb.U(new fnq(new i89(((crq) ((ocl) this.P.b).f25032a).f4857a, (byte) 22), new dj3(this, null), b4), jiu0.a(this));
    }

    public final void A(xeo xeoVar) {
        p7m0 p7m0Var;
        Object value;
        jh3 jh3Var;
        ArrayList arrayList;
        do {
            p7m0Var = this.j0;
            value = p7m0Var.getValue();
            jh3Var = (jh3) p7m0Var.getValue();
            Set set = ((jh3) p7m0Var.getValue()).j;
            arrayList = new ArrayList();
            for (Object obj : set) {
                if (!Intrinsics.d((xeo) obj, xeoVar)) {
                    arrayList.add(obj);
                }
            }
        } while (!p7m0Var.m(value, jh3.a(jh3Var, null, null, null, null, null, null, null, CollectionsKt.P0(arrayList), false, false, 3583)));
        boolean zEquals = xeoVar.equals(veo.f37295a);
        vzg0 vzg0Var = this.b;
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
    public final Object B(zje zjeVar) {
        gj3 gj3Var;
        if (zjeVar instanceof gj3) {
            gj3Var = (gj3) zjeVar;
            int i = gj3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gj3Var.k = i - Integer.MIN_VALUE;
            } else {
                gj3Var = new gj3(this, zjeVar);
            }
        } else {
            gj3Var = new gj3(this, zjeVar);
        }
        Object objO = gj3Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gj3Var.k;
        if (i2 == 0) {
            z1x.P(objO);
            ed5 ed5Var = ed5.f7601a;
            iy3 iy3Var = ((jh3) this.j0.getValue()).b;
            gj3Var.k = 1;
            objO = this.h.o(ed5Var, iy3Var, gj3Var);
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
            this.l.p(org.xplatform.background_video.api.presentation.m.a((be5) it.next()));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(zje zjeVar) {
        hj3 hj3Var;
        if (zjeVar instanceof hj3) {
            hj3Var = (hj3) zjeVar;
            int i = hj3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hj3Var.k = i - Integer.MIN_VALUE;
            } else {
                hj3Var = new hj3(this, zjeVar);
            }
        } else {
            hj3Var = new hj3(this, zjeVar);
        }
        Object objO = hj3Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hj3Var.k;
        if (i2 == 0) {
            z1x.P(objO);
            ed5 ed5Var = ed5.b;
            iy3 iy3Var = ((jh3) this.j0.getValue()).b;
            hj3Var.k = 1;
            objO = this.h.o(ed5Var, iy3Var, hj3Var);
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
            this.l.p(org.xplatform.background_video.api.presentation.n.a((be5) it.next()));
        }
        return Unit.f46060a;
    }

    public final void w(vw5 vw5Var) {
        sac.T(new fnq(vw5Var.c(), new ee0((Object) this, (Object) vw5Var, (yje) null, (byte) 8), (byte) 4), d5c.S(jiu0.a(this), this.e.c), th3.h);
    }

    public final void x() {
        p7m0 p7m0Var = this.j0;
        if (((jh3) p7m0Var.getValue()).l) {
            return;
        }
        xeo xeoVar = (xeo) CollectionsKt.V(((jh3) p7m0Var.getValue()).j);
        byte b = 0;
        gr00 gr00Var = this.c;
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
                A(veo.f37295a);
            } else {
                if (!(xeoVar instanceof veo)) {
                    t9f.b();
                    return;
                }
                sac.V(jiu0.a(this), uh3.f35656a, null, this.e.c, new vh3(this, yjeVar, b), 10);
            }
            A(xeoVar);
            Object obj = ((jh3) p7m0Var.getValue()).j.isEmpty() ? nf50.f23419a : of50.f25149a;
            p7m0 p7m0Var2 = this.k0;
            p7m0Var2.getClass();
            p7m0Var2.o(null, obj);
            return;
        }
        e6m0 e6m0VarB = this.b0.b();
        if (e6m0VarB instanceof c6m0) {
            long j = ((c6m0) e6m0VarB).f3824a;
            String strG = this.T.g();
            h97.x("loadTimeMs", Long.valueOf(j), this.Q.f809a, "start_screen_load_time");
            this.S.f40143a.a(tx3.l0(new k1p[]{new i1p((int) j, (byte) 2), new j1p(strG, (byte) 2)}), 10561L);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("loadingTimeValue", ncy.b(Long.valueOf(j)));
            ((rny) this.Z).a("loadingTime", new tny("checkLoading", xp20.n(linkedHashMap)));
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

    public final sff0 y() {
        return (sff0) this.d0.getValue();
    }

    public final void z(g8d g8dVar, Function0 function0) {
        this.i0.add(sac.T(new fnq(g8dVar.c, new ah0(g8dVar, this, function0, null, (byte) 4), (byte) 4), d5c.S(jiu0.a(this), this.e.c), wi3.h));
    }
}
