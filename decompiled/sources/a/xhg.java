package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f40889a;
    public final bjg b;
    public final pgg c;
    public final String d;

    public xhg(imm immVar, bjg bjgVar, pgg pggVar, String str) {
        str.getClass();
        this.f40889a = immVar;
        this.b = bjgVar;
        this.c = pggVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhg)) {
            return false;
        }
        xhg xhgVar = (xhg) obj;
        return this.f40889a.equals(xhgVar.f40889a) && this.b.equals(xhgVar.b) && this.c.equals(xhgVar.c) && Intrinsics.d(this.d, xhgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f40889a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CyberChampsMainUiState(navBarModel=" + this.f40889a + ", tabs=" + this.b + ", filters=" + this.c + ", searchQuery=" + this.d + Separators.RPAREN;
    }
}
