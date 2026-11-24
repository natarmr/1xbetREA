package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zv6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx6 f45042a;
    public final pln0 b;
    public final wnb0 c;
    public final kke d;
    public final gx6 e;
    public final String f;
    public final boolean g;

    public zv6(nx6 nx6Var, pln0 pln0Var, wnb0 wnb0Var, kke kkeVar, gx6 gx6Var, String str, boolean z) {
        str.getClass();
        this.f45042a = nx6Var;
        this.b = pln0Var;
        this.c = wnb0Var;
        this.d = kkeVar;
        this.e = gx6Var;
        this.f = str;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv6)) {
            return false;
        }
        zv6 zv6Var = (zv6) obj;
        return this.f45042a.equals(zv6Var.f45042a) && this.b.equals(zv6Var.b) && this.c.equals(zv6Var.c) && this.d.equals(zv6Var.d) && this.e == zv6Var.e && Intrinsics.d(this.f, zv6Var.f) && this.g == zv6Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f45042a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldContentUiState(fieldState=");
        sb.append(this.f45042a);
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
