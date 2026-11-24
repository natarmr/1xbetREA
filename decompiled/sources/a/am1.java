package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class am1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fs80 f1088a;
    public final q91 b;

    public am1(fs80 fs80Var, q91 q91Var) {
        fs80Var.getClass();
        q91Var.getClass();
        this.f1088a = fs80Var;
        this.b = q91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am1)) {
            return false;
        }
        am1 am1Var = (am1) obj;
        return Intrinsics.d(this.f1088a, am1Var.f1088a) && this.b == am1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1088a.hashCode() * 31);
    }

    public final String toString() {
        return "CategoriesScreen(categoryToOpen=" + this.f1088a + ", navigationSource=" + this.b + Separators.RPAREN;
    }
}
