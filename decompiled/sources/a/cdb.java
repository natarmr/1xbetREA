package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class cdb {
    public static final bdb Companion = new bdb();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new e0b(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f4153a;
    public final List b;

    public /* synthetic */ cdb(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f4153a = null;
        } else {
            this.f4153a = l;
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
        if (!(obj instanceof cdb)) {
            return false;
        }
        cdb cdbVar = (cdb) obj;
        return Intrinsics.d(this.f4153a, cdbVar.f4153a) && Intrinsics.d(this.b, cdbVar.b);
    }

    public final int hashCode() {
        Long l = this.f4153a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ChampImagesResponse(feedId=" + this.f4153a + ", images=" + this.b + Separators.RPAREN;
    }
}
