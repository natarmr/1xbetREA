package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jx60 {
    public static final ix60 Companion = new ix60();
    public static final a8z[] b = {maz.a(wez.f39042a, new fq60(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17289a;

    public /* synthetic */ jx60(int i, List list) {
        if ((i & 1) == 0) {
            this.f17289a = null;
        } else {
            this.f17289a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx60) && Intrinsics.d(this.f17289a, ((jx60) obj).f17289a);
    }

    public final int hashCode() {
        List list = this.f17289a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17289a, "OneXGamesFavoritesResponse(favoriteGames=", Separators.RPAREN);
    }
}
