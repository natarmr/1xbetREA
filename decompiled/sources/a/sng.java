package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32493a;

    public final boolean equals(Object obj) {
        if (obj instanceof sng) {
            return Intrinsics.d(this.f32493a, ((sng) obj).f32493a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32493a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerName(value=", this.f32493a, Separators.RPAREN);
    }
}
