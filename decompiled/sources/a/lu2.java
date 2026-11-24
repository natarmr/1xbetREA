package a;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class lu2 extends CancellationException {
    public lu2() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(zgc.e);
        return this;
    }
}
