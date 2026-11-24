package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9397a;
    public final long b;
    public final kda0 c;
    public final aea0 d;
    public final aea0 e;

    public fea0(String str, long j, kda0 kda0Var, aea0 aea0Var, aea0 aea0Var2) {
        this.f9397a = str;
        this.b = j;
        this.c = kda0Var;
        this.d = aea0Var;
        this.e = aea0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fea0)) {
            return false;
        }
        fea0 fea0Var = (fea0) obj;
        return this.f9397a.equals(fea0Var.f9397a) && this.b == fea0Var.b && this.c.equals(fea0Var.c) && this.d.equals(fea0Var.d) && this.e.equals(fea0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f9397a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "PlayerTransfersTransferModel(date=", this.f9397a, ", dateStamp=");
        sbO.append(", player=");
        sbO.append(this.c);
        sbO.append(", oldTeam=");
        sbO.append(this.d);
        sbO.append(", newTeam=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
