package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h8r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12641a;
    public final String b;

    public h8r(String str, double d) {
        str.getClass();
        this.f12641a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8r)) {
            return false;
        }
        h8r h8rVar = (h8r) obj;
        return Double.compare(this.f12641a, h8rVar.f12641a) == 0 && Intrinsics.d(this.b, h8rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f12641a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("FreeValueConfigurationMinMaxModel(value=", this.f12641a, ", valueView=", this.b);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
