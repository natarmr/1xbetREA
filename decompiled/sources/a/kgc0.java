package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kgc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vgc0 f18232a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final dxh0 e;
    public final a4x f;
    public final String g;
    public final String h;

    public kgc0(vgc0 vgc0Var, boolean z, boolean z2, String str, dxh0 dxh0Var, a4x a4xVar, String str2, String str3) {
        vgc0Var.getClass();
        a4xVar.getClass();
        str2.getClass();
        str3.getClass();
        this.f18232a = vgc0Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = dxh0Var;
        this.f = a4xVar;
        this.g = str2;
        this.h = str3;
    }

    public static kgc0 a(kgc0 kgc0Var, vgc0 vgc0Var, String str, int i) {
        if ((i & 1) != 0) {
            vgc0Var = kgc0Var.f18232a;
        }
        vgc0 vgc0Var2 = vgc0Var;
        boolean z = kgc0Var.b;
        boolean z2 = kgc0Var.c;
        dxh0 dxh0Var = kgc0Var.e;
        a4x a4xVar = kgc0Var.f;
        String str2 = kgc0Var.g;
        String str3 = kgc0Var.h;
        vgc0Var2.getClass();
        str.getClass();
        a4xVar.getClass();
        str2.getClass();
        str3.getClass();
        return new kgc0(vgc0Var2, z, z2, str, dxh0Var, a4xVar, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgc0)) {
            return false;
        }
        kgc0 kgc0Var = (kgc0) obj;
        return this.f18232a == kgc0Var.f18232a && this.b == kgc0Var.b && this.c == kgc0Var.c && this.d.equals(kgc0Var.d) && this.e.equals(kgc0Var.e) && Intrinsics.d(this.f, kgc0Var.f) && Intrinsics.d(this.g, kgc0Var.g) && Intrinsics.d(this.h, kgc0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(cs0.b(this.f, hne.h(this.e, ua80.b(brm0.e(brm0.e(this.f18232a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodesInternalState(currentTab=");
        sb.append(this.f18232a);
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
