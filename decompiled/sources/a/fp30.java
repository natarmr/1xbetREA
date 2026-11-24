package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fp30 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug20 f9910a;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;

    static {
        int i = c820.n;
    }

    public fp30(c820 c820Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        ctf0Var.getClass();
        int iOrdinal = c820Var.l.ordinal();
        byte b = 2;
        ug20 ug20Var = (iOrdinal == 1 || iOrdinal != 2) ? ug20.b : ug20.f35603a;
        this.f9910a = ug20Var;
        n0o0 n0o0VarH = bkb.H(c820Var.f3892a);
        this.b = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(c820Var.c);
        this.c = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(c820Var.b);
        this.d = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(c820Var.d);
        this.e = n0o0VarH4;
        n0o0 n0o0VarH5 = bkb.H(c820Var.e);
        this.f = n0o0VarH5;
        this.g = bkb.H(Boolean.valueOf(c820Var.i));
        n0o0 n0o0VarH6 = bkb.H(Boolean.valueOf(c820Var.g));
        this.h = n0o0VarH6;
        this.i = bkb.H(Boolean.valueOf(c820Var.k));
        this.j = maz.b(new yw9((fee) n0o0VarH6.getValue(), new v510(this, ctf0Var, (byte) 8), (byte) 20));
        this.k = maz.b(new yw9((fee) n0o0VarH.getValue(), new tr20((byte) 11), (byte) 20));
        this.l = maz.b(new yw9((fee) n0o0VarH3.getValue(), new k9v(ctf0Var, zvh0Var, this, (byte) 27), (byte) 20));
        this.m = maz.b(new yw9((fee) n0o0VarH2.getValue(), new dp30(ctf0Var, this, (byte) 0), (byte) 20));
        this.n = maz.b(new yw9((fee) n0o0VarH4.getValue(), new dp30(this, ctf0Var), (byte) 20));
        this.o = maz.b(new yw9((fee) n0o0VarH5.getValue(), new dp30(ctf0Var, this, b), (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        c820 c820Var = (c820) obj;
        c820Var.getClass();
        fee feeVar = (fee) this.b.getValue();
        feeVar.getClass();
        pz40 pz40VarA = feeVar.a();
        ((my6) feeVar.a().getValue()).getClass();
        pz40VarA.setValue(c820Var.f3892a);
        fee feeVar2 = (fee) this.c.getValue();
        feeVar2.getClass();
        pz40 pz40VarA2 = feeVar2.a();
        ((bn5) feeVar2.a().getValue()).getClass();
        pz40VarA2.setValue(c820Var.c);
        fee feeVar3 = (fee) this.d.getValue();
        feeVar3.getClass();
        pz40 pz40VarA3 = feeVar3.a();
        ((go7) feeVar3.a().getValue()).getClass();
        pz40VarA3.setValue(c820Var.b);
        fee feeVar4 = (fee) this.e.getValue();
        feeVar4.getClass();
        pz40 pz40VarA4 = feeVar4.a();
        ((svj0) feeVar4.a().getValue()).getClass();
        pz40VarA4.setValue(c820Var.d);
        fee feeVar5 = (fee) this.f.getValue();
        feeVar5.getClass();
        pz40 pz40VarA5 = feeVar5.a();
        pz40VarA5.setValue(c820Var.e);
        fee feeVar6 = (fee) this.g.getValue();
        feeVar6.getClass();
        pz40 pz40VarA6 = feeVar6.a();
        ((Boolean) feeVar6.a().getValue()).getClass();
        pz40VarA6.setValue(Boolean.valueOf(c820Var.i));
        fee feeVar7 = (fee) this.h.getValue();
        feeVar7.getClass();
        pz40 pz40VarA7 = feeVar7.a();
        ((Boolean) feeVar7.a().getValue()).getClass();
        pz40VarA7.setValue(Boolean.valueOf(c820Var.g));
        fee feeVar8 = (fee) this.i.getValue();
        feeVar8.getClass();
        pz40 pz40VarA8 = feeVar8.a();
        ((Boolean) feeVar8.a().getValue()).getClass();
        pz40VarA8.setValue(Boolean.valueOf(c820Var.k));
        return new d820(this.f9910a, null, new jp30(new q820((xy6) ((fee) this.k.getValue()).b()), (vwh0) ((fee) this.l.getValue()).b(), (ff6) ((fee) this.m.getValue()).b(), (awj0) ((fee) this.n.getValue()).b(), (a7c0) ((fee) this.o.getValue()).b(), null, (xw00) ((fee) this.j.getValue()).b(), 1.0f, null), null, 8);
    }
}
