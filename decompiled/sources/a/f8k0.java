package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f8k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9110a;
    public final String b;
    public final h8k0 c;
    public final g8k0 d;
    public final g8k0 e;

    public f8k0(String str, String str2, h8k0 h8k0Var, g8k0 g8k0Var, g8k0 g8k0Var2) {
        str.getClass();
        this.f9110a = str;
        this.b = str2;
        this.c = h8k0Var;
        this.d = g8k0Var;
        this.e = g8k0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8k0)) {
            return false;
        }
        f8k0 f8k0Var = (f8k0) obj;
        return Intrinsics.d(this.f9110a, f8k0Var.f9110a) && this.b.equals(f8k0Var.b) && this.c == f8k0Var.c && this.d.equals(f8k0Var.d) && this.e.equals(f8k0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f9110a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SliderItemContent(title=", this.f9110a, ", currency=", this.b, ", sliderType=");
        sbN.append(this.c);
        sbN.append(", betStartValue=");
        sbN.append(this.d);
        sbN.append(", betEndValue=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
