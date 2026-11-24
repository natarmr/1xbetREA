package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class egm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7771a;
    public final long b;

    public egm(String str, long j) {
        str.getClass();
        this.f7771a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egm)) {
            return false;
        }
        egm egmVar = (egm) obj;
        if (!Intrinsics.d(this.f7771a, egmVar.f7771a)) {
            return false;
        }
        long j = egmVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f7771a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("DsEventCardRouletteModel(number=", this.f7771a, ", color=", y3d.i(this.b), Separators.RPAREN);
    }
}
