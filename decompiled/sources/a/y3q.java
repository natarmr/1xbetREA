package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final urs f41965a;
    public final m4s b;
    public final int c;
    public final int d;

    public y3q(urs ursVar, m4s m4sVar, int i, int i2) {
        ursVar.getClass();
        m4sVar.getClass();
        this.f41965a = ursVar;
        this.b = m4sVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3q)) {
            return false;
        }
        y3q y3qVar = (y3q) obj;
        return this.f41965a == y3qVar.f41965a && this.b == y3qVar.b && this.c == y3qVar.c && this.d == y3qVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, (this.b.hashCode() + (this.f41965a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterUiState(selectedSort=");
        sb.append(this.f41965a);
        sb.append(", selectedCoefficient=");
        sb.append(this.b);
        sb.append(", selectedCategoryId=");
        return w6x.o(this.c, this.d, ", counter=", Separators.RPAREN, sb);
    }
}
