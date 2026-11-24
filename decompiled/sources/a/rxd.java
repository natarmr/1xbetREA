package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rxd implements vxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31259a;

    public rxd(String str) {
        str.getClass();
        this.f31259a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxd) && Intrinsics.d(this.f31259a, ((rxd) obj).f31259a);
    }

    public final int hashCode() {
        return pek0.f26859a.hashCode() + (this.f31259a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMessage(message=" + this.f31259a + ", snackbarType=" + pek0.f26859a + Separators.RPAREN;
    }
}
