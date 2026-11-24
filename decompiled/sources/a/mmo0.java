package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mmo0 {
    public static final jmo0 Companion = new jmo0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dco0(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22050a;
    public final List b;

    public /* synthetic */ mmo0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f22050a = null;
        } else {
            this.f22050a = l;
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
        if (!(obj instanceof mmo0)) {
            return false;
        }
        mmo0 mmo0Var = (mmo0) obj;
        return Intrinsics.d(this.f22050a, mmo0Var.f22050a) && Intrinsics.d(this.b, mmo0Var.b);
    }

    public final int hashCode() {
        Long l = this.f22050a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TableTitleResponse(id=" + this.f22050a + ", ratingValueCol=" + this.b + Separators.RPAREN;
    }
}
