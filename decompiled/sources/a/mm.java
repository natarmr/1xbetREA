package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mm implements qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22015a;

    public final boolean equals(Object obj) {
        if (obj instanceof mm) {
            return this.f22015a.equals(((mm) obj).f22015a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22015a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnActiveTeamClick(teamName=", this.f22015a, Separators.RPAREN);
    }
}
