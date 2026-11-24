package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zh4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f44375a;

    public zh4(iqt0 iqt0Var) {
        this.f44375a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh4) && this.f44375a.equals(((zh4) obj).f44375a);
    }

    public final int hashCode() {
        return this.f44375a.hashCode();
    }

    public final String toString() {
        return "OnCaptchaConfirm(userActionCaptcha=" + this.f44375a + Separators.RPAREN;
    }
}
