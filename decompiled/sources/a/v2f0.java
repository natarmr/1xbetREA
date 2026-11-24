package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f36678a;

    public v2f0(iqt0 iqt0Var) {
        this.f36678a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2f0) && this.f36678a.equals(((v2f0) obj).f36678a);
    }

    public final int hashCode() {
        return this.f36678a.hashCode();
    }

    public final String toString() {
        return "OnConfirmCaptcha(userActionCaptcha=" + this.f36678a + Separators.RPAREN;
    }
}
