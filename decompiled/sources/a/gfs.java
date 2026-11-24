package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gfs extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11220a;

    public gfs(String str) {
        this.f11220a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfs) && this.f11220a.equals(((gfs) obj).f11220a);
    }

    public final int hashCode() {
        return this.f11220a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoLogoUrlChanged(teamTwoImageUrl=", this.f11220a, Separators.RPAREN);
    }
}
