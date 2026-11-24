package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class op0 implements pp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gyl f25615a;

    public op0(gyl gylVar) {
        this.f25615a = gylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof op0) && this.f25615a.equals(((op0) obj).f25615a);
    }

    public final int hashCode() {
        return this.f25615a.hashCode();
    }

    public final String toString() {
        return "Shimmer(model=" + this.f25615a + Separators.RPAREN;
    }
}
