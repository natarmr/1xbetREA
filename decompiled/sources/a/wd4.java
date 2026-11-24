package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class wd4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f38955a;

    public wd4(iqt0 iqt0Var) {
        this.f38955a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd4) && this.f38955a.equals(((wd4) obj).f38955a);
    }

    public final int hashCode() {
        return this.f38955a.hashCode();
    }

    public final String toString() {
        return "OnCaptchaConfirm(userActionCaptcha=" + this.f38955a + Separators.RPAREN;
    }
}
