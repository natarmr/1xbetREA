package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class efs extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7732a;

    public efs(String str) {
        this.f7732a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efs) && this.f7732a.equals(((efs) obj).f7732a);
    }

    public final int hashCode() {
        return this.f7732a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneLogoUrlChanged(teamOneImageUrl=", this.f7732a, Separators.RPAREN);
    }
}
