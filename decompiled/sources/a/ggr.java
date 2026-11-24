package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ggr extends mir {
    public static final fgr Companion = new fgr();
    public final String c;

    public /* synthetic */ ggr(int i, String str, String str2) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = "GPWebAppRefreshPage";
        } else {
            this.c = str2;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggr) && Intrinsics.d(this.c, ((ggr) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return kng0.l("GPWebAppRefreshPage(eventName=", this.c, Separators.RPAREN);
    }
}
