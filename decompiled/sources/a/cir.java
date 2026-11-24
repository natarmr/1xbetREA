package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class cir extends mir {
    public static final bir Companion = new bir();
    public static final a8z[] f = {null, maz.a(wez.f39042a, new s9r(12)), null, null};
    public final tir c;
    public final boolean d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cir(int i, String str, tir tirVar, boolean z, String str2) {
        super(i, str);
        if (6 != (i & 6)) {
            m2x.I(i, 6, air.f937a.getDescriptor());
            throw null;
        }
        this.c = tirVar;
        this.d = z;
        if ((i & 8) == 0) {
            this.e = "GPWebAppShowGameState";
        } else {
            this.e = str2;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cir)) {
            return false;
        }
        cir cirVar = (cir) obj;
        return this.c == cirVar.c && this.d == cirVar.d && Intrinsics.d(this.e, cirVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GPWebAppShowGameState(state=");
        sb.append(this.c);
        sb.append(", bonusActive=");
        sb.append(this.d);
        sb.append(", eventName=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
