package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ae80 implements zhr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f716a;
    public final xm6 b;
    public final cop0 c;
    public final String d;
    public final ee80 e;

    public ae80(String str, xm6 xm6Var, cop0 cop0Var, String str2, ee80 ee80Var) {
        str.getClass();
        this.f716a = str;
        this.b = xm6Var;
        this.c = cop0Var;
        this.d = str2;
        this.e = ee80Var;
    }

    @Override // a.zhr0
    public final String a() {
        return this.f716a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae80)) {
            return false;
        }
        ae80 ae80Var = (ae80) obj;
        return Intrinsics.d(this.f716a, ae80Var.f716a) && this.b.equals(ae80Var.b) && this.c.equals(ae80Var.c) && this.d.equals(ae80Var.d) && this.e.equals(ae80Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f716a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "OutcomesCardUiModel(itemKey=" + this.f716a + ", betCardHeaderUiModel=" + this.b + ", teamsAndBulkPercentageUiModel=" + this.c + ", totalTagText=" + this.d + ", outcomesChoiceUiModel=" + this.e + Separators.RPAREN;
    }
}
