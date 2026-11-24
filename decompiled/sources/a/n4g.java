package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n4g {
    public static final m4g Companion = new m4g();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dpf((byte) 24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22896a;
    public final List b;

    public /* synthetic */ n4g(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f22896a = null;
        } else {
            this.f22896a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4g)) {
            return false;
        }
        n4g n4gVar = (n4g) obj;
        return Intrinsics.d(this.f22896a, n4gVar.f22896a) && Intrinsics.d(this.b, n4gVar.b);
    }

    public final int hashCode() {
        Integer num = this.f22896a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f22896a, "CyberCalendarAvailableDatesResponse(year=", ", months=", Separators.RPAREN, this.b);
    }
}
