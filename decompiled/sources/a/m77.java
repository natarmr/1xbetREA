package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class m77 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s77 f21305a;
    public final boolean b;

    public m77(s77 s77Var, boolean z) {
        s77Var.getClass();
        this.f21305a = s77Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m77)) {
            return false;
        }
        m77 m77Var = (m77) obj;
        return this.f21305a == m77Var.f21305a && this.b == m77Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21305a.hashCode() * 31);
    }

    public final String toString() {
        return "BetHistoryTypeData(betHistoryType=" + this.f21305a + ", selected=" + this.b + Separators.RPAREN;
    }
}
