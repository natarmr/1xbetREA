package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nli {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8i f23729a;
    public final tnc0 b;
    public final wsf0 c;
    public final rkc0 d;
    public final fhj e;
    public final nli f = this;
    public final n5d0 g;
    public final gji h;

    public nli(evz evzVar, g8i g8iVar, wsf0 wsf0Var, rkc0 rkc0Var, tnc0 tnc0Var, fhj fhjVar) {
        this.f23729a = g8iVar;
        this.b = tnc0Var;
        this.c = wsf0Var;
        this.d = rkc0Var;
        this.e = fhjVar;
        byte b = 7;
        this.g = n0k0.a(new gji(this, 0, b));
        this.h = new gji(this, 1, b);
    }

    public final nvu a() {
        g8i g8iVar = this.f23729a;
        gii0 gii0VarJ9 = g8iVar.j9();
        x1x.x(gii0VarJ9);
        zn00 zn00Var = new zn00(gii0VarJ9, (byte) 4);
        btt0 btt0VarO8 = g8iVar.o8();
        x1x.x(btt0VarO8);
        knf0 knf0VarJ8 = g8iVar.J8();
        x1x.x(knf0VarJ8);
        return new nvu(zn00Var, btt0VarO8, knf0VarJ8, (byte) 10);
    }
}
