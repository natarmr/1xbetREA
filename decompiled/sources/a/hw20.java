package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hw20 implements fw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13751a;
    public final long b;
    public final dw20 c;
    public final boolean d;
    public int e;

    public hw20(String str, long j, dw20 dw20Var, boolean z, int i) {
        this.f13751a = str;
        this.b = j;
        this.c = dw20Var;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw20)) {
            return false;
        }
        hw20 hw20Var = (hw20) obj;
        return this.f13751a.equals(hw20Var.f13751a) && this.b == hw20Var.b && this.c == hw20Var.c && this.d == hw20Var.d && this.e == hw20Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e((this.c.hashCode() + rw2.b(this.f13751a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        int i = this.e;
        StringBuilder sbO = f140.o(this.b, "MarketSettingUiModel(name=", this.f13751a, ", id=");
        sbO.append(", marketSettingType=");
        sbO.append(this.c);
        sbO.append(", available=");
        sbO.append(this.d);
        return vqd.p(sbO, ", pinnedPosition=", i, Separators.RPAREN);
    }
}
