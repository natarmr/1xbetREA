package a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class ccw0 extends hcw0 {
    public static final ccw0 b = new ccw0(jcw0.f16300a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f4132a;

    public ccw0(hcw0 hcw0Var) {
        this.f4132a = new AtomicReference(hcw0Var);
    }

    @Override // a.hcw0
    public final void a(String str, Level level, boolean z) {
        ((hcw0) this.f4132a.get()).a(str, level, z);
    }

    @Override // a.hcw0
    public final rcw0 b() {
        return ((hcw0) this.f4132a.get()).b();
    }

    @Override // a.hcw0
    public final wgm0 c() {
        return ((hcw0) this.f4132a.get()).c();
    }
}
