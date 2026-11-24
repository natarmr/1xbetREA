package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iec0 implements jec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14626a;

    public iec0(String str) {
        this.f14626a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iec0) && this.f14626a.equals(((iec0) obj).f14626a);
    }

    public final int hashCode() {
        return this.f14626a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSuccessMessage(message=", this.f14626a, Separators.RPAREN);
    }
}
