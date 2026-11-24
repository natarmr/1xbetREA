package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oa10 implements qa10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24908a;

    public /* synthetic */ oa10(String str) {
        this.f24908a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oa10) {
            return this.f24908a.equals(((oa10) obj).f24908a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24908a.hashCode();
    }

    public final String toString() {
        return kng0.l("Asset(assetName=", this.f24908a, Separators.RPAREN);
    }
}
