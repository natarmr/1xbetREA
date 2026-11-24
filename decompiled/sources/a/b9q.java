package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b9q implements f9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wbq f2223a;
    public final int b;

    public b9q(int i, wbq wbqVar) {
        this.f2223a = wbqVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9q)) {
            return false;
        }
        b9q b9qVar = (b9q) obj;
        return this.f2223a == b9qVar.f2223a && this.b == b9qVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f2223a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSpinnerValueClicked(type=" + this.f2223a + ", index=" + this.b + Separators.RPAREN;
    }
}
