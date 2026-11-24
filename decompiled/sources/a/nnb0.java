package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23813a;
    public final String b;
    public final String c;

    public nnb0(boolean z, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f23813a = z;
        this.b = str;
        this.c = str2;
    }

    public static nnb0 a(nnb0 nnb0Var, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = nnb0Var.f23813a;
        }
        if ((i & 2) != 0) {
            str = nnb0Var.b;
        }
        str.getClass();
        str2.getClass();
        return new nnb0(z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnb0)) {
            return false;
        }
        nnb0 nnb0Var = (nnb0) obj;
        return this.f23813a == nnb0Var.f23813a && Intrinsics.d(this.b, nnb0Var.b) && Intrinsics.d(this.c, nnb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f23813a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("PossibleWinStateModel(isVisible=", ", title=", this.b, this.f23813a, ", value="), this.c, Separators.RPAREN);
    }
}
