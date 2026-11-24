package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17927a;
    public final double b;
    public final wbq c;
    public final eho d;
    public final boolean e;

    public k9q(String str, double d, wbq wbqVar, eho ehoVar, boolean z) {
        str.getClass();
        this.f17927a = str;
        this.b = d;
        this.c = wbqVar;
        this.d = ehoVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9q)) {
            return false;
        }
        k9q k9qVar = (k9q) obj;
        return Intrinsics.d(this.f17927a, k9qVar.f17927a) && Double.compare(this.b, k9qVar.b) == 0 && this.c == k9qVar.c && this.d == k9qVar.d && this.e == k9qVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + brm0.d(this.b, this.f17927a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinBetsFinanceEventUiModel(coefEventDescription=");
        sb.append(this.f17927a);
        sb.append(", coefficient=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", selectedType=");
        sb.append(this.d);
        return f140.n(sb, ", coefWithDivider=", this.e, Separators.RPAREN);
    }
}
