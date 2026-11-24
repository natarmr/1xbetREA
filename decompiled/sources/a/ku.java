package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18889a;
    public final double b;
    public final String c;

    public ku(double d, String str, String str2) {
        this.f18889a = str;
        this.b = d;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj;
        return this.f18889a.equals(kuVar.f18889a) && Double.compare(this.b, kuVar.b) == 0 && this.c.equals(kuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, this.f18889a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddTotoBetModel(message=");
        sb.append(this.f18889a);
        sb.append(", balance=");
        sb.append(this.b);
        return rw2.o(sb, ", totoTicket=", this.c, Separators.RPAREN);
    }
}
