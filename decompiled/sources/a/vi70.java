package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vi70 extends w46 {
    public final fq b;
    public final mne c;
    public final l1u d;
    public final v8u e;
    public final k1u f;
    public final spx g;
    public final lzt h;
    public final xcc i;
    public final lg60 j;
    public final t0u k;
    public final q99 l;

    public vi70(i1w0 i1w0Var, fq fqVar, mne mneVar, qa60 qa60Var, l1u l1uVar, v8u v8uVar, k1u k1uVar, spx spxVar, lzt lztVar, xcc xccVar, lg60 lg60Var, tbu tbuVar, t0u t0uVar) {
        i1w0Var.getClass();
        fqVar.getClass();
        qa60Var.getClass();
        l1uVar.getClass();
        v8uVar.getClass();
        k1uVar.getClass();
        spxVar.getClass();
        lztVar.getClass();
        xccVar.getClass();
        lg60Var.getClass();
        tbuVar.getClass();
        t0uVar.getClass();
        this.b = fqVar;
        this.c = mneVar;
        this.d = l1uVar;
        this.e = v8uVar;
        this.f = k1uVar;
        this.g = spxVar;
        this.h = lztVar;
        this.i = xccVar;
        this.j = lg60Var;
        this.k = t0uVar;
        int i = 0;
        yje yjeVar = null;
        this.l = vtb.d(0, null, null, 7);
        x(new pi70(true));
        gxo[] gxoVarArrValues = gxo.values();
        int length = gxoVarArrValues.length;
        while (true) {
            byte b = 3;
            if (i >= length) {
                slb.U(new dnq(new fnq(qa60Var.a(), new hi70(2, this, vi70.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 1), (byte) 4), new ib60(this, yjeVar, b), (byte) 1), jiu0.a(this));
                return;
            }
            gxo gxoVar = gxoVarArrValues[i];
            qjj.W(jiu0.a(this), null, null, new ui70(this, gxoVar, this.e.a(gxoVar), null, (byte) 0), 3);
            i++;
        }
    }

    public final void w(gxo gxoVar) {
        if (!this.g.a() || this.h.a()) {
            v8u v8uVar = this.e;
            double dA = v8uVar.a(gxoVar);
            l1u l1uVar = this.d;
            double dA2 = l1uVar.a();
            if (dA <= this.f.a() && dA2 <= dA) {
                this.j.a(v8uVar.a(gxoVar));
                sac.V(jiu0.a(this), ti70.f33996a, null, this.c.f22085a, new ku60(this, fy5.f10344a, null, (byte) 23), 10);
            } else {
                boolean z = v8uVar.a(gxoVar) < l1uVar.a();
                x(new pi70(true));
                x(new ri70(z));
            }
        }
    }

    public final void x(si70 si70Var) {
        qjj.W(jiu0.a(this), null, null, new ku60(this, si70Var, null, (byte) 24), 3);
    }
}
