package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class he80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12910a;
    public final String b;
    public final String c;

    public he80(String str, String str2, String str3) {
        this.f12910a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he80)) {
            return false;
        }
        he80 he80Var = (he80) obj;
        return this.f12910a.equals(he80Var.f12910a) && this.b.equals(he80Var.b) && this.c.equals(he80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f12910a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("OutcomesHeaderUiModel(sportImageUrl=", this.f12910a, ", title=", this.b, ", description="), this.c, Separators.RPAREN);
    }
}
