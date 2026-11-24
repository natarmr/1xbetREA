package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class nqi0 {
    public static final iqi0 Companion = new iqi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23962a;

    public /* synthetic */ nqi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f23962a = list;
        } else {
            m2x.I(i, 1, dqi0.f6518a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqi0) && Intrinsics.d(this.f23962a, ((nqi0) obj).f23962a);
    }

    public final int hashCode() {
        return this.f23962a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f23962a, "SetMoneyLimitsRequest(limits=", Separators.RPAREN);
    }

    public nqi0(List list) {
        list.getClass();
        this.f23962a = list;
    }
}
