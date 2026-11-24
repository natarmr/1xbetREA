package a;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class og00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25193a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public og00(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            jf4.o("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            jf4.o("WorkerParameters is null");
            throw null;
        }
        this.f25193a = context;
        this.b = workerParameters;
    }

    public abstract wu9 a();

    public wu9 b() {
        Executor executor = this.b.c;
        executor.getClass();
        return y0x0.I(new lmn0(executor, new jmv0(this, (byte) 4), (byte) 7));
    }
}
