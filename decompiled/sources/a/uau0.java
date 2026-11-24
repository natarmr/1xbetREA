package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uau0 implements wau0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fbu0 f35350a;

    public uau0(fbu0 fbu0Var) {
        this.f35350a = fbu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uau0) && this.f35350a.equals(((uau0) obj).f35350a);
    }

    public final int hashCode() {
        return this.f35350a.hashCode();
    }

    public final String toString() {
        return "ShowContent(verificationStatusUiModel=" + this.f35350a + Separators.RPAREN;
    }
}
