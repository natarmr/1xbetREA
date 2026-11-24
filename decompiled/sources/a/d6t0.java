package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class d6t0 implements iqg {
    public static final c6t0 Companion = new c6t0();
    public static final a8z[] b = {maz.a(wez.f39042a, new xns0(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5567a;

    public /* synthetic */ d6t0(int i, List list) {
        if ((i & 1) == 0) {
            this.f5567a = null;
        } else {
            this.f5567a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6t0) && Intrinsics.d(this.f5567a, ((d6t0) obj).f5567a);
    }

    public final int hashCode() {
        List list = this.f5567a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f5567a, "UfcRoundListResponse(roundList=", Separators.RPAREN);
    }

    public d6t0() {
        this.f5567a = null;
    }
}
