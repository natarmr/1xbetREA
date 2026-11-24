package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class mqi0 {
    public static final hqi0 Companion = new hqi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22227a;

    public /* synthetic */ mqi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f22227a = list;
        } else {
            m2x.I(i, 1, cqi0.f4795a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqi0) && Intrinsics.d(this.f22227a, ((mqi0) obj).f22227a);
    }

    public final int hashCode() {
        return this.f22227a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f22227a, "SetMoneyLimitsRequest(limits=", Separators.RPAREN);
    }

    public mqi0(List list) {
        list.getClass();
        this.f22227a = list;
    }
}
