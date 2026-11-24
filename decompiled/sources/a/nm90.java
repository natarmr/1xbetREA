package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nm90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23760a;
    public final String b;

    public nm90(String str, String str2) {
        this.f23760a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm90)) {
            return false;
        }
        nm90 nm90Var = (nm90) obj;
        return this.f23760a.equals(nm90Var.f23760a) && this.b.equals(nm90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23760a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PhotoModel(photoPath=", this.f23760a, ", photoDescription=", this.b, Separators.RPAREN);
    }
}
