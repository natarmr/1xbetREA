package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class sgr extends mir {
    public static final rgr Companion = new rgr();
    public static final a8z[] e = {null, maz.a(wez.f39042a, new s9r(10)), null};
    public final rir c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sgr(int i, String str, rir rirVar, String str2) {
        super(i, str);
        if (2 != (i & 2)) {
            m2x.I(i, 2, qgr.f28699a.getDescriptor());
            throw null;
        }
        this.c = rirVar;
        if ((i & 4) == 0) {
            this.d = "GPWebAppSetDemoStatus";
        } else {
            this.d = str2;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgr)) {
            return false;
        }
        sgr sgrVar = (sgr) obj;
        return this.c == sgrVar.c && Intrinsics.d(this.d, sgrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "GPWebAppSetDemoStatus(status=" + this.c + ", eventName=" + this.d + Separators.RPAREN;
    }
}
