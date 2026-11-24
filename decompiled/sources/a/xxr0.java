package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xxr0 implements zxr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41673a;

    public xxr0(String str) {
        this.f41673a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxr0) && this.f41673a.equals(((xxr0) obj).f41673a);
    }

    public final int hashCode() {
        return this.f41673a.hashCode();
    }

    public final String toString() {
        return kng0.l("ResultWithThreeTeams(teamThreeIcon=", this.f41673a, Separators.RPAREN);
    }
}
