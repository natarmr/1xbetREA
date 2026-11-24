package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zmk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44630a;
    public final int b;
    public final float c;
    public final int d;
    public final int e;
    public final int f;

    public zmk0(String str, int i, float f, int i2, int i3, int i4) {
        str.getClass();
        this.f44630a = str;
        this.b = i;
        this.c = f;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final SpannableString a(Context context) {
        context.getClass();
        SpannableString spannableString = new SpannableString(this.f44630a);
        int i = this.d;
        if (i != -1) {
            int length = spannableString.length();
            TypedValue typedValue = j5d.f15927a;
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(i)), 0, length, 17);
        }
        int i2 = this.e;
        if (i2 != -1) {
            yyw.Z(spannableString, i2, 0, spannableString.length());
        }
        int i3 = this.b;
        if (i3 != -1) {
            spannableString.setSpan(new AbsoluteSizeSpan(i3), 0, spannableString.length(), 33);
        }
        float f = this.c;
        if (f != -1.0f) {
            spannableString.setSpan(new RelativeSizeSpan(f), 0, spannableString.length(), 33);
        }
        int i4 = this.f;
        if (i4 != -1) {
            int length2 = spannableString.length();
            TypedValue typedValue2 = j5d.f15927a;
            spannableString.setSpan(new ForegroundColorSpan(j5d.a(context, i4, false)), 0, length2, 33);
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(spannableString);
        spannableStringValueOf.getClass();
        return spannableStringValueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmk0)) {
            return false;
        }
        zmk0 zmk0Var = (zmk0) obj;
        return Intrinsics.d(this.f44630a, zmk0Var.f44630a) && this.b == zmk0Var.b && Float.compare(this.c, zmk0Var.c) == 0 && this.d == zmk0Var.d && this.e == zmk0Var.e && this.f == zmk0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, twn.a(this.d, defpackage.c.a(twn.a(this.b, this.f44630a.hashCode() * 31, 31), this.c, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "SpannableElement(text=", this.f44630a, ", textAbsoluteSize=", ", textRelativeSize=");
        sbP.append(this.c);
        sbP.append(", textColorRes=");
        sbP.append(this.d);
        sbP.append(", textStyle=");
        return w6x.o(this.e, this.f, ", textColorAttrRes=", Separators.RPAREN, sbP);
    }
}
