package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ic00 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gc00 f14514a;
    public boolean b;
    public int c;

    public ic00(gc00 gc00Var) {
        this.f14514a = gc00Var;
    }

    @Override // a.a1
    public final boolean b(p78 p78Var) {
        if (!(p78Var instanceof hd00)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.f14514a.g = false;
            this.b = false;
        }
        return true;
    }

    @Override // a.a1
    public final p78 d() {
        return this.f14514a;
    }

    @Override // a.a1
    public final boolean e() {
        return true;
    }

    @Override // a.a1
    public final iyc g(yxk yxkVar) {
        if (yxkVar.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return iyc.a(yxkVar.b);
    }
}
