package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class res extends wes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30351a;

    public res(String str) {
        this.f30351a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof res) && this.f30351a.equals(((res) obj).f30351a);
    }

    public final int hashCode() {
        return this.f30351a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneLogoUrlChanged(teamOneImageUrl=", this.f30351a, Separators.RPAREN);
    }
}
