package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dm90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6312a;
    public final int b;
    public final int c;
    public final String d;

    public dm90(int i, int i2, int i3, String str) {
        str.getClass();
        this.f6312a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm90)) {
            return false;
        }
        dm90 dm90Var = (dm90) obj;
        return this.f6312a == dm90Var.f6312a && this.b == dm90Var.b && this.c == dm90Var.c && Intrinsics.d(this.d, dm90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f6312a) * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", phoneMask=", this.d, Separators.RPAREN, dw9.t("PhoneMaskPart(id=", this.f6312a, ", phoneMaskMaxLength=", ", phoneMaskMinLength=", this.b));
    }
}
