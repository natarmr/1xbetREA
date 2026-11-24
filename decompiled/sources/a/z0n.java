package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43576a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public z0n(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        brm0.B(str, str3, str4);
        this.f43576a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0n)) {
            return false;
        }
        z0n z0nVar = (z0n) obj;
        return Intrinsics.d(this.f43576a, z0nVar.f43576a) && this.b == z0nVar.b && this.c.equals(z0nVar.c) && Intrinsics.d(this.d, z0nVar.d) && Intrinsics.d(this.e, z0nVar.e) && this.f == z0nVar.f && this.g == z0nVar.g && this.h == z0nVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(twn.a(this.b, this.f43576a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V1(opponentLabel=", this.f43576a, ", redCardCounter=", ", gameScore=");
        f140.v(sbP, this.c, ", setScore=", this.d, ", resultScore=");
        brm0.C(this.e, ", resultScoreChanged=", ", gameScoreChanged=", sbP, this.f);
        return ohs0.p(", setScoreChanged=", Separators.RPAREN, sbP, this.g, this.h);
    }
}
