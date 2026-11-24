package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class faj0 implements taj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f9210a;

    public final boolean equals(Object obj) {
        if (obj instanceof faj0) {
            return this.f9210a.equals(((faj0) obj).f9210a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9210a.hashCode();
    }

    public final String toString() {
        return "CaptchaConfirmed(serActionCaptcha=" + this.f9210a + Separators.RPAREN;
    }
}
