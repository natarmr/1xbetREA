package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mm5 implements qm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f22020a;
    public final boolean b;
    public final ql5 c;

    public mm5(ke keVar, ql5 ql5Var, boolean z) {
        keVar.getClass();
        ql5Var.getClass();
        this.f22020a = keVar;
        this.b = z;
        this.c = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm5)) {
            return false;
        }
        mm5 mm5Var = (mm5) obj;
        return Intrinsics.d(this.f22020a, mm5Var.f22020a) && this.b == mm5Var.b && Intrinsics.d(this.c, mm5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f22020a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Value(accountInfo=" + this.f22020a + ", isCanChangeBalance=" + this.b + ", currentBalance=" + this.c + Separators.RPAREN;
    }
}
