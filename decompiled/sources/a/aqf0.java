package a;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aqf0 extends w46 {
    public boolean A;
    public Function0 B;
    public final p7m0 C;
    public final p7m0 D;
    public final p7m0 E;
    public final p7m0 F;
    public final p7m0 G;
    public final fqf0 b;
    public final uqf0 c;
    public final bsf0 d;
    public final fsf0 e;
    public final pqf0 f;
    public final i5m0 g;
    public final ecs h;
    public final s7t0 i;
    public final fq j;
    public final qa60 k;
    public final xcc l;
    public final vcu m;
    public final vrs0 n;
    public final qni0 o;
    public final itt p;
    public final cpi0 q;
    public final t0u r;
    public final mne s;
    public bby t;
    public bby u;
    public bby v;
    public bby w;
    public bby x;
    public vqf0 y;
    public int z;

    public aqf0(fqf0 fqf0Var, uqf0 uqf0Var, bsf0 bsf0Var, fsf0 fsf0Var, pqf0 pqf0Var, i5m0 i5m0Var, ecs ecsVar, s7t0 s7t0Var, fq fqVar, qa60 qa60Var, xcc xccVar, vcu vcuVar, vrs0 vrs0Var, qni0 qni0Var, itt ittVar, cpi0 cpi0Var, t0u t0uVar, mne mneVar) {
        fqf0Var.getClass();
        uqf0Var.getClass();
        bsf0Var.getClass();
        fsf0Var.getClass();
        pqf0Var.getClass();
        i5m0Var.getClass();
        ecsVar.getClass();
        s7t0Var.getClass();
        fqVar.getClass();
        qa60Var.getClass();
        xccVar.getClass();
        vcuVar.getClass();
        vrs0Var.getClass();
        qni0Var.getClass();
        ittVar.getClass();
        cpi0Var.getClass();
        t0uVar.getClass();
        this.b = fqf0Var;
        this.c = uqf0Var;
        this.d = bsf0Var;
        this.e = fsf0Var;
        this.f = pqf0Var;
        this.g = i5m0Var;
        this.h = ecsVar;
        this.i = s7t0Var;
        this.j = fqVar;
        this.k = qa60Var;
        this.l = xccVar;
        this.m = vcuVar;
        this.n = vrs0Var;
        this.o = qni0Var;
        this.p = ittVar;
        this.q = cpi0Var;
        this.r = t0uVar;
        this.s = mneVar;
        this.z = -1;
        this.B = new b4f0((byte) 16);
        this.C = q7m0.a(npf0.f23911a);
        Boolean bool = Boolean.FALSE;
        this.D = q7m0.a(bool);
        this.E = q7m0.a(new ipf0());
        this.F = q7m0.a(new jpf0("", "", false, false));
        this.G = q7m0.a(bool);
        sac.V(jiu0.a(this), new aif0(1, this, aqf0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar.f22085a, new ypf0(this, null, (byte) 1), 10);
    }

    public final void A(vqf0 vqf0Var) {
        p7m0 p7m0Var;
        Object value;
        trf0 trf0Var;
        String str;
        do {
            p7m0Var = this.F;
            value = p7m0Var.getValue();
            trf0Var = vqf0Var.f37854a;
            str = trf0Var.c;
        } while (!p7m0Var.m(value, new jpf0(trf0Var.b, str, trf0Var.b.length() > 0 && str.length() > 0, false)));
    }

    public final void B(int i, boolean z) {
        bby bbyVar = this.v;
        if (bbyVar == null || !bbyVar.isActive()) {
            if (z) {
                this.z = i;
            }
            bvc bvcVarA = jiu0.a(this);
            dvj dvjVar = this.s.b;
            this.u = sac.i0(bvcVarA, "ResidentGameViewModel.makeAction", 5, 5L, q3d.j(oqt0.class, ff5.class, zhi0.class, qct.class), null, new h18(this, z, i, null, (byte) 2), null, dvjVar, new aif0(1, this, aqf0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, 592);
        }
    }

    public final void C() {
        wof0 wof0Var;
        wof0 wof0Var2;
        wof0 wof0Var3;
        w(dy5.f6877a);
        vqf0 vqf0Var = this.y;
        yje yjeVar = null;
        lnm0 lnm0Var = (vqf0Var == null || (wof0Var3 = vqf0Var.b) == null) ? null : wof0Var3.k;
        lnm0 lnm0Var2 = lnm0.c;
        mne mneVar = this.s;
        if (lnm0Var != lnm0Var2) {
            sac.V(jiu0.a(this), new aif0(1, this, aqf0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.b, new zye0((Object) this, yjeVar, (byte) 11), 10);
            return;
        }
        y(true, (vqf0Var == null || (wof0Var2 = vqf0Var.b) == null) ? false : wof0Var2.h);
        vqf0 vqf0Var2 = this.y;
        if (vqf0Var2 == null || (wof0Var = vqf0Var2.b) == null) {
            return;
        }
        sac.V(jiu0.a(this), new aif0(1, this, aqf0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, mneVar.b, new wpf0(this, wof0Var, null), 10);
    }

    public final void w(zy5 zy5Var) {
        sac.V(jiu0.a(this), tpf0.f34330a, null, this.s.f22085a, new k6d0((Object) this, (Object) zy5Var, (yje) null, (byte) 11), 10);
    }

    public final void x(vqf0 vqf0Var, boolean z) {
        p7m0 p7m0Var;
        Object value;
        ipf0 ipf0Var;
        p7m0 p7m0Var2;
        Object value2;
        p7m0 p7m0Var3;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        this.y = vqf0Var;
        wof0 wof0Var = vqf0Var.b;
        boolean z2 = (wof0Var != null ? Integer.valueOf(wof0Var.e) : null) != null && wof0Var.e >= 4;
        tre0 tre0Var = sre0.f32672a;
        List listJ = q3d.j(tre0Var.b(mpf0.class), tre0Var.b(kpf0.class));
        p7m0 p7m0Var4 = this.C;
        boolean zContains = listJ.contains(tre0Var.b(p7m0Var4.getValue().getClass()));
        do {
            p7m0Var = this.E;
            value = p7m0Var.getValue();
            ipf0Var = (ipf0) value;
            pn40 pn40Var = pn40.f27267a;
        } while (!p7m0Var.m(value, ipf0.a(ipf0Var, pn40.c(wof0Var != null ? wof0Var.c : 0.0d, p3u0.g), 23)));
        do {
            p7m0Var2 = this.F;
            value2 = p7m0Var2.getValue();
        } while (!p7m0Var2.m(value2, jpf0.a((jpf0) value2, vqf0Var.f37854a.f34421a && !this.A, 12)));
        do {
            p7m0Var3 = this.G;
            value3 = p7m0Var3.getValue();
            ((Boolean) value3).getClass();
        } while (!p7m0Var3.m(value3, Boolean.valueOf(z)));
        gpf0 gpf0Var = wof0Var != null ? wof0Var.d : null;
        int i = gpf0Var == null ? -1 : spf0.f32591a[gpf0Var.ordinal()];
        if (i == 1) {
            lpf0 lpf0Var = new lpf0(wof0Var.j, wof0Var.f);
            if (Intrinsics.d(p7m0Var4.getValue(), lpf0Var)) {
                C();
            }
            do {
                value4 = p7m0Var4.getValue();
            } while (!p7m0Var4.m(value4, lpf0Var));
            return;
        }
        if (i == 2) {
            if (z2 && !zContains && z) {
                do {
                    value6 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value6, new mpf0(wof0Var.j, wof0Var.f)));
                return;
            } else {
                do {
                    value5 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value5, kpf0.f18673a));
                return;
            }
        }
        if (i != 3) {
            return;
        }
        int iOrdinal = wof0Var.k.ordinal();
        if (iOrdinal == 2) {
            do {
                value7 = p7m0Var4.getValue();
            } while (!p7m0Var4.m(value7, new qpf0(wof0Var, z2 && zContains, this.z)));
        } else {
            if (iOrdinal != 3) {
                return;
            }
            do {
                value8 = p7m0Var4.getValue();
            } while (!p7m0Var4.m(value8, new opf0(wof0Var, z2 && zContains, this.z)));
        }
    }

    public final void y(boolean z, boolean z2) {
        p7m0 p7m0Var;
        Object value;
        boolean z3 = z && z2;
        do {
            p7m0Var = this.D;
            value = p7m0Var.getValue();
            ((Boolean) value).getClass();
        } while (!p7m0Var.m(value, Boolean.valueOf(z)));
        w(new hy5(!z3));
    }

    public final void z(Throwable th) {
        sac.V(jiu0.a(this), vpf0.f37802a, null, this.s.f22085a, new k6d0((Object) this, (Object) th, (yje) null, (byte) 13), 10);
    }
}
