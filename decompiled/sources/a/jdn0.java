package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jdn0 implements mdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f16337a;

    public jdn0(i4 i4Var) {
        i4Var.getClass();
        this.f16337a = i4Var;
    }

    @Override // a.mdn0
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdn0) && Intrinsics.d(this.f16337a, ((jdn0) obj).f16337a);
    }

    public final int hashCode() {
        return this.f16337a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "Loading(isRefreshing=false, shimmerList=" + this.f16337a + Separators.RPAREN;
    }
}
