package a;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class haw0 implements Executor {
    public static volatile haw0 b;
    public static Context c;
    public static final /* synthetic */ haw0 d = new haw0(2);
    public static final /* synthetic */ haw0 e = new haw0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12745a;

    public /* synthetic */ haw0(byte b2) {
        this.f12745a = b2;
    }

    public static haw0 a(Context context) {
        haw0 haw0Var;
        haw0 haw0Var2 = b;
        if (haw0Var2 != null) {
            return haw0Var2;
        }
        synchronized (haw0.class) {
            try {
                haw0Var = b;
                if (haw0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    s0x.H(applicationContext);
                    c = applicationContext;
                    haw0Var = new haw0((byte) 0);
                    b = haw0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return haw0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12745a) {
            case 0:
                gaw0.f10989a.post(runnable);
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
