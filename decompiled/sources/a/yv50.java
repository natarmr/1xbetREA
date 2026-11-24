package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yv50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43304a;

    public yv50(String str) {
        this.f43304a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv50) && this.f43304a.equals(((yv50) obj).f43304a);
    }

    public final int hashCode() {
        return this.f43304a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f43304a, Separators.RPAREN);
    }
}
