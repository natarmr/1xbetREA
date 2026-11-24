package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class t95 {
    public static final n95 Companion = new n95();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f33545a;
    public final String b;
    public final String c;

    public /* synthetic */ t95(int i, Double d, String str, String str2) {
        if ((i & 1) == 0) {
            this.f33545a = null;
        } else {
            this.f33545a = d;
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
        if (!(obj instanceof t95)) {
            return false;
        }
        t95 t95Var = (t95) obj;
        return Intrinsics.d(this.f33545a, t95Var.f33545a) && Intrinsics.d(this.b, t95Var.b) && Intrinsics.d(this.c, t95Var.c);
    }

    public final int hashCode() {
        Double d = this.f33545a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailableValueResponse(value=");
        sb.append(this.f33545a);
        sb.append(", measure=");
        sb.append(this.b);
        sb.append(", valueView=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
