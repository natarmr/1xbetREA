package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xz3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41736a;
    public final Handler b;

    public xz3(byte b) {
        this.f41736a = b;
        switch (b) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.f41736a;
        Handler handler = this.b;
        switch (b) {
            case 0:
                handler.post(runnable);
                break;
            case 1:
                handler.post(runnable);
                break;
            default:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    udk.c(handler);
                    break;
                }
                break;
        }
    }

    public xz3(Handler handler) {
        this.f41736a = (byte) 2;
        this.b = handler;
    }
}
