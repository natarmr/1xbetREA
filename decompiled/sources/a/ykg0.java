package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ykg0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42786a;
    public final String b;
    public final ysw c;
    public final ysw d;
    public final clg0 e;

    public ykg0(boolean z, String str, ysw yswVar, ysw yswVar2, clg0 clg0Var) {
        str.getClass();
        yswVar.getClass();
        yswVar2.getClass();
        clg0Var.getClass();
        this.f42786a = z;
        this.b = str;
        this.c = yswVar;
        this.d = yswVar2;
        this.e = clg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykg0)) {
            return false;
        }
        ykg0 ykg0Var = (ykg0) obj;
        return this.f42786a == ykg0Var.f42786a && Intrinsics.d(this.b, ykg0Var.b) && Intrinsics.d(this.c, ykg0Var.c) && Intrinsics.d(this.d, ykg0Var.d) && this.e == ykg0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(Boolean.hashCode(this.f42786a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("RuleModel(header=", ", rulePoint=", this.b, this.f42786a, ", href=");
        sbQ.append(this.c);
        sbQ.append(", fallbackHref=");
        sbQ.append(this.d);
        sbQ.append(", type=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
