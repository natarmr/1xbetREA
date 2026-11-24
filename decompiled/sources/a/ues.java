package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ues extends wes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35544a;

    public ues(String str) {
        this.f35544a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ues) && this.f35544a.equals(((ues) obj).f35544a);
    }

    public final int hashCode() {
        return this.f35544a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoLogoUrlChanged(teamTwoImageUrl=", this.f35544a, Separators.RPAREN);
    }
}
