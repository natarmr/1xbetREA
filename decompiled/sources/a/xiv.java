package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xiv implements iqg {
    public static final wiv Companion = new wiv();
    public static final a8z[] b = {maz.a(wez.f39042a, new ldv(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40965a;

    public /* synthetic */ xiv(int i, List list) {
        if ((i & 1) == 0) {
            this.f40965a = null;
        } else {
            this.f40965a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xiv) && Intrinsics.d(this.f40965a, ((xiv) obj).f40965a);
    }

    public final int hashCode() {
        List list = this.f40965a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f40965a, "GuiltyGearResponse(rounds=", Separators.RPAREN);
    }

    public xiv() {
        this.f40965a = null;
    }
}
