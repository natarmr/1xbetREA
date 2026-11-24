package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18040a;
    public final int b;
    public final jc3 c;

    public kc3(String str, int i, jc3 jc3Var) {
        str.getClass();
        this.f18040a = str;
        this.b = i;
        this.c = jc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc3)) {
            return false;
        }
        kc3 kc3Var = (kc3) obj;
        return Intrinsics.d(this.f18040a, kc3Var.f18040a) && this.b == kc3Var.b && this.c.equals(kc3Var.c);
    }

    public final int hashCode() {
        return this.c.f16257a.hashCode() + twn.a(this.b, this.f18040a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "AppBarToolbarUiModel(champName=", this.f18040a, ", placeholder=", ", appBarImage=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
