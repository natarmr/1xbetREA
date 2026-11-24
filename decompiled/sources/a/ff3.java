package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ff3 {
    public static final ef3 Companion = new ef3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9432a;
    public final String b;

    public /* synthetic */ ff3(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f9432a = null;
        } else {
            this.f9432a = num;
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
        if (!(obj instanceof ff3)) {
            return false;
        }
        ff3 ff3Var = (ff3) obj;
        return Intrinsics.d(this.f9432a, ff3Var.f9432a) && Intrinsics.d(this.b, ff3Var.b);
    }

    public final int hashCode() {
        Integer num = this.f9432a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f9432a, "AppForCheckResponse(id=", ", bundle=", this.b, Separators.RPAREN);
    }
}
