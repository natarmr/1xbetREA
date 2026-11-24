package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lt30 implements nt30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20611a;
    public final boolean b;

    public lt30(int i, boolean z) {
        this.f20611a = i;
        this.b = z;
    }

    @Override // a.nt30
    public final boolean a() {
        return this.b;
    }

    @Override // a.nt30
    public final int b() {
        return this.f20611a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt30)) {
            return false;
        }
        lt30 lt30Var = (lt30) obj;
        return this.f20611a == lt30Var.f20611a && this.b == lt30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f20611a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f20611a, "Small(imageRes=", ", isRotated=", Separators.RPAREN, this.b);
    }
}
