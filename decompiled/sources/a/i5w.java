package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i5w implements j5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14214a;
    public final String b;
    public final String c;

    public i5w(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f14214a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5w)) {
            return false;
        }
        i5w i5wVar = (i5w) obj;
        return Intrinsics.d(this.f14214a, i5wVar.f14214a) && this.b.equals(i5wVar.b) && Intrinsics.d(this.c, i5wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f14214a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowSuccessfulAlternativeSale(title=", this.f14214a, ", description=", this.b, ", betId="), this.c, Separators.RPAREN);
    }
}
