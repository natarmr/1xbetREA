package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jyg {
    public static final iyg Companion = new iyg();
    public static final a8z[] b = {maz.a(wez.f39042a, new xng(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17358a;

    public /* synthetic */ jyg(int i, List list) {
        if ((i & 1) == 0) {
            this.f17358a = null;
        } else {
            this.f17358a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyg) && Intrinsics.d(this.f17358a, ((jyg) obj).f17358a);
    }

    public final int hashCode() {
        List list = this.f17358a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17358a, "CyberGamesCSRankingLeaderBoardResponse(teams=", Separators.RPAREN);
    }
}
