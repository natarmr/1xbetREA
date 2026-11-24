package a;

/* JADX INFO: loaded from: classes.dex */
public final class wzg0 implements zkz, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40019a;
    public final vzg0 b;
    public boolean c;

    public wzg0(String str, vzg0 vzg0Var) {
        this.f40019a = str;
        this.b = vzg0Var;
    }

    public final void a(kd30 kd30Var, glz glzVar) {
        kd30Var.getClass();
        glzVar.getClass();
        if (this.c) {
            jf4.n("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        glzVar.a(this);
        kd30Var.S(this.f40019a, (ufd) this.b.b.e);
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        if (kkzVar == kkz.ON_DESTROY) {
            this.c = false;
            clzVar.x().f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
