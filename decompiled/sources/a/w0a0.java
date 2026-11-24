package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class w0a0 {
    public static final v0a0 Companion = new v0a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38341a;
    public final String b;
    public final Integer c;

    public /* synthetic */ w0a0(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f38341a = null;
        } else {
            this.f38341a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0a0)) {
            return false;
        }
        w0a0 w0a0Var = (w0a0) obj;
        return Intrinsics.d(this.f38341a, w0a0Var.f38341a) && Intrinsics.d(this.b, w0a0Var.b) && Intrinsics.d(this.c, w0a0Var.c);
    }

    public final int hashCode() {
        String str = this.f38341a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(b1j.n("PlayerCommonItemResponse(name=", this.f38341a, ", image=", this.b, ", timeSeconds="), this.c, Separators.RPAREN);
    }
}
