package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rvw implements tvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31190a;

    public /* synthetic */ rvw(String str) {
        this.f31190a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rvw) {
            return this.f31190a.equals(((rvw) obj).f31190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31190a.hashCode();
    }

    public final String toString() {
        return kng0.l("RemoteResourceUiModel(url=", this.f31190a, Separators.RPAREN);
    }
}
