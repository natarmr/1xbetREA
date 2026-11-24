package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qa00 implements ra00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28373a;
    public final int b;
    public final p6m0 c;

    public qa00(String str, int i, p6m0 p6m0Var) {
        this.f28373a = str;
        this.b = i;
        this.c = p6m0Var;
    }

    @Override // a.ra00
    public final String a() {
        return this.f28373a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa00)) {
            return false;
        }
        qa00 qa00Var = (qa00) obj;
        return this.f28373a.equals(qa00Var.f28373a) && this.b == qa00Var.b && this.c.equals(qa00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f28373a.hashCode() * 31, 31);
    }

    @Override // a.ra00
    public final int s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Sport(backgroundUrl=", this.f28373a, ", placeholderRes=", ", lineupList=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
