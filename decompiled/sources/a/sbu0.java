package a;

import java.math.BigInteger;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sbu0 implements Comparable {
    public static final sbu0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31954a;
    public final int b;
    public final int c;
    public final String d;
    public final n0o0 e = maz.b(new rbt0(this, 9));

    static {
        new sbu0(0, 0, 0, "");
        f = new sbu0(0, 1, 0, "");
        new sbu0(1, 0, 0, "");
    }

    public sbu0(int i, int i2, int i3, String str) {
        this.f31954a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        sbu0 sbu0Var = (sbu0) obj;
        sbu0Var.getClass();
        Object value = this.e.getValue();
        value.getClass();
        Object value2 = sbu0Var.e.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sbu0)) {
            return false;
        }
        sbu0 sbu0Var = (sbu0) obj;
        return this.f31954a == sbu0Var.f31954a && this.b == sbu0Var.b && this.c == sbu0Var.c;
    }

    public final int hashCode() {
        return ((((527 + this.f31954a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String str = this.d;
        String strK = !StringsKt.W(str) ? kng0.k("-", str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31954a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        return rz4.j(this.c, strK, sb);
    }
}
