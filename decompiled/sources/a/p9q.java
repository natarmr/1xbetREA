package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26620a;
    public final long b;

    public p9q(float f, long j) {
        this.f26620a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9q)) {
            return false;
        }
        p9q p9qVar = (p9q) obj;
        return Float.compare(this.f26620a, p9qVar.f26620a) == 0 && this.b == p9qVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Float.hashCode(this.f26620a) * 31);
    }

    public final String toString() {
        return "FinBetsGraphPointUiModel(height=" + this.f26620a + ", timeStamp=" + this.b + Separators.RPAREN;
    }
}
