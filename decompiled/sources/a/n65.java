package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n65 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22979a;
    public final int b;
    public final int c;
    public final zmq0 d;
    public final dqs e;
    public final tzb0 f;
    public final nnm0 g;
    public final double h;
    public final String i;
    public final double j;
    public final String k;
    public final na90 l;

    public n65(long j, int i, int i2, zmq0 zmq0Var, dqs dqsVar, tzb0 tzb0Var, nnm0 nnm0Var, double d, String str, double d2, String str2, na90 na90Var) {
        this.f22979a = j;
        this.b = i;
        this.c = i2;
        this.d = zmq0Var;
        this.e = dqsVar;
        this.f = tzb0Var;
        this.g = nnm0Var;
        this.h = d;
        this.i = str;
        this.j = d2;
        this.k = str2;
        this.l = na90Var;
    }

    public static n65 a(n65 n65Var, zmq0 zmq0Var, String str, String str2, int i) {
        long j = n65Var.f22979a;
        int i2 = n65Var.b;
        int i3 = n65Var.c;
        zmq0 zmq0Var2 = (i & 8) != 0 ? n65Var.d : zmq0Var;
        dqs dqsVar = n65Var.e;
        tzb0 tzb0Var = n65Var.f;
        nnm0 nnm0Var = n65Var.g;
        double d = n65Var.h;
        String str3 = (i & 256) != 0 ? n65Var.i : str;
        double d2 = n65Var.j;
        String str4 = (i & 1024) != 0 ? n65Var.k : str2;
        na90 na90Var = n65Var.l;
        n65Var.getClass();
        zmq0Var2.getClass();
        str3.getClass();
        str4.getClass();
        return new n65(j, i2, i3, zmq0Var2, dqsVar, tzb0Var, nnm0Var, d, str3, d2, str4, na90Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n65)) {
            return false;
        }
        n65 n65Var = (n65) obj;
        return this.f22979a == n65Var.f22979a && this.b == n65Var.b && this.c == n65Var.c && this.d.equals(n65Var.d) && this.e.equals(n65Var.e) && this.f.equals(n65Var.f) && this.g == n65Var.g && Double.compare(this.h, n65Var.h) == 0 && this.i.equals(n65Var.i) && Double.compare(this.j, n65Var.j) == 0 && this.k.equals(n65Var.k) && this.l == n65Var.l;
    }

    public final int hashCode() {
        return this.l.hashCode() + ua80.b(brm0.d(this.j, ua80.b(brm0.d(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + rw2.b(twn.a(this.c, twn.a(this.b, Long.hashCode(this.f22979a) * 31, 31), 31), 31, this.d.f44639a)) * 31)) * 31)) * 31, 31), 31, this.i), 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f22979a, "AvailableFreeSpinModel(id=", ", countSpins=");
        sbQ.append(", countUsed=");
        sbQ.append(this.c);
        sbQ.append(", timerLeftModel=");
        sbQ.append(this.d);
        sbQ.append(", gameInfo=");
        sbQ.append(this.e);
        sbQ.append(", providerInfo=");
        sbQ.append(this.f);
        sbQ.append(", status=");
        sbQ.append(this.g);
        sbQ.append(", minDeposit=");
        hne.w(sbQ, this.h, ", depositCurrency=", this.i);
        ohs0.A(sbQ, this.j, ", winningAmount=", ", winningCurrency=");
        sbQ.append(this.k);
        sbQ.append(", paymentType=");
        sbQ.append(this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
