package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class pqi0 {
    public static final kqi0 Companion = new kqi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27419a;

    public /* synthetic */ pqi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f27419a = list;
        } else {
            m2x.I(i, 1, fqi0.f9976a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqi0) && Intrinsics.d(this.f27419a, ((pqi0) obj).f27419a);
    }

    public final int hashCode() {
        return this.f27419a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f27419a, "SetMoneyLimitsRequest(limits=", Separators.RPAREN);
    }

    public pqi0(List list) {
        list.getClass();
        this.f27419a = list;
    }
}
