package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ywr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43386a;
    public final String b;
    public final String c;
    public final String d;

    public ywr0(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f43386a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywr0)) {
            return false;
        }
        ywr0 ywr0Var = (ywr0) obj;
        return Intrinsics.d(this.f43386a, ywr0Var.f43386a) && Intrinsics.d(this.b, ywr0Var.b) && Intrinsics.d(this.c, ywr0Var.c) && Intrinsics.d(this.d, ywr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f43386a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("TournamentBracketMatchCardHeaderUiModel(date=", this.f43386a, ", liveText=", this.b, ", finalText="), this.c, ", thirdPlaceText=", this.d, Separators.RPAREN);
    }
}
