package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i190 implements k190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13987a;

    public i190(String str) {
        this.f13987a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i190) && this.f13987a.equals(((i190) obj).f13987a);
    }

    public final int hashCode() {
        return this.f13987a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(message=", this.f13987a, Separators.RPAREN);
    }
}
