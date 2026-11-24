package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fj90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9628a;
    public final String b;
    public final String c;

    public fj90(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f9628a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj90)) {
            return false;
        }
        fj90 fj90Var = (fj90) obj;
        return this.f9628a == fj90Var.f9628a && Intrinsics.d(this.b, fj90Var.b) && Intrinsics.d(this.c, fj90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f9628a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f9628a, "PersonalDataRsUiModel(iconRes=", ", label=", this.b, ", value="), this.c, Separators.RPAREN);
    }
}
