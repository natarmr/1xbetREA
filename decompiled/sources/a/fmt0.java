package a;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class fmt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aag0 f9803a;

    public fmt0(aag0 aag0Var) {
        aag0Var.getClass();
        this.f9803a = aag0Var;
    }

    public final void a(boolean z) {
        AtomicBoolean atomicBoolean = this.f9803a.f523a.f44017a;
        atomicBoolean.compareAndSet(atomicBoolean.get(), z);
    }
}
