package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8996a;

    public final boolean equals(Object obj) {
        if (obj instanceof f67) {
            return Intrinsics.d(this.f8996a, ((f67) obj).f8996a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8996a.hashCode();
    }

    public final String toString() {
        return kng0.l("DeleteOrder(betId=", this.f8996a, Separators.RPAREN);
    }
}
