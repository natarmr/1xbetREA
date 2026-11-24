package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class od10 {
    public static final nd10 Companion = new nd10();
    public static final a8z[] f = {maz.a(wez.f39042a, new t010((byte) 28)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25056a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;

    public /* synthetic */ od10(int i, Integer num, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f25056a = null;
        } else {
            this.f25056a = list;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od10)) {
            return false;
        }
        od10 od10Var = (od10) obj;
        return Intrinsics.d(this.f25056a, od10Var.f25056a) && Intrinsics.d(this.b, od10Var.b) && Intrinsics.d(this.c, od10Var.c) && Intrinsics.d(this.d, od10Var.d) && Intrinsics.d(this.e, od10Var.e);
    }

    public final int hashCode() {
        List list = this.f25056a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("LottoResponse(games=", ", gameUrl=", this.b, this.f25056a, ", message=");
        axq.x(this.d, this.c, ", errorId=", ", errorMessage=", sbO);
        return axq.n(sbO, this.e, Separators.RPAREN);
    }
}
