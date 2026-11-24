package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14645a;
    public final String b;

    public iep0(String str, String str2) {
        this.f14645a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iep0)) {
            return false;
        }
        iep0 iep0Var = (iep0) obj;
        return this.f14645a.equals(iep0Var.f14645a) && this.b.equals(iep0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14645a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TeamHeaderInfo(image=", this.f14645a, ", name=", this.b, Separators.RPAREN);
    }
}
