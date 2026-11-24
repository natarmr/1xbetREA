package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tv60 extends uv60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrv f34585a;
    public final rv60 b;

    public tv60(nrv nrvVar, rv60 rv60Var) {
        this.f34585a = nrvVar;
        this.b = rv60Var;
    }

    @Override // a.uv60
    public final String c() {
        return "160291";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv60)) {
            return false;
        }
        tv60 tv60Var = (tv60) obj;
        return this.f34585a.equals(tv60Var.f34585a) && this.b.equals(tv60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.f34585a.hashCode() * 31) + 1454178367) * 31);
    }

    public final String toString() {
        return "SingleItem(headerModel=" + this.f34585a + ", categoryId=160291, uiModelWrapper=" + this.b + Separators.RPAREN;
    }
}
