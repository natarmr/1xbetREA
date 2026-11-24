package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n5s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22960a;

    public n5s0(String str) {
        str.getClass();
        this.f22960a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5s0) && Intrinsics.d(this.f22960a, ((n5s0) obj).f22960a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f22960a;
    }

    public final int hashCode() {
        return this.f22960a.hashCode();
    }

    public final String toString() {
        return kng0.l("TournamentShimmerUiItem(key=", this.f22960a, Separators.RPAREN);
    }
}
