package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lbl implements m5d0 {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile m5d0 f19759a;
    public volatile Object b;

    public static m5d0 a(m5d0 m5d0Var) {
        if (m5d0Var instanceof lbl) {
            return m5d0Var;
        }
        lbl lblVar = new lbl();
        lblVar.b = c;
        lblVar.f19759a = m5d0Var;
        return lblVar;
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
                obj = this.f19759a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.f19759a = null;
            }
        }
        return obj;
    }
}
