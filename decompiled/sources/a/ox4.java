package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ox4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx4 f25993a;
    public final String b;
    public final boolean c;

    public ox4(hx4 hx4Var, String str, boolean z) {
        str.getClass();
        this.f25993a = hx4Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox4)) {
            return false;
        }
        ox4 ox4Var = (ox4) obj;
        return this.f25993a.equals(ox4Var.f25993a) && Intrinsics.d(this.b, ox4Var.b) && this.c == ox4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f25993a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoBetTabKeyModel(autoBetState=");
        sb.append(this.f25993a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
