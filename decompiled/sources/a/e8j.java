package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e8j {
    public static final x7j Companion = new x7j();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new bmh(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8j f7374a;
    public final List b;

    public /* synthetic */ e8j(int i, a8j a8jVar, List list) {
        if ((i & 1) == 0) {
            this.f7374a = null;
        } else {
            this.f7374a = a8jVar;
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
        if (!(obj instanceof e8j)) {
            return false;
        }
        e8j e8jVar = (e8j) obj;
        return Intrinsics.d(this.f7374a, e8jVar.f7374a) && Intrinsics.d(this.b, e8jVar.b);
    }

    public final int hashCode() {
        a8j a8jVar = this.f7374a;
        int iHashCode = (a8jVar == null ? 0 : a8jVar.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DailyWinnerResponse(date=" + this.f7374a + ", winners=" + this.b + Separators.RPAREN;
    }
}
