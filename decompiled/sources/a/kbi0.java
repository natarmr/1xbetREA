package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kbi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f18016a;
    public final List b;

    public kbi0(swp0 swp0Var, List list) {
        swp0Var.getClass();
        list.getClass();
        this.f18016a = swp0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbi0)) {
            return false;
        }
        kbi0 kbi0Var = (kbi0) obj;
        return Intrinsics.d(this.f18016a, kbi0Var.f18016a) && Intrinsics.d(this.b, kbi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18016a.hashCode() * 31);
    }

    public final String toString() {
        return "SendConfirmationActivationStateModel(temporaryToken=" + this.f18016a + ", availableActivateCodeType=" + this.b + Separators.RPAREN;
    }
}
