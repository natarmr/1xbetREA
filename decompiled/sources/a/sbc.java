package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31925a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public sbc(String str, long j, boolean z) {
        str.getClass();
        this.f31925a = (int) j;
        this.b = str;
        this.c = z;
    }

    public static sbc a(sbc sbcVar, boolean z) {
        long j = sbcVar.f31925a ? 1L : 0L;
        String str = sbcVar.b;
        str.getClass();
        return new sbc(str, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbc)) {
            return false;
        }
        sbc sbcVar = (sbc) obj;
        return (this.f31925a ? 1L : 0L) == (sbcVar.f31925a ? 1L : 0L) && Intrinsics.d(this.b, sbcVar.b) && this.c == sbcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f31925a ? 1L : 0L) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f31925a ? 1L : 0L, "ChipUiModel(chipId=", ", chipTitle=", this.b), ", isSelected=", this.c, Separators.RPAREN);
    }
}
