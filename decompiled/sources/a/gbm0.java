package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gbm0 implements hbm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbm0 f11021a;
    public final dbm0 b;
    public final dbm0 c;
    public final String d;

    public gbm0(dbm0 dbm0Var, dbm0 dbm0Var2, dbm0 dbm0Var3, String str) {
        this.f11021a = dbm0Var;
        this.b = dbm0Var2;
        this.c = dbm0Var3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbm0)) {
            return false;
        }
        gbm0 gbm0Var = (gbm0) obj;
        return this.f11021a.equals(gbm0Var.f11021a) && this.b.equals(gbm0Var.b) && this.c.equals(gbm0Var.c) && this.d.equals(gbm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f11021a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Image(startContent=" + this.f11021a + ", middleContent=" + this.b + ", endContent=" + this.c + ", image=" + this.d + Separators.RPAREN;
    }
}
