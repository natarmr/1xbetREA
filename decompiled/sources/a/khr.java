package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class khr extends mir {
    public static final jhr Companion = new jhr();
    public static final a8z[] f = {null, maz.a(wez.f39042a, new s9r(11)), null, null};
    public final yir c;
    public final wir d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ khr(int i, String str, yir yirVar, wir wirVar, String str2) {
        super(i, str);
        if (2 != (i & 2)) {
            m2x.I(i, 2, ihr.f14794a.getDescriptor());
            throw null;
        }
        this.c = yirVar;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = wirVar;
        }
        if ((i & 8) == 0) {
            this.e = "GPWebAppSetRoute";
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
        if (!(obj instanceof khr)) {
            return false;
        }
        khr khrVar = (khr) obj;
        return this.c == khrVar.c && Intrinsics.d(this.d, khrVar.d) && Intrinsics.d(this.e, khrVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        wir wirVar = this.d;
        return this.e.hashCode() + ((iHashCode + (wirVar == null ? 0 : wirVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GPWebAppSetRoute(route=");
        sb.append(this.c);
        sb.append(", params=");
        sb.append(this.d);
        sb.append(", eventName=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
