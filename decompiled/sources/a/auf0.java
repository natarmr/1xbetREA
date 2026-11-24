package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class auf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1477a;
    public final String b;
    public final String c;

    public auf0(String str, String str2, String str3) {
        this.f1477a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auf0)) {
            return false;
        }
        auf0 auf0Var = (auf0) obj;
        return this.f1477a.equals(auf0Var.f1477a) && this.b.equals(auf0Var.b) && this.c.equals(auf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f1477a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ResponsibleContactModel(title=", this.f1477a, ", description=", this.b, ", link="), this.c, Separators.RPAREN);
    }
}
