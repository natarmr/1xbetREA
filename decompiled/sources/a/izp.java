package a;

/* JADX INFO: loaded from: classes.dex */
public final class izp implements y1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y190 f15645a;
    public final yzp b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;
    public zae0 g;

    public izp(y190 y190Var, yzp yzpVar, String str, AutoCloseable autoCloseable) {
        this.f15645a = y190Var;
        this.b = yzpVar;
        this.c = str;
        this.d = autoCloseable;
    }

    @Override // a.y1x
    public final y190 Q0() {
        y190 y190Var;
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            y190Var = this.f15645a;
        }
        return y190Var;
    }

    @Override // a.y1x
    public final u99 V0() {
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            zae0 zae0Var = this.g;
            if (zae0Var != null) {
                return zae0Var;
            }
            zae0 zae0VarD = x9x.D(this.b.y(this.f15645a));
            this.g = zae0VarD;
            return zae0VarD;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.e) {
            this.f = true;
            zae0 zae0Var = this.g;
            if (zae0Var != null) {
                try {
                    zae0Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    try {
                        ohs0.y(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    ohs0.y(autoCloseable);
                }
            }
            throw th;
        }
    }

    @Override // a.y1x
    public final yzp getFileSystem() {
        return this.b;
    }

    @Override // a.y1x
    public final x1x getMetadata() {
        return null;
    }
}
