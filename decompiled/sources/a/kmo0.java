package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kmo0 {
    public static final hmo0 Companion = new hmo0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dco0(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f18551a;
    public final List b;

    public /* synthetic */ kmo0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f18551a = null;
        } else {
            this.f18551a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmo0)) {
            return false;
        }
        kmo0 kmo0Var = (kmo0) obj;
        return Intrinsics.d(this.f18551a, kmo0Var.f18551a) && Intrinsics.d(this.b, kmo0Var.b);
    }

    public final int hashCode() {
        Long l = this.f18551a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TableTitleResponse(id=" + this.f18551a + ", valueColList=" + this.b + Separators.RPAREN;
    }
}
