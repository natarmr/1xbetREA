package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nxf0 implements pxf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24282a;

    public nxf0(String str) {
        this.f24282a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxf0) && this.f24282a.equals(((nxf0) obj).f24282a);
    }

    public final int hashCode() {
        return this.f24282a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(errorMessage=", this.f24282a, Separators.RPAREN);
    }
}
