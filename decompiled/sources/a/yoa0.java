package a;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class yoa0 extends CancellationException {
    public yoa0(long j) {
        super(axq.h(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(cwr0.i);
        return this;
    }
}
