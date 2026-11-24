package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ljo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20162a;
    public final kjo0 b;

    public ljo0(String str, kjo0 kjo0Var) {
        this.f20162a = str;
        this.b = kjo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljo0)) {
            return false;
        }
        ljo0 ljo0Var = (ljo0) obj;
        return this.f20162a.equals(ljo0Var.f20162a) && this.b == ljo0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20162a.hashCode() * 31);
    }

    public final String toString() {
        return "TableDataTypeModel(title=" + this.f20162a + ", type=" + this.b + Separators.RPAREN;
    }
}
