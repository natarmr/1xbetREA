package a;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class e2e implements qpg0, i050 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qpg0 f7079a;
    public final i050 b;
    public CoroutineContext c;
    public Throwable d;

    public e2e(qpg0 qpg0Var) {
        k050 k050Var = new k050();
        qpg0Var.getClass();
        this.f7079a = qpg0Var;
        this.b = k050Var;
    }

    @Override // a.qpg0
    public final xpg0 Z0(String str) {
        str.getClass();
        return this.f7079a.Z0(str);
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
        this.f7079a.close();
    }

    @Override // a.i050
    public final Object d(yje yjeVar) {
        return this.b.d(yjeVar);
    }

    public final void e(StringBuilder sb) {
        if (this.c == null && this.d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
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

    public final String toString() {
        return this.f7079a.toString();
    }
}
