package a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class yn2 extends i3t0 {
    public static final /* synthetic */ int g0 = 0;
    public final h6i A;
    public final oif0 B;
    public final p4u C;
    public final qv2 D;
    public final yfm0 E;
    public final uf3 F;
    public final mne G;
    public final duj H;
    public final i1w0 I;
    public final fvt0 J;
    public final y78 K;
    public final ls L;
    public final z4u M;
    public final iqt N;
    public final gw60 O;
    public final ix0 P;
    public final lbu Q;
    public final n4u R;
    public final mne S;
    public final r9u T;
    public final o3c U;
    public final eyg0 V;
    public final h3c W;
    public final hjd X;
    public final kki Y;
    public final n0o0 Z;
    public bby a0;
    public c4m0 b0;
    public bby c0;
    public bby d0;
    public bby e0;
    public bby f0;
    public final bn6 o;
    public final je p;
    public final m1e q;
    public final gg5 r;
    public final yo4 s;
    public final hs60 t;
    public final kd30 u;
    public final luu v;
    public final j3c w;
    public final lbu x;
    public final yoc y;
    public final yoc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn2(vzg0 vzg0Var, bn6 bn6Var, je jeVar, g2v g2vVar, m1e m1eVar, gg5 gg5Var, yo4 yo4Var, hs60 hs60Var, kd30 kd30Var, luu luuVar, j3c j3cVar, svu svuVar, lbu lbuVar, pru pruVar, yoc yocVar, yoc yocVar2, h6i h6iVar, oif0 oif0Var, p4u p4uVar, qv2 qv2Var, yfm0 yfm0Var, uf3 uf3Var, mne mneVar, duj dujVar, i1w0 i1w0Var, ctf0 ctf0Var, fvt0 fvt0Var, y78 y78Var, ls lsVar, z4u z4uVar, iqt iqtVar, gw60 gw60Var, ix0 ix0Var, lbu lbuVar2, n4u n4uVar, mne mneVar2, r9u r9uVar, o3c o3cVar, eyg0 eyg0Var, h3c h3cVar, hjd hjdVar, kki kkiVar) {
        super(null, new mc((Object) g2vVar, (Object) svuVar, (byte) 21), new on((Object) ctf0Var, (Object) y78Var, (Object) pruVar, (byte) 11), cvm0.p(mneVar2.c, mneVar2.f22085a), null);
        m1eVar.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.o = bn6Var;
        this.p = jeVar;
        this.q = m1eVar;
        this.r = gg5Var;
        this.s = yo4Var;
        this.t = hs60Var;
        this.u = kd30Var;
        this.v = luuVar;
        this.w = j3cVar;
        this.x = lbuVar;
        this.y = yocVar;
        this.z = yocVar2;
        this.A = h6iVar;
        this.B = oif0Var;
        this.C = p4uVar;
        this.D = qv2Var;
        this.E = yfm0Var;
        this.F = uf3Var;
        this.G = mneVar;
        this.H = dujVar;
        this.I = i1w0Var;
        this.J = fvt0Var;
        this.K = y78Var;
        this.L = lsVar;
        this.M = z4uVar;
        this.N = iqtVar;
        this.O = gw60Var;
        this.P = ix0Var;
        this.Q = lbuVar2;
        this.R = n4uVar;
        this.S = mneVar2;
        this.T = r9uVar;
        this.U = o3cVar;
        this.V = eyg0Var;
        this.W = h3cVar;
        this.X = hjdVar;
        this.Y = kkiVar;
        this.Z = maz.b(new hc0(pruVar, (byte) 4));
        i3t0.K(this, null, null, new rn2(this, null, (byte) 1), 3);
    }

    public final void M() {
        Object value;
        oyg0 oyg0Var;
        Object value2;
        bby bbyVar = this.a0;
        if (bbyVar == null || !bbyVar.isActive()) {
            boolean z = ((xm2) D()).k;
            ocj ocjVar = this.i;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var = this.f;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, xm2.a((xm2) value, false, false, false, null, null, null, false, false, false, false, false, false, 260095)));
            if (((xm2) D()).b && z) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, xm2.a((xm2) value2, true, false, false, null, null, null, false, false, false, false, false, false, 262142)));
            }
            this.a0 = sac.V(jiu0.a(this), new bk2(1, this, yn2.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, this.S.b, new ex1((Object) this, (yje) null, (byte) 2), 10);
        }
    }

    public final void N(Throwable th) {
        O(false);
        this.H.b(th, new ma2((byte) 18));
    }

    public final void O(boolean z) {
        Object value;
        iun iunVar;
        if (!z || (((xm2) D()).d.isEmpty() && ((xm2) D()).e.isEmpty())) {
            v3c.N(this.a0);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                iunVar = iun.f15405a;
            } while (!p7m0Var.m(value, xm2.a((xm2) value, false, true, false, iunVar, iunVar, null, false, false, false, false, false, false, 196564)));
        }
    }

    public final void P(List list) {
        bby bbyVar = this.c0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.c0 = sac.f0(jiu0.a(this), this.z.a(), TimeUnit.MILLISECONDS, this.G.f22085a, new m51(this, (byte) 23), new y32((Object) this, (Object) list, (yje) null, (byte) 7), 32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        wm2 wm2Var = (wm2) obj;
        wm2Var.getClass();
        super.x(wm2Var);
        boolean z = wm2Var instanceof hm2;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        byte b = 1;
        if (z) {
            hm2 hm2Var = (hm2) wm2Var;
            if (hm2Var.equals(fm2.f9765a)) {
                bby bbyVar = this.e0;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.e0 = i3t0.K(this, null, null, new rn2(this, objArr7 == true ? 1 : 0, objArr3 == true ? 1 : 0), 3);
                }
                c4m0 c4m0Var = this.b0;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.b0 = slb.U(new dnq(new fnq(this.q.b(), new qn2(this, objArr9 == true ? 1 : 0, b), (byte) 4), new sn2(this, objArr8 == true ? 1 : 0, b), (byte) 1), jiu0.a(this));
                }
                v3c.N(this.d0);
                this.d0 = i3t0.F(this, this.X, null, null, new ma2((byte) 19), 119);
                return;
            }
            if (hm2Var.equals(gm2.f11522a)) {
                v3c.N(this.a0);
                v3c.N(this.b0);
                v3c.N(this.d0);
                v3c.N(this.e0);
                v3c.N(this.c0);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value6 = p7m0Var.getValue();
                    value6.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value6, xm2.a((xm2) value6, false, false, false, null, null, null, false, false, false, false, false, false, 196607)));
                return;
            }
            if (hm2Var instanceof dm2) {
                P(kotlin.collections.a.c(Long.valueOf(((dm2) hm2Var).f6305a)));
                return;
            }
            if (hm2Var.equals(em2.f8028a)) {
                M();
                return;
            } else if (hm2Var.equals(cm2.f4587a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(wm2Var instanceof vm2)) {
            t9f.b();
            return;
        }
        vm2 vm2Var = (vm2) wm2Var;
        if (vm2Var.equals(pm2.f27212a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value5 = p7m0Var2.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value5, xm2.a((xm2) value5, false, false, false, null, null, null, true, true, false, false, false, false, 255999)));
            M();
            return;
        }
        if (vm2Var.equals(om2.f25483a)) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value4 = p7m0Var3.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value4, xm2.a((xm2) value4, false, false, false, null, null, null, true, true, false, false, true, false, 190463)));
            v3c.N(this.a0);
            M();
            return;
        }
        boolean zEquals = vm2Var.equals(mm2.f22018a);
        mne mneVar = this.G;
        if (zEquals) {
            this.r.b(agp.VIEWED, kotlin.collections.a.c(ofp.ALL));
            this.s.f42966a.a("bet_favor_clear_done", xp20.f(new Pair("menu", "viewed"), new Pair("option", "all")));
            sac.V(jiu0.a(this), new bk2(1, this, yn2.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 2), null, mneVar.b, new qn2(this, objArr6 == true ? 1 : 0, objArr2 == true ? 1 : 0), 10);
            return;
        }
        if (vm2Var instanceof km2) {
            i3t0.A(this, this.X, ebc.n0(((km2) vm2Var).f18518a), null, null, 6);
            return;
        }
        if (vm2Var instanceof jm2) {
            i3t0.A(this, this.X, ((jm2) vm2Var).f16743a, null, null, 6);
            return;
        }
        if (vm2Var instanceof rm2) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value3 = p7m0Var4.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value3, xm2.a((xm2) value3, false, false, false, null, null, null, false, false, true, false, false, false, 245759)));
            return;
        }
        if (vm2Var instanceof qm2) {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value2 = p7m0Var5.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value2, xm2.a((xm2) value2, false, false, false, null, null, null, false, false, false, false, false, false, 245759)));
            return;
        }
        boolean z2 = vm2Var instanceof im2;
        i1w0 i1w0Var = this.I;
        if (z2) {
            js0 js0Var = ((im2) vm2Var).f15005a;
            long j = js0Var.f17026a;
            Iterator it = ((xm2) D()).d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((oxy) it.next()).a() == j) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            ix0.c(this.P, (int) j, numValueOf != null ? kng0.e(1, numValueOf) : null);
            i1w0Var.d(new df1(this, js0Var, (byte) 21));
            return;
        }
        if (vm2Var instanceof tm2) {
            sac.V(jiu0.a(this), null, null, mneVar.f22085a, new y32((Object) this, (Object) ((tm2) vm2Var).f34173a, (yje) (objArr5 == true ? 1 : 0), (byte) 6), 11);
            return;
        }
        if (vm2Var instanceof um2) {
            um2 um2Var = (um2) vm2Var;
            bby bbyVar2 = this.f0;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                this.f0 = sac.V(jiu0.a(this), new bk2(1, this, yn2.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar.b, new wn2((Object) um2Var, (Object) this, (yje) (objArr4 == true ? 1 : 0), (byte) (objArr == true ? 1 : 0)), 10);
                return;
            }
            return;
        }
        if (!(vm2Var instanceof lm2)) {
            if (!(vm2Var instanceof sm2)) {
                if (vm2Var.equals(nm2.f23752a)) {
                    G(hn2.f13331a);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            boolean z3 = ((sm2) vm2Var).f32425a;
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value = p7m0Var6.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value, xm2.a((xm2) value, false, false, false, null, null, null, false, false, false, z3, false, false, 229375)));
            return;
        }
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
}
