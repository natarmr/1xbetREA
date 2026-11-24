package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x8f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f40459a;

    public x8f0(iqt0 iqt0Var) {
        this.f40459a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8f0) && this.f40459a.equals(((x8f0) obj).f40459a);
    }

    public final int hashCode() {
        return this.f40459a.hashCode();
    }

    public final String toString() {
        return "OnConfirmCaptcha(userActionCaptcha=" + this.f40459a + Separators.RPAREN;
    }
}
