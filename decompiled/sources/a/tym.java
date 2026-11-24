package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34762a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public tym(String str, String str2, String str3, boolean z, boolean z2) {
        brm0.B(str, str2, str3);
        this.f34762a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tym)) {
            return false;
        }
        tym tymVar = (tym) obj;
        return Intrinsics.d(this.f34762a, tymVar.f34762a) && Intrinsics.d(this.b, tymVar.b) && Intrinsics.d(this.c, tymVar.c) && this.d == tymVar.d && this.e == tymVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(ua80.b(this.f34762a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DsSportEventCardTennisScore(title=", this.f34762a, ", firstScore=", this.b, ", secondScore=");
        brm0.C(this.c, ", isFirstScoreChange=", ", isSecondScoreChange=", sbN, this.d);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
