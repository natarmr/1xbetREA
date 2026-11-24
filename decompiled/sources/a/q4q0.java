package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q4q0 implements r4q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28112a;
    public final int b;
    public final List c;

    public q4q0(int i, int i2, List list) {
        list.getClass();
        this.f28112a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4q0)) {
            return false;
        }
        q4q0 q4q0Var = (q4q0) obj;
        return this.f28112a == q4q0Var.f28112a && this.b == q4q0Var.b && Intrinsics.d(this.c, q4q0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f28112a) * 31, 31);
    }

    public final String toString() {
        return dw9.r(dw9.t("TextModel(offset=", this.f28112a, ", length=", ", attrs=", this.b), this.c, Separators.RPAREN);
    }
}
