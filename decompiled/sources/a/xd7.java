package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xd7 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40681a;

    public final boolean equals(Object obj) {
        if (obj instanceof xd7) {
            return Intrinsics.d(this.f40681a, ((xd7) obj).f40681a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40681a.hashCode();
    }

    public final String toString() {
        return kng0.l("BetTitle(value=", this.f40681a, Separators.RPAREN);
    }
}
