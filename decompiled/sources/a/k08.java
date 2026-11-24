package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k08 implements m08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz7 f17451a;
    public final hz7 b;

    public k08(rz7 rz7Var, hz7 hz7Var) {
        this.f17451a = rz7Var;
        this.b = hz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k08)) {
            return false;
        }
        k08 k08Var = (k08) obj;
        return this.f17451a.equals(k08Var.f17451a) && this.b.equals(k08Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17451a.hashCode() * 31);
    }

    public final String toString() {
        return "Victory(images=" + this.f17451a + ", descriptions=" + this.b + Separators.RPAREN;
    }
}
