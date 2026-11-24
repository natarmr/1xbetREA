package a;

import android.gov.nist.core.Separators;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes5.dex */
public final class mo4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableString f22117a;
    public final String b;

    public mo4(SpannableString spannableString, String str) {
        this.f22117a = spannableString;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo4)) {
            return false;
        }
        mo4 mo4Var = (mo4) obj;
        return this.f22117a.equals(mo4Var.f22117a) && this.b.equals(mo4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22117a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthenticationEnabledDialogUiModel(message=" + ((Object) this.f22117a) + ", resetHashSecretKey=" + this.b + Separators.RPAREN;
    }
}
