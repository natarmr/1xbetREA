package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class chj0 implements ehj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4363a;
    public final String b;
    public final i8m0 c;

    public chj0(String str, String str2, i8m0 i8m0Var) {
        str.getClass();
        str2.getClass();
        i8m0Var.getClass();
        this.f4363a = str;
        this.b = str2;
        this.c = i8m0Var;
    }

    @Override // a.ehj0
    public final int b() {
        return R.drawable.ic_glyph_proxy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chj0)) {
            return false;
        }
        chj0 chj0Var = (chj0) obj;
        return Intrinsics.d(this.f4363a, chj0Var.f4363a) && Intrinsics.d(this.b, chj0Var.b) && this.c == chj0Var.c;
    }

    @Override // a.ehj0
    public final String getSubTitle() {
        return this.b;
    }

    @Override // a.ehj0
    public final String getTitle() {
        return this.f4363a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_proxy, this.f4363a.hashCode() * 31, 31), 31, this.b), 961), 31, true);
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
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_proxy, "ProxySettingsUiModel(title=", this.f4363a, ", image=", ", subTitle=");
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
