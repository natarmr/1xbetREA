package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class flg0 implements glg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9736a;
    public final png0 b;

    public flg0(String str, png0 png0Var) {
        str.getClass();
        this.f9736a = str;
        this.b = png0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flg0)) {
            return false;
        }
        flg0 flg0Var = (flg0) obj;
        return Intrinsics.d(this.f9736a, flg0Var.f9736a) && this.b == flg0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9736a.hashCode() * 31);
    }

    public final String toString() {
        return "TextRule(text=" + this.f9736a + ", textStyle=" + this.b + Separators.RPAREN;
    }
}
