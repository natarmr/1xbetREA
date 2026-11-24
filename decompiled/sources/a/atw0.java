package a;

/* JADX INFO: loaded from: classes2.dex */
public final class atw0 {
    public static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1452a;
    public final xmw0 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ atw0(String str, Object obj, xmw0 xmw0Var) {
        this.f1452a = str;
        this.c = obj;
        this.b = xmw0Var;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (ltt0.c == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (svs0.e()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (atw0 atw0Var : btw0.f3204a) {
                        if (svs0.e()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objMo0zza = null;
                        try {
                            xmw0 xmw0Var = atw0Var.b;
                            if (xmw0Var != null) {
                                objMo0zza = xmw0Var.mo0zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            atw0Var.e = objMo0zza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                xmw0 xmw0Var2 = this.b;
                if (xmw0Var2 != null) {
                    try {
                        return xmw0Var2.mo0zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
