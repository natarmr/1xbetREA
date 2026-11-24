package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dqm implements eqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6523a;
    public final y3d b;

    public dqm(String str, y3d y3dVar) {
        str.getClass();
        this.f6523a = str;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqm)) {
            return false;
        }
        dqm dqmVar = (dqm) obj;
        return Intrinsics.d(this.f6523a, dqmVar.f6523a) && Intrinsics.d(this.b, dqmVar.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f6523a.hashCode() * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "TextScoreCell(text=" + this.f6523a + ", textColor=" + this.b + Separators.RPAREN;
    }
}
