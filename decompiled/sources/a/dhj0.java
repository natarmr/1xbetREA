package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class dhj0 implements ehj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6094a;
    public final String b;
    public final i8m0 c;
    public final boolean d;

    public dhj0(String str, String str2, i8m0 i8m0Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.f6094a = str;
        this.b = str2;
        this.c = i8m0Var;
        this.d = z;
    }

    @Override // a.ehj0
    public final int b() {
        return R.drawable.ic_glyph_lock;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhj0)) {
            return false;
        }
        dhj0 dhj0Var = (dhj0) obj;
        return Intrinsics.d(this.f6094a, dhj0Var.f6094a) && Intrinsics.d(this.b, dhj0Var.b) && this.c == dhj0Var.c && this.d == dhj0Var.d;
    }

    @Override // a.ehj0
    public final String getSubTitle() {
        return this.b;
    }

    @Override // a.ehj0
    public final String getTitle() {
        return this.f6094a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_lock, this.f6094a.hashCode() * 31, 31), 31, this.b), 961), 31, this.d);
    }

    @Override // a.ehj0
    public final boolean i() {
        return this.d;
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
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_lock, "SettingsSecurityUiModel(title=", this.f6094a, ", image=", ", subTitle=");
        sbP.append(this.b);
        sbP.append(", stateStatus=");
        sbP.append(this.c);
        sbP.append(", endText=, enable=");
        return rw2.p(sbP, this.d, ", clickable=true)");
    }

    @Override // a.ehj0
    public final i8m0 y() {
        return this.c;
    }
}
