package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rgk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30442a;
    public final int b;

    public rgk0(String str, int i) {
        str.getClass();
        this.f30442a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgk0)) {
            return false;
        }
        rgk0 rgk0Var = (rgk0) obj;
        return Intrinsics.d(this.f30442a, rgk0Var.f30442a) && this.b == rgk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f30442a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Data(host=", this.f30442a, ", port=", Separators.RPAREN);
    }
}
