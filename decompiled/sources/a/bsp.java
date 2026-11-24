package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bsp implements iqg {
    public static final asp Companion = new asp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3142a;
    public final Integer b;

    public /* synthetic */ bsp(int i, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f3142a = null;
        } else {
            this.f3142a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsp)) {
            return false;
        }
        bsp bspVar = (bsp) obj;
        return Intrinsics.d(this.f3142a, bspVar.f3142a) && Intrinsics.d(this.b, bspVar.b);
    }

    public final int hashCode() {
        Long l = this.f3142a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "FifaResponse(tournamentId=" + this.f3142a + ", iteration=" + this.b + Separators.RPAREN;
    }

    public bsp() {
        this.f3142a = null;
        this.b = null;
    }
}
