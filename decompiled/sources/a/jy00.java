package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jy00 implements yy00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17336a;

    public final boolean equals(Object obj) {
        if (obj instanceof jy00) {
            return Intrinsics.d(this.f17336a, ((jy00) obj).f17336a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17336a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnBestHeroesPlayerClick(value=", this.f17336a, Separators.RPAREN);
    }
}
