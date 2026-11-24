package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class o8e0 {
    public static final n8e0 Companion = new n8e0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new o6e0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f24825a;
    public final List b;

    public /* synthetic */ o8e0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f24825a = null;
        } else {
            this.f24825a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8e0)) {
            return false;
        }
        o8e0 o8e0Var = (o8e0) obj;
        return Intrinsics.d(this.f24825a, o8e0Var.f24825a) && Intrinsics.d(this.b, o8e0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f24825a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f24825a, "RatingTableTitleResponse(id=", ", ratingTitleCol=", Separators.RPAREN, this.b);
    }
}
