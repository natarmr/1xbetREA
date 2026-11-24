package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gw20 implements ew20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12005a;
    public final long b;
    public final cw20 c;
    public final boolean d;
    public int e;

    public gw20(String str, long j, cw20 cw20Var, boolean z, int i) {
        str.getClass();
        this.f12005a = str;
        this.b = j;
        this.c = cw20Var;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw20)) {
            return false;
        }
        gw20 gw20Var = (gw20) obj;
        return Intrinsics.d(this.f12005a, gw20Var.f12005a) && this.b == gw20Var.b && this.c == gw20Var.c && this.d == gw20Var.d && this.e == gw20Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + brm0.e((this.c.hashCode() + rw2.b(this.f12005a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        int i = this.e;
        StringBuilder sbO = f140.o(this.b, "MarketSettingUiModel(name=", this.f12005a, ", id=");
        sbO.append(", marketSettingType=");
        sbO.append(this.c);
        sbO.append(", available=");
        sbO.append(this.d);
        return vqd.p(sbO, ", pinnedPosition=", i, Separators.RPAREN);
    }
}
