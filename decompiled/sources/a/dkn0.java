package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dkn0 implements gkn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6240a;

    public dkn0(String str) {
        this.f6240a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkn0) && this.f6240a.equals(((dkn0) obj).f6240a);
    }

    public final int hashCode() {
        return this.f6240a.hashCode();
    }

    public final String toString() {
        return kng0.l("DownloadXCareApp(url=", this.f6240a, Separators.RPAREN);
    }
}
