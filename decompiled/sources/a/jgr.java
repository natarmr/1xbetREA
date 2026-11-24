package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jgr extends mir {
    public static final igr Companion = new igr();
    public final long c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgr(int i, long j, String str, String str2) {
        super(i, str);
        if (2 != (i & 2)) {
            m2x.I(i, 2, hgr.f13026a.getDescriptor());
            throw null;
        }
        this.c = j;
        if ((i & 4) == 0) {
            this.d = "GPWebAppSetActiveUserAccount";
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
        if (!(obj instanceof jgr)) {
            return false;
        }
        jgr jgrVar = (jgr) obj;
        return this.c == jgrVar.c && Intrinsics.d(this.d, jgrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.c, "GPWebAppSetActiveUserAccount(accountId=", ", eventName=", this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public jgr(long j) {
        this.c = j;
        this.d = "GPWebAppSetActiveUserAccount";
    }
}
