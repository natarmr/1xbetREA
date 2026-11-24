package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class m1j implements n1j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21010a;
    public final int b;

    public m1j(int i, int i2) {
        this.f21010a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1j)) {
            return false;
        }
        m1j m1jVar = (m1j) obj;
        return this.f21010a == m1jVar.f21010a && this.b == m1jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f21010a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnPageScroll(currentPage=", this.f21010a, ", pageCount=", Separators.RPAREN, this.b);
    }
}
