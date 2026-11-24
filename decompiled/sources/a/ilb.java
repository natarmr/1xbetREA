package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ilb implements jlb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14968a;

    public ilb(String str) {
        str.getClass();
        this.f14968a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ilb) && Intrinsics.d(this.f14968a, ((ilb) obj).f14968a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f14968a;
    }

    public final int hashCode() {
        return this.f14968a.hashCode();
    }

    public final String toString() {
        return kng0.l("ChampionshipsCardShimmerUiItem(key=", this.f14968a, Separators.RPAREN);
    }
}
