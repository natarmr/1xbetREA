package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vsh0 implements fth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37951a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;

    public vsh0(int i, int i2, int i3, String str, String str2, boolean z) {
        str2.getClass();
        this.f37951a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsh0)) {
            return false;
        }
        vsh0 vsh0Var = (vsh0) obj;
        return this.f37951a.equals(vsh0Var.f37951a) && Intrinsics.d(this.b, vsh0Var.b) && this.c == vsh0Var.c && this.d == vsh0Var.d && this.e == vsh0Var.e && this.f == vsh0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(twn.a(this.e, twn.a(this.d, twn.a(this.c, brm0.e(ua80.b(this.f37951a.hashCode() * 31, 31, this.b), 31, true), 31), 31), 31), 31, this.f), 31, true);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Progress(title=", this.f37951a, ", description=", this.b, ", showDescription=true, progressBarValue=");
        axq.r(this.c, this.d, ", currentProgress=", ", completeProgress=", sbN);
        return ohs0.k(this.e, ", isPromoAvailable=", ", isFirst=true, isLast=false)", sbN, this.f);
    }
}
