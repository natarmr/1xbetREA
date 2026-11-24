package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class joa0 implements loa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f16849a;
    public final j83 b;

    public joa0(j83 j83Var, j83 j83Var2) {
        this.f16849a = j83Var;
        this.b = j83Var2;
    }

    @Override // a.loa0
    public final j83 a() {
        return this.f16849a;
    }

    @Override // a.loa0
    public final j83 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joa0)) {
            return false;
        }
        joa0 joa0Var = (joa0) obj;
        return this.f16849a.equals(joa0Var.f16849a) && this.b.equals(joa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16849a.hashCode() * 31);
    }

    public final String toString() {
        return "WithoutTitle(teamOneScore=" + ((Object) this.f16849a) + ", teamTwoScore=" + ((Object) this.b) + Separators.RPAREN;
    }
}
