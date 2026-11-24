package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tm7 implements vm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aud f34179a;
    public final ctc b;

    public tm7(aud audVar, ctc ctcVar) {
        audVar.getClass();
        this.f34179a = audVar;
        this.b = ctcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm7)) {
            return false;
        }
        tm7 tm7Var = (tm7) obj;
        return Intrinsics.d(this.f34179a, tm7Var.f34179a) && this.b == tm7Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34179a.hashCode() * 31);
    }

    public final String toString() {
        return "HandleLongTapResult(configureCouponResultModel=" + this.f34179a + ", clickType=" + this.b + Separators.RPAREN;
    }
}
