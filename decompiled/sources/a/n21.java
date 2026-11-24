package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class n21 extends i3t0 {
    public static final String a0 = e11.class.getSimpleName();
    public final x20 A;
    public final kb0 B;
    public final v88 C;
    public final abu D;
    public final u58 E;
    public final r7v F;
    public final s64 G;
    public final cmt H;
    public final eyg0 I;
    public final ali J;
    public final ytt K;
    public final c4m0 L;
    public final c4m0 M;
    public bby N;
    public bby O;
    public c4m0 P;
    public bby Q;
    public bby R;
    public bby S;
    public bby T;
    public bby U;
    public bby V;
    public bby W;
    public bby X;
    public bby Y;
    public bby Z;
    public final mne o;
    public final pou p;
    public final oeg0 q;
    public final duj r;
    public final pw70 s;
    public final wdu t;
    public final cmt u;
    public final yo4 v;
    public final s91 w;
    public final ctf0 x;
    public final xr y;
    public final iqt z;

    /* JADX WARN: Illegal instructions before constructor call */
    public n21(mne mneVar, pou pouVar, x860 x860Var, oeg0 oeg0Var, duj dujVar, pw70 pw70Var, wdu wduVar, cmt cmtVar, yo4 yo4Var, m1e m1eVar, s91 s91Var, ctf0 ctf0Var, xr xrVar, iqt iqtVar, x20 x20Var, kb0 kb0Var, v88 v88Var, pru pruVar, q0u q0uVar, jqt jqtVar, dmt dmtVar, abu abuVar, u58 u58Var, r7v r7vVar, s64 s64Var, cmt cmtVar2, bzt bztVar, eyg0 eyg0Var, r9u r9uVar, ali aliVar, ytt yttVar) {
        oeg0Var.getClass();
        pw70Var.getClass();
        m1eVar.getClass();
        s91Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        g090 g090VarP = cvm0.p(vs10Var, mneVar.f22085a);
        yje yjeVar = null;
        super(new co0(pruVar, x860Var, iqtVar, dmtVar, bztVar, ctf0Var), g090VarP, new uc(ctf0Var, (byte) 8), (yzn0) null);
        this.o = mneVar;
        this.p = pouVar;
        this.q = oeg0Var;
        this.r = dujVar;
        this.s = pw70Var;
        this.t = wduVar;
        this.u = cmtVar;
        this.v = yo4Var;
        this.w = s91Var;
        this.x = ctf0Var;
        this.y = xrVar;
        this.z = iqtVar;
        this.A = x20Var;
        this.B = kb0Var;
        this.C = v88Var;
        this.D = abuVar;
        this.E = u58Var;
        this.F = r7vVar;
        this.G = s64Var;
        this.H = cmtVar2;
        this.I = eyg0Var;
        this.J = aliVar;
        this.K = yttVar;
        c4m0 c4m0Var = this.L;
        byte b = 4;
        byte b2 = 2;
        byte b3 = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.L = sac.T(new fnq(m1eVar.b(), new e21(this, yjeVar, b2), b), d5c.S(jiu0.a(this), dvjVar), new i8(2, this, n21.class, "showError", "showError(Ljava/lang/Throwable;)V", 4, (byte) 10));
        }
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        i3t0.F(this, kb0Var, null, new b21(this, b3), new g20((byte) 23), 117);
        c4m0 c4m0Var2 = this.M;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            this.M = sac.T(new fnq(jqtVar.a(), new e21(this, yjeVar, b3), b), d5c.S(jiu0.a(this), dvjVar), new pd(b2, yjeVar, (byte) 5));
        }
        P();
    }

    public final lu0 M(Long l, long j) {
        Integer numValueOf;
        Object next;
        List list;
        Iterator it = ((q11) D()).j.iterator();
        do {
            numValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((j8b) next).f16074a != l.longValue());
        j8b j8bVar = (j8b) next;
        if (j8bVar != null && (list = j8bVar.c) != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (((mlr) it2.next()).f22006a == j) {
                    break;
                }
                i++;
            }
            numValueOf = Integer.valueOf(i + 1);
        }
        Integer num = numValueOf;
        long j2 = 0;
        g3z g3zVar = new g3z(0L, "placeholder_auth");
        s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
        g3z g3zVar2 = new g3z(l.longValue() == -1 ? 824L : l.longValue(), "category");
        if ((j8bVar == null || j8bVar.f16074a != -1) && ((j8bVar == null || j8bVar.f != -1) && j8bVar != null)) {
            j2 = j8bVar.d;
        }
        g3z g3zVar3 = new g3z(j2, "partition");
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(g3zVar);
        lc00VarB.add(g3zVar2);
        lc00VarB.add(g3zVar3);
        return new lu0(0L, num, "aggregator_gifts", kotlin.collections.a.a(lc00VarB));
    }

    public final void N(nnm0 nnm0Var, int i) {
        sac.V(jiu0.a(this), new c21(1, this, n21.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, this.o.b, new d21((Object) this, i, (Object) nnm0Var, (yje) null, (byte) 0), 10);
    }

    public final List O() {
        return q3d.j(this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z);
    }

    public final void P() {
        byte b = 0;
        Q(true, false);
        bby bbyVar = this.O;
        mne mneVar = this.o;
        yje yjeVar = null;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.O = sac.V(jiu0.a(this), new c21(1, this, n21.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, mneVar.b, new e21(this, yjeVar, b), 10);
        }
        c4m0 c4m0Var = this.P;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        this.P = sac.T(new fnq(this.J.o(), new qa(this, yjeVar, (byte) 17), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), h21.h);
    }

    public final void Q(boolean z, boolean z2) {
        Object value;
        bby bbyVar = this.N;
        if (bbyVar == null || !bbyVar.isActive()) {
            if (z) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, q11.a((q11) value, 0L, null, null, a7v.f393a, l7v.f19578a, null, null, null, null, false, false, false, f7v.f9076a, false, null, null, null, 536214783)));
            }
            byte b = 0;
            this.N = sac.V(jiu0.a(this), new b21(this, b), null, this.o.b, new g21(this, z2, null, b), 10);
        }
    }

    public final void R(Throwable th) {
        Object value;
        if (th instanceof d01) {
            e01 e01Var = ((d01) th).g;
            if (e01Var.c == i2o.PromoBonusTryActivateLater.getErrorCode()) {
                int i = e01Var.f6968a;
                b1j.w("promocode", Integer.valueOf(i), this.v.f42966a, "promo_games_available_activated_stop");
                this.A.f40143a.a(cui0.b(new j1p(String.valueOf(e01Var.f6968a), (byte) 0)), 3299L);
            }
            V(th);
            return;
        }
        if (!(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException) && !(th instanceof zhi0)) {
            V(th);
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, q11.a((q11) value, 0L, null, null, null, null, null, null, null, null, false, false, false, null, true, null, null, null, 536346623)));
    }

    public final void S(nw80 nw80Var, int i) {
        this.X = bww.R(jiu0.a(this), this.X, O(), this.o.f22085a, null, null, new mc0((Object) this, (Object) nw80Var, i, (yje) null, (byte) 1), 56);
    }

    public final void T(int i, long j, nw80 nw80Var, m7m0 m7m0Var, String str) {
        Object value;
        int iOrdinal = m7m0Var.ordinal();
        if (iOrdinal == 0) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, q11.a((q11) value, 0L, null, Integer.valueOf(i), null, null, null, null, null, null, false, false, false, null, false, null, null, null, 536870895)));
            G(k11.f17496a);
            return;
        }
        yo4 yo4Var = this.v;
        x20 x20Var = this.A;
        if (iOrdinal == 4) {
            x20Var.f40143a.a(cui0.b(new j1p(String.valueOf(i), (byte) 0)), 3297L);
            b1j.w("promocode", Integer.valueOf(i), yo4Var.f42966a, "promo_games_available_activate");
            N(nnm0.ACTIVE, i);
            return;
        }
        switch (iOrdinal) {
            case 6:
                x20Var.f40143a.a(cui0.b(new j1p(String.valueOf(i), (byte) 0)), 3302L);
                b1j.w("promocode", Integer.valueOf(i), yo4Var.f42966a, "promo_games_available_resume_call");
                N(nnm0.ACTIVE, i);
                break;
            case 7:
                x20Var.f40143a.a(cui0.b(new j1p(String.valueOf(i), (byte) 0)), 3301L);
                b1j.w("promocode", Integer.valueOf(i), yo4Var.f42966a, "promo_games_available_stop_call");
                N(nnm0.INTERRUPT, i);
                break;
            case 8:
                x20Var.f40143a.a(cui0.b(new j1p(String.valueOf(j), (byte) 0)), 3303L);
                yo4Var.f42966a.a("promo_games_available_play_call", wp20.b(new Pair("promocode", Long.valueOf(j))));
                str.getClass();
                v2s0[] v2s0VarArr = v2s0.f36702a;
                I(this.o.f22085a, new b21(this, (byte) 2), new sr((i3t0) this, (Object) new js0(i, "", str, "", 0L, 0L, false, false, false), j, (yje) null, (byte) 2));
                break;
            case 9:
                this.C.a(this.q.c(), true, ((q11) D()).f27928a);
                break;
            default:
                U(nw80Var, m7m0Var, i, str);
                break;
        }
    }

    public final void U(nw80 nw80Var, m7m0 m7m0Var, int i, String str) {
        int iOrdinal = m7m0Var.ordinal();
        mne mneVar = this.o;
        yje yjeVar = null;
        byte b = 1;
        if (iOrdinal == 1) {
            this.Z = bww.R(jiu0.a(this), this.Z, O(), mneVar.f22085a, null, null, new bh0(this, i, yjeVar, b), 56);
            return;
        }
        if (iOrdinal == 2) {
            this.Y = bww.R(jiu0.a(this), this.Y, O(), mneVar.f22085a, null, null, new l21(this, nw80Var, i, str, (yje) null), 56);
            return;
        }
        if (iOrdinal == 3) {
            S(nw80Var, i);
        } else {
            if (iOrdinal != 5) {
                return;
            }
            this.A.f40143a.a(cui0.b(new j1p(String.valueOf(i), (byte) 0)), 3300L);
            ctf0 ctf0Var = this.x;
            this.w.c(new AggregatorScreenModel(ctf0Var.b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_category_folder_and_section_description, Arrays.copyOf(new Object[0], 0)), 1L, new hm1(2, kotlin.collections.a.c(Long.MAX_VALUE), null), null, 0L, 0L, null, false, 496));
        }
    }

    public final void V(Throwable th) {
        this.r.b(th, new oc(2, this, n21.class, "handleCustomError", "handleCustomError(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object next;
        b11 b11Var = (b11) obj;
        b11Var.getClass();
        super.x(b11Var);
        boolean zEquals = b11Var.equals(u01.f34832a);
        byte b = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        mne mneVar = this.o;
        if (zEquals) {
            this.V = bww.R(jiu0.a(this), this.V, O(), mneVar.f22085a, null, null, new i21(this, objArr5 == true ? 1 : 0, b), 56);
            return;
        }
        byte b2 = 3;
        if (b11Var instanceof r01) {
            r01 r01Var = (r01) b11Var;
            sac.V(jiu0.a(this), new b21(this, b2), null, mneVar.b, new k21(this, r01Var.f29605a, r01Var.c, r01Var.b, null), 10);
            return;
        }
        if (b11Var.equals(m01.f20931a)) {
            E();
            return;
        }
        byte b3 = 0;
        if (b11Var.equals(v01.f36561a)) {
            this.T = bww.R(jiu0.a(this), this.T, O(), mneVar.b, null, null, new i21(this, objArr4 == true ? 1 : 0, b3), 56);
            return;
        }
        if (b11Var.equals(w01.f38325a)) {
            this.S = bww.R(jiu0.a(this), this.S, O(), mneVar.b, null, null, new e21(this, objArr3 == true ? 1 : 0, b2), 56);
            return;
        }
        if (b11Var.equals(n01.f22678a)) {
            G(l11.f19225a);
            return;
        }
        if (b11Var instanceof s01) {
            H(new a21(b3, ((s01) b11Var).f31389a));
            Iterator it = ((q11) D()).h.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((e65) next).g.f44639a >= System.currentTimeMillis());
            Object[] objArr6 = next != null;
            for (Object obj3 : ((q11) D()).i) {
                if (((n65) obj3).d.f44639a < System.currentTimeMillis()) {
                    obj2 = obj3;
                    break;
                }
            }
            if (obj2 == null && !objArr6 == true) {
                return;
            }
            Q(false, true);
            return;
        }
        if (b11Var.equals(x01.f40046a)) {
            i3t0.A(this, this.B, eb0.f7494a, mneVar.b, null, 4);
            return;
        }
        if (b11Var.equals(y01.f41781a)) {
            P();
            return;
        }
        if (b11Var.equals(z01.f43543a)) {
            this.R = bww.R(jiu0.a(this), this.R, O(), mneVar.b, m21.f21033a, null, new e21(this, objArr2 == true ? 1 : 0, (byte) 4), 40);
            return;
        }
        boolean zEquals2 = b11Var.equals(f01.f8696a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals2) {
            Integer num = ((q11) D()).d;
            if (num != null) {
                N(nnm0.DELETE, num.intValue());
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, q11.a((q11) value3, 0L, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, 536870895)));
                return;
            }
            return;
        }
        if (b11Var.equals(a11.f47a)) {
            this.U = bww.R(jiu0.a(this), this.U, O(), mneVar.b, null, null, new i21(this, objArr == true ? 1 : 0, (byte) 2), 56);
            return;
        }
        if (b11Var instanceof q01) {
            q01 q01Var = (q01) b11Var;
            this.W = bww.R(jiu0.a(this), this.W, O(), mneVar.b, null, null, new j21((byte) 0, q01Var.f27871a, q01Var.b, (yje) null, (Object) this, (Object) q01Var.c), 56);
            return;
        }
        if (b11Var instanceof h01) {
            h01 h01Var = (h01) b11Var;
            T(h01Var.d, h01Var.c, h01Var.f12210a, h01Var.b, h01Var.e);
            return;
        }
        if (b11Var instanceof i01) {
            i01 i01Var = (i01) b11Var;
            U(i01Var.f13929a, i01Var.b, i01Var.c, i01Var.d);
            return;
        }
        if (b11Var instanceof j01) {
            j01 j01Var = (j01) b11Var;
            S(j01Var.f15661a, j01Var.c);
            return;
        }
        if (b11Var instanceof l01) {
            l01 l01Var = (l01) b11Var;
            T(l01Var.d, l01Var.c, l01Var.f19176a, l01Var.b, l01Var.e);
            return;
        }
        if (b11Var instanceof g01) {
            int i = ((g01) b11Var).f10437a;
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, q11.a((q11) value2, 0L, null, Integer.valueOf(i), null, null, null, null, null, null, false, false, false, null, false, null, null, null, 536870895)));
            G(k11.f17496a);
            return;
        }
        if (b11Var.equals(p01.f26124a)) {
            i3t0.A(this, this.B, za0.f44045a, mneVar.b, null, 4);
            Q(false, true);
            return;
        }
        if (b11Var instanceof t01) {
            t01 t01Var = (t01) b11Var;
            this.Q = bww.R(jiu0.a(this), this.Q, O(), mneVar.b, null, null, new tr(this, t01Var.f33096a, t01Var.b, null, (byte) 3), 56);
            return;
        }
        if (!b11Var.equals(k01.f17441a)) {
            if (b11Var instanceof o01) {
                Q(false, false);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value = p7m0Var3.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value, q11.a((q11) value, 0L, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, 536805375)));
    }
}
