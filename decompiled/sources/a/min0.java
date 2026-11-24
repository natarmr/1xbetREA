package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class min0 implements lin0, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f21853a = new Object();
    public final lin0 b;
    public volatile transient boolean c;
    public transient Object d;

    public min0(lin0 lin0Var) {
        lin0Var.getClass();
        this.b = lin0Var;
    }

    @Override // a.lin0
    public final Object get() {
        if (!this.c) {
            synchronized (this.f21853a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + Separators.GREATER_THAN;
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
