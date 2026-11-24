package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kct {
    public static final cct Companion = new cct();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new e6t(22)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18077a;
    public final List b;
    public final Boolean c;

    public /* synthetic */ kct(int i, Boolean bool, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f18077a = null;
        } else {
            this.f18077a = num;
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
        if (!(obj instanceof kct)) {
            return false;
        }
        kct kctVar = (kct) obj;
        return Intrinsics.d(this.f18077a, kctVar.f18077a) && Intrinsics.d(this.b, kctVar.b) && Intrinsics.d(this.c, kctVar.c);
    }

    public final int hashCode() {
        Integer num = this.f18077a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesResultsResponse(count=");
        sb.append(this.f18077a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", isAll=");
        return defpackage.c.e(sb, this.c, Separators.RPAREN);
    }
}
