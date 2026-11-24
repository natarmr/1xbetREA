package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class u420 implements v420 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f35024a;

    public u420(a8q0 a8q0Var) {
        this.f35024a = a8q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u420) && this.f35024a.equals(((u420) obj).f35024a);
    }

    public final int hashCode() {
        return this.f35024a.hashCode();
    }

    public final String toString() {
        return "ValueChange(inputValue=" + this.f35024a + Separators.RPAREN;
    }
}
