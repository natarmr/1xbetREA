package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f18953a;

    public kve0(iqt0 iqt0Var) {
        this.f18953a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kve0) && this.f18953a.equals(((kve0) obj).f18953a);
    }

    public final int hashCode() {
        return this.f18953a.hashCode();
    }

    public final String toString() {
        return "OnConfirmCaptcha(userActionCaptcha=" + this.f18953a + Separators.RPAREN;
    }
}
