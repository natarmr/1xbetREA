package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w0v0 implements ep80 {
    public final v0v0 b;

    public w0v0(v0v0 v0v0Var) {
        this.b = v0v0Var;
    }

    @Override // a.ep80
    public final Object d(w6k w6kVar) {
        w6kVar.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0v0) && this.b == ((w0v0) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "WatermarkPositionParentData(position=" + this.b + Separators.RPAREN;
    }
}
