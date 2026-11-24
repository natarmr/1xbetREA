package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j08 implements m08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz7 f15670a;
    public final hz7 b;
    public final boolean c;
    public final int d;

    public j08(rz7 rz7Var, hz7 hz7Var, boolean z, int i) {
        this.f15670a = rz7Var;
        this.b = hz7Var;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j08)) {
            return false;
        }
        j08 j08Var = (j08) obj;
        return this.f15670a.equals(j08Var.f15670a) && this.b.equals(j08Var.b) && this.c == j08Var.c && this.d == j08Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f15670a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Throw(images=" + this.f15670a + ", descriptions=" + this.b + ", changesTurn=" + this.c + ", throwNumber=" + this.d + Separators.RPAREN;
    }
}
