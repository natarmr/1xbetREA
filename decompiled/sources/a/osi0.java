package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class osi0 {
    public static final ksi0 Companion = new ksi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25783a;

    public /* synthetic */ osi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f25783a = list;
        } else {
            m2x.I(i, 1, gsi0.f11831a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osi0) && Intrinsics.d(this.f25783a, ((osi0) obj).f25783a);
    }

    public final int hashCode() {
        return this.f25783a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25783a, "SetSelfExcludeLimitsRequest(limits=", Separators.RPAREN);
    }

    public osi0(List list) {
        list.getClass();
        this.f25783a = list;
    }
}
