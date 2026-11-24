package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mze implements nze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22651a;

    public mze(float f) {
        this.f22651a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mze) && Float.compare(this.f22651a, ((mze) obj).f22651a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22651a);
    }

    public final String toString() {
        return rw2.j(this.f22651a, "FromParent(offset=", Separators.RPAREN);
    }
}
