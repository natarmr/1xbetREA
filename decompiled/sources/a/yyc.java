package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class yyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f43459a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final boolean f;
    public final boolean g;

    public yyc(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, boolean z, boolean z2) {
        this.f43459a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = bigDecimal4;
        this.e = bigDecimal5;
        this.f = z;
        this.g = z2;
    }

    public static yyc a(yyc yycVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            bigDecimal2 = yycVar.b;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        BigDecimal bigDecimal4 = yycVar.c;
        BigDecimal bigDecimal5 = yycVar.d;
        BigDecimal bigDecimal6 = yycVar.e;
        if ((i & 32) != 0) {
            z = yycVar.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = yycVar.g;
        }
        bigDecimal.getClass();
        bigDecimal3.getClass();
        return new yyc(bigDecimal, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyc)) {
            return false;
        }
        yyc yycVar = (yyc) obj;
        return this.f43459a.equals(yycVar.f43459a) && this.b.equals(yycVar.b) && this.c.equals(yycVar.c) && this.d.equals(yycVar.d) && this.e.equals(yycVar.e) && this.f == yycVar.f && this.g == yycVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(axq.a(axq.a(axq.a(axq.a(this.f43459a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoefBetFieldParamsStateModel(currentValue=");
        sb.append(this.f43459a);
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
