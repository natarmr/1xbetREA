package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b150 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t150 f1792a;

    public b150(t150 t150Var) {
        this.f1792a = t150Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b150) && this.f1792a == ((b150) obj).f1792a;
    }

    public final int hashCode() {
        return this.f1792a.hashCode();
    }

    public final String toString() {
        return "OnClickAuth(type=" + this.f1792a + Separators.RPAREN;
    }
}
