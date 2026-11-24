package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bjb0 implements kjb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2698a;
    public final String b;

    public bjb0(String str, String str2) {
        this.f2698a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjb0)) {
            return false;
        }
        bjb0 bjb0Var = (bjb0) obj;
        return this.f2698a.equals(bjb0Var.f2698a) && this.b.equals(bjb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2698a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OpenAuthenticationEnableDialog(message=", this.f2698a, ", resetHashSecretKey=", this.b, Separators.RPAREN);
    }
}
