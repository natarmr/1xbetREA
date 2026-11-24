package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14007a;
    public final String b;

    public i1n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f14007a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1n)) {
            return false;
        }
        i1n i1nVar = (i1n) obj;
        return Intrinsics.d(this.f14007a, i1nVar.f14007a) && Intrinsics.d(this.b, i1nVar.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(ua80.b(this.f14007a.hashCode() * 29791, 31, this.b), 31, false), 31, false);
    }

    public final String toString() {
        return b1j.k("V1(opponentLabel=", this.f14007a, ", gameScore=, setScore=, resultScore=", this.b, ", resultScoreChanged=false, gameScoreChanged=false, setScoreChanged=false)");
    }
}
