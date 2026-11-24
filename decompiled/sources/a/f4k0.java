package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f4k0 implements l4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8918a;

    public final boolean equals(Object obj) {
        if (obj instanceof f4k0) {
            return Intrinsics.d(this.f8918a, ((f4k0) obj).f8918a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8918a.hashCode();
    }

    public final String toString() {
        return kng0.l("EnemyTeamTitle(value=", this.f8918a, Separators.RPAREN);
    }
}
