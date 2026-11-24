package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z7i0 implements a8i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43920a;

    public z7i0(String str) {
        str.getClass();
        this.f43920a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7i0) && Intrinsics.d(this.f43920a, ((z7i0) obj).f43920a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f43920a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f43920a, ", exitAfter=false)");
    }
}
