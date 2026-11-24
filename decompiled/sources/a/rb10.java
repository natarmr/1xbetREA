package a;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class rb10 extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30161a = 1;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb10(h04 h04Var, jmv jmvVar) {
        super(jmvVar);
        this.b = h04Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.f30161a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((sb10) this.b).d((ob10) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((sb10) this.b).d(new ob10(e));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.b = null;
                }
            default:
                h04 h04Var = (h04) this.b;
                AtomicBoolean atomicBoolean = h04Var.d;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    h04Var.a(obj);
                    return;
                } catch (InterruptedException e2) {
                    Log.w("AsyncTask", e2);
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    h04Var.a(null);
                    return;
                } catch (ExecutionException e3) {
                    e9d0.m("An error occurred while executing doInBackground()", e3.getCause());
                    return;
                } catch (Throwable th) {
                    e9d0.m("An error occurred while executing doInBackground()", th);
                    return;
                }
        }
    }

    public /* synthetic */ rb10(Callable callable) {
        super(callable);
    }
}
