package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lo10 extends oo10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm60 f20369a;

    public lo10(jm60 jm60Var) {
        this.f20369a = jm60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo10) && this.f20369a.equals(((lo10) obj).f20369a);
    }

    public final int hashCode() {
        return this.f20369a.hashCode();
    }

    public final String toString() {
        return "Content(oneXGameBannerUiModel=" + this.f20369a + Separators.RPAREN;
    }
}
