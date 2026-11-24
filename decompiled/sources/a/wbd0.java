package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wbd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38872a;

    public wbd0(String str) {
        this.f38872a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbd0) && this.f38872a.equals(((wbd0) obj).f38872a);
    }

    public final int hashCode() {
        return this.f38872a.hashCode();
    }

    public final String toString() {
        return kng0.l("PaySystemRedirection(redirectUrl=", this.f38872a, Separators.RPAREN);
    }
}
