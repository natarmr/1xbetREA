package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class uc40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35412a;
    public final int b;
    public final String c;

    public uc40(String str, int i, String str2) {
        this.f35412a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc40)) {
            return false;
        }
        uc40 uc40Var = (uc40) obj;
        return this.f35412a.equals(uc40Var.f35412a) && this.b == uc40Var.b && this.c.equals(uc40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f35412a.hashCode() * 31, 31);
    }

    public final String toString() {
        return axq.n(kng0.p(this.b, "MetaHeroesSkillModel(name=", this.f35412a, ", level=", ", image="), this.c, Separators.RPAREN);
    }
}
