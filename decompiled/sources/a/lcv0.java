package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lcv0 implements mcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19818a;
    public final wbv0 b;

    public lcv0(String str, wbv0 wbv0Var) {
        this.f19818a = str;
        this.b = wbv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcv0)) {
            return false;
        }
        lcv0 lcv0Var = (lcv0) obj;
        return this.f19818a.equals(lcv0Var.f19818a) && this.b.equals(lcv0Var.b);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f19818a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19818a.hashCode() * 31);
    }

    public final String toString() {
        return "WhoWinSingleStageCellDefaultUiModel(key=" + this.f19818a + ", cell=" + this.b + Separators.RPAREN;
    }
}
