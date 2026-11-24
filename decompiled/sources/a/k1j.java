package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class k1j implements n1j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17526a;
    public final int b;

    public k1j(int i, int i2) {
        this.f17526a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1j)) {
            return false;
        }
        k1j k1jVar = (k1j) obj;
        return this.f17526a == k1jVar.f17526a && this.b == k1jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f17526a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnButtonActionClick(currentPage=", this.f17526a, ", pageCount=", Separators.RPAREN, this.b);
    }
}
