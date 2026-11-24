package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rm90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30734a;
    public final String b;

    public rm90(String str, String str2) {
        this.f30734a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm90)) {
            return false;
        }
        rm90 rm90Var = (rm90) obj;
        return this.f30734a.equals(rm90Var.f30734a) && this.b.equals(rm90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30734a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PhotoUiModel(photoPath=", this.f30734a, ", photoDescription=", this.b, Separators.RPAREN);
    }
}
