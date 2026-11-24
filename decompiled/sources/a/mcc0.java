package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class mcc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21545a;
    public final Date b;
    public final Date c;
    public final fcc0 d;

    public mcc0(int i, Date date, Date date2, fcc0 fcc0Var) {
        this.f21545a = i;
        this.b = date;
        this.c = date2;
        this.d = fcc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcc0)) {
            return false;
        }
        mcc0 mcc0Var = (mcc0) obj;
        return this.f21545a == mcc0Var.f21545a && this.b.equals(mcc0Var.b) && this.c.equals(mcc0Var.c) && this.d == mcc0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.i(this.c, brm0.i(this.b, Integer.hashCode(this.f21545a) * 31, 31), 31);
    }

    public final String toString() {
        return "PromoCmsPromotionInfoStageModel(stageId=" + this.f21545a + ", startDate=" + this.b + ", endDate=" + this.c + ", isFinished=" + this.d + Separators.RPAREN;
    }
}
