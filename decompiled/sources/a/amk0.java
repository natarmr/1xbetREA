package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class amk0 {
    public static final zlk0 Companion = new zlk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1112a;
    public final Long b;
    public final String c;
    public final String d;

    public /* synthetic */ amk0(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f1112a = null;
        } else {
            this.f1112a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
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
        if (!(obj instanceof amk0)) {
            return false;
        }
        amk0 amk0Var = (amk0) obj;
        return Intrinsics.d(this.f1112a, amk0Var.f1112a) && Intrinsics.d(this.b, amk0Var.b) && Intrinsics.d(this.c, amk0Var.c) && Intrinsics.d(this.d, amk0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f1112a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(h97.m(this.f1112a, this.b, "SoulcaliburRoundResponse(round=", ", time=", ", winnerName="), this.c, ", typeOfWin=", this.d, Separators.RPAREN);
    }
}
