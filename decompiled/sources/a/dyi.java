package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dyi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8i f6895a;
    public final n5d0 b;
    public final n5d0 c;
    public final n5d0 d;
    public final n5d0 e;
    public final n5d0 f;

    public dyi(qud qudVar, g8i g8iVar) {
        this.f6895a = g8iVar;
        byte b = 27;
        this.b = mbl.b(new psi(this, 1, b));
        this.c = n0k0.a(new psi(this, 0, b));
        this.d = n0k0.a(new psi(this, 2, b));
        this.e = n0k0.a(new psi(this, 3, b));
        this.f = n0k0.a(new psi(this, 4, b));
    }

    public final ali a() {
        g8i g8iVar = this.f6895a;
        btt0 btt0VarO8 = g8iVar.o8();
        x1x.x(btt0VarO8);
        yzi yziVar = (yzi) this.b.get();
        knf0 knf0VarJ8 = g8iVar.J8();
        x1x.x(knf0VarJ8);
        gii0 gii0VarJ9 = g8iVar.j9();
        x1x.x(gii0VarJ9);
        return new ali(btt0VarO8, yziVar, knf0VarJ8, gii0VarJ9);
    }
}
