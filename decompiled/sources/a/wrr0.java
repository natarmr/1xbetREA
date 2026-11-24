package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wrr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final irq0 f39659a;
    public final hqq0 b;
    public final long c;
    public final String d;

    public wrr0(irq0 irq0Var, hqq0 hqq0Var, long j, String str) {
        this.f39659a = irq0Var;
        this.b = hqq0Var;
        this.c = j;
        this.d = str;
    }

    public static wrr0 a(wrr0 wrr0Var, irq0 irq0Var, hqq0 hqq0Var, long j, int i) {
        if ((i & 1) != 0) {
            irq0Var = wrr0Var.f39659a;
        }
        irq0 irq0Var2 = irq0Var;
        if ((i & 2) != 0) {
            hqq0Var = wrr0Var.b;
        }
        hqq0 hqq0Var2 = hqq0Var;
        if ((i & 4) != 0) {
            j = wrr0Var.c;
        }
        String str = wrr0Var.d;
        wrr0Var.getClass();
        return new wrr0(irq0Var2, hqq0Var2, j, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrr0)) {
            return false;
        }
        wrr0 wrr0Var = (wrr0) obj;
        return this.f39659a.equals(wrr0Var.f39659a) && this.b.equals(wrr0Var.b) && this.c == wrr0Var.c && this.d.equals(wrr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b((this.b.hashCode() + (this.f39659a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoJackpotTirageState(topBarState=");
        sb.append(this.f39659a);
        sb.append(", tirageListState=");
        sb.append(this.b);
        sb.append(", retryCountDownTimerValue=");
        kng0.z(sb, this.c, ", jackpotBannerUrl=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
