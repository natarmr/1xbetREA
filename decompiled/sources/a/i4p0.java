package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i4p0 implements k4p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14158a;

    public i4p0(String str) {
        str.getClass();
        this.f14158a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4p0) && Intrinsics.d(this.f14158a, ((i4p0) obj).f14158a);
    }

    public final int hashCode() {
        return this.f14158a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(message=", this.f14158a, Separators.RPAREN);
    }
}
