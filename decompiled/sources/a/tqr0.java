package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tqr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7y f34394a;
    public final e3y b;
    public final boolean c;
    public final in8 d;
    public final long e;
    public final String f;
    public final kfk0 g;

    public tqr0(y7y y7yVar, e3y e3yVar, boolean z, in8 in8Var, long j, String str, kfk0 kfk0Var) {
        this.f34394a = y7yVar;
        this.b = e3yVar;
        this.c = z;
        this.d = in8Var;
        this.e = j;
        this.f = str;
        this.g = kfk0Var;
    }

    public static tqr0 a(tqr0 tqr0Var, y7y y7yVar, e3y e3yVar, boolean z, in8 in8Var, kfk0 kfk0Var, int i) {
        if ((i & 1) != 0) {
            y7yVar = tqr0Var.f34394a;
        }
        y7y y7yVar2 = y7yVar;
        if ((i & 2) != 0) {
            e3yVar = tqr0Var.b;
        }
        e3y e3yVar2 = e3yVar;
        if ((i & 4) != 0) {
            z = tqr0Var.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            in8Var = tqr0Var.d;
        }
        in8 in8Var2 = in8Var;
        long j = (i & 16) != 0 ? tqr0Var.e : 10000L;
        String str = tqr0Var.f;
        if ((i & 64) != 0) {
            kfk0Var = tqr0Var.g;
        }
        tqr0Var.getClass();
        return new tqr0(y7yVar2, e3yVar2, z2, in8Var2, j, str, kfk0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqr0)) {
            return false;
        }
        tqr0 tqr0Var = (tqr0) obj;
        return this.f34394a.equals(tqr0Var.f34394a) && this.b.equals(tqr0Var.b) && this.c == tqr0Var.c && this.d.equals(tqr0Var.d) && this.e == tqr0Var.e && this.f.equals(tqr0Var.f) && this.g == tqr0Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(rw2.b((this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f34394a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoJackpotState(topBarState=");
        sb.append(this.f34394a);
        sb.append(", tirageListState=");
        sb.append(this.b);
        sb.append(", showBottomBar=");
        sb.append(this.c);
        sb.append(", bottomBarUiModel=");
        sb.append(this.d);
        sb.append(", retryCountDownTimerValue=");
        kng0.z(sb, this.e, ", jackpotBannerUrl=", this.f);
        sb.append(", snapState=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
