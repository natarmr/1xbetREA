package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class km1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc0 f18516a;

    public km1(uc0 uc0Var) {
        this.f18516a = uc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km1) && this.f18516a.equals(((km1) obj).f18516a);
    }

    public final int hashCode() {
        return this.f18516a.hashCode();
    }

    public final String toString() {
        return "ProvidersScreen(brandItemModel=" + this.f18516a + Separators.RPAREN;
    }
}
