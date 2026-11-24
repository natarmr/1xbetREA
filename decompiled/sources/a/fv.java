package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fv implements iv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10189a;

    public fv(String str) {
        this.f10189a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv) && this.f10189a.equals(((fv) obj).f10189a);
    }

    public final int hashCode() {
        return this.f10189a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowQr(authString=", this.f10189a, Separators.RPAREN);
    }
}
