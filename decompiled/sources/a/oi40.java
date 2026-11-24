package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oi40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f25294a;
    public final n0x b;
    public final Integer c;
    public final Long d;

    public oi40(n0x n0xVar, n0x n0xVar2, Integer num, Long l) {
        this.f25294a = n0xVar;
        this.b = n0xVar2;
        this.c = num;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi40)) {
            return false;
        }
        oi40 oi40Var = (oi40) obj;
        return this.f25294a.equals(oi40Var.f25294a) && this.b.equals(oi40Var.b) && Intrinsics.d(this.c, oi40Var.c) && Intrinsics.d(this.d, oi40Var.d);
    }

    public final int hashCode() {
        int iF = f140.f(this.b, this.f25294a.hashCode() * 31, 31);
        Integer num = this.c;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "MlbbGameTeamInfoHeroUiModel(image=" + this.f25294a + ", bwImage=" + this.b + ", positionIcon=" + this.c + ", respawnSeconds=" + this.d + Separators.RPAREN;
    }
}
