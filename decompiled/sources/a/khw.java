package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class khw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18309a;

    public khw(String str) {
        this.f18309a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khw) && this.f18309a.equals(((khw) obj).f18309a);
    }

    public final int hashCode() {
        return this.f18309a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnItemWithKeyClick(idKey=", this.f18309a, Separators.RPAREN);
    }
}
