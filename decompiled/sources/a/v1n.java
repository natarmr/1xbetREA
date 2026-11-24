package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36641a;
    public final String b;
    public final String c;

    public v1n(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f36641a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1n)) {
            return false;
        }
        v1n v1nVar = (v1n) obj;
        return Intrinsics.d(this.f36641a, v1nVar.f36641a) && Intrinsics.d(this.b, v1nVar.b) && Intrinsics.d(this.c, v1nVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(ua80.b(ua80.b(this.f36641a.hashCode() * 31, 31, this.b), 31, this.c), 31, false);
    }

    public final String toString() {
        return axq.n(b1j.n("V4(title=", this.f36641a, ", firstScore=", this.b, ", secondScore="), this.c, ", isFirstScoreChange=false, isSecondScoreChange=false)");
    }
}
