package a;

/* JADX INFO: loaded from: classes.dex */
public final class nbl implements o5d0 {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile o5d0 f23247a;
    public volatile Object b;

    public static o5d0 a(o5d0 o5d0Var) {
        if (o5d0Var instanceof nbl) {
            return o5d0Var;
        }
        nbl nblVar = new nbl();
        nblVar.b = c;
        nblVar.f23247a = o5d0Var;
        return nblVar;
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
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.f23247a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.f23247a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
