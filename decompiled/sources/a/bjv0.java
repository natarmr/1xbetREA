package a;

/* JADX INFO: loaded from: classes.dex */
public final class bjv0 extends ajv0 {
    @Override // a.ajv0, a.ycm0
    public final int q() {
        return this.f996a.getSystemBarsBehavior();
    }

    @Override // a.ajv0, a.ycm0
    public final boolean t() {
        return (this.f996a.getSystemBarsAppearance() & 16) != 0;
    }

    @Override // a.ajv0, a.ycm0
    public final boolean u() {
        return (this.f996a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // a.ajv0, a.ycm0
    public final void v(boolean z) {
        this.f996a.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // a.ajv0, a.ycm0
    public final void w(boolean z) {
        this.f996a.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // a.ajv0, a.ycm0
    public final void x(int i) {
        this.f996a.setSystemBarsBehavior(i);
    }
}
