package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gx4 f22535a;
    public final String b;
    public final boolean c;

    public mx4(gx4 gx4Var, String str, boolean z) {
        str.getClass();
        this.f22535a = gx4Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx4)) {
            return false;
        }
        mx4 mx4Var = (mx4) obj;
        return Intrinsics.d(this.f22535a, mx4Var.f22535a) && Intrinsics.d(this.b, mx4Var.b) && this.c == mx4Var.c;
    }

    public final int hashCode() {
        gx4 gx4Var = this.f22535a;
        return Boolean.hashCode(this.c) + ua80.b((gx4Var == null ? 0 : gx4Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoBetTabKeyModel(autoBetState=");
        sb.append(this.f22535a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
