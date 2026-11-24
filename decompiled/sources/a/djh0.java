package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class djh0 {
    public static final cjh0 Companion = new cjh0();
    public static final a8z[] b = {maz.a(wez.f39042a, new igh0(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6186a;

    public /* synthetic */ djh0(int i, List list) {
        if ((i & 1) == 0) {
            this.f6186a = null;
        } else {
            this.f6186a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djh0) && Intrinsics.d(this.f6186a, ((djh0) obj).f6186a);
    }

    public final int hashCode() {
        List list = this.f6186a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f6186a, "SeasonSelectorsResponse(options=", Separators.RPAREN);
    }
}
