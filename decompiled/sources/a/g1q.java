package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10527a;
    public final int b;
    public final String c;

    public g1q(String str, int i, boolean z) {
        str.getClass();
        this.f10527a = z;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1q)) {
            return false;
        }
        g1q g1qVar = (g1q) obj;
        return this.f10527a == g1qVar.f10527a && this.b == g1qVar.b && Intrinsics.d(this.c, g1qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f10527a) * 31, 31);
    }

    public final String toString() {
        return axq.n(ohs0.t(this.b, "Country(isRequired=", ", id=", ", name=", this.f10527a), this.c, Separators.RPAREN);
    }
}
