package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class z6n0 {
    public static final y6n0 Companion = new y6n0();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new x9m0(29)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43879a;
    public final List b;
    public final Boolean c;

    public /* synthetic */ z6n0(int i, Boolean bool, Long l, List list) {
        if ((i & 1) == 0) {
            this.f43879a = null;
        } else {
            this.f43879a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6n0)) {
            return false;
        }
        z6n0 z6n0Var = (z6n0) obj;
        return Intrinsics.d(this.f43879a, z6n0Var.f43879a) && Intrinsics.d(this.b, z6n0Var.b) && Intrinsics.d(this.c, z6n0Var.c);
    }

    public final int hashCode() {
        Long l = this.f43879a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionEventGroupResponse(groupId=");
        sb.append(this.f43879a);
        sb.append(", events=");
        sb.append(this.b);
        sb.append(", specialSign=");
        return defpackage.c.e(sb, this.c, Separators.RPAREN);
    }
}
