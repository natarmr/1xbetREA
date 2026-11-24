package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jjr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16632a;
    public final mtr0 b;
    public final vnr0 c;

    public jjr0(String str, mtr0 mtr0Var, vnr0 vnr0Var) {
        str.getClass();
        mtr0Var.getClass();
        this.f16632a = str;
        this.b = mtr0Var;
        this.c = vnr0Var;
    }

    public static jjr0 a(jjr0 jjr0Var, mtr0 mtr0Var, int i) {
        String str = (i & 1) != 0 ? jjr0Var.f16632a : "";
        if ((i & 2) != 0) {
            mtr0Var = jjr0Var.b;
        }
        vnr0 vnr0Var = jjr0Var.c;
        str.getClass();
        mtr0Var.getClass();
        return new jjr0(str, mtr0Var, vnr0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjr0)) {
            return false;
        }
        jjr0 jjr0Var = (jjr0) obj;
        return Intrinsics.d(this.f16632a, jjr0Var.f16632a) && Intrinsics.d(this.b, jjr0Var.b) && this.c.equals(jjr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16632a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TotoTopBarState(backgroundImageUrl=" + this.f16632a + ", totoNavigationBarState=" + this.b + ", totoHeaderBannerState=" + this.c + Separators.RPAREN;
    }
}
