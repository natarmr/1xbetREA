package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ud00 implements ugi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugi0 f35456a;

    public ud00(ugi0 ugi0Var) {
        this.f35456a = ugi0Var;
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        jf4.o(ohs0.n(str, " is not a valid list index"));
        return 0;
    }

    @Override // a.ugi0
    public final int d() {
        return 1;
    }

    @Override // a.ugi0
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud00)) {
            return false;
        }
        ud00 ud00Var = (ud00) obj;
        return Intrinsics.d(this.f35456a, ud00Var.f35456a) && Intrinsics.d(h(), ud00Var.h());
    }

    @Override // a.ugi0
    public final List f(int i) {
        if (i >= 0) {
            return iun.f15405a;
        }
        StringBuilder sbM = b1j.m(i, "Illegal index ", ", ");
        sbM.append(h());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    @Override // a.ugi0
    public final ugi0 g(int i) {
        if (i >= 0) {
            return this.f35456a;
        }
        StringBuilder sbM = b1j.m(i, "Illegal index ", ", ");
        sbM.append(h());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public final int hashCode() {
        return h().hashCode() + (this.f35456a.hashCode() * 31);
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM = b1j.m(i, "Illegal index ", ", ");
        sbM.append(h());
        sbM.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    @Override // a.ugi0
    public final c3x l() {
        return aum0.c;
    }

    public final String toString() {
        return h() + '(' + this.f35456a + ')';
    }
}
