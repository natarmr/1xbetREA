package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m6q0 implements n6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21285a;
    public final y3d b;

    public m6q0(String str, y3d y3dVar) {
        str.getClass();
        this.f21285a = str;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6q0)) {
            return false;
        }
        m6q0 m6q0Var = (m6q0) obj;
        return Intrinsics.d(this.f21285a, m6q0Var.f21285a) && this.b.equals(m6q0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f21285a.hashCode() * 31;
        long j = this.b.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(j) + iHashCode;
    }

    public final String toString() {
        return "Trailing(text=" + this.f21285a + ", labelColor=" + this.b + Separators.RPAREN;
    }
}
