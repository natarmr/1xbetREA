package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t93 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f33541a;

    public t93(i4 i4Var) {
        i4Var.getClass();
        this.f33541a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t93) && Intrinsics.d(this.f33541a, ((t93) obj).f33541a);
    }

    public final int hashCode() {
        return this.f33541a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f33541a, "AnotherAwardsUiModel(banners=", Separators.RPAREN);
    }
}
