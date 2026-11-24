package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface qq40 extends CoroutineContext.Element {
    Object e(Function1 function1, yje yjeVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.f getKey() {
        return lwf.t;
    }
}
