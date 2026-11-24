package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class k03 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17444a;
    public final Handler b;

    public k03(byte b) {
        this.f17444a = b;
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
        byte b = this.f17444a;
        Handler handler = this.b;
        switch (b) {
            case 0:
                handler.post(runnable);
                break;
            case 1:
                handler.post(runnable);
                break;
            case 2:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    udk.c(handler);
                    break;
                }
                break;
            case 3:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    udk.c(handler);
                    break;
                }
                break;
            default:
                handler.post(runnable);
                break;
        }
    }

    public /* synthetic */ k03(Handler handler, byte b) {
        this.f17444a = b;
        this.b = handler;
    }

    public k03(Handler handler) {
        this.f17444a = (byte) 3;
        handler.getClass();
        this.b = handler;
    }
}
