package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cy8 implements fy8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f5160a;
    public final String b;
    public final imm c;
    public final vu8 d;
    public final ge70 e;
    public final imm f;
    public final pp0 g;

    public cy8(m0x m0xVar, String str, imm immVar, vu8 vu8Var, ge70 ge70Var, imm immVar2, pp0 pp0Var) {
        str.getClass();
        immVar.getClass();
        vu8Var.getClass();
        ge70Var.getClass();
        immVar2.getClass();
        pp0Var.getClass();
        this.f5160a = m0xVar;
        this.b = str;
        this.c = immVar;
        this.d = vu8Var;
        this.e = ge70Var;
        this.f = immVar2;
        this.g = pp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy8)) {
            return false;
        }
        cy8 cy8Var = (cy8) obj;
        return this.f5160a.equals(cy8Var.f5160a) && Intrinsics.d(this.b, cy8Var.b) && Intrinsics.d(this.c, cy8Var.c) && Intrinsics.d(this.d, cy8Var.d) && Intrinsics.d(this.e, cy8Var.e) && Intrinsics.d(this.f, cy8Var.f) && Intrinsics.d(this.g, cy8Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + h97.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + h97.a(this.c, ua80.b(this.f5160a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "OneXLive(titleImageLink=" + this.f5160a + ", bannerImageUrl=" + this.b + ", navigationBarUiModel=" + this.c + ", authSectionUiState=" + this.d + ", contentSectionUiState=" + this.e + ", navigationBarExpandedUiModel=" + this.f + ", filterUiModel=" + this.g + Separators.RPAREN;
    }
}
