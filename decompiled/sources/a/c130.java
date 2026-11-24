package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c130 implements g130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f07 f3555a;
    public final long b;

    public c130(f07 f07Var, long j) {
        this.f3555a = f07Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c130)) {
            return false;
        }
        c130 c130Var = (c130) obj;
        return this.f3555a == c130Var.f3555a && this.b == c130Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f3555a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoClick(infoButtonType=" + this.f3555a + ", marketGroupId=" + this.b + Separators.RPAREN;
    }
}
