package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class zgj0 implements ehj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44347a;
    public final String b;
    public final i8m0 c;

    public zgj0(String str, String str2, i8m0 i8m0Var) {
        str.getClass();
        str2.getClass();
        this.f44347a = str;
        this.b = str2;
        this.c = i8m0Var;
    }

    @Override // a.ehj0
    public final int b() {
        return R.drawable.ic_glyph_authenticator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgj0)) {
            return false;
        }
        zgj0 zgj0Var = (zgj0) obj;
        return Intrinsics.d(this.f44347a, zgj0Var.f44347a) && Intrinsics.d(this.b, zgj0Var.b) && this.c == zgj0Var.c;
    }

    @Override // a.ehj0
    public final String getSubTitle() {
        return this.b;
    }

    @Override // a.ehj0
    public final String getTitle() {
        return this.f44347a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_authenticator, this.f44347a.hashCode() * 31, 31), 31, this.b), 961), 31, true);
    }

    @Override // a.ehj0
    public final boolean i() {
        return true;
    }

    @Override // a.ehj0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_authenticator, "AuthenticatorUiModel(title=", this.f44347a, ", image=", ", subTitle=");
        sbP.append(this.b);
        sbP.append(", stateStatus=");
        sbP.append(this.c);
        sbP.append(", endText=, enable=true, clickable=true)");
        return sbP.toString();
    }

    @Override // a.ehj0
    public final i8m0 y() {
        return this.c;
    }
}
