package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ba4 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f2240a;

    public ba4(iqt0 iqt0Var) {
        this.f2240a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba4) && this.f2240a.equals(((ba4) obj).f2240a);
    }

    public final int hashCode() {
        return this.f2240a.hashCode();
    }

    public final String toString() {
        return "OnCaptchaConfirm(userActionCaptcha=" + this.f2240a + Separators.RPAREN;
    }
}
