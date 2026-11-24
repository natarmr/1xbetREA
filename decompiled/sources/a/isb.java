package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class isb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u12 f15296a;
    public final Function1 b;
    public final cfq c;
    public final boolean d;

    public isb(u12 u12Var, Function1 function1, cfq cfqVar, boolean z) {
        this.f15296a = u12Var;
        this.b = function1;
        this.c = cfqVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isb)) {
            return false;
        }
        isb isbVar = (isb) obj;
        return Intrinsics.d(this.f15296a, isbVar.f15296a) && Intrinsics.d(this.b, isbVar.b) && Intrinsics.d(this.c, isbVar.c) && this.d == isbVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f15296a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f15296a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + Separators.RPAREN;
    }
}
