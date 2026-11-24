package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class t6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dzc0 f33412a;
    public final boolean b;

    public t6c0(dzc0 dzc0Var, boolean z) {
        this.f33412a = dzc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6c0)) {
            return false;
        }
        t6c0 t6c0Var = (t6c0) obj;
        return this.f33412a.equals(t6c0Var.f33412a) && this.b == t6c0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f33412a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoBetTabKeyModel(promocodeState=" + this.f33412a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
