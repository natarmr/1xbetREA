package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ivo0 implements Serializable {
    public static final ivo0 c = new ivo0("", 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15455a;
    public final double b;

    public ivo0(String str, double d) {
        str.getClass();
        this.f15455a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivo0)) {
            return false;
        }
        ivo0 ivo0Var = (ivo0) obj;
        return Intrinsics.d(this.f15455a, ivo0Var.f15455a) && Double.compare(this.b, ivo0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f15455a.hashCode() * 31);
    }

    public final String toString() {
        return "TaxInfoModel(name=" + this.f15455a + ", value=" + this.b + Separators.RPAREN;
    }
}
