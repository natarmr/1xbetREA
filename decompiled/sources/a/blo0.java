package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class blo0 {
    public static final zko0 Companion = new zko0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dco0(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2805a;
    public final List b;

    public /* synthetic */ blo0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f2805a = null;
        } else {
            this.f2805a = num;
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
        if (!(obj instanceof blo0)) {
            return false;
        }
        blo0 blo0Var = (blo0) obj;
        return Intrinsics.d(this.f2805a, blo0Var.f2805a) && Intrinsics.d(this.b, blo0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f2805a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f2805a, "TableRowResponse(color=", ", cellList=", Separators.RPAREN, this.b);
    }
}
