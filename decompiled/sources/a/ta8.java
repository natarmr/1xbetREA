package a;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ta8 extends a2 {
    public final Thread e;
    public final eeo f;

    public ta8(CoroutineContext coroutineContext, Thread thread, eeo eeoVar) {
        super(coroutineContext, true);
        this.e = thread;
        this.f = eeoVar;
    }

    @Override // a.pby
    public final void o(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (Intrinsics.d(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
