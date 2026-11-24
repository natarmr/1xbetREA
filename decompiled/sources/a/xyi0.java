package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xyi0 implements czi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41707a;

    public xyi0(String str) {
        this.f41707a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyi0) && this.f41707a.equals(((xyi0) obj).f41707a);
    }

    public final int hashCode() {
        return this.f41707a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendQrCode(qrCodeContent=", this.f41707a, Separators.RPAREN);
    }
}
