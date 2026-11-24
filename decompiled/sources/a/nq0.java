package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nq0 implements rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo0 f23934a;
    public final rqm b;

    public nq0(zo0 zo0Var, rqm rqmVar) {
        this.f23934a = zo0Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq0)) {
            return false;
        }
        nq0 nq0Var = (nq0) obj;
        return this.f23934a.equals(nq0Var.f23934a) && this.b.equals(nq0Var.b);
    }

    @Override // a.rq0
    public final String getId() {
        return "PROVIDERS_SETTING_CELL_ID";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f23934a.hashCode() + 1378338100) * 31);
    }

    public final String toString() {
        return "SettingsCell(id=PROVIDERS_SETTING_CELL_ID, position=" + this.f23934a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
