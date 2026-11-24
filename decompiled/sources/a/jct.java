package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jct {
    public static final bct Companion = new bct();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new e6t(21)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f16294a;
    public final List b;
    public final Boolean c;

    public /* synthetic */ jct(int i, Boolean bool, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f16294a = null;
        } else {
            this.f16294a = num;
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
        if (!(obj instanceof jct)) {
            return false;
        }
        jct jctVar = (jct) obj;
        return Intrinsics.d(this.f16294a, jctVar.f16294a) && Intrinsics.d(this.b, jctVar.b) && Intrinsics.d(this.c, jctVar.c);
    }

    public final int hashCode() {
        Integer num = this.f16294a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesResultsResponse(count=");
        sb.append(this.f16294a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", isAll=");
        return defpackage.c.e(sb, this.c, Separators.RPAREN);
    }
}
