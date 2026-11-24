package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ard {
    public static final zqd Companion = new zqd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f1340a;
    public final String b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Integer f;
    public final Integer g;
    public final szb0 h;

    public /* synthetic */ ard(int i, Double d, String str, Double d2, Double d3, Double d4, Integer num, Integer num2, szb0 szb0Var) {
        if ((i & 1) == 0) {
            this.f1340a = null;
        } else {
            this.f1340a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = szb0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ard)) {
            return false;
        }
        ard ardVar = (ard) obj;
        return Intrinsics.d(this.f1340a, ardVar.f1340a) && Intrinsics.d(this.b, ardVar.b) && Intrinsics.d(this.c, ardVar.c) && Intrinsics.d(this.d, ardVar.d) && Intrinsics.d(this.e, ardVar.e) && Intrinsics.d(this.f, ardVar.f) && Intrinsics.d(this.g, ardVar.g) && Intrinsics.d(this.h, ardVar.h);
    }

    public final int hashCode() {
        Double d = this.f1340a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.d;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.e;
        int iHashCode5 = (iHashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        szb0 szb0Var = this.h;
        return iHashCode7 + (szb0Var != null ? szb0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConditionStateResponse(minAmountOperation=");
        sb.append(this.f1340a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", percentCompleted=");
        vqd.w(sb, this.c, ", currentAmount=", this.d, ", necessaryAmount=");
        sb.append(this.e);
        sb.append(", currentCount=");
        sb.append(this.f);
        sb.append(", necessaryCount=");
        sb.append(this.g);
        sb.append(", product=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
