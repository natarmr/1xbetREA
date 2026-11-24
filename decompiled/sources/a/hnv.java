package a;

import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class hnv implements ugi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13366a;
    public final ugi0 b;
    public final ugi0 c;

    public hnv(String str, ugi0 ugi0Var, ugi0 ugi0Var2) {
        this.f13366a = str;
        this.b = ugi0Var;
        this.c = ugi0Var2;
    }

    @Override // a.ugi0
    public final int c(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        jf4.o(ohs0.n(str, " is not a valid map index"));
        return 0;
    }

    @Override // a.ugi0
    public final int d() {
        return 2;
    }

    @Override // a.ugi0
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnv)) {
            return false;
        }
        hnv hnvVar = (hnv) obj;
        return this.f13366a.equals(hnvVar.f13366a) && this.b.equals(hnvVar.b) && this.c.equals(hnvVar.c);
    }

    @Override // a.ugi0
    public final List f(int i) {
        if (i >= 0) {
            return iun.f15405a;
        }
        c99.s(axq.n(b1j.m(i, "Illegal index ", ", "), this.f13366a, " expects only non-negative indices"));
        return null;
    }

    @Override // a.ugi0
    public final ugi0 g(int i) {
        if (i < 0) {
            c99.s(axq.n(b1j.m(i, "Illegal index ", ", "), this.f13366a, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        jf4.n("Unreached");
        return null;
    }

    @Override // a.ugi0
    public final String h() {
        return this.f13366a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f13366a.hashCode() * 31)) * 31);
    }

    @Override // a.ugi0
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        c99.s(axq.n(b1j.m(i, "Illegal index ", ", "), this.f13366a, " expects only non-negative indices"));
        return false;
    }

    @Override // a.ugi0
    public final c3x l() {
        return aum0.d;
    }

    public final String toString() {
        return this.f13366a + '(' + this.b + ", " + this.c + ')';
    }
}
