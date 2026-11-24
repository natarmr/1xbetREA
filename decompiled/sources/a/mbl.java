package a;

/* JADX INFO: loaded from: classes.dex */
public final class mbl implements n5d0, z7z {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile n5d0 f21515a;
    public volatile Object b = c;

    public mbl(n5d0 n5d0Var) {
        this.f21515a = n5d0Var;
    }

    public static z7z a(n5d0 n5d0Var) {
        if (n5d0Var instanceof z7z) {
            return (z7z) n5d0Var;
        }
        n5d0Var.getClass();
        return new mbl(n5d0Var);
    }

    public static n5d0 b(n5d0 n5d0Var) {
        n5d0Var.getClass();
        return n5d0Var instanceof mbl ? n5d0Var : new mbl(n5d0Var);
    }

    @Override // a.o5d0
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.f21515a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.f21515a = null;
            }
        }
        return obj;
    }
}
