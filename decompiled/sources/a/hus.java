package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mlr f13696a;
    public final int b;
    public final String c;

    public hus(mlr mlrVar, int i, String str) {
        this.f13696a = mlrVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hus)) {
            return false;
        }
        hus husVar = (hus) obj;
        return this.f13696a.equals(husVar.f13696a) && this.b == husVar.b && this.c.equals(husVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f13696a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameToOpen(game=");
        sb.append(this.f13696a);
        sb.append(", subCategoryId=");
        sb.append(this.b);
        sb.append(", gameMetricsUid=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
