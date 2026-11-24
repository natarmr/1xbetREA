package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class d13 implements bpa0 {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public d13(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d13.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((d13) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return ua80.e(this.b, "AndroidPointerIcon(type=", Separators.RPAREN);
    }
}
