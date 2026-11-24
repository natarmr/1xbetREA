package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jxd implements vxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17301a;

    public jxd(String str) {
        str.getClass();
        this.f17301a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxd) && Intrinsics.d(this.f17301a, ((jxd) obj).f17301a);
    }

    public final int hashCode() {
        return this.f17301a.hashCode();
    }

    public final String toString() {
        return kng0.l("FillPushCode(code=", this.f17301a, Separators.RPAREN);
    }
}
