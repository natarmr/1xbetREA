package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ddt0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9m f5913a;

    public ddt0(d9m d9mVar) {
        this.f5913a = d9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ddt0) && this.f5913a.equals(((ddt0) obj).f5913a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TEAMS";
    }

    public final int hashCode() {
        return this.f5913a.f5708a.hashCode() - 1824382678;
    }

    public final String toString() {
        return "UniversalChampTeamsUiModel(key=TEAMS, teamsModel=" + this.f5913a + Separators.RPAREN;
    }
}
