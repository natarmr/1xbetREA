package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class qpa extends spa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29106a;

    public qpa(String str) {
        this.f29106a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpa) && this.f29106a.equals(((qpa) obj).f29106a);
    }

    public final int hashCode() {
        return this.f29106a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoLogoUrlChanged(teamTwoImageUrl=", this.f29106a, Separators.RPAREN);
    }
}
