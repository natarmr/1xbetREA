package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yv8 implements zv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43308a;
    public final cv8 b;

    public yv8(String str, cv8 cv8Var) {
        xv8 xv8Var = xv8.f41546a;
        this.f43308a = str;
        this.b = cv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv8)) {
            return false;
        }
        yv8 yv8Var = (yv8) obj;
        if (!this.f43308a.equals(yv8Var.f43308a) || !this.b.equals(yv8Var.b)) {
            return false;
        }
        xv8 xv8Var = xv8.f41546a;
        return true;
    }

    @Override // a.zv8
    public final String getId() {
        return this.f43308a;
    }

    public final int hashCode() {
        return xv8.f41546a.hashCode() + ((this.b.hashCode() + (this.f43308a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shimmer(id=" + this.f43308a + ", position=" + this.b + ", type=" + xv8.f41546a + Separators.RPAREN;
    }
}
