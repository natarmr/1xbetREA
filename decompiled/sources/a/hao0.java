package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12734a;
    public final boolean b;

    public hao0(String str, boolean z) {
        this.f12734a = str;
        this.b = z;
    }

    public static hao0 a(hao0 hao0Var, boolean z) {
        String str = hao0Var.f12734a;
        hao0Var.getClass();
        return new hao0(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hao0)) {
            return false;
        }
        hao0 hao0Var = (hao0) obj;
        return this.f12734a.equals(hao0Var.f12734a) && this.b == hao0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12734a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("SystemTypeUiModel(systemTypeTitle=", this.f12734a, ", isLoading=", this.b, Separators.RPAREN);
    }
}
