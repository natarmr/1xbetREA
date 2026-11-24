package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ywr implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43385a;
    public final int b;

    public ywr(String str, int i) {
        str.getClass();
        this.f43385a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywr)) {
            return false;
        }
        ywr ywrVar = (ywr) obj;
        return Intrinsics.d(this.f43385a, ywrVar.f43385a) && this.b == ywrVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + ua80.b(Long.hashCode(0L) * 31, 31, this.f43385a);
    }

    public final String toString() {
        return dw9.n(this.b, "GameCardType17StatisticsUiModel(id=0, roundValue=", this.f43385a, ", background=", Separators.RPAREN);
    }
}
