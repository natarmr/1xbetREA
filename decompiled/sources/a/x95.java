package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x95 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40493a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final boolean e;

    public x95(long j, String str, String str2, wui0 wui0Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.f40493a = j;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x95)) {
            return false;
        }
        x95 x95Var = (x95) obj;
        return this.f40493a == x95Var.f40493a && Intrinsics.d(this.b, x95Var.b) && Intrinsics.d(this.c, x95Var.c) && this.d == x95Var.d && this.e == x95Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.c(this.d, ua80.b(ua80.b(Long.hashCode(this.f40493a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f40493a, "AvailableValueUiModel(value=", ", measure=", this.b);
        sbO.append(", valueView=");
        sbO.append(this.c);
        sbO.append(", position=");
        sbO.append(this.d);
        return f140.n(sbO, ", selected=", this.e, Separators.RPAREN);
    }
}
