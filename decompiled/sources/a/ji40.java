package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ji40 implements li40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f16558a;
    public final a4x b;
    public final a4x c;

    public ji40(m0x m0xVar, i4 i4Var, i4 i4Var2) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f16558a = m0xVar;
        this.b = i4Var;
        this.c = i4Var2;
    }

    @Override // a.li40
    public final o0x b() {
        return this.f16558a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji40)) {
            return false;
        }
        ji40 ji40Var = (ji40) obj;
        return this.f16558a.equals(ji40Var.f16558a) && Intrinsics.d(this.b, ji40Var.b) && Intrinsics.d(this.c, ji40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f16558a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Active(image=");
        sb.append(this.f16558a);
        sb.append(", heroes=");
        sb.append(this.b);
        sb.append(", towers=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
