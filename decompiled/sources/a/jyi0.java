package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jyi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f17362a;

    public jyi0(iqt0 iqt0Var) {
        this.f17362a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyi0) && this.f17362a.equals(((jyi0) obj).f17362a);
    }

    public final int hashCode() {
        return this.f17362a.hashCode();
    }

    public final String toString() {
        return "OnCaptchaConfirmed(serActionCaptcha=" + this.f17362a + Separators.RPAREN;
    }
}
