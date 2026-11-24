package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lk3 implements ok3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20178a;
    public final String b;
    public final List c;
    public final nl3 d;

    public lk3(String str, String str2, List list, nl3 nl3Var) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f20178a = str;
        this.b = str2;
        this.c = list;
        this.d = nl3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk3)) {
            return false;
        }
        lk3 lk3Var = (lk3) obj;
        return Intrinsics.d(this.f20178a, lk3Var.f20178a) && Intrinsics.d(this.b, lk3Var.b) && Intrinsics.d(this.c, lk3Var.c) && this.d.equals(lk3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(ua80.b(this.f20178a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BottomSheetScreenStyle(title=", this.f20178a, ", description=", this.b, ", dropDownCardList=");
        sbN.append(this.c);
        sbN.append(", appUpdateDownloadUiModel=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
