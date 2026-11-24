package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gib0 implements hib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11337a;
    public final aib0 b;

    public gib0(boolean z, aib0 aib0Var) {
        this.f11337a = z;
        this.b = aib0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gib0)) {
            return false;
        }
        gib0 gib0Var = (gib0) obj;
        return this.f11337a == gib0Var.f11337a && this.b == gib0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f11337a) * 31);
    }

    public final String toString() {
        return "OnSettingsToggleClick(isChecked=" + this.f11337a + ", type=" + this.b + Separators.RPAREN;
    }
}
