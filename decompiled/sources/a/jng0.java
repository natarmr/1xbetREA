package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class jng0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16811a;
    public final long b;
    public final Date c;
    public final Date d;
    public final String e;

    public jng0(String str, long j, Date date, Date date2, String str2) {
        this.f16811a = str;
        this.b = j;
        this.c = date;
        this.d = date2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jng0)) {
            return false;
        }
        jng0 jng0Var = (jng0) obj;
        return this.f16811a.equals(jng0Var.f16811a) && this.b == jng0Var.b && this.c.equals(jng0Var.c) && this.d.equals(jng0Var.d) && this.e.equals(jng0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.i(this.d, brm0.i(this.c, rw2.b(this.f16811a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "RulesStageItemModel(content=", this.f16811a, ", crmStageId=");
        sbO.append(", stageEndAt=");
        sbO.append(this.c);
        sbO.append(", stageStartAt=");
        sbO.append(this.d);
        return rw2.o(sbO, ", subContent=", this.e, Separators.RPAREN);
    }
}
