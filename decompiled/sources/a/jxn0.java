package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jxn0 implements uxn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17316a;
    public final int b;

    public jxn0(String str, int i) {
        str.getClass();
        this.f17316a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxn0)) {
            return false;
        }
        jxn0 jxn0Var = (jxn0) obj;
        return Intrinsics.d(this.f17316a, jxn0Var.f17316a) && this.b == jxn0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f17316a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "ShowBetErrorWithCustomIcon(errorMessage=", this.f17316a, ", iconIdRes=", Separators.RPAREN);
    }
}
