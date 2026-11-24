package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sbv0 implements ubv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f31956a;
    public final ctc b;
    public final ms2 c;

    public sbv0(aud audVar, ctc ctcVar, ms2 ms2Var) {
        audVar.getClass();
        ctcVar.getClass();
        this.f31956a = audVar;
        this.b = ctcVar;
        this.c = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbv0)) {
            return false;
        }
        sbv0 sbv0Var = (sbv0) obj;
        return Intrinsics.d(this.f31956a, sbv0Var.f31956a) && this.b == sbv0Var.b && this.c.equals(sbv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f31956a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HandleLongTapResult(configureCouponResultModel=" + this.f31956a + ", clickType=" + this.b + ", entryPointType=" + this.c + Separators.RPAREN;
    }
}
