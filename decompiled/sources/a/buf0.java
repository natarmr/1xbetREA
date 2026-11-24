package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class buf0 implements awf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3229a;
    public final String b;
    public final String c;

    public buf0(String str, String str2, String str3) {
        this.f3229a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buf0)) {
            return false;
        }
        buf0 buf0Var = (buf0) obj;
        return this.f3229a.equals(buf0Var.f3229a) && this.b.equals(buf0Var.b) && this.c.equals(buf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f3229a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ResponsibleContactUiModel(title=", this.f3229a, ", description=", this.b, ", link="), this.c, Separators.RPAREN);
    }
}
