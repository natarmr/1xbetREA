package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hxu f5131a;
    public final String b;
    public final e4f c;

    static {
        hxu hxuVar = hxu.h;
    }

    public cxo0(hxu hxuVar, String str, e4f e4fVar) {
        hxuVar.getClass();
        str.getClass();
        this.f5131a = hxuVar;
        this.b = str;
        this.c = e4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxo0)) {
            return false;
        }
        cxo0 cxo0Var = (cxo0) obj;
        return Intrinsics.d(this.f5131a, cxo0Var.f5131a) && Intrinsics.d(this.b, cxo0Var.b) && this.c == cxo0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f5131a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "BetTax(taxModel=" + this.f5131a + ", currencySymbol=" + this.b + ", status=" + this.c + Separators.RPAREN;
    }
}
