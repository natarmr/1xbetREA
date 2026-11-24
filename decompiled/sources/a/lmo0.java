package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class lmo0 {
    public static final imo0 Companion = new imo0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dco0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20307a;
    public final List b;

    public /* synthetic */ lmo0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f20307a = null;
        } else {
            this.f20307a = l;
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
        if (!(obj instanceof lmo0)) {
            return false;
        }
        lmo0 lmo0Var = (lmo0) obj;
        return Intrinsics.d(this.f20307a, lmo0Var.f20307a) && Intrinsics.d(this.b, lmo0Var.b);
    }

    public final int hashCode() {
        Long l = this.f20307a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TableTitleResponse(id=" + this.f20307a + ", valueColList=" + this.b + Separators.RPAREN;
    }
}
