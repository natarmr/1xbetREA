package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pvs0 implements rvs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27677a;
    public final String b;

    public pvs0(int i, String str) {
        this.f27677a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvs0)) {
            return false;
        }
        pvs0 pvs0Var = (pvs0) obj;
        return this.f27677a == pvs0Var.f27677a && this.b.equals(pvs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27677a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f27677a, "ServerException(errorCode=", ", errorMessage=", this.b, Separators.RPAREN);
    }
}
