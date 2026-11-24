package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cbm0 implements ebm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4068a;
    public final String b;

    public cbm0(String str, String str2) {
        this.f4068a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbm0)) {
            return false;
        }
        cbm0 cbm0Var = (cbm0) obj;
        return this.f4068a.equals(cbm0Var.f4068a) && this.b.equals(cbm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4068a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("BoundedImage(image=", this.f4068a, ", title=", this.b, Separators.RPAREN);
    }
}
