package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qok0 {
    public static final pok0 Companion = new pok0();
    public static final a8z[] b = {maz.a(wez.f39042a, new pdk0(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29077a;

    public /* synthetic */ qok0(int i, List list) {
        if ((i & 1) == 0) {
            this.f29077a = null;
        } else {
            this.f29077a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qok0) && Intrinsics.d(this.f29077a, ((qok0) obj).f29077a);
    }

    public final int hashCode() {
        List list = this.f29077a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f29077a, "SpecialEventInfoResponse(specialEvents=", Separators.RPAREN);
    }
}
