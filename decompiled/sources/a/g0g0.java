package a;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g0g0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f10458a;

    public g0g0(Throwable th) {
        th.getClass();
        this.f10458a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0g0) {
            return Intrinsics.d(this.f10458a, ((g0g0) obj).f10458a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10458a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10458a + ')';
    }
}
