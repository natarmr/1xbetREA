package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mi7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21830a;

    public final boolean equals(Object obj) {
        if (obj instanceof mi7) {
            return Intrinsics.d(this.f21830a, ((mi7) obj).f21830a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21830a.hashCode();
    }

    public final String toString() {
        return kng0.l("DeleteOrder(betId=", this.f21830a, Separators.RPAREN);
    }
}
