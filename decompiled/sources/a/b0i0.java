package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b0i0 implements k0i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f1766a;

    public b0i0(iqt0 iqt0Var) {
        this.f1766a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0i0) && this.f1766a.equals(((b0i0) obj).f1766a);
    }

    public final int hashCode() {
        return this.f1766a.hashCode();
    }

    public final String toString() {
        return "CaptchaConfirmed(userActionCaptcha=" + this.f1766a + Separators.RPAREN;
    }
}
