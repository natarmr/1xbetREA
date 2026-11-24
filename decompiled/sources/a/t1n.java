package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33174a;
    public final String b;

    public t1n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f33174a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1n)) {
            return false;
        }
        t1n t1nVar = (t1n) obj;
        return Intrinsics.d(this.f33174a, t1nVar.f33174a) && Intrinsics.d(this.b, t1nVar.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(ua80.b(this.f33174a.hashCode() * 31, 31, this.b), 31, false);
    }

    public final String toString() {
        return b1j.k("Default(firstScore=", this.f33174a, ", secondScore=", this.b, ", isFirstScoreChange=false, isSecondScoreChange=false)");
    }
}
