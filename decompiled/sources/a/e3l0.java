package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e3l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7143a;
    public final ope b;
    public final int c;
    public final String d;

    public e3l0(int i, ope opeVar, int i2, String str) {
        this.f7143a = i;
        this.b = opeVar;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3l0)) {
            return false;
        }
        e3l0 e3l0Var = (e3l0) obj;
        return this.f7143a == e3l0Var.f7143a && Intrinsics.d(this.b, e3l0Var.b) && this.c == e3l0Var.c && Intrinsics.d(this.d, e3l0Var.d);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.f7143a) * 31)) * 31, 31);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TagWithCounterAndActionIcon(counterValue=");
        sb.append(this.f7143a);
        sb.append(", counterStyle=");
        sb.append(this.b);
        sb.append(", actionIconResId=");
        return rw2.k(this.c, ", tagText=", this.d, Separators.RPAREN, sb);
    }
}
