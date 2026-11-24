package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class oqq0 {
    public static final nqq0 Companion = new nqq0();
    public static final a8z[] b = {maz.a(wez.f39042a, new joq0(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25701a;

    public /* synthetic */ oqq0(int i, List list) {
        if ((i & 1) == 0) {
            this.f25701a = null;
        } else {
            this.f25701a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqq0) && Intrinsics.d(this.f25701a, ((oqq0) obj).f25701a);
    }

    public final int hashCode() {
        List list = this.f25701a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25701a, "TirageParametersResponse(result=", Separators.RPAREN);
    }
}
