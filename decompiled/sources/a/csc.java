package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class csc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pif0 f4881a;
    public final rqm b;

    public csc(pif0 pif0Var, rqm rqmVar) {
        this.f4881a = pif0Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csc)) {
            return false;
        }
        csc cscVar = (csc) obj;
        return this.f4881a == cscVar.f4881a && this.b.equals(cscVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4881a.hashCode() * 31);
    }

    public final String toString() {
        return "ClearTeamUiModel(element=" + this.f4881a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
