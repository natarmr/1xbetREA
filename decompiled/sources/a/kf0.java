package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kf0 {
    public static final jf0 Companion = new jf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18175a;
    public final String b;

    public /* synthetic */ kf0(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f18175a = null;
        } else {
            this.f18175a = num;
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
        if (!(obj instanceof kf0)) {
            return false;
        }
        kf0 kf0Var = (kf0) obj;
        return Intrinsics.d(this.f18175a, kf0Var.f18175a) && Intrinsics.d(this.b, kf0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f18175a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f18175a, "AggregatorCategoriesDataResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
