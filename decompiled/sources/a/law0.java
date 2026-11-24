package a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class law0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19727a = 1;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public law0(fuj0 fuj0Var, BasePendingResult basePendingResult) {
        this.b = basePendingResult;
        Objects.requireNonNull(fuj0Var);
        this.c = fuj0Var;
    }

    public final void a(Status status) {
        m0g0 m0g0Var;
        switch (this.f19727a) {
            case 0:
                if (!status.m()) {
                    ((TaskCompletionSource) this.c).setException(status.c != null ? new lsf0(status) : new qa3(status));
                    return;
                }
                BasePendingResult basePendingResult = this.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                s0x.J("Result has already been consumed.", !basePendingResult.g);
                try {
                    if (!basePendingResult.b.await(0L, timeUnit)) {
                        basePendingResult.c(Status.h);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.c(Status.f);
                }
                s0x.J("Result is not ready.", basePendingResult.d());
                synchronized (basePendingResult.f45487a) {
                    s0x.J("Result has already been consumed.", !basePendingResult.g);
                    s0x.J("Result is not ready.", basePendingResult.d());
                    m0g0Var = basePendingResult.e;
                    basePendingResult.e = null;
                    basePendingResult.g = true;
                    break;
                }
                if (basePendingResult.d.getAndSet(null) != null) {
                    hny.b();
                    return;
                } else {
                    s0x.H(m0g0Var);
                    ((TaskCompletionSource) this.c).setResult(null);
                    return;
                }
            default:
                ((Map) ((fuj0) this.c).f10166a).remove(this.b);
                return;
        }
    }

    public law0(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, svs0 svs0Var) {
        this.b = basePendingResult;
        this.c = taskCompletionSource;
    }
}
