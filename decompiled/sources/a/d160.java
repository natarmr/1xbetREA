package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d160 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k460 f5296a;
    public final zrm b;
    public final String c;

    public d160(k460 k460Var, zrm zrmVar) {
        this.f5296a = k460Var;
        this.b = zrmVar;
        this.c = String.valueOf(k460Var.f17654a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d160)) {
            return false;
        }
        d160 d160Var = (d160) obj;
        return this.f5296a == d160Var.f5296a && this.b.equals(d160Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5296a.hashCode() * 31);
    }

    public final String toString() {
        return "NoTabsDashboardOrderUiItem(item=" + this.f5296a + ", cardStyle=" + this.b + Separators.RPAREN;
    }
}
