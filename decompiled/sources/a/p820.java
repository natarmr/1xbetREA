package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p820 implements s820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wy6 f26535a;

    public p820(wy6 wy6Var) {
        wy6Var.getClass();
        this.f26535a = wy6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p820) && Intrinsics.d(this.f26535a, ((p820) obj).f26535a);
    }

    public final int hashCode() {
        return this.f26535a.hashCode();
    }

    public final String toString() {
        return "PrimaryBet(betGameInfo=" + this.f26535a + Separators.RPAREN;
    }
}
