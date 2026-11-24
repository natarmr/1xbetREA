package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34386a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final uql f;

    public tql(String str, int i, String str2, String str3, String str4, uql uqlVar) {
        brm0.B(str2, str3, str4);
        this.f34386a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tql)) {
            return false;
        }
        tql tqlVar = (tql) obj;
        return Intrinsics.d(this.f34386a, tqlVar.f34386a) && this.b == tqlVar.b && Intrinsics.d(this.c, tqlVar.c) && Intrinsics.d(this.d, tqlVar.d) && Intrinsics.d(this.e, tqlVar.e) && this.f == tqlVar.f;
    }

    public final int hashCode() {
        String str = this.f34386a;
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "DsAggregatorTournamentProgressRatingModel(nextStepLabel=", this.f34386a, ", currentProgress=", ", startValue=");
        f140.v(sbP, this.c, ", maxValue=", this.d, ", point=");
        sbP.append(this.e);
        sbP.append(", type=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
