package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cq60 {
    public static final bq60 Companion = new bq60();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4777a;
    public final String b;

    public /* synthetic */ cq60(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f4777a = null;
        } else {
            this.f4777a = num;
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
        if (!(obj instanceof cq60)) {
            return false;
        }
        cq60 cq60Var = (cq60) obj;
        return Intrinsics.d(this.f4777a, cq60Var.f4777a) && Intrinsics.d(this.b, cq60Var.b);
    }

    public final int hashCode() {
        Integer num = this.f4777a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f4777a, "ForbiddenGame(id=", ", gameName=", this.b, Separators.RPAREN);
    }
}
