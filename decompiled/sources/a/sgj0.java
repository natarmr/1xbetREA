package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class sgj0 implements wgj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32164a;
    public final String b;
    public final i8m0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public sgj0(String str, String str2, i8m0 i8m0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        this.f32164a = str;
        this.b = str2;
        this.c = i8m0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override // a.wgj0
    public final int b() {
        return R.drawable.ic_glyph_document;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgj0)) {
            return false;
        }
        sgj0 sgj0Var = (sgj0) obj;
        return Intrinsics.d(this.f32164a, sgj0Var.f32164a) && Intrinsics.d(this.b, sgj0Var.b) && this.c == sgj0Var.c && this.d == sgj0Var.d && this.e == sgj0Var.e && this.f == sgj0Var.f && this.g == sgj0Var.g;
    }

    @Override // a.wgj0
    public final boolean getFirst() {
        return this.f;
    }

    @Override // a.wgj0
    public final boolean getLast() {
        return this.g;
    }

    @Override // a.wgj0
    public final String getSubTitle() {
        return this.b;
    }

    @Override // a.wgj0
    public final String getTitle() {
        return this.f32164a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(brm0.e(brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_document, this.f32164a.hashCode() * 31, 31), 31, this.b), 961), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // a.wgj0
    public final boolean i() {
        return this.d;
    }

    @Override // a.wgj0
    public final boolean k() {
        return this.e;
    }

    @Override // a.wgj0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_document, "IdentificationUiModel(title=", this.f32164a, ", image=", ", subTitle=");
        sbP.append(this.b);
        sbP.append(", stateStatus=");
        sbP.append(this.c);
        sbP.append(", endText=, enable=");
        ua80.u(", clickable=", ", first=", sbP, this.d, this.e);
        return ohs0.p(", last=", Separators.RPAREN, sbP, this.f, this.g);
    }

    @Override // a.wgj0
    public final i8m0 y() {
        return this.c;
    }
}
