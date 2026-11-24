package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2490a;

    public final boolean equals(Object obj) {
        if (obj instanceof bf80) {
            return Intrinsics.d(this.f2490a, ((bf80) obj).f2490a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2490a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "OutputResult(result=" + this.f2490a + ')';
    }
}
