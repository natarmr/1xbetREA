package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qsr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7y f29270a;
    public final e3y b;
    public final in8 c;
    public final String d;
    public final boolean e;
    public final kfk0 f;

    public qsr0(y7y y7yVar, e3y e3yVar, in8 in8Var, String str, boolean z, kfk0 kfk0Var) {
        this.f29270a = y7yVar;
        this.b = e3yVar;
        this.c = in8Var;
        this.d = str;
        this.e = z;
        this.f = kfk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsr0)) {
            return false;
        }
        qsr0 qsr0Var = (qsr0) obj;
        return this.f29270a.equals(qsr0Var.f29270a) && this.b.equals(qsr0Var.b) && this.c.equals(qsr0Var.c) && this.d.equals(qsr0Var.d) && this.e == qsr0Var.e && this.f == qsr0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f29270a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "TotoJackpotUiState(topBarState=" + this.f29270a + ", jackpotListState=" + this.b + ", bottomBarUiModel=" + this.c + ", jackpotBannerUrl=" + this.d + ", showBottomBar=" + this.e + ", snapState=" + this.f + Separators.RPAREN;
    }
}
