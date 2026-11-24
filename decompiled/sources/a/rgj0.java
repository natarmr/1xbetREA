package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class rgj0 implements wgj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30440a;
    public final String b;
    public final i8m0 c;
    public final boolean d;
    public final boolean e;

    public rgj0(String str, String str2, i8m0 i8m0Var, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f30440a = str;
        this.b = str2;
        this.c = i8m0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // a.wgj0
    public final int b() {
        return R.drawable.ic_glyph_authenticator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgj0)) {
            return false;
        }
        rgj0 rgj0Var = (rgj0) obj;
        return Intrinsics.d(this.f30440a, rgj0Var.f30440a) && Intrinsics.d(this.b, rgj0Var.b) && this.c == rgj0Var.c && this.d == rgj0Var.d && this.e == rgj0Var.e;
    }

    @Override // a.wgj0
    public final boolean getFirst() {
        return false;
    }

    @Override // a.wgj0
    public final boolean getLast() {
        return false;
    }

    @Override // a.wgj0
    public final String getSubTitle() {
        return this.b;
    }

    @Override // a.wgj0
    public final String getTitle() {
        return this.f30440a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_authenticator, this.f30440a.hashCode() * 31, 31), 31, this.b), 961), 31, this.d), 31, this.e), 31, false);
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
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_authenticator, "AuthenticatorUiModel(title=", this.f30440a, ", image=", ", subTitle=");
        sbP.append(this.b);
        sbP.append(", stateStatus=");
        sbP.append(this.c);
        sbP.append(", endText=, enable=");
        return ohs0.p(", clickable=", ", first=false, last=false)", sbP, this.d, this.e);
    }

    @Override // a.wgj0
    public final i8m0 y() {
        return this.c;
    }
}
