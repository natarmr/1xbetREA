package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ltc0 implements otc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20624a;

    public final boolean equals(Object obj) {
        if (obj instanceof ltc0) {
            return Intrinsics.d(this.f20624a, ((ltc0) obj).f20624a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20624a.hashCode();
    }

    public final String toString() {
        return kng0.l("Subtitle(value=", this.f20624a, Separators.RPAREN);
    }
}
