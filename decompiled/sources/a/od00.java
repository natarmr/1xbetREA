package a;

/* JADX INFO: loaded from: classes2.dex */
public final class od00 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd00 f25054a = new hd00();
    public final int b;
    public boolean c;

    public od00(int i) {
        this.b = i;
    }

    @Override // a.a1
    public final boolean b(p78 p78Var) {
        if (!this.c) {
            return true;
        }
        p78 p78Var2 = (p78) ((b4e) this.f25054a.b);
        if (!(p78Var2 instanceof gc00)) {
            return true;
        }
        ((gc00) p78Var2).g = false;
        return true;
    }

    @Override // a.a1
    public final p78 d() {
        return this.f25054a;
    }

    @Override // a.a1
    public final boolean e() {
        return true;
    }

    @Override // a.a1
    public final iyc g(yxk yxkVar) {
        if (yxkVar.h) {
            if (((b4e) this.f25054a.c) == null) {
                return null;
            }
            p78 p78VarD = yxkVar.h().d();
            this.c = (p78VarD instanceof un80) || (p78VarD instanceof hd00);
            return iyc.a(yxkVar.e);
        }
        int i = yxkVar.g;
        int i2 = this.b;
        if (i >= i2) {
            return new iyc(-1, yxkVar.c + i2, false);
        }
        return null;
    }
}
