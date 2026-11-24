package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lr40 implements iqg {
    public static final kr40 Companion = new kr40();
    public static final a8z[] b = {maz.a(wez.f39042a, new ec40(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20511a;

    public /* synthetic */ lr40(int i, List list) {
        if ((i & 1) == 0) {
            this.f20511a = null;
        } else {
            this.f20511a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr40) && Intrinsics.d(this.f20511a, ((lr40) obj).f20511a);
    }

    public final int hashCode() {
        List list = this.f20511a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f20511a, "MortalKombatRoundListResponse(roundList=", Separators.RPAREN);
    }

    public lr40() {
        this.f20511a = null;
    }
}
