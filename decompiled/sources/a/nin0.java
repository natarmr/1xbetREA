package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nin0 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23599a = new Object();
    public volatile lin0 b;
    public Object c;

    public nin0(lin0 lin0Var) {
        lin0Var.getClass();
        this.b = lin0Var;
    }

    @Override // a.lin0
    public final Object get() {
        if (this.b != null) {
            synchronized (this.f23599a) {
                try {
                    if (this.b != null) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = null;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.c + Separators.GREATER_THAN;
        }
        sb.append(obj);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
