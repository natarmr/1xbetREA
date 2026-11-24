package a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g050 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10442a = new AtomicReference(null);
    public final k050 b = new k050();

    public static Object a(g050 g050Var, Function1 function1, bnn0 bnn0Var) {
        c050 c050Var = c050.f3507a;
        g050Var.getClass();
        return d5c.J(bnn0Var, new lpp(c050Var, g050Var, function1, null, (byte) 4));
    }

    public final void b(e050 e050Var) {
        while (true) {
            AtomicReference atomicReference = this.f10442a;
            e050 e050Var2 = (e050) atomicReference.get();
            if (e050Var2 != null && e050Var.f6973a.compareTo(e050Var2.f6973a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(e050Var2, e050Var)) {
                    if (e050Var2 != null) {
                        e050Var2.b.cancel(new tkq("Mutation interrupted", (byte) 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == e050Var2);
        }
    }
}
