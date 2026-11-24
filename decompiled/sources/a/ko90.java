package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ko90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18621a;
    public final String b;
    public final String c;
    public final a4x d;

    public ko90(int i, a4x a4xVar, String str, String str2) {
        a4xVar.getClass();
        this.f18621a = i;
        this.b = str;
        this.c = str2;
        this.d = a4xVar;
    }

    public static ko90 a(ko90 ko90Var, int i, String str, String str2, a4x a4xVar, int i2) {
        if ((i2 & 1) != 0) {
            i = ko90Var.f18621a;
        }
        if ((i2 & 2) != 0) {
            str = ko90Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = ko90Var.c;
        }
        ko90Var.getClass();
        if ((i2 & 16) != 0) {
            a4xVar = ko90Var.d;
        }
        ko90Var.getClass();
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        return new ko90(i, a4xVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko90)) {
            return false;
        }
        ko90 ko90Var = (ko90) obj;
        return this.f18621a == ko90Var.f18621a && this.b.equals(ko90Var.b) && this.c.equals(ko90Var.c) && Intrinsics.d(this.d, ko90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(ua80.b(Integer.hashCode(this.f18621a) * 31, 31, this.b), 31, this.c), 31, true);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f18621a, "PickerBottomSheetDialogUiModel(countryId=", ", title=", this.b, ", searchHint=");
        sbR.append(this.c);
        sbR.append(", countryAllowed=true, content=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
