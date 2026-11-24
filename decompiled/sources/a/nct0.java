package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class nct0 {
    public static final mct0 Companion = new mct0();
    public static final a8z[] b = {maz.a(wez.f39042a, new xns0(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23310a;

    public /* synthetic */ nct0(int i, List list) {
        if ((i & 1) == 0) {
            this.f23310a = null;
        } else {
            this.f23310a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nct0) && Intrinsics.d(this.f23310a, ((nct0) obj).f23310a);
    }

    public final int hashCode() {
        List list = this.f23310a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f23310a, "MainContent(info=", Separators.RPAREN);
    }
}
