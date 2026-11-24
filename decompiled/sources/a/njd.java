package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class njd implements sjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f23629a;
    public final ctc b;
    public final ms2 c;

    public njd(aud audVar, ctc ctcVar, ms2 ms2Var) {
        audVar.getClass();
        ctcVar.getClass();
        ms2Var.getClass();
        this.f23629a = audVar;
        this.b = ctcVar;
        this.c = ms2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njd)) {
            return false;
        }
        njd njdVar = (njd) obj;
        return Intrinsics.d(this.f23629a, njdVar.f23629a) && this.b == njdVar.b && Intrinsics.d(this.c, njdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f23629a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HandleLongTapResult(configureCouponResultModel=" + this.f23629a + ", clickType=" + this.b + ", entryPoint=" + this.c + Separators.RPAREN;
    }
}
