package a;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class vox implements Executor {
    public static volatile vox c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37786a;
    public final Object b;

    public vox() {
        this.f37786a = (byte) 0;
        this.b = Executors.newFixedThreadPool(2, new cz9((byte) 2));
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (vox.class) {
            try {
                if (c == null) {
                    c = new vox();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.f37786a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                break;
            case 1:
                ((jaw0) obj).post(runnable);
                break;
            case 2:
                ((fpv0) obj).d.post(runnable);
                break;
            default:
                fxw0 fxw0Var = ((kxw0) ((b1x0) obj).b).g;
                kxw0.g(fxw0Var);
                fxw0Var.v1(runnable);
                break;
        }
    }

    public vox(Looper looper) {
        this.f37786a = (byte) 1;
        this.b = new jaw0(looper, (byte) 3);
    }

    public /* synthetic */ vox(Object obj, byte b) {
        this.f37786a = b;
        this.b = obj;
    }
}
