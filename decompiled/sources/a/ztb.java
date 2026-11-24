package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ztb {
    public static final ytb b = new ytb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44949a;

    public /* synthetic */ ztb(Object obj) {
        this.f44949a = obj;
    }

    public static final Throwable a(Object obj) {
        xtb xtbVar = obj instanceof xtb ? (xtb) obj : null;
        if (xtbVar != null) {
            return xtbVar.f41457a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof ytb) {
            return null;
        }
        return obj;
    }

    public static final void c(Object obj) {
        if (obj instanceof ytb) {
            if (!(obj instanceof xtb)) {
                jf4.n("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                return;
            }
            Throwable th = ((xtb) obj).f41457a;
            if (th != null) {
                throw th;
            }
            jf4.n("Trying to call 'getOrThrow' on a channel closed without a cause");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ztb) {
            return Intrinsics.d(this.f44949a, ((ztb) obj).f44949a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f44949a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f44949a;
        if (obj instanceof xtb) {
            return ((xtb) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
