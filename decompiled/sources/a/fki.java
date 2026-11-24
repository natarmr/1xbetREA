package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8i f9693a;
    public final tnc0 b;
    public final wsf0 c;
    public final rkc0 d;
    public final fhj e;
    public final fki f = this;
    public final n5d0 g;
    public final n5d0 h;
    public final n5d0 i;

    public fki(uuz uuzVar, g8i g8iVar, wsf0 wsf0Var, rkc0 rkc0Var, tnc0 tnc0Var, fhj fhjVar) {
        this.f9693a = g8iVar;
        this.b = tnc0Var;
        this.c = wsf0Var;
        this.d = rkc0Var;
        this.e = fhjVar;
        byte b = 18;
        this.g = n0k0.a(new rii(this, 0, b));
        this.h = mbl.b(new rii(this, 2, b));
        this.i = n0k0.a(new rii(this, 1, b));
    }

    public final dgu a() {
        g8i g8iVar = this.f9693a;
        gii0 gii0VarJ9 = g8iVar.j9();
        x1x.x(gii0VarJ9);
        j910 j910Var = new j910(gii0VarJ9, (byte) 0);
        i910 i910Var = (i910) this.h.get();
        btt0 btt0VarO8 = g8iVar.o8();
        x1x.x(btt0VarO8);
        knf0 knf0VarJ8 = g8iVar.J8();
        x1x.x(knf0VarJ8);
        return new dgu(j910Var, i910Var, btt0VarO8, knf0VarJ8);
    }
}
