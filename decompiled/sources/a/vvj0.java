package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvj0 f38103a;
    public final String b;
    public final boolean c;

    public vvj0(rvj0 rvj0Var, String str, boolean z) {
        str.getClass();
        this.f38103a = rvj0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvj0)) {
            return false;
        }
        vvj0 vvj0Var = (vvj0) obj;
        return this.f38103a.equals(vvj0Var.f38103a) && Intrinsics.d(this.b, vvj0Var.b) && this.c == vvj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f38103a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBetTabKeyModel(simpleBetState=");
        sb.append(this.f38103a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
