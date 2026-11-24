package a;

/* JADX INFO: loaded from: classes3.dex */
public final class iyi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8i f15590a;
    public final tnc0 b;
    public final wsf0 c;
    public final s470 d;
    public final rkc0 e;
    public final fhj f;
    public final iyi g = this;
    public final n5d0 h;
    public final n5d0 i;
    public final psi j;

    public iyi(y2m0 y2m0Var, g8i g8iVar, wsf0 wsf0Var, s470 s470Var, rkc0 rkc0Var, tnc0 tnc0Var, fhj fhjVar) {
        this.f15590a = g8iVar;
        this.b = tnc0Var;
        this.c = wsf0Var;
        this.d = s470Var;
        this.e = rkc0Var;
        this.f = fhjVar;
        byte b = 29;
        this.h = n0k0.a(new psi(this, 0, b));
        this.i = mbl.b(new psi(this, 2, b));
        this.j = new psi(this, 1, b);
    }

    public final h0q0 a() {
        qps0 qps0Var = (qps0) this.i.get();
        g8i g8iVar = this.f15590a;
        gii0 gii0VarJ9 = g8iVar.j9();
        x1x.x(gii0VarJ9);
        g090 g090Var = new g090(gii0VarJ9, (byte) 27);
        btt0 btt0VarO8 = g8iVar.o8();
        x1x.x(btt0VarO8);
        knf0 knf0VarJ8 = g8iVar.J8();
        x1x.x(knf0VarJ8);
        qps0Var.getClass();
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = qps0Var;
        h0q0Var.b = g090Var;
        h0q0Var.c = btt0VarO8;
        h0q0Var.d = knf0VarJ8;
        return h0q0Var;
    }
}
