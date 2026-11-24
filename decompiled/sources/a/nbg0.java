package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nbg0 implements obg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f23238a;
    public final String b;

    public nbg0(ra10 ra10Var, String str) {
        this.f23238a = ra10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbg0)) {
            return false;
        }
        nbg0 nbg0Var = (nbg0) obj;
        return this.f23238a.equals(nbg0Var.f23238a) && this.b.equals(nbg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23238a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowError(lottieConfig=" + this.f23238a + ", errorMessage=" + this.b + Separators.RPAREN;
    }
}
