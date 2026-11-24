package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 extends jd8 {
    @Override // a.jd8
    public final boolean a0(l2 l2Var, i2 i2Var, i2 i2Var2) {
        synchronized (l2Var) {
            try {
                if (l2Var.b != i2Var) {
                    return false;
                }
                l2Var.b = i2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.jd8
    public final boolean b0(r2 r2Var, Object obj, Object obj2) {
        synchronized (r2Var) {
            try {
                if (r2Var.f29706a != obj) {
                    return false;
                }
                r2Var.f29706a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.jd8
    public final boolean c0(r2 r2Var, q2 q2Var, q2 q2Var2) {
        synchronized (r2Var) {
            try {
                if (r2Var.c != q2Var) {
                    return false;
                }
                r2Var.c = q2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.jd8
    public final i2 d0(l2 l2Var) {
        i2 i2Var;
        i2 i2Var2 = i2.d;
        synchronized (l2Var) {
            try {
                i2Var = l2Var.b;
                if (i2Var != i2Var2) {
                    l2Var.b = i2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2Var;
    }

    @Override // a.jd8
    public final q2 e0(l2 l2Var) {
        q2 q2Var;
        q2 q2Var2 = q2.c;
        synchronized (l2Var) {
            try {
                q2Var = l2Var.c;
                if (q2Var != q2Var2) {
                    l2Var.c = q2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q2Var;
    }

    @Override // a.jd8
    public final void h0(q2 q2Var, q2 q2Var2) {
        q2Var.b = q2Var2;
    }

    @Override // a.jd8
    public final void i0(q2 q2Var, Thread thread) {
        q2Var.f27977a = thread;
    }
}
