package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gag {
    public static final fag Companion = new fag();
    public static final a8z[] b = {maz.a(wez.f39042a, new dpf((byte) 27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10963a;

    public /* synthetic */ gag(int i, List list) {
        if ((i & 1) == 0) {
            this.f10963a = null;
        } else {
            this.f10963a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gag) && Intrinsics.d(this.f10963a, ((gag) obj).f10963a);
    }

    public final int hashCode() {
        List list = this.f10963a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f10963a, "CyberCalendarStatisticResponse(tournaments=", Separators.RPAREN);
    }
}
