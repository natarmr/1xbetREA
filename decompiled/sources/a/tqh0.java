package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes5.dex */
public final class tqh0 implements yqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableString f34380a;
    public final String b;

    public tqh0(SpannableString spannableString, String str) {
        this.f34380a = spannableString;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqh0)) {
            return false;
        }
        tqh0 tqh0Var = (tqh0) obj;
        return this.f34380a.equals(tqh0Var.f34380a) && this.b.equals(tqh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34380a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthenticationEnabledDialog(message=" + ((Object) this.f34380a) + ", resetHashSecretKey=" + this.b + Separators.RPAREN;
    }
}
