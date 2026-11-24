package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w95 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38761a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final boolean e;

    public w95(int i, String str, String str2, wui0 wui0Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.f38761a = i;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w95)) {
            return false;
        }
        w95 w95Var = (w95) obj;
        return this.f38761a == w95Var.f38761a && Intrinsics.d(this.b, w95Var.b) && Intrinsics.d(this.c, w95Var.c) && this.d == w95Var.d && this.e == w95Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.c(this.d, ua80.b(ua80.b(Integer.hashCode(this.f38761a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f38761a, "AvailableValueUiModel(value=", ", measure=", this.b, ", valueView=");
        sbR.append(this.c);
        sbR.append(", position=");
        sbR.append(this.d);
        sbR.append(", selected=");
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
