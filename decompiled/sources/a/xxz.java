package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xxz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41681a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public xxz(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8) {
        ohs0.z(str2, str4, str5, str6, str7);
        str8.getClass();
        this.f41681a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxz)) {
            return false;
        }
        xxz xxzVar = (xxz) obj;
        return this.f41681a.equals(xxzVar.f41681a) && Intrinsics.d(this.b, xxzVar.b) && this.c.equals(xxzVar.c) && Intrinsics.d(this.d, xxzVar.d) && this.e == xxzVar.e && Intrinsics.d(this.f, xxzVar.f) && Intrinsics.d(this.g, xxzVar.g) && Intrinsics.d(this.h, xxzVar.h) && Intrinsics.d(this.i, xxzVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(this.f41681a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LimitsKenyaBottomSheetUiState(initialLimitValue=", this.f41681a, ", limitValue=", this.b, ", pendingValue=");
        f140.v(sbN, this.c, ", currency=", this.d, ", isSaveButtonEnabled=");
        f140.s(", titleText=", this.f, ", descriptionText=", sbN, this.e);
        f140.v(sbN, this.g, ", currencyText=", this.h, ", saveChangesText=");
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
