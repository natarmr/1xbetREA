package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mbg0 implements obg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21507a;

    public mbg0(String str) {
        str.getClass();
        this.f21507a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbg0) && Intrinsics.d(this.f21507a, ((mbg0) obj).f21507a);
    }

    public final int hashCode() {
        return this.f21507a.hashCode();
    }

    public final String toString() {
        return kng0.l("LoadUrl(url=", this.f21507a, Separators.RPAREN);
    }
}
