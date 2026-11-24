package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class oqi0 {
    public static final jqi0 Companion = new jqi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25690a;

    public /* synthetic */ oqi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f25690a = list;
        } else {
            m2x.I(i, 1, eqi0.f8239a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqi0) && Intrinsics.d(this.f25690a, ((oqi0) obj).f25690a);
    }

    public final int hashCode() {
        return this.f25690a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25690a, "SetMoneyLimitsRequest(limits=", Separators.RPAREN);
    }

    public oqi0(ArrayList arrayList) {
        this.f25690a = arrayList;
    }
}
