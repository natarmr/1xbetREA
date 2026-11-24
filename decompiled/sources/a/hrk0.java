package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hrk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13535a;

    public hrk0(int i) {
        this.f13535a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrk0) && this.f13535a == ((hrk0) obj).f13535a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13535a);
    }

    public final String toString() {
        return ua80.e(this.f13535a, "OnTeamClick(teamClId=", Separators.RPAREN);
    }
}
