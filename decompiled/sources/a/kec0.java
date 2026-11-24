package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kec0 implements nec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18148a;
    public final boolean b;
    public final a4x c;
    public final mdm d;
    public final a4x e;
    public final String f;
    public final boolean g;
    public final ldc0 h;

    public kec0(a4x a4xVar, boolean z, a4x a4xVar2, mdm mdmVar, a4x a4xVar3, String str, boolean z2, ldc0 ldc0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        str.getClass();
        this.f18148a = a4xVar;
        this.b = z;
        this.c = a4xVar2;
        this.d = mdmVar;
        this.e = a4xVar3;
        this.f = str;
        this.g = z2;
        this.h = ldc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kec0)) {
            return false;
        }
        kec0 kec0Var = (kec0) obj;
        return Intrinsics.d(this.f18148a, kec0Var.f18148a) && this.b == kec0Var.b && Intrinsics.d(this.c, kec0Var.c) && this.d.equals(kec0Var.d) && Intrinsics.d(this.e, kec0Var.e) && Intrinsics.d(this.f, kec0Var.f) && this.g == kec0Var.g && this.h.equals(kec0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(ua80.b(cs0.b(this.e, f140.d(this.d, cs0.b(this.c, brm0.e(this.f18148a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "Content(chips=" + this.f18148a + ", isRefreshing=" + this.b + ", promoCodes=" + this.c + ", emptyConfig=" + this.d + ", recommendations=" + this.e + ", recommendationHeaderTitle=" + this.f + ", scrollToTop=" + this.g + ", accountInfo=" + this.h + Separators.RPAREN;
    }
}
