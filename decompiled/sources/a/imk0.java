package a;

/* JADX INFO: loaded from: classes.dex */
public final class imk0 implements y1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzp f15030a;
    public final x1x b;
    public final Object c = new Object();
    public boolean d;
    public final u99 e;

    public imk0(u99 u99Var, yzp yzpVar, x1x x1xVar) {
        this.f15030a = yzpVar;
        this.b = x1xVar;
        this.e = u99Var;
    }

    @Override // a.y1x
    public final y190 Q0() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // a.y1x
    public final u99 V0() {
        u99 u99Var;
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("closed");
                }
                u99Var = this.e;
                if (u99Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u99Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            u99 u99Var = this.e;
            if (u99Var != null) {
                try {
                    u99Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // a.y1x
    public final yzp getFileSystem() {
        return this.f15030a;
    }

    @Override // a.y1x
    public final x1x getMetadata() {
        return this.b;
    }
}
