package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ocv0 implements rcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3m0 f25047a;
    public final oxh0 b;

    public ocv0(i3m0 i3m0Var, oxh0 oxh0Var) {
        i3m0Var.getClass();
        this.f25047a = i3m0Var;
        this.b = oxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocv0)) {
            return false;
        }
        ocv0 ocv0Var = (ocv0) obj;
        return Intrinsics.d(this.f25047a, ocv0Var.f25047a) && this.b.equals(ocv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25047a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(selectedTab=" + this.f25047a + ", segmentsModel=" + this.b + Separators.RPAREN;
    }
}
