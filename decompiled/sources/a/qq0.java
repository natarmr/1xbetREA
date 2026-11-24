package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qq0 implements rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo0 f29143a;
    public final rqm b;

    public qq0(zo0 zo0Var, rqm rqmVar) {
        this.f29143a = zo0Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq0)) {
            return false;
        }
        qq0 qq0Var = (qq0) obj;
        return this.f29143a.equals(qq0Var.f29143a) && this.b.equals(qq0Var.b);
    }

    @Override // a.rq0
    public final String getId() {
        return "SORTING_SETTING_CELL_ID";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f29143a.hashCode() + 79318162) * 31);
    }

    public final String toString() {
        return "SortingSettingsCell(id=SORTING_SETTING_CELL_ID, position=" + this.f29143a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
