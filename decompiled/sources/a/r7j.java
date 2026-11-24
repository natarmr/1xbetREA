package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r7j {
    public static final q7j Companion = new q7j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f29977a;
    public final String b;
    public final Long c;

    public /* synthetic */ r7j(int i, Float f, String str, Long l) {
        this.f29977a = (i & 1) == 0 ? Float.valueOf(0.0f) : f;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7j)) {
            return false;
        }
        r7j r7jVar = (r7j) obj;
        return Intrinsics.d(this.f29977a, r7jVar.f29977a) && Intrinsics.d(this.b, r7jVar.b) && Intrinsics.d(this.c, r7jVar.c);
    }

    public final int hashCode() {
        Float f = this.f29977a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyUserPlaceResponse(points=");
        sb.append(this.f29977a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", place=");
        return ohs0.r(sb, this.c, Separators.RPAREN);
    }

    public r7j() {
        this.f29977a = Float.valueOf(0.0f);
        this.b = "";
        this.c = 0L;
    }
}
