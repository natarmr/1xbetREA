package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class evi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8469a;
    public final y3d b;

    public evi0(String str, y3d y3dVar) {
        str.getClass();
        this.f8469a = str;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evi0)) {
            return false;
        }
        evi0 evi0Var = (evi0) obj;
        return Intrinsics.d(this.f8469a, evi0Var.f8469a) && this.b.equals(evi0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f8469a.hashCode() * 31;
        long j = this.b.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(j) + iHashCode;
    }

    public final String toString() {
        return "ButtonLabel(buttonText=" + this.f8469a + ", textColor=" + this.b + Separators.RPAREN;
    }
}
