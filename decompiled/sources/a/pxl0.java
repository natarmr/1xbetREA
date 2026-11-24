package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pxl0 implements rxl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27758a;
    public final mvl0 b;
    public final v12 c;

    public pxl0(String str, mvl0 mvl0Var, v12 v12Var) {
        this.f27758a = str;
        this.b = mvl0Var;
        this.c = v12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxl0)) {
            return false;
        }
        pxl0 pxl0Var = (pxl0) obj;
        return this.f27758a.equals(pxl0Var.f27758a) && this.b.equals(pxl0Var.b) && this.c == pxl0Var.c;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f27758a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f27758a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StadiumLUiModel(key=" + this.f27758a + ", stadium=" + this.b + ", alignmentInSection=" + this.c + Separators.RPAREN;
    }
}
