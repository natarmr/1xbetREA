package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lpd implements mnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20435a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public lpd(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        str4.getClass();
        str5.getClass();
        this.f20435a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpd)) {
            return false;
        }
        lpd lpdVar = (lpd) obj;
        return this.f20435a.equals(lpdVar.f20435a) && this.b.equals(lpdVar.b) && this.c.equals(lpdVar.c) && Intrinsics.d(this.d, lpdVar.d) && Intrinsics.d(this.e, lpdVar.e) && this.f == lpdVar.f && this.g == lpdVar.g && this.h == lpdVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(this.f20435a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CompressedCardSingleGameModel(tournamentStage=", this.f20435a, ", seriesScore=", this.b, ", matchFormat=");
        f140.v(sbN, this.c, ", vid=", this.d, ", matchName=");
        brm0.C(this.e, ", finished=", ", live=", sbN, this.f);
        return ohs0.p(", nonStarted=", Separators.RPAREN, sbN, this.g, this.h);
    }
}
