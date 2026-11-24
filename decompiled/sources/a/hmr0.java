package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hmr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13321a;
    public final rqm b;

    public hmr0(int i, rqm rqmVar) {
        this.f13321a = i;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmr0)) {
            return false;
        }
        hmr0 hmr0Var = (hmr0) obj;
        return this.f13321a == hmr0Var.f13321a && this.b.equals(hmr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f13321a) * 31);
    }

    public final String toString() {
        return "TotoBetTypeCellUiState(id=" + this.f13321a + ", settingCellStyle=" + this.b + Separators.RPAREN;
    }
}
