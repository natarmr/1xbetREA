package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37078a;
    public final Date b;
    public final String c;

    public vac0(boolean z, Date date, String str) {
        this.f37078a = z;
        this.b = date;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vac0)) {
            return false;
        }
        vac0 vac0Var = (vac0) obj;
        return this.f37078a == vac0Var.f37078a && Intrinsics.d(this.b, vac0Var.b) && this.c.equals(vac0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f37078a) * 31;
        Date date = this.b;
        return this.c.hashCode() + ((iHashCode + (date == null ? 0 : date.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCmsConfirmModel(isConfirmed=");
        sb.append(this.f37078a);
        sb.append(", confirmationDate=");
        sb.append(this.b);
        sb.append(", info=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
