package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i08 implements m08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz7 f13937a;
    public final hz7 b;

    public i08(rz7 rz7Var, hz7 hz7Var) {
        this.f13937a = rz7Var;
        this.b = hz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i08)) {
            return false;
        }
        i08 i08Var = (i08) obj;
        return this.f13937a.equals(i08Var.f13937a) && this.b.equals(i08Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13937a.hashCode() * 31);
    }

    public final String toString() {
        return "Hidden(images=" + this.f13937a + ", descriptions=" + this.b + Separators.RPAREN;
    }
}
