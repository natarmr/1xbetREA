package a;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public interface bby extends CoroutineContext.Element {
    fac attachChild(jac jacVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    Sequence getChildren();

    h1i0 getOnJoin();

    nwk invokeOnCompletion(Function1 function1);

    nwk invokeOnCompletion(boolean z, boolean z2, Function1 function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(yje yjeVar);

    boolean start();
}
