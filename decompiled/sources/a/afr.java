package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public interface afr extends gmq {
    static /* synthetic */ gmq e(afr afrVar, CoroutineContext coroutineContext, int i, i99 i99Var, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f46065a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            i99Var = i99.f14377a;
        }
        return afrVar.b(coroutineContext, i, i99Var);
    }

    gmq b(CoroutineContext coroutineContext, int i, i99 i99Var);
}
