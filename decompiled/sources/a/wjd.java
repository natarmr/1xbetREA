package a;

/* JADX INFO: loaded from: classes.dex */
public final class wjd implements clz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final glz f39257a = new glz(this, true);
    public lkz b;
    public lkz c;

    public wjd() {
        lkz lkzVar = lkz.b;
        this.b = lkzVar;
        this.c = lkzVar;
    }

    public final void a() {
        lkz lkzVar = this.b.ordinal() < this.c.ordinal() ? this.b : this.c;
        glz glzVar = this.f39257a;
        if (glzVar.i == lkz.b && lkzVar == lkz.f20223a) {
            return;
        }
        glzVar.g(lkzVar);
    }

    @Override // a.clz
    public final glz x() {
        return this.f39257a;
    }
}
