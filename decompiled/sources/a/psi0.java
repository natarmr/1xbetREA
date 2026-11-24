package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class psi0 {
    public static final lsi0 Companion = new lsi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27516a;

    public /* synthetic */ psi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f27516a = list;
        } else {
            m2x.I(i, 1, hsi0.f13585a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psi0) && Intrinsics.d(this.f27516a, ((psi0) obj).f27516a);
    }

    public final int hashCode() {
        return this.f27516a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f27516a, "SetSelfExcludeLimitsRequest(limits=", Separators.RPAREN);
    }

    public psi0(List list) {
        list.getClass();
        this.f27516a = list;
    }
}
