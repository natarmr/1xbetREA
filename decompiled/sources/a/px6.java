package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class px6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vx6 f27739a;
    public final String b;
    public final lke c;
    public final ix6 d;
    public final String e;

    public px6(vx6 vx6Var, String str, lke lkeVar, ix6 ix6Var, String str2) {
        str.getClass();
        str2.getClass();
        this.f27739a = vx6Var;
        this.b = str;
        this.c = lkeVar;
        this.d = ix6Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px6)) {
            return false;
        }
        px6 px6Var = (px6) obj;
        return this.f27739a.equals(px6Var.f27739a) && Intrinsics.d(this.b, px6Var.b) && this.c.equals(px6Var.c) && this.d == px6Var.d && Intrinsics.d(this.e, px6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f27739a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldUiState(fieldValueUiState=");
        sb.append(this.f27739a);
        sb.append(", supportingTextState=");
        sb.append(this.b);
        sb.append(", controlsState=");
        sb.append(this.c);
        sb.append(", betFieldStyle=");
        sb.append(this.d);
        sb.append(", betCurrency=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
