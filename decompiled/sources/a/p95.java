package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class p95 {
    public static final j95 Companion = new j95();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f26591a;
    public final String b;
    public final String c;

    public /* synthetic */ p95(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f26591a = null;
        } else {
            this.f26591a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p95)) {
            return false;
        }
        p95 p95Var = (p95) obj;
        return Intrinsics.d(this.f26591a, p95Var.f26591a) && Intrinsics.d(this.b, p95Var.b) && Intrinsics.d(this.c, p95Var.c);
    }

    public final int hashCode() {
        Integer num = this.f26591a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.n(this.f26591a, "AvailableValueResponse(value=", ", measure=", this.b, ", valueView="), this.c, Separators.RPAREN);
    }
}
