package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g720 implements l720 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10793a;
    public final jg7 b;

    static {
        jg7 jg7Var = jg7.i;
    }

    public g720(String str, jg7 jg7Var) {
        str.getClass();
        jg7Var.getClass();
        this.f10793a = str;
        this.b = jg7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g720)) {
            return false;
        }
        g720 g720Var = (g720) obj;
        return Intrinsics.d(this.f10793a, g720Var.f10793a) && Intrinsics.d(this.b, g720Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10793a.hashCode() * 31);
    }

    public final String toString() {
        return "CoefDecrease(oldCoef=" + this.f10793a + ", headerData=" + this.b + Separators.RPAREN;
    }
}
