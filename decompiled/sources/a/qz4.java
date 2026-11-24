package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qz4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29563a;
    public final double b;

    public qz4(double d, boolean z) {
        this.f29563a = z;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz4)) {
            return false;
        }
        qz4 qz4Var = (qz4) obj;
        return this.f29563a == qz4Var.f29563a && Double.compare(this.b, qz4Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Boolean.hashCode(this.f29563a) * 31);
    }

    public final String toString() {
        return "AutoMaxStateModel(isAutoMaxEnabled=" + this.f29563a + ", autoMaxValue=" + this.b + Separators.RPAREN;
    }
}
