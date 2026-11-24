package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bjo0 {
    public static final zio0 Companion = new zio0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dco0(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2716a;
    public final List b;

    public /* synthetic */ bjo0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f2716a = null;
        } else {
            this.f2716a = l;
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
        if (!(obj instanceof bjo0)) {
            return false;
        }
        bjo0 bjo0Var = (bjo0) obj;
        return Intrinsics.d(this.f2716a, bjo0Var.f2716a) && Intrinsics.d(this.b, bjo0Var.b);
    }

    public final int hashCode() {
        Long l = this.f2716a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TableBodyResponse(id=" + this.f2716a + ", valueColBodyList=" + this.b + Separators.RPAREN;
    }
}
