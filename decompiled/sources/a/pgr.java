package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class pgr extends mir {
    public static final ogr Companion = new ogr();
    public final long c;
    public final boolean d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgr(int i, long j, String str, String str2, boolean z) {
        super(i, str);
        if (6 != (i & 6)) {
            m2x.I(i, 6, ngr.f23497a.getDescriptor());
            throw null;
        }
        this.c = j;
        this.d = z;
        if ((i & 8) == 0) {
            this.e = "GPWebAppSetDemo";
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
        if (!(obj instanceof pgr)) {
            return false;
        }
        pgr pgrVar = (pgr) obj;
        return this.c == pgrVar.c && this.d == pgrVar.d && Intrinsics.d(this.e, pgrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(Long.hashCode(this.c) * 31, 31, this.d);
    }

    public final String toString() {
        return rw2.o(kng0.r(this.c, "GPWebAppSetDemo(gameId=", ", status=", this.d), ", eventName=", this.e, Separators.RPAREN);
    }

    public pgr(boolean z, long j) {
        this.c = j;
        this.d = z;
        this.e = "GPWebAppSetDemo";
    }
}
