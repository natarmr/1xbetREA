package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class npp0 implements wnp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23925a;

    public npp0(float f) {
        this.f23925a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npp0) && Float.compare(this.f23925a, ((npp0) obj).f23925a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23925a);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof npp0) && (p6t0Var2 instanceof npp0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            k9x.G(linkedHashSet, new mpp0(((npp0) p6t0Var).f23925a), new mpp0(((npp0) p6t0Var2).f23925a));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        return kng0.l("TeamsHeaderUiModel(rotationValue=", rw2.j(this.f23925a, "RotationValue(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
