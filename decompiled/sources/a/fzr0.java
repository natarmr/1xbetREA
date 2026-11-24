package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fzr0 {
    public static final ezr0 Companion = new ezr0();
    public static final a8z[] b = {maz.a(wez.f39042a, new yqr0(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10423a;

    public /* synthetic */ fzr0(int i, List list) {
        if ((i & 1) == 0) {
            this.f10423a = null;
        } else {
            this.f10423a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzr0) && Intrinsics.d(this.f10423a, ((fzr0) obj).f10423a);
    }

    public final int hashCode() {
        List list = this.f10423a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f10423a, "TournamentCardsResponse(tournaments=", Separators.RPAREN);
    }
}
