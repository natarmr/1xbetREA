package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z0i0 implements b1i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43568a;

    public z0i0(String str) {
        str.getClass();
        this.f43568a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0i0) && Intrinsics.d(this.f43568a, ((z0i0) obj).f43568a);
    }

    public final int hashCode() {
        return this.f43568a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCashbackChangedDialog(message=", this.f43568a, Separators.RPAREN);
    }
}
