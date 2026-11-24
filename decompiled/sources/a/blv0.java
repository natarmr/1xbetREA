package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class blv0 {
    public static final alv0 Companion = new alv0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2812a;
    public final elv0 b;

    static {
        dlv0 dlv0Var = elv0.Companion;
    }

    public /* synthetic */ blv0(int i, Long l, elv0 elv0Var) {
        if ((i & 1) == 0) {
            this.f2812a = null;
        } else {
            this.f2812a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = elv0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blv0)) {
            return false;
        }
        blv0 blv0Var = (blv0) obj;
        return Intrinsics.d(this.f2812a, blv0Var.f2812a) && Intrinsics.d(this.b, blv0Var.b);
    }

    public final int hashCode() {
        Long l = this.f2812a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        elv0 elv0Var = this.b;
        return iHashCode + (elv0Var != null ? elv0Var.hashCode() : 0);
    }

    public final String toString() {
        return "WinterGameResponse(sportId=" + this.f2812a + ", response=" + this.b + Separators.RPAREN;
    }
}
