package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fyr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gyr0 f10375a;
    public final Date b;
    public final Date c;
    public final Long d;
    public final String e;

    public fyr0(gyr0 gyr0Var, Date date, Date date2, Long l, String str) {
        this.f10375a = gyr0Var;
        this.b = date;
        this.c = date2;
        this.d = l;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyr0)) {
            return false;
        }
        fyr0 fyr0Var = (fyr0) obj;
        return this.f10375a == fyr0Var.f10375a && Intrinsics.d(this.b, fyr0Var.b) && Intrinsics.d(this.c, fyr0Var.c) && this.d.equals(fyr0Var.d) && this.e.equals(fyr0Var.e);
    }

    public final int hashCode() {
        gyr0 gyr0Var = this.f10375a;
        int iHashCode = (gyr0Var == null ? 0 : gyr0Var.hashCode()) * 31;
        Date date = this.b;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Counter(type=");
        sb.append(this.f10375a);
        sb.append(", eventDate=");
        sb.append(this.b);
        sb.append(", expireDate=");
        sb.append(this.c);
        sb.append(", timeToExpire=");
        sb.append(this.d);
        sb.append(", title=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
