package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class xjr0 {
    public static final wjr0 Companion = new wjr0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dfr0(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41001a;
    public final List b;

    public /* synthetic */ xjr0(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, vjr0.f37544a.getDescriptor());
            throw null;
        }
        this.f41001a = num;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjr0)) {
            return false;
        }
        xjr0 xjr0Var = (xjr0) obj;
        return Intrinsics.d(this.f41001a, xjr0Var.f41001a) && Intrinsics.d(this.b, xjr0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f41001a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f41001a, "TotoBetGameOutcomeRequest(gameId=", ", outcome=", Separators.RPAREN, this.b);
    }

    public xjr0(Integer num, ArrayList arrayList) {
        this.f41001a = num;
        this.b = arrayList;
    }
}
