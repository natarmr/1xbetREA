package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ol70 extends w46 {
    public final fq b;
    public final l1u c;
    public final v8u d;
    public final k1u e;
    public final spx f;
    public final vcu g;
    public final boolean h;
    public final lzt i;
    public final xcc j;
    public final lg60 k;
    public final mne l;
    public final tbu m;
    public final t0u n;
    public final q99 o;

    public ol70(i1w0 i1w0Var, fq fqVar, qa60 qa60Var, l1u l1uVar, v8u v8uVar, k1u k1uVar, spx spxVar, vcu vcuVar, boolean z, lzt lztVar, xcc xccVar, lg60 lg60Var, mne mneVar, tbu tbuVar, t0u t0uVar) {
        i1w0Var.getClass();
        fqVar.getClass();
        qa60Var.getClass();
        l1uVar.getClass();
        v8uVar.getClass();
        k1uVar.getClass();
        spxVar.getClass();
        vcuVar.getClass();
        lztVar.getClass();
        xccVar.getClass();
        lg60Var.getClass();
        tbuVar.getClass();
        t0uVar.getClass();
        this.b = fqVar;
        this.c = l1uVar;
        this.d = v8uVar;
        this.e = k1uVar;
        this.f = spxVar;
        this.g = vcuVar;
        this.h = z;
        this.i = lztVar;
        this.j = xccVar;
        this.k = lg60Var;
        this.l = mneVar;
        this.m = tbuVar;
        this.n = t0uVar;
        yje yjeVar = null;
        this.o = vtb.d(0, null, null, 7);
        z(new il70(true));
        for (gxo gxoVar : gxo.values()) {
            x(gxoVar, this.d.a(gxoVar));
        }
        slb.U(new dnq(new fnq(qa60Var.a(), new hi70(2, this, ol70.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 5), (byte) 4), new ib60(this, yjeVar, (byte) 4), (byte) 1), jiu0.a(this));
    }

    public final void w(zy5 zy5Var) {
        sac.V(jiu0.a(this), ml70.f21975a, null, this.l.f22085a, new wk70(this, zy5Var, null, (byte) 2), 10);
    }

    public final void x(gxo gxoVar, double d) {
        sac.V(jiu0.a(this), new gk70(1, this, ol70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, null, new ui70(this, gxoVar, d, null, (byte) 1), 14);
    }

    public final void y(gxo gxoVar) {
        if (!this.f.a() || this.i.a()) {
            v8u v8uVar = this.d;
            double dA = v8uVar.a(gxoVar);
            l1u l1uVar = this.c;
            double dA2 = l1uVar.a();
            if (dA > this.e.a() || dA2 > dA) {
                boolean z = v8uVar.a(gxoVar) < l1uVar.a();
                z(new il70(true));
                z(new kl70(z));
                return;
            }
            boolean zA = this.g.a().a();
            this.k.a(v8uVar.a(gxoVar));
            if (this.h && zA) {
                w(py5.f27790a);
            } else if (this.m.f33685a.f26724a.z.d) {
                w(qy5.f29518a);
            } else {
                w(fy5.f10344a);
            }
        }
    }

    public final void z(ll70 ll70Var) {
        sac.V(jiu0.a(this), new wk60((byte) 20), null, null, new wk70(this, ll70Var, null, (byte) 4), 14);
    }
}
