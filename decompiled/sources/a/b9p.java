package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class b9p {
    public static final a9p Companion = new a9p();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new r4p(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2222a;
    public final List b;

    public /* synthetic */ b9p(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f2222a = null;
        } else {
            this.f2222a = l;
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
        if (!(obj instanceof b9p)) {
            return false;
        }
        b9p b9pVar = (b9p) obj;
        return Intrinsics.d(this.f2222a, b9pVar.f2222a) && Intrinsics.d(this.b, b9pVar.b);
    }

    public final int hashCode() {
        Long l = this.f2222a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "FavoriteGamesResponse(lifecycle=" + this.f2222a + ", games=" + this.b + Separators.RPAREN;
    }
}
