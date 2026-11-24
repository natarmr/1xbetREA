package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jss {
    public static final hss Companion = new hss();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new sqs(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17069a;
    public final List b;

    public /* synthetic */ jss(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f17069a = null;
        } else {
            this.f17069a = str;
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
        if (!(obj instanceof jss)) {
            return false;
        }
        jss jssVar = (jss) obj;
        return Intrinsics.d(this.f17069a, jssVar.f17069a) && Intrinsics.d(this.b, jssVar.b);
    }

    public final int hashCode() {
        String str = this.f17069a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("GameStatisticResponse(title=", this.f17069a, ", periodStatistics=", this.b, Separators.RPAREN);
    }
}
