package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s7u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31769a;
    public final String b;
    public final rqm c;

    public s7u0(int i, String str, rqm rqmVar) {
        this.f31769a = i;
        this.b = str;
        this.c = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7u0)) {
            return false;
        }
        s7u0 s7u0Var = (s7u0) obj;
        return this.f31769a == s7u0Var.f31769a && this.b.equals(s7u0Var.b) && this.c.equals(s7u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f31769a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f31769a, "VerificationItemCellUiModel(id=", ", description=", this.b, ", settingCellStyle=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
