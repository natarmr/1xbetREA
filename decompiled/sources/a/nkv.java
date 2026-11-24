package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class nkv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23699a;

    public nkv(boolean z) {
        this.f23699a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nkv) && this.f23699a == ((nkv) obj).f23699a;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23699a);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof nkv) && (p6t0Var2 instanceof nkv)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            k9x.G(linkedHashSet, new mkv(((nkv) p6t0Var).f23699a), new mkv(((nkv) p6t0Var2).f23699a));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        return kng0.l("HandShakeSettingsHeaderUiModel(handShakeEnabled=", defpackage.c.d("Enable(value=", Separators.RPAREN, this.f23699a), Separators.RPAREN);
    }
}
