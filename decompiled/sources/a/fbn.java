package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fbn implements s3e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f9268a;
    public final z3e b;

    public fbn(Function1 function1) {
        this.f9268a = function1;
        z3e z3eVar = new z3e(null);
        function1.invoke(z3eVar);
        this.b = z3eVar;
    }

    @Override // a.s3e
    public final void b(f7m0 f7m0Var, List list) throws ch9 {
        this.b.a(f7m0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbn)) {
            return false;
        }
        return this.b.equals(((fbn) obj).b);
    }

    public final int hashCode() {
        return this.b.f5398a.hashCode();
    }
}
