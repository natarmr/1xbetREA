package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xtb extends ytb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f41457a;

    public xtb(Throwable th) {
        this.f41457a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xtb) {
            return Intrinsics.d(this.f41457a, ((xtb) obj).f41457a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f41457a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // a.ytb
    public final String toString() {
        return "Closed(" + this.f41457a + ')';
    }
}
