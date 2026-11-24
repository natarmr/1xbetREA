package a;

import android.gov.nist.core.Separators;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class dr90 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6548a;

    public dr90(String str) {
        this.f6548a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr90) && this.f6548a.equals(((dr90) obj).f6548a);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return true;
    }

    public final int hashCode() {
        return this.f6548a.hashCode();
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }

    public final String toString() {
        return kng0.l("PickerTitleUiModel(description=", this.f6548a, Separators.RPAREN);
    }
}
