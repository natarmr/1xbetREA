package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class mni0 {
    public static final lni0 Companion = new lni0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22090a;

    public /* synthetic */ mni0(int i, List list) {
        if (1 == (i & 1)) {
            this.f22090a = list;
        } else {
            m2x.I(i, 1, kni0.f18588a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mni0) && Intrinsics.d(this.f22090a, ((mni0) obj).f22090a);
    }

    public final int hashCode() {
        return this.f22090a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f22090a, "SetBetLimitsRequest(limits=", Separators.RPAREN);
    }

    public mni0(List list) {
        list.getClass();
        this.f22090a = list;
    }
}
