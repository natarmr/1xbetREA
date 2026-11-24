package kotlin.coroutines;

import a.bqd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static CoroutineContext.Element a(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        if (Intrinsics.d(element.getKey(), fVar)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext b(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        return Intrinsics.d(element.getKey(), fVar) ? g.f46065a : element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.f46065a ? element : (CoroutineContext) coroutineContext.fold(element, new bqd((byte) 6));
    }
}
