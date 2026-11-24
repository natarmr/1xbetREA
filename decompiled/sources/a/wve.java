package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wve implements xve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39833a;

    public wve(String str) {
        this.f39833a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wve) && this.f39833a.equals(((wve) obj).f39833a);
    }

    public final int hashCode() {
        return this.f39833a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f39833a, Separators.RPAREN);
    }
}
