package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xtp0 implements iqg {
    public static final wtp0 Companion = new wtp0();
    public static final a8z[] b = {maz.a(wez.f39042a, new mhp0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41474a;

    public /* synthetic */ xtp0(int i, List list) {
        if ((i & 1) == 0) {
            this.f41474a = null;
        } else {
            this.f41474a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtp0) && Intrinsics.d(this.f41474a, ((xtp0) obj).f41474a);
    }

    public final int hashCode() {
        List list = this.f41474a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f41474a, "TekkenRoundListResponse(roundList=", Separators.RPAREN);
    }

    public xtp0() {
        this.f41474a = null;
    }
}
