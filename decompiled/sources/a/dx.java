package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6823a;
    public final String b;
    public final String c;

    public dx(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f6823a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx)) {
            return false;
        }
        dx dxVar = (dx) obj;
        return Intrinsics.d(this.f6823a, dxVar.f6823a) && Intrinsics.d(this.b, dxVar.b) && Intrinsics.d(this.c, dxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f6823a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("AdditionalButtonsUiModel(periodTitle=", this.f6823a, ", sellTitle=", this.b, ", topUpTitle="), this.c, Separators.RPAREN);
    }
}
