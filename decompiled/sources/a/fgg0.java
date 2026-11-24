package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fgg0 implements ggg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9492a;
    public final agg0 b;

    public fgg0(String str, agg0 agg0Var) {
        str.getClass();
        this.f9492a = str;
        this.b = agg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgg0)) {
            return false;
        }
        fgg0 fgg0Var = (fgg0) obj;
        return Intrinsics.d(this.f9492a, fgg0Var.f9492a) && this.b == fgg0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9492a.hashCode() * 31);
    }

    public final String toString() {
        return "Number(number=" + this.f9492a + ", itemColorType=" + this.b + Separators.RPAREN;
    }
}
