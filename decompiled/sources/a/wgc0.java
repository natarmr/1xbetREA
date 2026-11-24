package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wgc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vgc0 f39109a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final dxh0 e;
    public final a4x f;
    public final String g;
    public final String h;

    public wgc0(vgc0 vgc0Var, boolean z, boolean z2, String str, dxh0 dxh0Var, a4x a4xVar, String str2, String str3) {
        vgc0Var.getClass();
        a4xVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f39109a = vgc0Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = dxh0Var;
        this.f = a4xVar;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgc0)) {
            return false;
        }
        wgc0 wgc0Var = (wgc0) obj;
        return this.f39109a == wgc0Var.f39109a && this.b == wgc0Var.b && this.c == wgc0Var.c && this.d.equals(wgc0Var.d) && this.e.equals(wgc0Var.e) && Intrinsics.d(this.f, wgc0Var.f) && Intrinsics.d(this.g, wgc0Var.g) && Intrinsics.d(this.h, wgc0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(cs0.b(this.f, hne.h(this.e, ua80.b(brm0.e(brm0.e(this.f39109a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodesScreenUiState(currentTab=");
        sb.append(this.f39109a);
        sb.append(", tabBarVisible=");
        sb.append(this.b);
        sb.append(", ruleIconVisible=");
        f140.s(", toolbarSubtitle=", this.d, ", segmentedControlStyle=", sb, this.c);
        sb.append(this.e);
        sb.append(", segments=");
        sb.append(this.f);
        sb.append(", navigationTitle=");
        return ua80.m(sb, this.g, ", myPromoCodesText=", this.h, Separators.RPAREN);
    }
}
