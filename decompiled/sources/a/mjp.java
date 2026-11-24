package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mjp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21906a;

    public mjp(int i) {
        this.f21906a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjp) && this.f21906a == ((mjp) obj).f21906a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21906a);
    }

    public final String toString() {
        return ua80.e(this.f21906a, "OnSelectTab(tabSelected=", Separators.RPAREN);
    }
}
