package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pvj0 f43323a;
    public final String b;
    public final boolean c;

    public yvj0(pvj0 pvj0Var, String str, boolean z) {
        str.getClass();
        this.f43323a = pvj0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvj0)) {
            return false;
        }
        yvj0 yvj0Var = (yvj0) obj;
        return this.f43323a.equals(yvj0Var.f43323a) && Intrinsics.d(this.b, yvj0Var.b) && this.c == yvj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f43323a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBetTabKeyModel(simpleBetState=");
        sb.append(this.f43323a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
