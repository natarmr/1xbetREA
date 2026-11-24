package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wfh implements xfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39070a;

    public final boolean equals(Object obj) {
        if (obj instanceof wfh) {
            return this.f39070a.equals(((wfh) obj).f39070a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39070a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(value=", this.f39070a, Separators.RPAREN);
    }
}
