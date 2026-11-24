package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b130 implements g130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f1788a;
    public final long b;
    public final String c;

    public b130(xgl0 xgl0Var, long j, String str) {
        this.f1788a = xgl0Var;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b130)) {
            return false;
        }
        b130 b130Var = (b130) obj;
        return this.f1788a.equals(b130Var.f1788a) && this.b == b130Var.b && this.c.equals(b130Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f1788a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventCategoryBetLongClick(coefParams=");
        sb.append(this.f1788a);
        sb.append(", subGameId=");
        sb.append(this.b);
        return rw2.o(sb, ", subGameName=", this.c, Separators.RPAREN);
    }
}
