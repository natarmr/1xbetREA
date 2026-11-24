package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class pzc0 {
    public static final ozc0 Companion = new ozc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27838a;
    public final String b;

    public /* synthetic */ pzc0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f27838a = null;
        } else {
            this.f27838a = num;
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
        if (!(obj instanceof pzc0)) {
            return false;
        }
        pzc0 pzc0Var = (pzc0) obj;
        return Intrinsics.d(this.f27838a, pzc0Var.f27838a) && Intrinsics.d(this.b, pzc0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f27838a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f27838a, "PromotionResponse(messageId=", ", message=", this.b, Separators.RPAREN);
    }
}
