package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i8k implements j8k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14342a;

    public i8k(String str) {
        str.getClass();
        this.f14342a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8k) && Intrinsics.d(this.f14342a, ((i8k) obj).f14342a);
    }

    public final int hashCode() {
        return this.f14342a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f14342a, Separators.RPAREN);
    }
}
