package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oxl0 implements rxl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26018a;
    public final mvl0 b;

    public oxl0(String str, mvl0 mvl0Var) {
        this.f26018a = str;
        this.b = mvl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxl0)) {
            return false;
        }
        oxl0 oxl0Var = (oxl0) obj;
        return this.f26018a.equals(oxl0Var.f26018a) && this.b.equals(oxl0Var.b);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f26018a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26018a.hashCode() * 31);
    }

    public final String toString() {
        return "SingleStadiumLUiModel(key=" + this.f26018a + ", stadium=" + this.b + Separators.RPAREN;
    }
}
