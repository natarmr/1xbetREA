package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fzq0 {
    public static final ezq0 Companion = new ezq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wz5 f10421a;
    public final Integer b;
    public final l26 c;
    public final l26 d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ fzq0(int i, wz5 wz5Var, Integer num, l26 l26Var, l26 l26Var2, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f10421a = null;
        } else {
            this.f10421a = wz5Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l26Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l26Var2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzq0)) {
            return false;
        }
        fzq0 fzq0Var = (fzq0) obj;
        return Intrinsics.d(this.f10421a, fzq0Var.f10421a) && Intrinsics.d(this.b, fzq0Var.b) && Intrinsics.d(this.c, fzq0Var.c) && Intrinsics.d(this.d, fzq0Var.d) && Intrinsics.d(this.e, fzq0Var.e) && Intrinsics.d(this.f, fzq0Var.f);
    }

    public final int hashCode() {
        wz5 wz5Var = this.f10421a;
        int iHashCode = (wz5Var == null ? 0 : wz5Var.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        l26 l26Var = this.c;
        int iHashCode3 = (iHashCode2 + (l26Var == null ? 0 : l26Var.hashCode())) * 31;
        l26 l26Var2 = this.d;
        int iHashCode4 = (iHashCode3 + (l26Var2 == null ? 0 : l26Var2.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopChampResponse(league=");
        sb.append(this.f10421a);
        sb.append(", countryId=");
        sb.append(this.b);
        sb.append(", sport=");
        sb.append(this.c);
        sb.append(", subSport=");
        sb.append(this.d);
        sb.append(", gamesCount=");
        return ua80.l(sb, this.e, ", globalChampId=", this.f, Separators.RPAREN);
    }
}
