package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gx4 f24264a;
    public final String b;
    public final boolean c;

    public nx4(gx4 gx4Var, String str, boolean z) {
        str.getClass();
        this.f24264a = gx4Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx4)) {
            return false;
        }
        nx4 nx4Var = (nx4) obj;
        return Intrinsics.d(this.f24264a, nx4Var.f24264a) && Intrinsics.d(this.b, nx4Var.b) && this.c == nx4Var.c;
    }

    public final int hashCode() {
        gx4 gx4Var = this.f24264a;
        return Boolean.hashCode(this.c) + ua80.b((gx4Var == null ? 0 : gx4Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoBetTabKeyModel(autoBetState=");
        sb.append(this.f24264a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
