package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class eq60 {
    public static final xp60 Companion = new xp60();
    public static final a8z[] b = {maz.a(wez.f39042a, new th50(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8222a;

    public /* synthetic */ eq60(int i, List list) {
        if ((i & 1) == 0) {
            this.f8222a = null;
        } else {
            this.f8222a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq60) && Intrinsics.d(this.f8222a, ((eq60) obj).f8222a);
    }

    public final int hashCode() {
        List list = this.f8222a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f8222a, "OneXGamesActionResponse(xGamesActions=", Separators.RPAREN);
    }
}
