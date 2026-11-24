package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zsd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo20 f44901a;

    public zsd0(jo20 jo20Var) {
        this.f44901a = jo20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsd0) && this.f44901a.equals(((zsd0) obj).f44901a);
    }

    public final int hashCode() {
        return this.f44901a.hashCode();
    }

    public final String toString() {
        return "RacesResultsModel(racesResults=" + this.f44901a + Separators.RPAREN;
    }
}
