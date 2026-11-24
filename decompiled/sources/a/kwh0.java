package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class kwh0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f19002a;
    public final int b;

    public kwh0(Serializable serializable, int i) {
        this.f19002a = serializable;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwh0)) {
            return false;
        }
        kwh0 kwh0Var = (kwh0) obj;
        return this.f19002a.equals(kwh0Var.f19002a) && this.b == kwh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f19002a.hashCode() * 31);
    }

    public final String toString() {
        return "SegmentPage(pageType=" + this.f19002a + ", titleRes=" + this.b + Separators.RPAREN;
    }
}
