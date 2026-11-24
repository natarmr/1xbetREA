package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v58 implements w58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36816a;

    public v58(String str) {
        this.f36816a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v58) && this.f36816a.equals(((v58) obj).f36816a);
    }

    public final int hashCode() {
        return this.f36816a.hashCode();
    }

    public final String toString() {
        return kng0.l("Check(password=", this.f36816a, Separators.RPAREN);
    }
}
