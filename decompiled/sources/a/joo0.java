package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class joo0 implements uoo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16868a;
    public final int b;

    public joo0(String str, int i) {
        this.f16868a = str;
        this.b = i;
    }

    @Override // a.uoo0
    public final String a() {
        return this.f16868a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joo0)) {
            return false;
        }
        joo0 joo0Var = (joo0) obj;
        return this.f16868a.equals(joo0Var.f16868a) && this.b == joo0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f16868a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Counter(tagKey=", this.f16868a, ", count=", Separators.RPAREN);
    }
}
