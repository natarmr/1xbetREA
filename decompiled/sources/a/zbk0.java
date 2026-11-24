package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class zbk0 implements dck0 {
    public static final ybk0 Companion = new ybk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44120a;

    public /* synthetic */ zbk0(int i, String str) {
        if (1 == (i & 1)) {
            this.f44120a = str;
        } else {
            m2x.I(i, 1, xbk0.f40605a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbk0) && Intrinsics.d(this.f44120a, ((zbk0) obj).f44120a);
    }

    public final int hashCode() {
        return this.f44120a.hashCode();
    }

    public final String toString() {
        return kng0.l("TelegramCodeDataRequest(codeType=", this.f44120a, Separators.RPAREN);
    }

    public zbk0(String str) {
        this.f44120a = str;
    }
}
