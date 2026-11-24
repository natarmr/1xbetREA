package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mnl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22094a;
    public final String b;
    public final String c;
    public final String d;

    public mnl(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f22094a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnl)) {
            return false;
        }
        mnl mnlVar = (mnl) obj;
        return Intrinsics.d(this.f22094a, mnlVar.f22094a) && Intrinsics.d(this.b, mnlVar.b) && Intrinsics.d(this.c, mnlVar.c) && Intrinsics.d(this.d, mnlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f22094a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("DsAggregatorGiftCardsTimeSignaturesUiModel(days=", this.f22094a, ", hours=", this.b, ", minutes="), this.c, ", seconds=", this.d, Separators.RPAREN);
    }
}
