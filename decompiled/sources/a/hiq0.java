package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class hiq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13128a;
    public final boolean b;

    public hiq0(String str, boolean z) {
        this.f13128a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiq0)) {
            return false;
        }
        hiq0 hiq0Var = (hiq0) obj;
        return this.f13128a.equals(hiq0Var.f13128a) && this.b == hiq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f13128a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("TimeIsEndStateModel(message=", this.f13128a, ", isExitButtonEnable=", this.b, Separators.RPAREN);
    }
}
