package a;

/* JADX INFO: loaded from: classes2.dex */
public final class b8z implements p5d0 {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f2182a = c;
    public volatile p5d0 b;

    public b8z(p5d0 p5d0Var) {
        this.b = p5d0Var;
    }

    @Override // a.p5d0
    public final Object get() {
        Object obj;
        Object obj2 = this.f2182a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f2182a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.f2182a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
