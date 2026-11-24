package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cjs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4475a;
    public final rqm b;

    public cjs0(long j, rqm rqmVar) {
        this.f4475a = j;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjs0)) {
            return false;
        }
        cjs0 cjs0Var = (cjs0) obj;
        return this.f4475a == cjs0Var.f4475a && this.b.equals(cjs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f4475a) * 31);
    }

    public final String toString() {
        return "TransfersDisciplineFilterItemsUiModel(subSportId=" + this.f4475a + ", settingCell=" + this.b + Separators.RPAREN;
    }
}
