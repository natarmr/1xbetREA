package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wf90 {
    public static final vf90 Companion = new vf90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39060a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ wf90(int i, Integer num, Integer num2, String str) {
        if ((i & 1) == 0) {
            this.f39060a = null;
        } else {
            this.f39060a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf90)) {
            return false;
        }
        wf90 wf90Var = (wf90) obj;
        return Intrinsics.d(this.f39060a, wf90Var.f39060a) && Intrinsics.d(this.b, wf90Var.b) && Intrinsics.d(this.c, wf90Var.c);
    }

    public final int hashCode() {
        String str = this.f39060a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(axq.p(this.b, "PeriodSubScoreZipResponse(title=", this.f39060a, ", subScoreOne=", ", subScoreTwo="), this.c, Separators.RPAREN);
    }
}
