package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c6f0 implements i6f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f3815a;

    public c6f0(iqt0 iqt0Var) {
        this.f3815a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6f0) && this.f3815a.equals(((c6f0) obj).f3815a);
    }

    public final int hashCode() {
        return this.f3815a.hashCode();
    }

    public final String toString() {
        return "OnConfirmCaptcha(userActionCaptcha=" + this.f3815a + Separators.RPAREN;
    }
}
