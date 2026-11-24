package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class dpe {
    public static final cpe Companion = new cpe();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6462a;
    public final Long b;
    public final String c;
    public final Integer d;

    public /* synthetic */ dpe(int i, Long l, Long l2, String str, Integer num) {
        if ((i & 1) == 0) {
            this.f6462a = null;
        } else {
            this.f6462a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpe)) {
            return false;
        }
        dpe dpeVar = (dpe) obj;
        return Intrinsics.d(this.f6462a, dpeVar.f6462a) && Intrinsics.d(this.b, dpeVar.b) && Intrinsics.d(this.c, dpeVar.c) && Intrinsics.d(this.d, dpeVar.d);
    }

    public final int hashCode() {
        Long l = this.f6462a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return vqd.l(this.d, this.c, ", type=", Separators.RPAREN, rz4.o(this.f6462a, this.b, "CounterResponse(eventDt=", ", secondsToExpire=", ", title="));
    }
}
