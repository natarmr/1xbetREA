package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class c75 {
    public static final p65 Companion = new p65();
    public static final a8z[] b = {maz.a(wez.f39042a, new a04(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3845a;

    public /* synthetic */ c75(int i, List list) {
        if ((i & 1) == 0) {
            this.f3845a = null;
        } else {
            this.f3845a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c75) && Intrinsics.d(this.f3845a, ((c75) obj).f3845a);
    }

    public final int hashCode() {
        List list = this.f3845a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f3845a, "AvailableFreeSpinsResponse(offers=", Separators.RPAREN);
    }
}
