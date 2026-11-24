package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class lgt0 {
    public static final kgt0 Companion = new kgt0();
    public static final a8z[] d = {maz.a(wez.f39042a, new xns0(21)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20024a;
    public final String b;
    public final String c;

    public /* synthetic */ lgt0(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f20024a = null;
        } else {
            this.f20024a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgt0)) {
            return false;
        }
        lgt0 lgt0Var = (lgt0) obj;
        return Intrinsics.d(this.f20024a, lgt0Var.f20024a) && Intrinsics.d(this.b, lgt0Var.b) && Intrinsics.d(this.c, lgt0Var.c);
    }

    public final int hashCode() {
        List list = this.f20024a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(ua80.o("UpcomingEventsListResponse(upcomingEvents=", ", image=", this.b, this.f20024a, ", title="), this.c, Separators.RPAREN);
    }
}
