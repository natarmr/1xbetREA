package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class thr extends mir {
    public static final shr Companion = new shr();
    public final String c;

    public /* synthetic */ thr(int i, String str, String str2) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = "GPWebAppShowAuthenticationFailed";
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
        return (obj instanceof thr) && Intrinsics.d(this.c, ((thr) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return kng0.l("GPWebAppShowAuthenticationFailed(eventName=", this.c, Separators.RPAREN);
    }
}
