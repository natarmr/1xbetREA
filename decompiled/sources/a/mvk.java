package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class mvk extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f22460a;

    public mvk(Throwable th, lne lneVar, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + lneVar + " threw an exception, context = " + coroutineContext, th);
        this.f22460a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f22460a;
    }
}
