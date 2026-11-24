package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd f33694a;
    public final a4x b;

    public tc(fd fdVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f33694a = fdVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc)) {
            return false;
        }
        tc tcVar = (tc) obj;
        return this.f33694a.equals(tcVar.f33694a) && Intrinsics.d(this.b, tcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33694a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountActionsUiState(account=" + this.f33694a + ", actions=" + this.b + Separators.RPAREN;
    }
}
