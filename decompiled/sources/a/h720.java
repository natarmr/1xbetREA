package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h720 implements l720 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12556a;
    public final jg7 b;

    static {
        jg7 jg7Var = jg7.i;
    }

    public h720(String str, jg7 jg7Var) {
        str.getClass();
        jg7Var.getClass();
        this.f12556a = str;
        this.b = jg7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h720)) {
            return false;
        }
        h720 h720Var = (h720) obj;
        return Intrinsics.d(this.f12556a, h720Var.f12556a) && Intrinsics.d(this.b, h720Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12556a.hashCode() * 31);
    }

    public final String toString() {
        return "CoefIncrease(oldCoef=" + this.f12556a + ", headerData=" + this.b + Separators.RPAREN;
    }
}
