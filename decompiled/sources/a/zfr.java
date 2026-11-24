package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zfr extends mir {
    public static final yfr Companion = new yfr();
    public final String c;

    public /* synthetic */ zfr(int i, String str, String str2) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = "GPWebAppAnalyticEvent";
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
        return (obj instanceof zfr) && Intrinsics.d(this.c, ((zfr) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return kng0.l("GPWebAppAnalyticEvent(eventName=", this.c, Separators.RPAREN);
    }

    public zfr() {
        this.c = "GPWebAppAnalyticEvent";
    }
}
