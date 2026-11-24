package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fnk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9841a;
    public final boolean b;

    public fnk0(int i, boolean z) {
        this.f9841a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnk0)) {
            return false;
        }
        fnk0 fnk0Var = (fnk0) obj;
        return this.f9841a == fnk0Var.f9841a && this.b == fnk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f9841a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f9841a, "SparklineUiModel(value=", ", up=", Separators.RPAREN, this.b);
    }
}
