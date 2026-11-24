package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pad implements sad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26650a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public pad(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f26650a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pad)) {
            return false;
        }
        pad padVar = (pad) obj;
        return Intrinsics.d(this.f26650a, padVar.f26650a) && Intrinsics.d(this.b, padVar.b) && this.c.equals(padVar.c) && this.d.equals(padVar.d) && this.e == padVar.e && this.f == padVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(ua80.b(ua80.b(this.f26650a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cricket(teamOneName=", this.f26650a, ", teamTwoName=", this.b, ", teamOneScore=");
        f140.v(sbN, this.c, ", teamTwoScore=", this.d, ", oneTeamScoreChange=");
        return ohs0.p(", twoTeamScoreChange=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
