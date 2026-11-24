package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i1j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14001a;

    public i1j0(String str) {
        str.getClass();
        this.f14001a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1j0) && Intrinsics.d(this.f14001a, ((i1j0) obj).f14001a);
    }

    public final int hashCode() {
        return this.f14001a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowQrError(message=", this.f14001a, Separators.RPAREN);
    }
}
