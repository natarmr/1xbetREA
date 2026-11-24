package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24a;
    public final long b;

    public a0g0(String str, long j) {
        str.getClass();
        this.f24a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0g0)) {
            return false;
        }
        a0g0 a0g0Var = (a0g0) obj;
        return Intrinsics.d(this.f24a, a0g0Var.f24a) && this.b == a0g0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f24a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "RestrictionModel(contentType=", this.f24a, ", lengthLimit=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
