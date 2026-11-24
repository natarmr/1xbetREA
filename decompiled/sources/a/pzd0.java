package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class pzd0 {
    public static final ozd0 Companion = new ozd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27840a;
    public final Integer b;
    public final String c;
    public final String d;

    public /* synthetic */ pzd0(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f27840a = null;
        } else {
            this.f27840a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzd0)) {
            return false;
        }
        pzd0 pzd0Var = (pzd0) obj;
        return Intrinsics.d(this.f27840a, pzd0Var.f27840a) && Intrinsics.d(this.b, pzd0Var.b) && Intrinsics.d(this.c, pzd0Var.c) && Intrinsics.d(this.d, pzd0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f27840a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(hne.q("RainbowStatisticMatchesMatchBansResponse(teamId=", this.f27840a, ", id=", this.b, ", name="), this.c, ", image=", this.d, Separators.RPAREN);
    }
}
