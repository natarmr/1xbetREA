package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class if50 extends jf50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe50 f14671a;
    public final int b;

    public if50(xe50 xe50Var, int i) {
        xe50Var.getClass();
        this.f14671a = xe50Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || if50.class != obj.getClass()) {
            return false;
        }
        if50 if50Var = (if50) obj;
        return this.b == if50Var.b && Intrinsics.d(this.f14671a, if50Var.f14671a);
    }

    public final int hashCode() {
        return this.f14671a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f14671a + ", direction=" + this.b + Separators.RPAREN;
    }
}
