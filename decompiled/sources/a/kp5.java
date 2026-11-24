package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f18660a;
    public final gp5 b;

    public kp5(o0x o0xVar, gp5 gp5Var) {
        o0xVar.getClass();
        gp5Var.getClass();
        this.f18660a = o0xVar;
        this.b = gp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp5)) {
            return false;
        }
        kp5 kp5Var = (kp5) obj;
        return Intrinsics.d(this.f18660a, kp5Var.f18660a) && Intrinsics.d(this.b, kp5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18660a.hashCode() * 31);
    }

    public final String toString() {
        return "BannerImageItems(picture=" + this.f18660a + ", placeHolder=" + this.b + Separators.RPAREN;
    }
}
