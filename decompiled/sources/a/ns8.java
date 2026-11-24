package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ns8 implements os8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24040a;

    public ns8(float f) {
        this.f24040a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns8) && Float.compare(this.f24040a, ((ns8) obj).f24040a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24040a);
    }

    public final String toString() {
        return rw2.j(this.f24040a, "Fixed(value=", Separators.RPAREN);
    }
}
