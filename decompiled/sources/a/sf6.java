package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ol6 f32102a;
    public final boolean b;

    public sf6(ol6 ol6Var, boolean z) {
        this.f32102a = ol6Var;
        this.b = z;
    }

    public static sf6 a(sf6 sf6Var, ol6 ol6Var, int i) {
        if ((i & 1) != 0) {
            ol6Var = sf6Var.f32102a;
        }
        boolean z = (i & 2) != 0 ? sf6Var.b : false;
        ol6Var.getClass();
        return new sf6(ol6Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf6)) {
            return false;
        }
        sf6 sf6Var = (sf6) obj;
        return this.f32102a.equals(sf6Var.f32102a) && this.b == sf6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f32102a.hashCode() * 31);
    }

    public final String toString() {
        return "BetBuilderButtonStateModel(state=" + this.f32102a + ", isBadgeVisible=" + this.b + Separators.RPAREN;
    }
}
