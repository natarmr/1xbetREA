package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class pti0 {
    public static final mti0 Companion = new mti0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27566a;

    public /* synthetic */ pti0(int i, List list) {
        if (1 == (i & 1)) {
            this.f27566a = list;
        } else {
            m2x.I(i, 1, jti0.f17102a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pti0) && Intrinsics.d(this.f27566a, ((pti0) obj).f27566a);
    }

    public final int hashCode() {
        return this.f27566a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f27566a, "SetTimeLimitsRequest(limits=", Separators.RPAREN);
    }

    public pti0(ArrayList arrayList) {
        this.f27566a = arrayList;
    }
}
