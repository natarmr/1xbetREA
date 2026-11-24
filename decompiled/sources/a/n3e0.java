package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n3e0 implements s3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22845a;
    public final e6e0 b;

    public n3e0(String str, e6e0 e6e0Var) {
        this.f22845a = str;
        this.b = e6e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3e0)) {
            return false;
        }
        n3e0 n3e0Var = (n3e0) obj;
        return this.f22845a.equals(n3e0Var.f22845a) && this.b == n3e0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22845a.hashCode() * 31);
    }

    public final String toString() {
        return "PositionCell(value=" + this.f22845a + ", ratingPositionChange=" + this.b + Separators.RPAREN;
    }
}
