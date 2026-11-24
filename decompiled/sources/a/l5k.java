package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class l5k {
    public static final k5k Companion = new k5k();
    public static final a8z[] b = {maz.a(wez.f39042a, new rtj(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19461a;

    public /* synthetic */ l5k(int i, List list) {
        if (1 == (i & 1)) {
            this.f19461a = list;
        } else {
            m2x.I(i, 1, j5k.f15936a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5k) && Intrinsics.d(this.f19461a, ((l5k) obj).f19461a);
    }

    public final int hashCode() {
        return this.f19461a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f19461a, "DeletePopUpRequest(popUpIds=", Separators.RPAREN);
    }

    public l5k(List list) {
        list.getClass();
        this.f19461a = list;
    }
}
