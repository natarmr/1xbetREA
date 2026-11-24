package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class pir {
    public static final oir Companion = new oir();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27057a;
    public final Long b;
    public final Double c;

    public /* synthetic */ pir(int i, int i2, Long l, Double d) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, nir.f23603a.getDescriptor());
            throw null;
        }
        this.f27057a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pir)) {
            return false;
        }
        pir pirVar = (pir) obj;
        return this.f27057a == pirVar.f27057a && Intrinsics.d(this.b, pirVar.b) && Intrinsics.d(this.c, pirVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f27057a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "GPWebAppBonusRequest(type=" + this.f27057a + ", gameId=" + this.b + ", freeBetSum=" + this.c + Separators.RPAREN;
    }

    public pir(int i, Long l, Double d) {
        this.f27057a = i;
        this.b = l;
        this.c = d;
    }
}
