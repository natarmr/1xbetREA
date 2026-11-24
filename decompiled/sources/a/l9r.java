package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class l9r {
    public static final k9r Companion = new k9r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f19670a;
    public final long b;
    public final bg8 c;

    public /* synthetic */ l9r(int i, long j, bg8 bg8Var, Double d) {
        if (2 != (i & 2)) {
            m2x.I(i, 2, j9r.f16152a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f19670a = null;
        } else {
            this.f19670a = d;
        }
        this.b = j;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bg8Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9r)) {
            return false;
        }
        l9r l9rVar = (l9r) obj;
        return Intrinsics.d(this.f19670a, l9rVar.f19670a) && this.b == l9rVar.b && Intrinsics.d(this.c, l9rVar.c);
    }

    public final int hashCode() {
        Double d = this.f19670a;
        int iB = rw2.b((d == null ? 0 : d.hashCode()) * 31, 31, this.b);
        bg8 bg8Var = this.c;
        return iB + (bg8Var != null ? bg8Var.hashCode() : 0);
    }

    public final String toString() {
        return "FruitBlastGameRequest(betSum=" + this.f19670a + ", accountId=" + this.b + ", bonusRequest=" + this.c + Separators.RPAREN;
    }

    public l9r(long j, bg8 bg8Var, Double d) {
        this.f19670a = d;
        this.b = j;
        this.c = bg8Var;
    }
}
