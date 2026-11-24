package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vd90 implements ae90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f37221a;
    public final j83 b;

    public vd90(j83 j83Var, j83 j83Var2) {
        this.f37221a = j83Var;
        this.b = j83Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd90)) {
            return false;
        }
        vd90 vd90Var = (vd90) obj;
        return this.f37221a.equals(vd90Var.f37221a) && this.b.equals(vd90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37221a.hashCode() * 31);
    }

    public final String toString() {
        return "WithoutTitle(teamOneScore=" + ((Object) this.f37221a) + ", teamTwoScore=" + ((Object) this.b) + Separators.RPAREN;
    }
}
