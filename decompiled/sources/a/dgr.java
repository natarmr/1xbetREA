package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dgr extends mir {
    public static final cgr Companion = new cgr();
    public final String c;

    public /* synthetic */ dgr(int i, String str, String str2) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = "GPWebAppInit";
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
        return (obj instanceof dgr) && Intrinsics.d(this.c, ((dgr) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return kng0.l("GPWebAppInit(eventName=", this.c, Separators.RPAREN);
    }
}
