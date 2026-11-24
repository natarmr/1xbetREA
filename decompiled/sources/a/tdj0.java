package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class tdj0 implements vdj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33772a;
    public final boolean b;
    public final boolean c;

    public tdj0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f33772a = str;
        this.b = z;
        this.c = z2;
    }

    public static tdj0 c(tdj0 tdj0Var, boolean z) {
        String str = tdj0Var.f33772a;
        tdj0Var.getClass();
        tdj0Var.getClass();
        boolean z2 = tdj0Var.c;
        tdj0Var.getClass();
        tdj0Var.getClass();
        str.getClass();
        return new tdj0(str, z, z2);
    }

    @Override // a.vdj0
    public final int b() {
        return R.drawable.ic_glyph_conversion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdj0)) {
            return false;
        }
        tdj0 tdj0Var = (tdj0) obj;
        return Intrinsics.d(this.f33772a, tdj0Var.f33772a) && this.b == tdj0Var.b && this.c == tdj0Var.c;
    }

    @Override // a.vdj0
    public final boolean getFirst() {
        return this.c;
    }

    @Override // a.vdj0
    public final boolean getLast() {
        return true;
    }

    @Override // a.vdj0
    public final String getTitle() {
        return this.f33772a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_conversion, this.f33772a.hashCode() * 31, 31), 31, this.b), 31, true), 31, this.c);
    }

    @Override // a.vdj0
    public final boolean i() {
        return true;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return ohs0.p(", enable=true, first=", ", last=true)", kng0.p(R.drawable.ic_glyph_conversion, "GameCurrencyPopUpUiModel(title=", this.f33772a, ", image=", ", switched="), this.b, this.c);
    }

    @Override // a.vdj0
    public final boolean x() {
        return this.b;
    }
}
