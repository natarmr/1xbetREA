package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class vgj0 implements wgj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37383a;
    public final String b;
    public final i8m0 c;
    public final boolean d;

    public vgj0(String str, String str2, i8m0 i8m0Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.f37383a = str;
        this.b = str2;
        this.c = i8m0Var;
        this.d = z;
    }

    @Override // a.wgj0
    public final int b() {
        return R.drawable.ic_glyph_lock;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgj0)) {
            return false;
        }
        vgj0 vgj0Var = (vgj0) obj;
        return Intrinsics.d(this.f37383a, vgj0Var.f37383a) && Intrinsics.d(this.b, vgj0Var.b) && this.c == vgj0Var.c && this.d == vgj0Var.d;
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
        return this.f37383a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(w6x.g(this.c, ua80.b(twn.a(R.drawable.ic_glyph_lock, this.f37383a.hashCode() * 31, 31), 31, this.b), 961), 31, this.d), 31, true), 31, false);
    }

    @Override // a.wgj0
    public final boolean i() {
        return this.d;
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
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_lock, "SettingsSecurityUiModel(title=", this.f37383a, ", image=", ", subTitle=");
        sbP.append(this.b);
        sbP.append(", stateStatus=");
        sbP.append(this.c);
        sbP.append(", endText=, enable=");
        return rw2.p(sbP, this.d, ", clickable=true, first=false, last=false)");
    }

    @Override // a.wgj0
    public final i8m0 y() {
        return this.c;
    }
}
