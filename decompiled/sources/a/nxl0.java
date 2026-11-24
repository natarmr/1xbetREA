package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nxl0 implements rxl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24288a;
    public final kvl0 b;

    public nxl0(String str, kvl0 kvl0Var) {
        this.f24288a = str;
        this.b = kvl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxl0)) {
            return false;
        }
        nxl0 nxl0Var = (nxl0) obj;
        return this.f24288a.equals(nxl0Var.f24288a) && this.b.equals(nxl0Var.b);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f24288a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24288a.hashCode() * 31);
    }

    public final String toString() {
        return "SingleStadiumDefaultUiModel(key=" + this.f24288a + ", stadium=" + this.b + Separators.RPAREN;
    }
}
