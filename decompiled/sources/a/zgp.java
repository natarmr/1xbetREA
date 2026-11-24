package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44355a;
    public final rqm b;

    public zgp(int i, rqm rqmVar) {
        this.f44355a = i;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgp)) {
            return false;
        }
        zgp zgpVar = (zgp) obj;
        return this.f44355a == zgpVar.f44355a && this.b.equals(zgpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f44355a) * 31);
    }

    public final String toString() {
        return "FeatureToggleUiModel(id=" + this.f44355a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
