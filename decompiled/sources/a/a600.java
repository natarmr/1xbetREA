package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a600 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f296a;
    public final int b;
    public final List c;

    public a600(int i, int i2, List list) {
        list.getClass();
        this.f296a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a600)) {
            return false;
        }
        a600 a600Var = (a600) obj;
        return this.f296a == a600Var.f296a && this.b == a600Var.b && Intrinsics.d(this.c, a600Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f296a) * 31, 31);
    }

    public final String toString() {
        return dw9.r(dw9.t("LineGameEventsModel(id=", this.f296a, ", constId=", ", events=", this.b), this.c, Separators.RPAREN);
    }
}
