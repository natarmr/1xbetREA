package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34908a;
    public final String b;
    public final String c;

    public u1n(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f34908a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1n)) {
            return false;
        }
        u1n u1nVar = (u1n) obj;
        return Intrinsics.d(this.f34908a, u1nVar.f34908a) && Intrinsics.d(this.b, u1nVar.b) && Intrinsics.d(this.c, u1nVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(ua80.b(ua80.b(this.f34908a.hashCode() * 31, 31, this.b), 31, this.c), 31, false);
    }

    public final String toString() {
        return axq.n(b1j.n("V3(title=", this.f34908a, ", firstScore=", this.b, ", secondScore="), this.c, ", isFirstScoreChange=false, isSecondScoreChange=false)");
    }
}
