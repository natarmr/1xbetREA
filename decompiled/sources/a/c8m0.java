package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c8m0 implements b8m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a14 f3921a = new a14(0);

    public final boolean i(int i) {
        return (this.f3921a.get() & i) != 0;
    }

    public final void k(int i) {
        a14 a14Var;
        int i2;
        do {
            a14Var = this.f3921a;
            i2 = a14Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!a14Var.compareAndSet(i2, i2 | i));
    }
}
