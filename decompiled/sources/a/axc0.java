package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class axc0 implements bxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd50 f1618a;

    public axc0(hd50 hd50Var) {
        hd50Var.getClass();
        this.f1618a = hd50Var;
    }

    @Override // a.bxc0
    public final hd50 a() {
        return this.f1618a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axc0) && Intrinsics.d(this.f1618a, ((axc0) obj).f1618a);
    }

    public final int hashCode() {
        return this.f1618a.f12854a.hashCode();
    }

    public final String toString() {
        return "Loading(navigationBarUiState=" + this.f1618a + Separators.RPAREN;
    }
}
