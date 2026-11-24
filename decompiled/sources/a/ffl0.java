package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ffl0 implements hfl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9451a;

    public ffl0(String str) {
        this.f9451a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffl0) && this.f9451a.equals(((ffl0) obj).f9451a);
    }

    public final int hashCode() {
        return this.f9451a.hashCode();
    }

    public final String toString() {
        return kng0.l("RemoteResourceUiModel(url=", this.f9451a, Separators.RPAREN);
    }
}
