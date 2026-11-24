package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class pni0 {
    public static final oni0 Companion = new oni0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27289a;

    public /* synthetic */ pni0(int i, List list) {
        if (1 == (i & 1)) {
            this.f27289a = list;
        } else {
            m2x.I(i, 1, nni0.f23823a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pni0) && Intrinsics.d(this.f27289a, ((pni0) obj).f27289a);
    }

    public final int hashCode() {
        return this.f27289a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f27289a, "SetBetLimitsWithPeriodRequest(limits=", Separators.RPAREN);
    }

    public pni0(List list) {
        list.getClass();
        this.f27289a = list;
    }
}
