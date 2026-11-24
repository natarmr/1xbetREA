package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class bnk implements Executor {
    public static volatile bnk b;
    public static final bnk c = new bnk(1);
    public static final /* synthetic */ bnk d = new bnk(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2887a;

    public /* synthetic */ bnk(byte b2) {
        this.f2887a = b2;
    }

    public static bnk a() {
        if (b != null) {
            return b;
        }
        synchronized (bnk.class) {
            try {
                if (b == null) {
                    b = new bnk((byte) 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2887a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
