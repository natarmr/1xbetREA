package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class cm50 {
    public static final bm50 Companion = new bm50();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new th50(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4590a;
    public final List b;

    public /* synthetic */ cm50(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f4590a = null;
        } else {
            this.f4590a = num;
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
        if (!(obj instanceof cm50)) {
            return false;
        }
        cm50 cm50Var = (cm50) obj;
        return Intrinsics.d(this.f4590a, cm50Var.f4590a) && Intrinsics.d(this.b, cm50Var.b);
    }

    public final int hashCode() {
        Integer num = this.f4590a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f4590a, "NewCrystalInfoResponse(column=", ", crystals=", Separators.RPAREN, this.b);
    }
}
