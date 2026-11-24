package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n9u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23158a;
    public final o8u0 b;
    public final mbu0 c;

    public n9u0(List list, o8u0 o8u0Var, mbu0 mbu0Var) {
        list.getClass();
        this.f23158a = list;
        this.b = o8u0Var;
        this.c = mbu0Var;
    }

    public static n9u0 a(n9u0 n9u0Var, List list, o8u0 o8u0Var, int i) {
        if ((i & 1) != 0) {
            list = n9u0Var.f23158a;
        }
        mbu0 mbu0Var = n9u0Var.c;
        n9u0Var.getClass();
        list.getClass();
        return new n9u0(list, o8u0Var, mbu0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9u0)) {
            return false;
        }
        n9u0 n9u0Var = (n9u0) obj;
        return Intrinsics.d(this.f23158a, n9u0Var.f23158a) && this.b == n9u0Var.b && this.c == n9u0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f23158a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VerificationOptionsState(items=" + this.f23158a + ", verificationOptionsContentState=" + this.b + ", verificationType=" + this.c + Separators.RPAREN;
    }
}
