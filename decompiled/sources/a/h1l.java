package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12288a;

    public final boolean equals(Object obj) {
        if (obj instanceof h1l) {
            return Intrinsics.d(this.f12288a, ((h1l) obj).f12288a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12288a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnBestHeroesPlayerClick(value=", this.f12288a, Separators.RPAREN);
    }
}
