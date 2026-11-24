package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fbm0 implements hbm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbm0 f9267a;
    public final cbm0 b;
    public final dbm0 c;

    public fbm0(dbm0 dbm0Var, cbm0 cbm0Var, dbm0 dbm0Var2) {
        this.f9267a = dbm0Var;
        this.b = cbm0Var;
        this.c = dbm0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbm0)) {
            return false;
        }
        fbm0 fbm0Var = (fbm0) obj;
        return this.f9267a.equals(fbm0Var.f9267a) && this.b.equals(fbm0Var.b) && this.c.equals(fbm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f9267a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BoundedImage(startContent=" + this.f9267a + ", middleContent=" + this.b + ", endContent=" + this.c + Separators.RPAREN;
    }
}
