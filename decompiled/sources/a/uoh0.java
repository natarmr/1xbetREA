package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes5.dex */
public final class uoh0 implements zoh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableString f36015a;
    public final String b;

    public uoh0(SpannableString spannableString, String str) {
        this.f36015a = spannableString;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoh0)) {
            return false;
        }
        uoh0 uoh0Var = (uoh0) obj;
        return this.f36015a.equals(uoh0Var.f36015a) && this.b.equals(uoh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36015a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthenticationEnabledDialog(message=" + ((Object) this.f36015a) + ", resetHashSecretKey=" + this.b + Separators.RPAREN;
    }
}
