package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n0k0 implements n5d0 {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile n5d0 f22702a;
    public volatile Object b;

    public static n5d0 a(n5d0 n5d0Var) {
        if ((n5d0Var instanceof n0k0) || (n5d0Var instanceof mbl)) {
            return n5d0Var;
        }
        n0k0 n0k0Var = new n0k0();
        n0k0Var.b = c;
        n0k0Var.f22702a = n5d0Var;
        return n0k0Var;
    }

    @Override // a.o5d0
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        n5d0 n5d0Var = this.f22702a;
        if (n5d0Var == null) {
            return this.b;
        }
        Object obj2 = n5d0Var.get();
        this.b = obj2;
        this.f22702a = null;
        return obj2;
    }
}
