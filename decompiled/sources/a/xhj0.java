package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xhj0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40895a;
    public final String b;

    public xhj0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f40895a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhj0)) {
            return false;
        }
        xhj0 xhj0Var = (xhj0) obj;
        return Intrinsics.d(this.f40895a, xhj0Var.f40895a) && Intrinsics.d(this.b, xhj0Var.b);
    }

    public final int hashCode() {
        return brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_coefficient, ua80.b(this.f40895a.hashCode() * 31, 31, this.b), 31), 31, true), 31, true);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return rz4.j(R.drawable.ic_glyph_coefficient, ", enable=true, clickable=true, endText=)", b1j.n("CoefTypeUiModel(title=", this.f40895a, ", subTitle=", this.b, ", image="));
    }
}
