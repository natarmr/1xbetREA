package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class q3t extends w46 {
    public final zju b;
    public final v4u c;
    public final gni0 d;
    public final t0u e;
    public final pyb f;
    public final l1u g;
    public final k1u h;
    public final nqt i;
    public final fq j;
    public final v8u k;
    public final mne l;
    public final xcc m;
    public final q99 n;

    public q3t(i1w0 i1w0Var, zju zjuVar, v4u v4uVar, gni0 gni0Var, t0u t0uVar, pyb pybVar, l1u l1uVar, k1u k1uVar, qa60 qa60Var, nqt nqtVar, fq fqVar, v8u v8uVar, mne mneVar, xcc xccVar) {
        i1w0Var.getClass();
        zjuVar.getClass();
        v4uVar.getClass();
        gni0Var.getClass();
        t0uVar.getClass();
        pybVar.getClass();
        l1uVar.getClass();
        k1uVar.getClass();
        qa60Var.getClass();
        nqtVar.getClass();
        fqVar.getClass();
        v8uVar.getClass();
        xccVar.getClass();
        this.b = zjuVar;
        this.c = v4uVar;
        this.d = gni0Var;
        this.e = t0uVar;
        this.f = pybVar;
        this.g = l1uVar;
        this.h = k1uVar;
        this.i = nqtVar;
        this.j = fqVar;
        this.k = v8uVar;
        this.l = mneVar;
        this.m = xccVar;
        yje yjeVar = null;
        this.n = vtb.d(0, null, null, 7);
        slb.U(new dnq(new fnq(qa60Var.a(), new ens(2, this, q3t.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 1), (byte) 4), new lo3(3, yjeVar, (byte) 21), (byte) 1), jiu0.a(this));
        sac.V(jiu0.a(this), new h2s(1, this, q3t.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.b, new cbq((Object) this, yjeVar, (byte) 19), 10);
    }

    public final void A(gxo gxoVar, boolean z, String str) {
        C(new i3t(gxoVar, z));
        if (z) {
            return;
        }
        v4u v4uVar = this.c;
        double dA = v4uVar.a(gxoVar);
        if (str.length() != 0 && msm0.j(str)) {
            dA = Math.max(dA, Double.parseDouble(str));
        }
        double dA2 = this.g.a();
        double dA3 = this.h.a();
        if (dA > dA3) {
            dA = dA3;
        } else if (dA < dA2) {
            dA = Math.max(dA2, v4uVar.a(gxoVar));
        }
        C(new c3t(gxoVar, dA));
        lle lleVar = new lle(gxoVar, dA);
        sac.V(jiu0.a(this), m3t.f21135a, null, this.l.f22085a, new cbq(this, lleVar, null, (byte) 17), 10);
        C(new e3t(x()));
    }

    public final void B(gxo gxoVar, String str) {
        double dA = this.c.a(gxoVar);
        if (str.length() != 0 && msm0.j(str)) {
            dA = Math.max(dA, Double.parseDouble(str));
        }
        lle lleVar = new lle(gxoVar, dA);
        sac.V(jiu0.a(this), m3t.f21135a, null, this.l.f22085a, new cbq(this, lleVar, null, (byte) 17), 10);
    }

    public final void C(l3t l3tVar) {
        sac.V(jiu0.a(this), new vls((byte) 9), null, null, new cbq(this, l3tVar, null, (byte) 21), 14);
    }

    public final void w(w05 w05Var) {
        sac.V(jiu0.a(this), n3t.f22866a, null, this.l.f22085a, new cbq(this, w05Var, null, (byte) 18), 10);
    }

    public final boolean x() {
        for (gxo gxoVar : gxo.values()) {
            double dA = this.k.a(gxoVar);
            double dA2 = this.g.a();
            if (dA > this.h.a() || dA2 > dA) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(zy5 zy5Var, yje yjeVar) {
        o3t o3tVar;
        if (yjeVar instanceof o3t) {
            o3tVar = (o3t) yjeVar;
            int i = o3tVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3tVar.k = i - Integer.MIN_VALUE;
            } else {
                o3tVar = new o3t(this, yjeVar);
            }
        } else {
            o3tVar = new o3t(this, yjeVar);
        }
        Object objA = o3tVar.i;
        wne wneVar = wne.f39444a;
        int i2 = o3tVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (zy5Var != null) {
                if (zy5Var instanceof lle) {
                    lle lleVar = (lle) zy5Var;
                    gxo gxoVar = lleVar.f20243a;
                    C(new c3t(gxoVar, Math.max(lleVar.b, this.c.a(gxoVar))));
                } else if (zy5Var instanceof yy5) {
                    C(h3t.f12403a);
                } else if (zy5Var instanceof ple) {
                    o3tVar.k = 1;
                    objA = this.e.a(o3tVar);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        String str = (String) objA;
        C(new d3t(this.g.a(), this.h.a(), str));
        C(new e3t(x()));
        C(new b3t(str));
        z(gxo.f12086a);
        z(gxo.b);
        z(gxo.c);
        return Unit.f46060a;
    }

    public final void z(gxo gxoVar) {
        double dA = this.k.a(gxoVar);
        double dA2 = this.g.a();
        boolean z = false;
        if (dA <= this.h.a() && dA2 <= dA) {
            z = true;
        }
        C(new j3t(gxoVar, z));
        C(new c3t(gxoVar, Math.max(dA, this.c.a(gxoVar))));
    }
}
