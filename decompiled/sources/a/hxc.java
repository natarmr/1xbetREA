package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hxc implements kxc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13809a;

    public hxc(String str) {
        this.f13809a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxc) && this.f13809a.equals(((hxc) obj).f13809a);
    }

    public final int hashCode() {
        return this.f13809a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenLink(link=", this.f13809a, Separators.RPAREN);
    }
}
