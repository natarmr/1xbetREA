package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx6 f31171a;
    public final mnb0 b;
    public final kwo0 c;
    public final mnd0 d;
    public final String e;

    public rvj0(dx6 dx6Var, mnb0 mnb0Var, kwo0 kwo0Var, mnd0 mnd0Var, String str) {
        this.f31171a = dx6Var;
        this.b = mnb0Var;
        this.c = kwo0Var;
        this.d = mnd0Var;
        this.e = str;
    }

    public static rvj0 a(rvj0 rvj0Var, dx6 dx6Var, mnb0 mnb0Var, kwo0 kwo0Var, mnd0 mnd0Var, String str, int i) {
        if ((i & 1) != 0) {
            dx6Var = rvj0Var.f31171a;
        }
        dx6 dx6Var2 = dx6Var;
        if ((i & 2) != 0) {
            mnb0Var = rvj0Var.b;
        }
        mnb0 mnb0Var2 = mnb0Var;
        if ((i & 4) != 0) {
            kwo0Var = rvj0Var.c;
        }
        kwo0 kwo0Var2 = kwo0Var;
        if ((i & 8) != 0) {
            mnd0Var = rvj0Var.d;
        }
        mnd0 mnd0Var2 = mnd0Var;
        if ((i & 16) != 0) {
            str = rvj0Var.e;
        }
        rvj0Var.getClass();
        return new rvj0(dx6Var2, mnb0Var2, kwo0Var2, mnd0Var2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvj0)) {
            return false;
        }
        rvj0 rvj0Var = (rvj0) obj;
        return this.f31171a.equals(rvj0Var.f31171a) && this.b.equals(rvj0Var.b) && this.c.equals(rvj0Var.c) && this.d.equals(rvj0Var.d) && Intrinsics.d(this.e, rvj0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f31171a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBetStateModel(betFieldState=");
        sb.append(this.f31171a);
        sb.append(", possibleWinStateModel=");
        sb.append(this.b);
        sb.append(", taxStateModel=");
        sb.append(this.c);
        sb.append(", quickBetStateModel=");
        sb.append(this.d);
        sb.append(", infoLine=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
