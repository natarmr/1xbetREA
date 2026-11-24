package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class b680 {
    public static final z580 Companion = new z580();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2040a;
    public final String b;
    public final String c;

    public /* synthetic */ b680(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f2040a = null;
        } else {
            this.f2040a = num;
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
        if (!(obj instanceof b680)) {
            return false;
        }
        b680 b680Var = (b680) obj;
        return Intrinsics.d(this.f2040a, b680Var.f2040a) && Intrinsics.d(this.b, b680Var.b) && Intrinsics.d(this.c, b680Var.c);
    }

    public final int hashCode() {
        Integer num = this.f2040a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.n(this.f2040a, "OppsResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
