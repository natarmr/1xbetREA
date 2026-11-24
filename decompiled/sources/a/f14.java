package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class f14 {
    public static final e14 Companion = new e14();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new a04(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8747a;
    public final List b;

    public /* synthetic */ f14(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f8747a = null;
        } else {
            this.f8747a = l;
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
        if (!(obj instanceof f14)) {
            return false;
        }
        f14 f14Var = (f14) obj;
        return Intrinsics.d(this.f8747a, f14Var.f8747a) && Intrinsics.d(this.b, f14Var.b);
    }

    public final int hashCode() {
        Long l = this.f8747a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AttachFileConfigResponse(expiresSecAt=" + this.f8747a + ", uploadMediaRestrictions=" + this.b + Separators.RPAREN;
    }
}
