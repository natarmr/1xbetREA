package a;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class f2e implements qpg0, i050 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qpg0 f8807a;
    public final k050 b;
    public CoroutineContext c;
    public Throwable d;
    public final kd30 e;

    public f2e(qpg0 qpg0Var) {
        kd30 kd30Var;
        k050 k050Var = new k050();
        this.f8807a = qpg0Var;
        this.b = k050Var;
        if (vw90.f38139a != tw90.b) {
            kd30Var = new kd30();
            kd30Var.f18086a = qpg0Var;
            kd30Var.b = new p06(25, (byte) 0);
        } else {
            kd30Var = null;
        }
        this.e = kd30Var;
    }

    @Override // a.qpg0
    public final boolean P0() {
        return this.f8807a.P0();
    }

    @Override // a.qpg0
    public final xpg0 Z0(String str) {
        str.getClass();
        kd30 kd30Var = this.e;
        if (kd30Var == null) {
            return this.f8807a.Z0(str);
        }
        p06 p06Var = (p06) kd30Var.b;
        xpg0 xpg0VarZ0 = (xpg0) p06Var.c(str);
        if (xpg0VarZ0 == null) {
            xpg0VarZ0 = ((qpg0) kd30Var.f18086a).Z0(str);
            p06Var.d(str, xpg0VarZ0);
        }
        return new o06(xpg0VarZ0);
    }

    @Override // a.i050
    public final boolean a() {
        return this.b.a();
    }

    @Override // a.i050
    public final void c(Object obj) {
        this.b.c(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        kd30 kd30Var = this.e;
        if (kd30Var != null) {
            ((p06) kd30Var.b).f(-1);
        }
        this.f8807a.close();
    }

    @Override // a.i050
    public final Object d(yje yjeVar) {
        return this.b.d(yjeVar);
    }

    public final void e(StringBuilder sb) {
        int i;
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            CoroutineContext coroutineContext = this.c;
            if (coroutineContext != null) {
                sb.append("\t\tCoroutine: " + coroutineContext);
                sb.append('\n');
            }
            Throwable th = this.d;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = CollectionsKt.O(StringsKt.Z(tjo.b(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        kd30 kd30Var = this.e;
        if (kd30Var != null) {
            p06 p06Var = (p06) kd30Var.b;
            synchronized (p06Var.c) {
                i = p06Var.d;
            }
            sb.append("\t\tPrepared Statement Cache Size: " + i);
            sb.append('\n');
        }
    }

    public final String toString() {
        return this.f8807a.toString();
    }
}
