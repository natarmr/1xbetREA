package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m0c0 implements u0c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f20947a;

    public m0c0(iqt0 iqt0Var) {
        this.f20947a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0c0) && this.f20947a.equals(((m0c0) obj).f20947a);
    }

    public final int hashCode() {
        return this.f20947a.hashCode();
    }

    public final String toString() {
        return "OnCaptchaConfirmed(userActionCaptcha=" + this.f20947a + Separators.RPAREN;
    }
}
