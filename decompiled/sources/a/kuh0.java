package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes5.dex */
public final class kuh0 implements puh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableString f18910a;
    public final String b;

    public kuh0(SpannableString spannableString, String str) {
        this.f18910a = spannableString;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuh0)) {
            return false;
        }
        kuh0 kuh0Var = (kuh0) obj;
        return this.f18910a.equals(kuh0Var.f18910a) && this.b.equals(kuh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18910a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthenticationEnabledDialog(message=" + ((Object) this.f18910a) + ", resetHashSecretKey=" + this.b + Separators.RPAREN;
    }
}
