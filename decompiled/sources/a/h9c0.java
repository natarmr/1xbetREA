package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h9c0 implements k9c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12668a;

    public h9c0(String str) {
        this.f12668a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9c0) && this.f12668a.equals(((h9c0) obj).f12668a);
    }

    public final int hashCode() {
        return this.f12668a.hashCode();
    }

    public final String toString() {
        return kng0.l("SetNameParentScreen(screen=", this.f12668a, Separators.RPAREN);
    }
}
