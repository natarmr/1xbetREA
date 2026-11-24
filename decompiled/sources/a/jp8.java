package a;

import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class jp8 implements lp8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16889a;
    public final String b;
    public final c2i0 c;
    public final c2i0 d;

    public jp8(String str, String str2, c2i0 c2i0Var, c2i0 c2i0Var2) {
        str.getClass();
        str2.getClass();
        this.f16889a = str;
        this.b = str2;
        this.c = c2i0Var;
        this.d = c2i0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jp8) {
            jp8 jp8Var = (jp8) obj;
            return Intrinsics.d(this.f16889a, jp8Var.f16889a) && Intrinsics.d(this.b, jp8Var.b) && this.c == jp8Var.c && this.d == jp8Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((hashCode() + ((hashCode() + twn.a(R.dimen.size_40, twn.a(0, twn.a(0, twn.a(R.style.DSButton_Large_Primary, twn.a(R.style.DSButton_Large_Secondary, ua80.b(this.f16889a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ButtonsTwo(firstButtonText=", this.f16889a, ", secondButtonText=", this.b, ", firstButtonStyle=");
        axq.r(R.style.DSButton_Large_Secondary, R.style.DSButton_Large_Primary, ", secondButtonStyle=", ", firstButtonIcon=0, secondButtonIcon=0, buttonHeightDimenResId=", sbN);
        sbN.append(R.dimen.size_40);
        sbN.append(", firstButtonClickListener=");
        sbN.append(this.c);
        sbN.append(", secondButtonClickListener=");
        sbN.append(this.d);
        sbN.append(", horizontalOrientation=true)");
        return sbN.toString();
    }
}
