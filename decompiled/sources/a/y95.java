package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y95 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42228a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final boolean e;

    public y95(int i, String str, String str2, wui0 wui0Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.f42228a = i;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y95)) {
            return false;
        }
        y95 y95Var = (y95) obj;
        return this.f42228a == y95Var.f42228a && Intrinsics.d(this.b, y95Var.b) && Intrinsics.d(this.c, y95Var.c) && this.d == y95Var.d && this.e == y95Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.c(this.d, ua80.b(ua80.b(Integer.hashCode(this.f42228a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f42228a, "AvailableValueUiModel(value=", ", measure=", this.b, ", valueView=");
        sbR.append(this.c);
        sbR.append(", position=");
        sbR.append(this.d);
        sbR.append(", selected=");
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
