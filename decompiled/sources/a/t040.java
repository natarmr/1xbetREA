package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t040 implements c140 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33101a;

    public t040(String str) {
        this.f33101a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t040) && this.f33101a.equals(((t040) obj).f33101a);
    }

    public final int hashCode() {
        return this.f33101a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(link=", this.f33101a, Separators.RPAREN);
    }
}
