package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wct implements zct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38940a;

    public wct(String str) {
        this.f38940a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wct) && this.f38940a.equals(((wct) obj).f38940a);
    }

    public final int hashCode() {
        return this.f38940a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBarMessage(message=", this.f38940a, Separators.RPAREN);
    }
}
