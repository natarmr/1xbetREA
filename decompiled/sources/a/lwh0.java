package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class lwh0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f20764a;
    public final int b;

    public lwh0(Serializable serializable, int i) {
        this.f20764a = serializable;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwh0)) {
            return false;
        }
        lwh0 lwh0Var = (lwh0) obj;
        return this.f20764a.equals(lwh0Var.f20764a) && this.b == lwh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f20764a.hashCode() * 31);
    }

    public final String toString() {
        return "SegmentPage(pageType=" + this.f20764a + ", titleRes=" + this.b + Separators.RPAREN;
    }
}
