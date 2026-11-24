package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ydb {
    public static final xdb Companion = new xdb();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new e0b(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42425a;
    public final String b;
    public final List c;

    public /* synthetic */ ydb(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f42425a = null;
        } else {
            this.f42425a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydb)) {
            return false;
        }
        ydb ydbVar = (ydb) obj;
        return Intrinsics.d(this.f42425a, ydbVar.f42425a) && Intrinsics.d(this.b, ydbVar.b) && Intrinsics.d(this.c, ydbVar.c);
    }

    public final int hashCode() {
        Integer num = this.f42425a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(h97.n(this.f42425a, "ChampMenuResponse(type=", ", name=", this.b, ", selectors="), this.c, Separators.RPAREN);
    }
}
