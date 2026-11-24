package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s9t {
    public static final s9t h = new s9t(0.0d, e9t.e, 0.0d, 0.0d, iun.f15405a, 0.0d, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f31864a;
    public final e9t b;
    public final double c;
    public final double d;
    public final List e;
    public final double f;
    public final long g;

    public s9t(double d, e9t e9tVar, double d2, double d3, List list, double d4, long j) {
        e9tVar.getClass();
        list.getClass();
        this.f31864a = d;
        this.b = e9tVar;
        this.c = d2;
        this.d = d3;
        this.e = list;
        this.f = d4;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9t)) {
            return false;
        }
        s9t s9tVar = (s9t) obj;
        return Double.compare(this.f31864a, s9tVar.f31864a) == 0 && Intrinsics.d(this.b, s9tVar.b) && Double.compare(this.c, s9tVar.c) == 0 && Double.compare(this.d, s9tVar.d) == 0 && Intrinsics.d(this.e, s9tVar.e) && Double.compare(this.f, s9tVar.f) == 0 && this.g == s9tVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + brm0.d(this.f, dw9.a(brm0.d(this.d, brm0.d(this.c, (this.b.hashCode() + (Double.hashCode(this.f31864a) * 31)) * 31, 31), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesManiaPlayModel(coef=");
        sb.append(this.f31864a);
        sb.append(", jackPot=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", winSum=", ", betSum=");
        sb.append(this.d);
        sb.append(", result=");
        sb.append(this.e);
        ohs0.A(sb, this.f, ", balanceNew=", ", accountId=");
        return brm0.k(this.g, Separators.RPAREN, sb);
    }
}
