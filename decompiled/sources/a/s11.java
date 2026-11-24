package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s11 implements w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f31433a;
    public final bd b;
    public final boolean c;
    public final j7v d;
    public final a4x e;

    public s11(imm immVar, bd bdVar, boolean z, j7v j7vVar, i4 i4Var) {
        immVar.getClass();
        bdVar.getClass();
        j7vVar.getClass();
        i4Var.getClass();
        this.f31433a = immVar;
        this.b = bdVar;
        this.c = z;
        this.d = j7vVar;
        this.e = i4Var;
    }

    @Override // a.w11
    public final imm a() {
        return this.f31433a;
    }

    @Override // a.w11
    public final bd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s11)) {
            return false;
        }
        s11 s11Var = (s11) obj;
        return Intrinsics.d(this.f31433a, s11Var.f31433a) && Intrinsics.d(this.b, s11Var.b) && this.c == s11Var.c && Intrinsics.d(this.d, s11Var.d) && Intrinsics.d(this.e, s11Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f31433a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(navigationBarUiModel=");
        sb.append(this.f31433a);
        sb.append(", accountBalance=");
        sb.append(this.b);
        sb.append(", resetScroll=");
        sb.append(this.c);
        sb.append(", chipsModel=");
        sb.append(this.d);
        sb.append(", cards=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
