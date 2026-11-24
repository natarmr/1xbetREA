package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rxc0 implements uxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd50 f31258a;

    public rxc0(gd50 gd50Var) {
        gd50Var.getClass();
        this.f31258a = gd50Var;
    }

    @Override // a.uxc0
    public final gd50 a() {
        return this.f31258a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxc0) && Intrinsics.d(this.f31258a, ((rxc0) obj).f31258a);
    }

    public final int hashCode() {
        return this.f31258a.f11091a.hashCode();
    }

    public final String toString() {
        return "Content(navigationBarUiState=" + this.f31258a + Separators.RPAREN;
    }
}
