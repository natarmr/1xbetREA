package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mt30 implements nt30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22352a;
    public final boolean b;

    public mt30(int i, boolean z) {
        this.f22352a = i;
        this.b = z;
    }

    @Override // a.nt30
    public final boolean a() {
        return this.b;
    }

    @Override // a.nt30
    public final int b() {
        return this.f22352a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt30)) {
            return false;
        }
        mt30 mt30Var = (mt30) obj;
        return this.f22352a == mt30Var.f22352a && this.b == mt30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f22352a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f22352a, "Usual(imageRes=", ", isRotated=", Separators.RPAREN, this.b);
    }
}
