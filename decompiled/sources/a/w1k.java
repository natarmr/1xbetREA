package a;

/* JADX INFO: loaded from: classes.dex */
public final class w1k implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n5d0 f38404a;

    public static void a(n5d0 n5d0Var, n5d0 n5d0Var2) {
        w1k w1kVar = (w1k) n5d0Var;
        n5d0Var2.getClass();
        if (w1kVar.f38404a == null) {
            w1kVar.f38404a = n5d0Var2;
        } else {
            v4i0.e();
        }
    }

    @Override // a.o5d0
    public final Object get() {
        n5d0 n5d0Var = this.f38404a;
        if (n5d0Var != null) {
            return n5d0Var.get();
        }
        v4i0.e();
        return null;
    }
}
