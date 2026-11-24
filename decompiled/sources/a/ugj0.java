package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ugj0 implements wgj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35627a;
    public final String b;
    public final i8m0 c;
    public final boolean d;
    public final boolean e;

    public ugj0(String str, String str2, i8m0 i8m0Var, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        i8m0Var.getClass();
        this.f35627a = str;
        this.b = str2;
        this.c = i8m0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // a.wgj0
    public final int b() {
        return R.drawable.ic_glyph_proxy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugj0)) {
            return false;
        }
        ugj0 ugj0Var = (ugj0) obj;
        return Intrinsics.d(this.f35627a, ugj0Var.f35627a) && Intrinsics.d(this.b, ugj0Var.b) && this.c == ugj0Var.c && this.d == ugj0Var.d && this.e == ugj0Var.e;
    }

    @Override // a.wgj0
    public final boolean getFirst() {
        return this.d;
    }

    @Override // a.wgj0
    public final boolean getLast() {
        return this.e;
    }

    @Override // a.wgj0
    public final String getSubTitle() {
        return this.b;
    }

    @Override // a.wgj0
    public final String getTitle() {
        return this.f35627a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_proxy, this.f35627a.hashCode() * 31, 31), 31, this.b), 961), 31, true), 31, true), 31, this.d);
    }

    @Override // a.wgj0
    public final boolean i() {
        return true;
    }

    @Override // a.wgj0
    public final boolean k() {
        return true;
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
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_proxy, "ProxySettingsUiModel(title=", this.f35627a, ", image=", ", subTitle=");
        sbP.append(this.b);
        sbP.append(", stateStatus=");
        sbP.append(this.c);
        sbP.append(", endText=, enable=true, clickable=true, first=");
        return ohs0.p(", last=", Separators.RPAREN, sbP, this.d, this.e);
    }

    @Override // a.wgj0
    public final i8m0 y() {
        return this.c;
    }
}
