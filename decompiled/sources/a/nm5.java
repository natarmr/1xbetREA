package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nm5 implements wm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f23757a;
    public final boolean b;
    public final ql5 c;

    public nm5(ke keVar, ql5 ql5Var, boolean z) {
        keVar.getClass();
        ql5Var.getClass();
        this.f23757a = keVar;
        this.b = z;
        this.c = ql5Var;
    }

    public static nm5 a(nm5 nm5Var, boolean z) {
        ke keVar = nm5Var.f23757a;
        ql5 ql5Var = nm5Var.c;
        nm5Var.getClass();
        keVar.getClass();
        ql5Var.getClass();
        return new nm5(keVar, ql5Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm5)) {
            return false;
        }
        nm5 nm5Var = (nm5) obj;
        return Intrinsics.d(this.f23757a, nm5Var.f23757a) && this.b == nm5Var.b && Intrinsics.d(this.c, nm5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f23757a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Value(accountInfo=" + this.f23757a + ", isCanChangeBalance=" + this.b + ", currentBalance=" + this.c + Separators.RPAREN;
    }
}
