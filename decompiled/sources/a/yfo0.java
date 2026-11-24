package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yfo0 implements ego0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42550a;

    public yfo0(String str) {
        this.f42550a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yfo0) && this.f42550a.equals(((yfo0) obj).f42550a);
    }

    public final int hashCode() {
        return this.f42550a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(link=", this.f42550a, Separators.RPAREN);
    }
}
