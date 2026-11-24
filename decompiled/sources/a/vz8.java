package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vz8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38287a;
    public final rqm b;

    public vz8(int i, rqm rqmVar) {
        this.f38287a = i;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz8)) {
            return false;
        }
        vz8 vz8Var = (vz8) obj;
        return this.f38287a == vz8Var.f38287a && this.b.equals(vz8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f38287a) * 31);
    }

    public final String toString() {
        return "BrandsLanguageSelectionItemUiModel(id=" + this.f38287a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
