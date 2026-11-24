package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mq60 {
    public static final lq60 Companion = new lq60();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22208a;
    public final String b;

    public /* synthetic */ mq60(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f22208a = null;
        } else {
            this.f22208a = num;
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
        if (!(obj instanceof mq60)) {
            return false;
        }
        mq60 mq60Var = (mq60) obj;
        return Intrinsics.d(this.f22208a, mq60Var.f22208a) && Intrinsics.d(this.b, mq60Var.b);
    }

    public final int hashCode() {
        Integer num = this.f22208a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f22208a, "ForbiddenGameOld(gameId=", ", name=", this.b, Separators.RPAREN);
    }
}
