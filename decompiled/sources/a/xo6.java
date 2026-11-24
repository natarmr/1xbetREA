package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xo6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41200a;

    public xo6(String str) {
        str.getClass();
        this.f41200a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo6) && Intrinsics.d(this.f41200a, ((xo6) obj).f41200a);
    }

    public final int hashCode() {
        return this.f41200a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShakeTeams(message=", this.f41200a, Separators.RPAREN);
    }
}
