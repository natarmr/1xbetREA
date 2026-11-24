package a;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class r7m0 extends f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f29984a = new AtomicReference(null);

    @Override // a.f5
    public final boolean a(e5 e5Var) {
        AtomicReference atomicReference = this.f29984a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(q7m0.f28258a);
        return true;
    }

    @Override // a.f5
    public final yje[] b(e5 e5Var) {
        this.f29984a.set(null);
        return xf0.f40767a;
    }
}
