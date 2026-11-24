package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class air0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f938a;
    public final imm b;
    public final aor0 c;
    public final iur0 d;
    public final boolean e;
    public final boolean f;

    public air0(String str, imm immVar, aor0 aor0Var, iur0 iur0Var, boolean z, boolean z2) {
        str.getClass();
        immVar.getClass();
        aor0Var.getClass();
        iur0Var.getClass();
        this.f938a = str;
        this.b = immVar;
        this.c = aor0Var;
        this.d = iur0Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof air0)) {
            return false;
        }
        air0 air0Var = (air0) obj;
        return Intrinsics.d(this.f938a, air0Var.f938a) && Intrinsics.d(this.b, air0Var.b) && Intrinsics.d(this.c, air0Var.c) && Intrinsics.d(this.d, air0Var.d) && this.e == air0Var.e && this.f == air0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e((this.d.hashCode() + ((this.c.hashCode() + h97.a(this.b, this.f938a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoActiveTirageUiState(backgroundImageUrl=");
        sb.append(this.f938a);
        sb.append(", dsNavigationBarUiModel=");
        sb.append(this.b);
        sb.append(", totoHeaderBannerUiState=");
        sb.append(this.c);
        sb.append(", totoOutcomesUiState=");
        sb.append(this.d);
        sb.append(", isScrollToTopRequested=");
        return ohs0.p(", showMakeBetLoader=", Separators.RPAREN, sb, this.e, this.f);
    }
}
