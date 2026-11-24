package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class nhs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f23550a;
    public final long b;
    public final String c;
    public final String d;
    public final tmp0 e;
    public final tmp0 f;

    public nhs0(Date date, long j, String str, String str2, tmp0 tmp0Var, tmp0 tmp0Var2) {
        this.f23550a = date;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = tmp0Var;
        this.f = tmp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhs0)) {
            return false;
        }
        nhs0 nhs0Var = (nhs0) obj;
        return this.f23550a.equals(nhs0Var.f23550a) && this.b == nhs0Var.b && this.c.equals(nhs0Var.c) && this.d.equals(nhs0Var.d) && this.e.equals(nhs0Var.e) && this.f.equals(nhs0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(rw2.b(this.f23550a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferModel(date=");
        sb.append(this.f23550a);
        sb.append(", dateTimestamp=");
        sb.append(this.b);
        f140.v(sb, ", playerNickname=", this.c, ", playerImage=", this.d);
        sb.append(", oldTeam=");
        sb.append(this.e);
        sb.append(", newTeam=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
