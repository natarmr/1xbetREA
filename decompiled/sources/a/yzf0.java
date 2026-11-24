package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yzf0 extends zw5 {
    public yzf0(yje yjeVar) {
        super(yjeVar);
        if (yjeVar == null || yjeVar.getContext() == kotlin.coroutines.g.f46065a) {
            return;
        }
        jf4.o("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f46065a;
    }
}
