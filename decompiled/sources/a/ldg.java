package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ldg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19849a;
    public final String b;

    public ldg(String str, String str2) {
        this.f19849a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldg)) {
            return false;
        }
        ldg ldgVar = (ldg) obj;
        return this.f19849a.equals(ldgVar.f19849a) && this.b.equals(ldgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19849a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CyberChampPrizeDistributionTeamModel(name=", this.f19849a, ", image=", this.b, Separators.RPAREN);
    }
}
