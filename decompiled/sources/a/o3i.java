package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o3i implements q3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24586a;
    public final String b;

    public o3i(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24586a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3i)) {
            return false;
        }
        o3i o3iVar = (o3i) obj;
        return Intrinsics.d(this.f24586a, o3iVar.f24586a) && Intrinsics.d(this.b, o3iVar.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(ua80.b(this.f24586a.hashCode() * 31, 31, this.b), 31, false);
    }

    public final String toString() {
        return b1j.k("Score(firstScore=", this.f24586a, ", secondScore=", this.b, ", isFirstScoreChange=false, isSecondScoreChange=false)");
    }
}
