package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qxd implements vxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29478a;

    public qxd(String str) {
        str.getClass();
        this.f29478a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxd) && Intrinsics.d(this.f29478a, ((qxd) obj).f29478a);
    }

    public final int hashCode() {
        return this.f29478a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowLimitErrorDialog(message=", this.f29478a, Separators.RPAREN);
    }
}
