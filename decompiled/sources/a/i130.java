package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f13977a;
    public final ctc b;
    public final ms2 c;

    public i130(aud audVar, ctc ctcVar, ms2 ms2Var) {
        audVar.getClass();
        ctcVar.getClass();
        this.f13977a = audVar;
        this.b = ctcVar;
        this.c = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i130)) {
            return false;
        }
        i130 i130Var = (i130) obj;
        return Intrinsics.d(this.f13977a, i130Var.f13977a) && this.b == i130Var.b && this.c.equals(i130Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f13977a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AddEventToCouponHandle(configureCouponResultModel=" + this.f13977a + ", clickType=" + this.b + ", entryPointType=" + this.c + Separators.RPAREN;
    }
}
