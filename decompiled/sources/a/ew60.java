package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ew60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zn60 f8507a;
    public final y1p b;

    public ew60(zn60 zn60Var, y1p y1pVar) {
        this.f8507a = zn60Var;
        this.b = y1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew60)) {
            return false;
        }
        ew60 ew60Var = (ew60) obj;
        return this.f8507a == ew60Var.f8507a && this.b == ew60Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8507a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGamesDelegateState(screen=" + this.f8507a + ", fatmanScreenType=" + this.b + Separators.RPAREN;
    }
}
