package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j350 implements j450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t150 f15815a;

    public j350(t150 t150Var) {
        this.f15815a = t150Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j350) && this.f15815a == ((j350) obj).f15815a;
    }

    public final int hashCode() {
        return this.f15815a.hashCode();
    }

    public final String toString() {
        return "OnClickAuth(type=" + this.f15815a + Separators.RPAREN;
    }
}
