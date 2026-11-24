package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eeh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7675a;

    public final boolean equals(Object obj) {
        if (obj instanceof eeh0) {
            return Float.compare(this.f7675a, ((eeh0) obj).f7675a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7675a);
    }

    public final String toString() {
        return rw2.j(this.f7675a, "PlayerTwoOpacity(value=", Separators.RPAREN);
    }
}
