package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mgr extends mir {
    public static final lgr Companion = new lgr();
    public final long c;
    public final double d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mgr(int i, String str, long j, double d, String str2) {
        super(i, str);
        if (6 != (i & 6)) {
            m2x.I(i, 6, kgr.f18253a.getDescriptor());
            throw null;
        }
        this.c = j;
        this.d = d;
        if ((i & 8) == 0) {
            this.e = "GPWebAppSetBalance";
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
        if (!(obj instanceof mgr)) {
            return false;
        }
        mgr mgrVar = (mgr) obj;
        return this.c == mgrVar.c && Double.compare(this.d, mgrVar.d) == 0 && Intrinsics.d(this.e, mgrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.d(this.d, Long.hashCode(this.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.c, "GPWebAppSetBalance(accountId=", ", balance=");
        hne.w(sbQ, this.d, ", eventName=", this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public mgr(double d, long j) {
        this.c = j;
        this.d = d;
        this.e = "GPWebAppSetBalance";
    }
}
