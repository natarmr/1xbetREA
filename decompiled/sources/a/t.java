package a;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f33092a;

    public t(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f33092a = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
