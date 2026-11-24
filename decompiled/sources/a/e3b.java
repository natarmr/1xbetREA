package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class e3b {
    public static final d3b Companion = new d3b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7125a;
    public final Integer b;
    public final Double c;
    public final Double d;
    public final String e;
    public final Double f;
    public final Integer g;

    public /* synthetic */ e3b(int i, String str, Integer num, Double d, Double d2, String str2, Double d3, Integer num2) {
        if ((i & 1) == 0) {
            this.f7125a = null;
        } else {
            this.f7125a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3b)) {
            return false;
        }
        e3b e3bVar = (e3b) obj;
        return Intrinsics.d(this.f7125a, e3bVar.f7125a) && Intrinsics.d(this.b, e3bVar.b) && Intrinsics.d(this.c, e3bVar.c) && Intrinsics.d(this.d, e3bVar.d) && Intrinsics.d(this.e, e3bVar.e) && Intrinsics.d(this.f, e3bVar.f) && Intrinsics.d(this.g, e3bVar.g);
    }

    public final int hashCode() {
        String str = this.f7125a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f;
        int iHashCode6 = (iHashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num2 = this.g;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "CategoriesResponse(categoryNumber=", this.f7125a, ", guessed=", ", guessedInCurr=");
        vqd.w(sbP, this.c, ", payoutOn1CurrUnit=", this.d, ", percent=");
        sbP.append(this.e);
        sbP.append(", prizeFund=");
        sbP.append(this.f);
        sbP.append(", pointsSum=");
        return dw9.q(sbP, this.g, Separators.RPAREN);
    }
}
