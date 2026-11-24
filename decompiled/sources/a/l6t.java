package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class l6t {
    public static final d6t Companion = new d6t();
    public static final a8z[] d = {null, maz.a(wez.f39042a, new sqs(27)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19524a;
    public final List b;
    public final Boolean c;

    public /* synthetic */ l6t(int i, Boolean bool, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f19524a = null;
        } else {
            this.f19524a = num;
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
        if (!(obj instanceof l6t)) {
            return false;
        }
        l6t l6tVar = (l6t) obj;
        return Intrinsics.d(this.f19524a, l6tVar.f19524a) && Intrinsics.d(this.b, l6tVar.b) && Intrinsics.d(this.c, l6tVar.c);
    }

    public final int hashCode() {
        Integer num = this.f19524a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesHistoryResponse(count=");
        sb.append(this.f19524a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", isAll=");
        return defpackage.c.e(sb, this.c, Separators.RPAREN);
    }
}
