package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qhr extends mir {
    public static final phr Companion = new phr();
    public final String c;
    public final double d;
    public final Double e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qhr(int i, String str, String str2, double d, Double d2, String str3) {
        super(i, str);
        if (6 != (i & 6)) {
            m2x.I(i, 6, ohr.f25278a.getDescriptor());
            throw null;
        }
        this.c = str2;
        this.d = d;
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 16) == 0) {
            this.f = "GPWebAppSetUserAccountBalance";
        } else {
            this.f = str3;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhr)) {
            return false;
        }
        qhr qhrVar = (qhr) obj;
        return Intrinsics.d(this.c, qhrVar.c) && Double.compare(this.d, qhrVar.d) == 0 && Intrinsics.d(this.e, qhrVar.e) && Intrinsics.d(this.f, qhrVar.f);
    }

    public final int hashCode() {
        int iD = brm0.d(this.d, this.c.hashCode() * 31, 31);
        Double d = this.e;
        return this.f.hashCode() + ((iD + (d == null ? 0 : d.hashCode())) * 31);
    }

    public final String toString() {
        return "GPWebAppSetUserAccountBalance(accountId=" + this.c + ", balance=" + this.d + ", totalDemoWinSum=" + this.e + ", eventName=" + this.f + Separators.RPAREN;
    }
}
