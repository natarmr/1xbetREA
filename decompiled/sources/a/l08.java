package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l08 implements m08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz7 f19186a;
    public final hz7 b;
    public final boolean c;
    public final int d;

    public l08(rz7 rz7Var, hz7 hz7Var, boolean z, int i) {
        this.f19186a = rz7Var;
        this.b = hz7Var;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l08)) {
            return false;
        }
        l08 l08Var = (l08) obj;
        return this.f19186a.equals(l08Var.f19186a) && this.b.equals(l08Var.b) && this.c == l08Var.c && this.d == l08Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f19186a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "WaitingNextThrow(images=" + this.f19186a + ", descriptions=" + this.b + ", changesTurn=" + this.c + ", throwNumber=" + this.d + Separators.RPAREN;
    }
}
