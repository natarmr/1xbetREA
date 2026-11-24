package a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class i2 {
    public static final i2 d = new i2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f14025a;
    public final Executor b;
    public i2 c;

    public i2() {
        this.f14025a = null;
        this.b = null;
    }

    public i2(Runnable runnable, Executor executor) {
        this.f14025a = runnable;
        this.b = executor;
    }
}
