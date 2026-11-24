package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vz40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38283a;

    public vz40(Object obj) {
        this.f38283a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz40) && this.f38283a.equals(((vz40) obj).f38283a);
    }

    public final int hashCode() {
        return this.f38283a.hashCode();
    }

    public final String toString() {
        return f140.k(this.f38283a, "MutableValueHolder(value=", Separators.RPAREN);
    }
}
