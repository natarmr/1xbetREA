package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x290 extends z290 {
    public final float c;

    public x290(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x290) && Float.compare(this.c, ((x290) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return rw2.j(this.c, "RelativeVerticalTo(dy=", Separators.RPAREN);
    }
}
