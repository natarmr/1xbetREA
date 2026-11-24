package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ru7 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f31112a;
    public final int b;
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

    public ru7(pu7 pu7Var, ctf0 ctf0Var, long j, String str, mum0 mum0Var, int i) {
        ctf0Var.getClass();
        str.getClass();
        this.f31112a = ctf0Var;
        int i2 = R.drawable.football;
        if (j != 1) {
            if (j == 2) {
                i2 = R.drawable.hockey;
            } else if (j == 3) {
                i2 = R.drawable.basketball;
            }
        }
        this.b = i2;
        this.c = maz.b(new y02(i, (byte) 1));
        this.d = maz.b(new y02(i, (byte) 2));
        n0o0 n0o0VarH = bkb.H(pu7Var.f27601a);
        this.e = n0o0VarH;
        this.f = bkb.H(pu7Var.b);
        this.g = bkb.H(Long.valueOf(pu7Var.c));
        this.h = bkb.H(pu7Var.d);
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new os5(this, (byte) 26));
        this.j = bkb.G(((fee) n0o0VarH.getValue()).d, new op7(this, mum0Var, (byte) 2));
        this.k = bkb.G(((fee) n0o0VarH.getValue()).d, new mz0(this, j, str, (byte) 8));
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new op7(this, str, (byte) 3));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        pu7 pu7Var = (pu7) obj;
        pu7Var.getClass();
        ((fee) this.e.getValue()).d(pu7Var.f27601a);
        ((fee) this.f.getValue()).d(pu7Var.b);
        ((fee) this.g.getValue()).d(Long.valueOf(pu7Var.c));
        ((fee) this.h.getValue()).d(pu7Var.d);
        return new qu7((imm) ((fee) this.i.getValue()).b(), this.b, (qwh0) ((fee) this.j.getValue()).b(), (le40) ((fee) this.k.getValue()).b(), (tn8) ((fee) this.l.getValue()).b());
    }
}
