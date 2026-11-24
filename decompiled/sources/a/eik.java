package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class eik extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient CoroutineContext f7864a;

    public eik(CoroutineContext coroutineContext) {
        this.f7864a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f7864a);
    }
}
