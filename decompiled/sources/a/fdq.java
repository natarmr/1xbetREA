package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class fdq {
    public static final edq Companion = new edq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9369a;
    public final String b;

    public /* synthetic */ fdq(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f9369a = null;
        } else {
            this.f9369a = num;
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
        if (!(obj instanceof fdq)) {
            return false;
        }
        fdq fdqVar = (fdq) obj;
        return Intrinsics.d(this.f9369a, fdqVar.f9369a) && Intrinsics.d(this.b, fdqVar.b);
    }

    public final int hashCode() {
        Integer num = this.f9369a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f9369a, "FindCouponParamsResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
