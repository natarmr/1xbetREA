package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xnm implements ynm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41176a;
    public final String b;
    public final String c;

    public xnm(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f41176a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnm)) {
            return false;
        }
        xnm xnmVar = (xnm) obj;
        return Intrinsics.d(this.f41176a, xnmVar.f41176a) && Intrinsics.d(this.b, xnmVar.b) && Intrinsics.d(this.c, xnmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f41176a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("V3(amountLabel=", this.f41176a, ", promotionLabel=", this.b, ", additionalInfoLabel="), this.c, Separators.RPAREN);
    }
}
