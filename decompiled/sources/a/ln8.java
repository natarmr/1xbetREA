package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ln8 implements mn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20332a;
    public final boolean b;

    public ln8(String str, boolean z) {
        str.getClass();
        this.f20332a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln8)) {
            return false;
        }
        ln8 ln8Var = (ln8) obj;
        return Intrinsics.d(this.f20332a, ln8Var.f20332a) && this.b == ln8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f20332a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ClearButton(title=", this.f20332a, ", isEnable=", this.b, Separators.RPAREN);
    }
}
