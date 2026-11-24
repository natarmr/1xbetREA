package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w0p implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38361a;
    public final String b;

    public w0p(i4 i4Var, String str) {
        i4Var.getClass();
        str.getClass();
        this.f38361a = i4Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0p)) {
            return false;
        }
        w0p w0pVar = (w0p) obj;
        return Intrinsics.d(this.f38361a, w0pVar.f38361a) && Intrinsics.d(this.b, w0pVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "FATAL_FURY_KEY";
    }

    public final int hashCode() {
        return this.b.hashCode() + cs0.b(this.f38361a, -1794845873, 31);
    }

    public final String toString() {
        return "FatalFuryStatisticsUiModel(key=FATAL_FURY_KEY, roundTable=" + this.f38361a + ", typefacePath=" + this.b + Separators.RPAREN;
    }
}
