package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public interface ks40 extends CoroutineContext.Element {
    float d();

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.f getKey() {
        return ujn.u;
    }
}
