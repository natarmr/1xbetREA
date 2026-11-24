package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3316a;

    public bwc(String str) {
        this.f3316a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwc) && this.f3316a.equals(((bwc) obj).f3316a);
    }

    public final int hashCode() {
        return this.f3316a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenLink(link=", this.f3316a, Separators.RPAREN);
    }
}
