package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class di60 implements fi60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6125a;
    public final int b;
    public final int c;
    public final String d;

    public di60(int i, int i2, int i3, String str) {
        str.getClass();
        this.f6125a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di60)) {
            return false;
        }
        di60 di60Var = (di60) obj;
        return this.f6125a == di60Var.f6125a && this.b == di60Var.b && this.c == di60Var.c && Intrinsics.d(this.d, di60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f6125a) * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", screenName=", this.d, Separators.RPAREN, dw9.t("OnPageScrolled(tutorialId=", this.f6125a, ", index=", ", slidesCount=", this.b));
    }
}
