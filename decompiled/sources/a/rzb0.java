package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rzb0 {
    public static final pzb0 Companion = new pzb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f31352a;
    public final String b;

    public /* synthetic */ rzb0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f31352a = null;
        } else {
            this.f31352a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzb0)) {
            return false;
        }
        rzb0 rzb0Var = (rzb0) obj;
        return Intrinsics.d(this.f31352a, rzb0Var.f31352a) && Intrinsics.d(this.b, rzb0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f31352a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f31352a, "ProductResponse(productId=", ", name=", this.b, Separators.RPAREN);
    }
}
