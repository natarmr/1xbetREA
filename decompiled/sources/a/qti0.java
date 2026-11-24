package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class qti0 {
    public static final nti0 Companion = new nti0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29301a;

    public /* synthetic */ qti0(int i, List list) {
        if (1 == (i & 1)) {
            this.f29301a = list;
        } else {
            m2x.I(i, 1, kti0.f18867a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qti0) && Intrinsics.d(this.f29301a, ((qti0) obj).f29301a);
    }

    public final int hashCode() {
        return this.f29301a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f29301a, "SetTimeLimitsRequest(limits=", Separators.RPAREN);
    }

    public qti0(List list) {
        list.getClass();
        this.f29301a = list;
    }
}
