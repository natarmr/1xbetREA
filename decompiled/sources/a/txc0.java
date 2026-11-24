package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class txc0 implements uxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd50 f34691a;

    public txc0(gd50 gd50Var) {
        gd50Var.getClass();
        this.f34691a = gd50Var;
    }

    @Override // a.uxc0
    public final gd50 a() {
        return this.f34691a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txc0) && Intrinsics.d(this.f34691a, ((txc0) obj).f34691a);
    }

    public final int hashCode() {
        return this.f34691a.f11091a.hashCode();
    }

    public final String toString() {
        return "Loading(navigationBarUiState=" + this.f34691a + Separators.RPAREN;
    }
}
