package a;

import android.gov.nist.core.Separators;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class bke extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yje<Object> f2743a;

    public bke(n5a n5aVar) {
        super(false);
        this.f2743a = n5aVar;
    }

    public final void onError(Throwable th) {
        th.getClass();
        if (compareAndSet(false, true)) {
            yje<Object> yjeVar = this.f2743a;
            e0g0 e0g0Var = j0g0.b;
            yjeVar.resumeWith(new g0g0(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            yje<Object> yjeVar = this.f2743a;
            e0g0 e0g0Var = j0g0.b;
            yjeVar.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return defpackage.c.d("ContinuationOutcomeReceiver(outcomeReceived = ", Separators.RPAREN, get());
    }
}
