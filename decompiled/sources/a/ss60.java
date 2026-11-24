package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ss60 {
    public static final rs60 Companion = new rs60();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new fq60(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f32711a;
    public final List b;

    public /* synthetic */ ss60(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f32711a = null;
        } else {
            this.f32711a = num;
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
        if (!(obj instanceof ss60)) {
            return false;
        }
        ss60 ss60Var = (ss60) obj;
        return Intrinsics.d(this.f32711a, ss60Var.f32711a) && Intrinsics.d(this.b, ss60Var.b);
    }

    public final int hashCode() {
        Integer num = this.f32711a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f32711a, "OneXGamesByGameIdsRequest(userId=", ", gameIds=", Separators.RPAREN, this.b);
    }

    public ss60(Integer num, ArrayList arrayList) {
        this.f32711a = num;
        this.b = arrayList;
    }
}
