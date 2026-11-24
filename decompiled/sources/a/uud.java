package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uud implements evd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36294a;

    public uud(String str) {
        str.getClass();
        this.f36294a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uud) && Intrinsics.d(this.f36294a, ((uud) obj).f36294a);
    }

    public final int hashCode() {
        return this.f36294a.hashCode();
    }

    public final String toString() {
        return kng0.l("FillPushCode(code=", this.f36294a, Separators.RPAREN);
    }
}
