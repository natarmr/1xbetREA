package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uv8 implements zv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv8 f36335a;
    public final fyl b;

    public uv8(cv8 cv8Var, fyl fylVar) {
        vxl vxlVar = vxl.f38204a;
        this.f36335a = cv8Var;
        this.b = fylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv8)) {
            return false;
        }
        uv8 uv8Var = (uv8) obj;
        if (!this.f36335a.equals(uv8Var.f36335a) || !this.b.equals(uv8Var.b)) {
            return false;
        }
        vxl vxlVar = vxl.f38204a;
        return true;
    }

    @Override // a.zv8
    public final String getId() {
        return "LANGUAGES_CHIPS_ID";
    }

    public final int hashCode() {
        return vxl.b.hashCode() + ((this.b.hashCode() + ((this.f36335a.hashCode() + 415600713) * 31)) * 31);
    }

    public final String toString() {
        return "Chips(id=LANGUAGES_CHIPS_ID, position=" + this.f36335a + ", dsChipUiModel=" + this.b + ", dsChipStyle=" + vxl.b + Separators.RPAREN;
    }
}
