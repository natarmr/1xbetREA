package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84a;

    public a1q(String str) {
        this.f84a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1q) && this.f84a.equals(((a1q) obj).f84a);
    }

    public final int hashCode() {
        return this.f84a.hashCode();
    }

    public final String toString() {
        return kng0.l("AppsFlyerId(id=", this.f84a, Separators.RPAREN);
    }
}
