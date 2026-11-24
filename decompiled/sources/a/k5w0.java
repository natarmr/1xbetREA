package a;

/* JADX INFO: loaded from: classes2.dex */
public final class k5w0 implements m5w0 {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile m5w0 f17740a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static k5w0 b(l5w0 l5w0Var) {
        if (l5w0Var instanceof k5w0) {
            return (k5w0) l5w0Var;
        }
        k5w0 k5w0Var = new k5w0();
        k5w0Var.b = c;
        k5w0Var.f17740a = l5w0Var;
        return k5w0Var;
    }

    @Override // a.m5w0
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.b;
                if (objA == obj2) {
                    objA = this.f17740a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.b = objA;
                    this.f17740a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
