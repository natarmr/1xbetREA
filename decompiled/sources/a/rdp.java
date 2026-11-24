package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rdp implements tdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30300a;

    public rdp(String str) {
        this.f30300a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdp) && this.f30300a.equals(((rdp) obj).f30300a);
    }

    public final int hashCode() {
        return this.f30300a.hashCode();
    }

    public final String toString() {
        return kng0.l("Shimmer(id=", this.f30300a, Separators.RPAREN);
    }
}
