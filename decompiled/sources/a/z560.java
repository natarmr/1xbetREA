package a;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class z560 extends kotlin.coroutines.a implements bby {
    public static final z560 b = new z560(gqw0.o1);

    @Override // a.bby
    public final fac attachChild(jac jacVar) {
        return a660.f303a;
    }

    @Override // a.bby
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // a.bby
    public final Sequence getChildren() {
        return wun.f39799a;
    }

    @Override // a.bby
    public final h1i0 getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // a.bby
    public final nwk invokeOnCompletion(Function1 function1) {
        return a660.f303a;
    }

    @Override // a.bby
    public final boolean isActive() {
        return true;
    }

    @Override // a.bby
    public final boolean isCancelled() {
        return false;
    }

    @Override // a.bby
    public final boolean isCompleted() {
        throw null;
    }

    @Override // a.bby
    public final Object join(yje yjeVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // a.bby
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // a.bby
    public final nwk invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return a660.f303a;
    }

    @Override // a.bby, a.htb
    public final void cancel(CancellationException cancellationException) {
    }
}
