package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lo90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20381a;
    public final String b;
    public final int c;
    public final a4x d;
    public final boolean e;
    public final int f;
    public final int g;

    public lo90(String str, String str2, int i, a4x a4xVar, boolean z, int i2, int i3) {
        a4xVar.getClass();
        this.f20381a = str;
        this.b = str2;
        this.c = i;
        this.d = a4xVar;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo90)) {
            return false;
        }
        lo90 lo90Var = (lo90) obj;
        return this.f20381a.equals(lo90Var.f20381a) && this.b.equals(lo90Var.b) && this.c == lo90Var.c && Intrinsics.d(this.d, lo90Var.d) && this.e == lo90Var.e && this.f == lo90Var.f && this.g == lo90Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, brm0.e(cs0.b(this.d, brm0.e(twn.a(this.c, ua80.b(this.f20381a.hashCode() * 31, 31, this.b), 31), 31, true), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PickerBottomSheetDialogUiState(title=", this.f20381a, ", searchHint=", this.b, ", countryId=");
        sbN.append(this.c);
        sbN.append(", countryAllowed=true, content=");
        sbN.append(this.d);
        sbN.append(", hasRecommendItems=");
        ua80.q(this.f, ", firstRecommendIndex=", ", firstOtherIndex=", sbN, this.e);
        return rz4.j(this.g, Separators.RPAREN, sbN);
    }
}
