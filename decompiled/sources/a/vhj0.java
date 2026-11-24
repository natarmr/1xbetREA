package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class vhj0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37433a;
    public final String b;
    public final boolean c;

    public vhj0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f37433a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhj0)) {
            return false;
        }
        vhj0 vhj0Var = (vhj0) obj;
        return Intrinsics.d(this.f37433a, vhj0Var.f37433a) && Intrinsics.d(this.b, vhj0Var.b) && this.c == vhj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_coefficient, ua80.b(this.f37433a.hashCode() * 31, 31, this.b), 31), 31, true), 961, true), 31, this.c);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return ohs0.k(R.drawable.ic_glyph_coefficient, ", enable=true, clickable=true, endText=, first=", ", last=false)", b1j.n("CoefTypeUiModel(title=", this.f37433a, ", subTitle=", this.b, ", image="), this.c);
    }
}
