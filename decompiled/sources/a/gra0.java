package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gra0 implements kra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f11770a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public gra0(a4x a4xVar, String str, boolean z, boolean z2) {
        str.getClass();
        this.f11770a = a4xVar;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gra0)) {
            return false;
        }
        gra0 gra0Var = (gra0) obj;
        return this.f11770a.equals(gra0Var.f11770a) && Intrinsics.d(this.b, gra0Var.b) && this.c == gra0Var.c && this.d == gra0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f11770a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(champItems=");
        sb.append(this.f11770a);
        sb.append(", subtitleText=");
        sb.append(this.b);
        sb.append(", refreshing=");
        return ohs0.p(", scrollToTop=", Separators.RPAREN, sb, this.c, this.d);
    }
}
