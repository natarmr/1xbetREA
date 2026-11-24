package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yyh implements azh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43465a;
    public final y9q0 b;

    public yyh(float f, y9q0 y9q0Var) {
        y9q0Var.getClass();
        this.f43465a = f;
        this.b = y9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyh)) {
            return false;
        }
        yyh yyhVar = (yyh) obj;
        return ycl.b(this.f43465a, yyhVar.f43465a) && Intrinsics.d(this.b, yyhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f43465a) * 31);
    }

    public final String toString() {
        return "Custom(size=" + ycl.c(this.f43465a) + ", styleType=" + this.b + Separators.RPAREN;
    }
}
