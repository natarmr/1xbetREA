package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mk3 implements ok3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21924a;
    public final String b;
    public final String c;
    public final List d;
    public final ol3 e;

    public mk3(String str, String str2, String str3, List list, ol3 ol3Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.f21924a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = ol3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk3)) {
            return false;
        }
        mk3 mk3Var = (mk3) obj;
        return Intrinsics.d(this.f21924a, mk3Var.f21924a) && Intrinsics.d(this.b, mk3Var.b) && Intrinsics.d(this.c, mk3Var.c) && Intrinsics.d(this.d, mk3Var.d) && this.e.equals(mk3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(ua80.b(ua80.b(this.f21924a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FloatingButtonsAndTitleScreenStyle(titleBeforeUpdate=", this.f21924a, ", titleDuringUpdate=", this.b, ", description=");
        cs0.y(this.c, ", dropDownCardList=", ", appUpdateDownloadUiModel=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
