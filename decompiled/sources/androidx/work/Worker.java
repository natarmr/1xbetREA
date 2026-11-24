package androidx.work;

import a.lmn0;
import a.mg00;
import a.og00;
import a.wu9;
import a.y0x0;
import a.y9v0;
import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "La/og00;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends og00 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // a.og00
    public final wu9 a() {
        Executor executor = this.b.c;
        executor.getClass();
        return y0x0.I(new lmn0(executor, new y9v0(this), (byte) 7));
    }

    public abstract mg00 c();
}
