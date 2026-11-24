package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ajo0 {
    public static final yio0 Companion = new yio0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dco0(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f987a;
    public final List b;

    public /* synthetic */ ajo0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f987a = null;
        } else {
            this.f987a = l;
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
        if (!(obj instanceof ajo0)) {
            return false;
        }
        ajo0 ajo0Var = (ajo0) obj;
        return Intrinsics.d(this.f987a, ajo0Var.f987a) && Intrinsics.d(this.b, ajo0Var.b);
    }

    public final int hashCode() {
        Long l = this.f987a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TableBodyResponse(id=" + this.f987a + ", valueColBodyList=" + this.b + Separators.RPAREN;
    }
}
