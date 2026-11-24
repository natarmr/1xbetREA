package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class xyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f41701a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final boolean f;
    public final boolean g;

    public xyc(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, boolean z, boolean z2) {
        this.f41701a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = bigDecimal4;
        this.e = bigDecimal5;
        this.f = z;
        this.g = z2;
    }

    public static xyc a(xyc xycVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            bigDecimal2 = xycVar.b;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        BigDecimal bigDecimal4 = xycVar.c;
        BigDecimal bigDecimal5 = xycVar.d;
        BigDecimal bigDecimal6 = xycVar.e;
        if ((i & 32) != 0) {
            z = xycVar.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = xycVar.g;
        }
        bigDecimal.getClass();
        bigDecimal3.getClass();
        return new xyc(bigDecimal, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyc)) {
            return false;
        }
        xyc xycVar = (xyc) obj;
        return this.f41701a.equals(xycVar.f41701a) && this.b.equals(xycVar.b) && this.c.equals(xycVar.c) && this.d.equals(xycVar.d) && this.e.equals(xycVar.e) && this.f == xycVar.f && this.g == xycVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(axq.a(axq.a(axq.a(axq.a(this.f41701a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoefBetFieldParamsStateModel(currentValue=");
        sb.append(this.f41701a);
        sb.append(", initValue=");
        sb.append(this.b);
        sb.append(", stepValue=");
        sb.append(this.c);
        sb.append(", minValue=");
        sb.append(this.d);
        sb.append(", maxValue=");
        sb.append(this.e);
        sb.append(", maxHintIsVisible=");
        sb.append(this.f);
        sb.append(", minHintIsVisible=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
