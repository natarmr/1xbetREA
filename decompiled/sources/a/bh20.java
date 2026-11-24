package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bh20 {
    public static final ah20 Companion = new ah20();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2584a;
    public final Double b;
    public final p1f c;

    public /* synthetic */ bh20(int i, String str, Double d, p1f p1fVar) {
        if ((i & 1) == 0) {
            this.f2584a = null;
        } else {
            this.f2584a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = p1fVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh20)) {
            return false;
        }
        bh20 bh20Var = (bh20) obj;
        return Intrinsics.d(this.f2584a, bh20Var.f2584a) && Intrinsics.d(this.b, bh20Var.b) && Intrinsics.d(this.c, bh20Var.c);
    }

    public final int hashCode() {
        String str = this.f2584a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        p1f p1fVar = this.c;
        return iHashCode2 + (p1fVar != null ? p1fVar.hashCode() : 0);
    }

    public final String toString() {
        return "MakeBetViaConstructorResponse(id=" + this.f2584a + ", balance=" + this.b + ", couponResponse=" + this.c + Separators.RPAREN;
    }
}
