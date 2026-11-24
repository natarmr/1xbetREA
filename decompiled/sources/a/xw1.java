package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41588a;
    public final Date b;
    public final Date c;
    public final String d;

    public xw1(long j, Date date, Date date2, String str) {
        str.getClass();
        this.f41588a = j;
        this.b = date;
        this.c = date2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw1)) {
            return false;
        }
        xw1 xw1Var = (xw1) obj;
        return this.f41588a == xw1Var.f41588a && this.b.equals(xw1Var.b) && this.c.equals(xw1Var.c) && Intrinsics.d(this.d, xw1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.i(this.c, brm0.i(this.b, Long.hashCode(this.f41588a) * 31, 31), 31);
    }

    public final String toString() {
        return "AggregatorTournamentStageContent(stageId=" + this.f41588a + ", stageStartAt=" + this.b + ", stageEndAt=" + this.c + ", caption=" + this.d + Separators.RPAREN;
    }
}
