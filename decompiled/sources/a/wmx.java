package a;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes2.dex */
public final class wmx extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srs0 f39423a;

    public wmx(srs0 srs0Var) {
        this.f39423a = srs0Var;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f39423a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
