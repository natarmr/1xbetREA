package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zbs extends dcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yxk0 f44131a;
    public final Double b;

    public zbs(yxk0 yxk0Var, Double d) {
        this.f44131a = yxk0Var;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbs)) {
            return false;
        }
        zbs zbsVar = (zbs) obj;
        return this.f44131a == zbsVar.f44131a && Intrinsics.d(this.b, zbsVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f44131a.hashCode() * 31;
        Double d = this.b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "HighlightButton(betType=" + this.f44131a + ", betSum=" + this.b + Separators.RPAREN;
    }
}
