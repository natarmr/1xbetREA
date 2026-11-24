package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class oti0 {
    public static final lti0 Companion = new lti0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25832a;

    public /* synthetic */ oti0(int i, List list) {
        if (1 == (i & 1)) {
            this.f25832a = list;
        } else {
            m2x.I(i, 1, iti0.f15355a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oti0) && Intrinsics.d(this.f25832a, ((oti0) obj).f25832a);
    }

    public final int hashCode() {
        return this.f25832a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25832a, "SetTimeLimitsRequest(limits=", Separators.RPAREN);
    }

    public oti0(List list) {
        list.getClass();
        this.f25832a = list;
    }
}
