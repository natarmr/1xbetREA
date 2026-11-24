package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vgb implements ygb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37374a;

    public final boolean equals(Object obj) {
        if (obj instanceof vgb) {
            return Intrinsics.d(this.f37374a, ((vgb) obj).f37374a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37374a.hashCode();
    }

    public final String toString() {
        return kng0.l("ChampName(value=", this.f37374a, Separators.RPAREN);
    }
}
