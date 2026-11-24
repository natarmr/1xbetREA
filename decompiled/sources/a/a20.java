package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a20 implements c20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fbu0 f99a;

    public a20(fbu0 fbu0Var) {
        this.f99a = fbu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a20) && this.f99a.equals(((a20) obj).f99a);
    }

    public final int hashCode() {
        return this.f99a.hashCode();
    }

    public final String toString() {
        return "ShowContent(verificationStatusUiModel=" + this.f99a + Separators.RPAREN;
    }
}
