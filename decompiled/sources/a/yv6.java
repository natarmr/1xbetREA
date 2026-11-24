package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yv6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx6 f43305a;
    public final oln0 b;
    public final xnb0 c;
    public final jke d;
    public final fx6 e;
    public final String f;
    public final boolean g;

    public yv6(mx6 mx6Var, oln0 oln0Var, xnb0 xnb0Var, jke jkeVar, fx6 fx6Var, String str, boolean z) {
        str.getClass();
        this.f43305a = mx6Var;
        this.b = oln0Var;
        this.c = xnb0Var;
        this.d = jkeVar;
        this.e = fx6Var;
        this.f = str;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv6)) {
            return false;
        }
        yv6 yv6Var = (yv6) obj;
        return this.f43305a.equals(yv6Var.f43305a) && this.b.equals(yv6Var.b) && this.c.equals(yv6Var.c) && this.d.equals(yv6Var.d) && this.e == yv6Var.e && Intrinsics.d(this.f, yv6Var.f) && this.g == yv6Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f43305a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldContentUiState(fieldState=");
        sb.append(this.f43305a);
        sb.append(", supportingTextState=");
        sb.append(this.b);
        sb.append(", potentialWinState=");
        sb.append(this.c);
        sb.append(", controlsState=");
        sb.append(this.d);
        sb.append(", betFieldStyle=");
        sb.append(this.e);
        sb.append(", betCurrency=");
        sb.append(this.f);
        sb.append(", isVisible=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
