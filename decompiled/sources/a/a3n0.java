package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feature.office.test_section.impl.navigation.TestSectionScreen$PaletteScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class a3n0 extends i3t0 {
    public final ntu A;
    public final bot B;
    public final rjo C;
    public final bbw0 D;
    public final ou9 E;
    public final gqc F;
    public final ou9 G;
    public final zri H;
    public final pmi0 I;
    public final rpt J;
    public c4m0 K;
    public cre L;
    public final o2n0 o;
    public final ctf0 p;
    public final i1w0 q;
    public final n660 r;
    public final bzt s;
    public final gqc t;
    public final ljt0 u;
    public final hcp0 v;
    public final dot w;
    public final ljt0 x;
    public final yiu y;
    public final fnu z;

    public a3n0(vzg0 vzg0Var, o2n0 o2n0Var, ctf0 ctf0Var, i1w0 i1w0Var, n660 n660Var, bzt bztVar, gqc gqcVar, ljt0 ljt0Var, hcp0 hcp0Var, dot dotVar, ljt0 ljt0Var2, yiu yiuVar, fnu fnuVar, ntu ntuVar, bot botVar, rjo rjoVar, bbw0 bbw0Var, ou9 ou9Var, gqc gqcVar2, ou9 ou9Var2, zri zriVar, pmi0 pmi0Var, rpt rptVar, mne mneVar) {
        ctf0Var.getClass();
        jfm0 jfm0Var = new jfm0(o2n0Var, (byte) 6);
        h0j0 h0j0Var = new h0j0(ctf0Var, (byte) 7);
        rwj rwjVar = mneVar.f22085a;
        super(null, jfm0Var, h0j0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = o2n0Var;
        this.p = ctf0Var;
        this.q = i1w0Var;
        this.r = n660Var;
        this.s = bztVar;
        this.t = gqcVar;
        this.u = ljt0Var;
        this.v = hcp0Var;
        this.w = dotVar;
        this.x = ljt0Var2;
        this.y = yiuVar;
        this.z = fnuVar;
        this.A = ntuVar;
        this.B = botVar;
        this.C = rjoVar;
        this.D = bbw0Var;
        this.E = ou9Var;
        this.F = gqcVar2;
        this.G = ou9Var2;
        this.H = zriVar;
        this.I = pmi0Var;
        this.J = rptVar;
        this.L = cre.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) throws JSONException {
        Object value;
        w0n0 w0n0Var;
        Object value2;
        Object value3;
        w0n0 w0n0Var2;
        Object value4;
        w0n0 w0n0Var3;
        Object value5;
        w0n0 w0n0Var4;
        Object value6;
        w0n0 w0n0Var5;
        Object value7;
        w0n0 w0n0Var6;
        Integer intOrNull;
        Object value8;
        Object value9;
        Object value10;
        w0n0 w0n0Var7;
        Object value11;
        w0n0 w0n0Var8;
        d0n0 d0n0Var = (d0n0) obj;
        d0n0Var.getClass();
        super.x(d0n0Var);
        final byte b = 1;
        ?? r4 = 0;
        if (d0n0Var instanceof uzm0) {
            c4m0 c4m0Var = this.K;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.K = sac.T(new p6d(this.r.w(this.s.f3488a.a().N), vtb.N((qz40) ((fjj) ((clc) this.J.f30901a).b).b.getValue()), new p4b0(this, r4, (byte) 10), b), jiu0.a(this), new tri0(2, r4, (byte) 16));
                return;
            }
            return;
        }
        boolean z = d0n0Var instanceof vzm0;
        ou9 ou9Var = this.G;
        if (z) {
            o2n0 o2n0Var = this.o;
            if (o2n0Var != null) {
                if (o2n0Var instanceof i2n0) {
                    z0q0 z0q0Var = ((w0n0) D()).c;
                    ljt0 ljt0Var = this.x;
                    ljt0Var.getClass();
                    z0q0Var.getClass();
                    j1q0 j1q0Var = ljt0Var.f20167a;
                    j1q0Var.getClass();
                    m1q0 m1q0Var = j1q0Var.f15748a;
                    m1q0Var.getClass();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("TEST_CONSULTANT_PROJECT_ID", z0q0Var.f43582a);
                    jSONObject.put("TEST_CONSULTANT_URL", z0q0Var.b);
                    jSONObject.put("TEST_CONSULTANT_USE_CUSTOM", z0q0Var.c);
                    jSONObject.put("TEST_CONSULTANT_USE_TEST", z0q0Var.d);
                    jSONObject.put("TEST_CONSULTANT_USE_TEST_STAGE", z0q0Var.e);
                    jSONObject.put("TEST_CONSULTANT_USE_STAGE", z0q0Var.f);
                    q7d0 q7d0Var = m1q0Var.f21021a;
                    String string = jSONObject.toString();
                    string.getClass();
                    q7d0Var.g("TEST_CONSULTANT", string);
                    m1q0Var.f.o(null, z0q0Var);
                    String str = ((w0n0) D()).d;
                    yiu yiuVar = this.y;
                    yiuVar.getClass();
                    j1q0 j1q0Var2 = yiuVar.f42713a;
                    j1q0Var2.getClass();
                    m1q0 m1q0Var2 = j1q0Var2.f15748a;
                    m1q0Var2.getClass();
                    m1q0Var2.f21021a.g("MANUAL_TEST_DOMAIN", str);
                } else if ((o2n0Var instanceof n2n0) && ((w0n0) D()).f) {
                    ou9Var.a(((w0n0) D()).e);
                }
            }
            e3c.n(this.K);
            return;
        }
        if (d0n0Var instanceof tzm0) {
            E();
            return;
        }
        boolean z2 = d0n0Var instanceof wzm0;
        i1w0 i1w0Var = this.q;
        if (!z2) {
            boolean z3 = d0n0Var instanceof c0n0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            a1n0 a1n0Var = a1n0.f79a;
            c1n0 c1n0Var = c1n0.f3581a;
            d1n0 d1n0Var = d1n0.f5317a;
            z0n0 z0n0Var = z0n0.f43577a;
            y0n0 y0n0Var = y0n0.f41816a;
            b1n0 b1n0Var = b1n0.f1815a;
            x0n0 x0n0Var = x0n0.f40078a;
            if (z3) {
                c0n0 c0n0Var = (c0n0) d0n0Var;
                String str2 = c0n0Var.b;
                e1n0 e1n0Var = c0n0Var.f3534a;
                if (e1n0Var.equals(x0n0Var)) {
                    l1q0 l1q0Var = ((w0n0) D()).b;
                    if (l1q0Var == null || !l1q0Var.y) {
                        return;
                    }
                    ljt0 ljt0Var2 = this.u;
                    ljt0Var2.getClass();
                    str2.getClass();
                    j1q0 j1q0Var3 = ljt0Var2.f20167a;
                    j1q0Var3.getClass();
                    m1q0 m1q0Var3 = j1q0Var3.f15748a;
                    m1q0Var3.getClass();
                    m1q0Var3.f21021a.g("FAKE_APP_GUID", str2);
                    m1q0Var3.i.o(null, str2);
                    return;
                }
                if (e1n0Var.equals(y0n0Var)) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value11 = p7m0Var.getValue();
                        value11.getClass();
                        w0n0Var8 = (w0n0) value11;
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value11, w0n0.a(w0n0Var8, null, z0q0.a(w0n0Var8.c, c0n0Var.b, null, false, false, false, false, 62), null, null, false, 0, null, 251)));
                    return;
                }
                if (e1n0Var.equals(z0n0Var)) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value10 = p7m0Var2.getValue();
                        value10.getClass();
                        w0n0Var7 = (w0n0) value10;
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value10, w0n0.a(w0n0Var7, null, z0q0.a(w0n0Var7.c, null, c0n0Var.b, false, false, false, false, 61), null, null, false, 0, null, 251)));
                    return;
                }
                if (e1n0Var.equals(a1n0Var)) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value9 = p7m0Var3.getValue();
                        value9.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value9, w0n0.a((w0n0) value9, null, null, c0n0Var.b, null, false, 0, null, 247)));
                    return;
                }
                if (e1n0Var.equals(d1n0Var)) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value8 = p7m0Var4.getValue();
                        value8.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value8, w0n0.a((w0n0) value8, null, null, null, c0n0Var.b, false, 0, null, 239)));
                    return;
                }
                if (!e1n0Var.equals(c1n0Var)) {
                    if (e1n0Var.equals(b1n0Var)) {
                        return;
                    }
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value7 = p7m0Var5.getValue();
                    value7.getClass();
                    w0n0Var6 = (w0n0) value7;
                    oyg0Var.getClass();
                    intOrNull = StringsKt.toIntOrNull(str2);
                } while (!p7m0Var5.m(value7, w0n0.a(w0n0Var6, null, null, null, null, false, intOrNull != null ? intOrNull.intValue() : 0, null, 191)));
                return;
            }
            if (!(d0n0Var instanceof a0n0)) {
                if (!(d0n0Var instanceof yzm0)) {
                    if (d0n0Var instanceof xzm0) {
                        g0n0 g0n0Var = ((xzm0) d0n0Var).f41760a;
                        if (g0n0Var.equals(f0n0.f8724a)) {
                            sac.V(jiu0.a(this), new f8l0((byte) 20), null, null, new tmg0(this, r4, (byte) 24), 14);
                            return;
                        } else if (g0n0Var.equals(e0n0.f6997a)) {
                            sac.V(jiu0.a(this), y2n0.f41913a, null, null, new z2n0(this, r4, (byte) 0), 14);
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    if (!(d0n0Var instanceof zzm0)) {
                        if (!(d0n0Var instanceof b0n0)) {
                            t9f.b();
                            return;
                        } else {
                            final byte b2 = 0;
                            sac.V(jiu0.a(this), new Function1(this) { // from class: a.w2n0
                                public final /* synthetic */ a3n0 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    byte b3 = b2;
                                    a3n0 a3n0Var = this.b;
                                    Throwable th = (Throwable) obj2;
                                    switch (b3) {
                                        case 0:
                                            th.getClass();
                                            th.printStackTrace();
                                            a3n0Var.C.a(th);
                                            break;
                                        default:
                                            th.getClass();
                                            th.printStackTrace();
                                            a3n0Var.C.a(th);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, null, null, new u52((Object) this, ((b0n0) d0n0Var).f1773a, (yje) r4, (byte) 27), 14);
                            return;
                        }
                    }
                    e1n0 e1n0Var2 = ((zzm0) d0n0Var).f45263a;
                    if (e1n0Var2.equals(b1n0Var)) {
                        sac.V(jiu0.a(this), new Function1(this) { // from class: a.w2n0
                            public final /* synthetic */ a3n0 b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b3 = b;
                                a3n0 a3n0Var = this.b;
                                Throwable th = (Throwable) obj2;
                                switch (b3) {
                                    case 0:
                                        th.getClass();
                                        th.printStackTrace();
                                        a3n0Var.C.a(th);
                                        break;
                                    default:
                                        th.getClass();
                                        th.printStackTrace();
                                        a3n0Var.C.a(th);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, null, null, new x2n0(this, null), 14);
                        return;
                    }
                    if (e1n0Var2.equals(x0n0Var) || e1n0Var2.equals(y0n0Var) || e1n0Var2.equals(z0n0Var) || e1n0Var2.equals(d1n0Var) || e1n0Var2.equals(c1n0Var) || e1n0Var2.equals(a1n0Var)) {
                        return;
                    }
                    t9f.b();
                    return;
                }
                r0n0 r0n0Var = ((yzm0) d0n0Var).f43521a;
                if (r0n0Var != null) {
                    boolean z4 = r0n0Var instanceof q0n0;
                    if (z4) {
                        q0n0 q0n0Var = z4 ? (q0n0) r0n0Var : null;
                        if (q0n0Var == null) {
                            return;
                        }
                        if (!q0n0Var.equals(q0n0.f27909a)) {
                            t9f.b();
                            return;
                        }
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen testSectionScreen$PaletteScreen = new TestSectionScreen$PaletteScreen();
                        if (testSectionScreen$PaletteScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) testSectionScreen$PaletteScreen)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(testSectionScreen$PaletteScreen)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (!pawVar.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    } else {
                        boolean z5 = r0n0Var instanceof p0n0;
                        if (z5) {
                            r4 = z5 ? (p0n0) r0n0Var : 0;
                            if (r4 == 0) {
                                return;
                            }
                            boolean zEquals = r4.equals(o0n0.f24436a);
                            pmi0 pmi0Var = this.I;
                            if (zEquals) {
                                pmi0Var.g(ljj.f20154a);
                                return;
                            } else if (r4.equals(n0n0.f22708a)) {
                                pmi0Var.g(ljj.b);
                                return;
                            } else {
                                t9f.b();
                                return;
                            }
                        }
                    }
                }
                t9f.b();
                return;
            }
            a0n0 a0n0Var = (a0n0) d0n0Var;
            boolean z6 = a0n0Var.b;
            e2n0 e2n0Var = a0n0Var.f34a;
            if (e2n0Var != null) {
                if (e2n0Var instanceof f1n0) {
                    boolean z7 = !z6;
                    m1q0 m1q0Var4 = this.t.f11725a.f15748a;
                    m1q0Var4.f21021a.d("FAKE_APP_GUID_ENABLED", z7);
                    m1q0Var4.h.o(null, Boolean.valueOf(z7));
                    return;
                }
                boolean z8 = e2n0Var instanceof r1n0;
                hcp0 hcp0Var = this.v;
                if (z8) {
                    r1n0 r1n0Var = z8 ? (r1n0) e2n0Var : null;
                    if (r1n0Var == null) {
                        return;
                    }
                    if (r1n0Var instanceof q1n0) {
                        hcp0Var.r(new ruq0(z6));
                        return;
                    }
                    if (r1n0Var instanceof n1n0) {
                        hcp0Var.r(new suq0(z6));
                        return;
                    }
                    if (r1n0Var instanceof o1n0) {
                        hcp0Var.r(new guq0(z6));
                        return;
                    }
                    if (r1n0Var instanceof l1n0) {
                        hcp0Var.r(new juq0(z6));
                        return;
                    }
                    if (r1n0Var instanceof g1n0) {
                        hcp0Var.r(new ztq0(z6));
                        return;
                    }
                    if (r1n0Var instanceof h1n0) {
                        p7m0 p7m0Var6 = ocjVar.f25029a;
                        do {
                            value6 = p7m0Var6.getValue();
                            value6.getClass();
                            w0n0Var5 = (w0n0) value6;
                            oyg0Var.getClass();
                        } while (!p7m0Var6.m(value6, w0n0.a(w0n0Var5, null, z0q0.a(w0n0Var5.c, null, null, !z6, false, false, false, 59), null, null, false, 0, null, 251)));
                        return;
                    }
                    if (r1n0Var instanceof j1n0) {
                        p7m0 p7m0Var7 = ocjVar.f25029a;
                        do {
                            value5 = p7m0Var7.getValue();
                            value5.getClass();
                            w0n0Var4 = (w0n0) value5;
                            oyg0Var.getClass();
                        } while (!p7m0Var7.m(value5, w0n0.a(w0n0Var4, null, z0q0.a(w0n0Var4.c, null, null, false, !z6, false, false, 55), null, null, false, 0, null, 251)));
                        return;
                    }
                    if (r1n0Var instanceof k1n0) {
                        p7m0 p7m0Var8 = ocjVar.f25029a;
                        do {
                            value4 = p7m0Var8.getValue();
                            value4.getClass();
                            w0n0Var3 = (w0n0) value4;
                            oyg0Var.getClass();
                        } while (!p7m0Var8.m(value4, w0n0.a(w0n0Var3, null, z0q0.a(w0n0Var3.c, null, null, false, false, !z6, false, 47), null, null, false, 0, null, 251)));
                        return;
                    }
                    if (r1n0Var instanceof i1n0) {
                        p7m0 p7m0Var9 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var9.getValue();
                            value3.getClass();
                            w0n0Var2 = (w0n0) value3;
                            oyg0Var.getClass();
                        } while (!p7m0Var9.m(value3, w0n0.a(w0n0Var2, null, z0q0.a(w0n0Var2.c, null, null, false, false, false, !z6, 31), null, null, false, 0, null, 251)));
                        return;
                    }
                    if (r1n0Var instanceof p1n0) {
                        hcp0Var.r(new ouq0(z6));
                        return;
                    } else if (r1n0Var instanceof m1n0) {
                        hcp0Var.r(new puq0(z6));
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                boolean z9 = e2n0Var instanceof d2n0;
                if (z9) {
                    d2n0 d2n0Var = z9 ? (d2n0) e2n0Var : null;
                    if (d2n0Var == null) {
                        return;
                    }
                    if (d2n0Var.equals(b2n0.f1861a)) {
                        hcp0Var.r(new duq0(z6));
                        return;
                    }
                    if (d2n0Var.equals(c2n0.f3634a)) {
                        hcp0Var.r(new iuq0(z6));
                        return;
                    }
                    if (d2n0Var.equals(a2n0.f132a)) {
                        hcp0Var.r(new cuq0(z6));
                        return;
                    } else if (!d2n0Var.equals(z1n0.f43630a)) {
                        t9f.b();
                        return;
                    } else {
                        H(new edk0(a0n0Var, (byte) 29));
                        hcp0Var.r(new huq0(z6));
                        return;
                    }
                }
                boolean z10 = e2n0Var instanceof u1n0;
                if (z10) {
                    u1n0 u1n0Var = z10 ? (u1n0) e2n0Var : null;
                    if (u1n0Var == null) {
                        return;
                    }
                    if (u1n0Var.equals(s1n0.f31466a)) {
                        hcp0Var.r(new fuq0(z6));
                        return;
                    } else if (u1n0Var.equals(t1n0.f33175a)) {
                        hcp0Var.r(new kuq0(z6));
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                boolean z11 = e2n0Var instanceof x1n0;
                if (z11) {
                    x1n0 x1n0Var = z11 ? (x1n0) e2n0Var : null;
                    if (x1n0Var == null) {
                        return;
                    }
                    if (x1n0Var.equals(v1n0.f36642a)) {
                        hcp0Var.r(new muq0(z6));
                        return;
                    } else if (x1n0Var.equals(w1n0.f38411a)) {
                        hcp0Var.r(new nuq0(z6));
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                boolean z12 = e2n0Var instanceof y1n0;
                if (z12) {
                    y1n0 y1n0Var = z12 ? (y1n0) e2n0Var : null;
                    if (y1n0Var == null) {
                        return;
                    }
                    if (!y1n0Var.equals(y1n0.f41865a)) {
                        t9f.b();
                        return;
                    }
                    p7m0 p7m0Var10 = ocjVar.f25029a;
                    do {
                        value = p7m0Var10.getValue();
                        value.getClass();
                        w0n0Var = (w0n0) value;
                        oyg0Var.getClass();
                    } while (!p7m0Var10.m(value, w0n0.a(w0n0Var, null, null, null, null, !w0n0Var.f, 0, null, 223)));
                    if (((w0n0) D()).f) {
                        ou9Var.a(((w0n0) D()).e);
                        return;
                    }
                    p7m0 p7m0Var11 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var11.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var11.m(value2, w0n0.a((w0n0) value2, null, null, null, "", false, 0, null, 239)));
                    ou9Var.a(((w0n0) D()).e);
                    return;
                }
            }
            t9f.b();
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
        while (true) {
            paw pawVar2 = (paw) listIteratorP;
            if (!pawVar2.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar2.next());
            }
        }
    }
}
