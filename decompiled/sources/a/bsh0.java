package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class bsh0 {
    public static final ash0 Companion = new ash0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3130a;
    public final String b;
    public final String c;

    public /* synthetic */ bsh0(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f3130a = null;
        } else {
            this.f3130a = num;
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
        if (!(obj instanceof bsh0)) {
            return false;
        }
        bsh0 bsh0Var = (bsh0) obj;
        return Intrinsics.d(this.f3130a, bsh0Var.f3130a) && Intrinsics.d(this.b, bsh0Var.b) && Intrinsics.d(this.c, bsh0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f3130a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.n(this.f3130a, "Data(id=", ", otherQuestion=", this.b, ", answer="), this.c, Separators.RPAREN);
    }

    public bsh0(Integer num, String str, String str2) {
        this.f3130a = num;
        this.b = str;
        this.c = str2;
    }
}
