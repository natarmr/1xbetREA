package a;

import android.javax.sip.message.Response;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class wz1 extends i3t0 {
    public static final String T = ty1.class.getSimpleName();
    public final zr1 A;
    public final o470 B;
    public final pwi C;
    public final roq0 D;
    public final s64 E;
    public final cmt F;
    public final ytt G;
    public final cyu H;
    public bby I;
    public bby J;
    public bby K;
    public final c4m0 L;
    public bby M;
    public bby N;
    public bby O;
    public bby P;
    public bby Q;
    public bby R;
    public bby S;
    public final kb0 o;
    public final duj p;
    public final s91 q;
    public final qu r;
    public final dgu s;
    public final oeg0 t;
    public final ctf0 u;
    public final s31 v;
    public final a6u w;
    public final gto0 x;
    public final mne y;
    public final iqt z;

    /* JADX WARN: Illegal instructions before constructor call */
    public wz1(kb0 kb0Var, duj dujVar, s91 s91Var, m1e m1eVar, qu quVar, dgu dguVar, g2v g2vVar, dmt dmtVar, oeg0 oeg0Var, ctf0 ctf0Var, s31 s31Var, a6u a6uVar, gto0 gto0Var, mne mneVar, iqt iqtVar, zr1 zr1Var, o470 o470Var, pwi pwiVar, roq0 roq0Var, s64 s64Var, cmt cmtVar, kc60 kc60Var, ytt yttVar, wiu wiuVar, cyu cyuVar, pru pruVar) {
        s91Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        yje yjeVar = null;
        super(new mr0(iqtVar, dmtVar, ctf0Var, pruVar, (byte) 1), cvm0.p(vs10Var, dvjVar), new dc0((Object) pruVar, (Object) wiuVar, (Object) ctf0Var, (Object) g2vVar, (byte) 3), (yzn0) null);
        this.o = kb0Var;
        this.p = dujVar;
        this.q = s91Var;
        this.r = quVar;
        this.s = dguVar;
        this.t = oeg0Var;
        this.u = ctf0Var;
        this.v = s31Var;
        this.w = a6uVar;
        this.x = gto0Var;
        this.y = mneVar;
        this.z = iqtVar;
        this.A = zr1Var;
        this.B = o470Var;
        this.C = pwiVar;
        this.D = roq0Var;
        this.E = s64Var;
        this.F = cmtVar;
        this.G = yttVar;
        this.H = cyuVar;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        byte b = 0;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new qa(this, yjeVar, (byte) 23), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new qz1(this, yjeVar, b));
        c4m0 c4m0Var = this.L;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.L = sac.T(new fnq(m1eVar.b(), new oz1(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), dvjVar), pz1.h);
        }
        i3t0.F(this, kb0Var, null, new lz1(this, (byte) 5), new xg1((byte) 18), 117);
    }

    public final List M() {
        return q3d.j(this.M, this.N, this.O, this.P, this.Q, this.R, this.S);
    }

    public final void N() {
        Object value;
        bby bbyVar = this.J;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, dz1.a((dz1) value, false, false, false, null, false, null, null, false, xhe.f40886a, 2047)));
            this.J = sac.V(jiu0.a(this), new lz1(this, (byte) 2), null, this.y.b, new wg0(this, null, b), 10);
        }
    }

    public final void O(boolean z, long j) {
        this.R = bww.R(jiu0.a(this), this.R, M(), this.y.b, null, null, new uz1(z, this, j, null), 56);
    }

    public final void P(boolean z, long j) {
        this.K = bww.R(jiu0.a(this), this.K, M(), this.y.b, new lz1(this, (byte) 1), null, new ey((byte) 4, j, null, this, z), 40);
    }

    public final void Q(myr0 myr0Var) {
        this.q.c(new AggregatorScreenModel(null, null, 0L, new qm1(myr0Var.f22617a, s9s0.f31863a, myr0Var.f.f13873a, false), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
    }

    public final void R(long j) {
        bby bbyVar = this.I;
        if (bbyVar == null || !bbyVar.isActive()) {
            byte b = 3;
            this.I = sac.f0(jiu0.a(this), j, TimeUnit.SECONDS, this.y.b, new lz1(this, b), new qz1(this, null, b), 32);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(myr0 myr0Var, zje zjeVar) {
        vz1 vz1Var;
        Object value;
        if (zjeVar instanceof vz1) {
            vz1Var = (vz1) zjeVar;
            int i = vz1Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vz1Var.l = i - Integer.MIN_VALUE;
            } else {
                vz1Var = new vz1(this, zjeVar);
            }
        } else {
            vz1Var = new vz1(this, zjeVar);
        }
        Object objR = vz1Var.j;
        wne wneVar = wne.f39444a;
        int i2 = vz1Var.l;
        try {
            if (i2 == 0) {
                z1x.P(objR);
                e0g0 e0g0Var = j0g0.b;
                dgu dguVar = this.s;
                long j = myr0Var.f22617a;
                vz1Var.i = myr0Var;
                vz1Var.l = 1;
                objR = dguVar.r(j, vz1Var);
                if (objR == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                myr0Var = vz1Var.i;
                z1x.P(objR);
            }
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable unused) {
            e0g0 e0g0Var3 = j0g0.b;
        }
        myr0 myr0Var2 = myr0Var;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, dz1.a((dz1) value, false, false, false, null, false, myr0Var2, null, false, null, 3839)));
        G(new az1(myr0Var2.f22617a, myr0Var2.f.f13873a));
        N();
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        List list;
        Object value2;
        Object value3;
        by1 by1Var = (by1) obj;
        by1Var.getClass();
        boolean zEquals = by1Var.equals(mx1.f22531a);
        byte b = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        mne mneVar = this.y;
        if (zEquals) {
            this.M = bww.R(jiu0.a(this), this.M, M(), mneVar.b, null, null, new oz1(this, objArr6 == true ? 1 : 0, b), 56);
            return;
        }
        if (by1Var.equals(ox1.f25990a)) {
            this.O = bww.R(jiu0.a(this), this.O, M(), mneVar.b, rz1.f31336a, null, new oz1(this, objArr5 == true ? 1 : 0, (byte) 3), 40);
            return;
        }
        if (by1Var.equals(qx1.f29459a)) {
            this.P = bww.R(jiu0.a(this), this.P, M(), mneVar.b, sz1.f33048a, null, new oz1(this, objArr4 == true ? 1 : 0, (byte) 4), 40);
            return;
        }
        byte b2 = 2;
        if (by1Var.equals(rx1.f31241a)) {
            this.Q = bww.R(jiu0.a(this), this.Q, M(), mneVar.f22085a, null, null, new qz1(this, objArr3 == true ? 1 : 0, b2), 56);
            return;
        }
        if (by1Var.equals(ux1.f36418a)) {
            i3t0.A(this, this.o, eb0.f7494a, mneVar.b, null, 4);
            return;
        }
        if (by1Var.equals(zx1.f45136a)) {
            this.N = bww.R(jiu0.a(this), this.N, M(), mneVar.b, null, null, new oz1(this, objArr2 == true ? 1 : 0, b2), 56);
            return;
        }
        if (by1Var instanceof tx1) {
            tx1 tx1Var = (tx1) by1Var;
            P(tx1Var.b, tx1Var.f34676a);
            return;
        }
        byte b3 = 0;
        if (by1Var instanceof sx1) {
            O(false, ((sx1) by1Var).f32950a);
            return;
        }
        if (by1Var instanceof yx1) {
            N();
            return;
        }
        boolean z = by1Var instanceof nx1;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            s9s0 s9s0Var = ((nx1) by1Var).f24261a;
            myr0 myr0Var = ((dz1) D()).i;
            if (myr0Var == null) {
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, dz1.a((dz1) value3, false, false, false, null, false, null, null, false, null, 3839)));
            this.q.c(new AggregatorScreenModel(null, null, 0L, new qm1(myr0Var.f22617a, s9s0Var, myr0Var.f.f13873a, false), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
            return;
        }
        if (by1Var instanceof ay1) {
            long j = ((ay1) by1Var).f1649a;
            bie bieVar = ((dz1) D()).l;
            vge vgeVar = bieVar instanceof vge ? (vge) bieVar : null;
            if (vgeVar == null || (list = vgeVar.f37377a) == null) {
                list = iun.f15405a;
            }
            if (!list.isEmpty()) {
                O(true, j);
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, dz1.a((dz1) value2, false, false, false, null, false, null, Long.valueOf(j), false, null, 3583)));
            return;
        }
        if (by1Var.equals(px1.f27733a)) {
            this.S = bww.R(jiu0.a(this), this.S, M(), mneVar.b, null, null, new qz1(this, objArr == true ? 1 : 0, b), 56);
            return;
        }
        if (by1Var.equals(wx1.f39909a)) {
            if (((dz1) D()).d) {
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, dz1.a((dz1) value, false, true, false, null, false, null, null, false, null, 4087)));
            R(0L);
            return;
        }
        if (by1Var.equals(xx1.f41636a)) {
            this.t.c().d(new lz1(this, b3));
            return;
        }
        if (by1Var.equals(vx1.f38179a)) {
            N();
        } else if (by1Var.equals(lx1.f20791a)) {
            E();
        } else {
            t9f.b();
        }
    }
}
