package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n830 implements p830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ca80 f23070a;
    public final ArrayList b;

    public n830(ca80 ca80Var, ArrayList arrayList) {
        this.f23070a = ca80Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n830)) {
            return false;
        }
        n830 n830Var = (n830) obj;
        return Intrinsics.d(this.f23070a, n830Var.f23070a) && this.b.equals(n830Var.b);
    }

    public final int hashCode() {
        ca80 ca80Var = this.f23070a;
        return this.b.hashCode() + ((ca80Var == null ? 0 : Integer.hashCode(ca80Var.f3996a)) * 31);
    }

    public final String toString() {
        return "OrderedList(attrs=" + this.f23070a + ", content=" + this.b + Separators.RPAREN;
    }
}
