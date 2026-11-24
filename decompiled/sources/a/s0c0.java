package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s0c0 implements u0c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31405a;

    public s0c0(int i) {
        this.f31405a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0c0) && this.f31405a == ((s0c0) obj).f31405a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31405a);
    }

    public final String toString() {
        return ua80.e(this.f31405a, "OnPickerResult(selectedId=", Separators.RPAREN);
    }
}
