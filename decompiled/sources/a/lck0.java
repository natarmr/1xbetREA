package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class lck0 implements pck0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f19804a;

    public lck0(iqt0 iqt0Var) {
        this.f19804a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lck0) && this.f19804a.equals(((lck0) obj).f19804a);
    }

    public final int hashCode() {
        return this.f19804a.hashCode();
    }

    public final String toString() {
        return "OnCaptchaConfirmed(captcha=" + this.f19804a + Separators.RPAREN;
    }
}
