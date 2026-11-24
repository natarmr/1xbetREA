package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wnm implements ynm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39457a;
    public final String b;
    public final String c;

    public wnm(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f39457a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnm)) {
            return false;
        }
        wnm wnmVar = (wnm) obj;
        return Intrinsics.d(this.f39457a, wnmVar.f39457a) && Intrinsics.d(this.b, wnmVar.b) && Intrinsics.d(this.c, wnmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f39457a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("V1(amountLabel=", this.f39457a, ", promotionLabel=", this.b, ", additionalInfoLabel="), this.c, Separators.RPAREN);
    }
}
