package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b8o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2165a;
    public final String b;
    public final ArrayList c;
    public final int d;

    public b8o0(int i, String str, String str2, ArrayList arrayList) {
        str2.getClass();
        this.f2165a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8o0)) {
            return false;
        }
        b8o0 b8o0Var = (b8o0) obj;
        return this.f2165a.equals(b8o0Var.f2165a) && Intrinsics.d(this.b, b8o0Var.b) && this.c.equals(b8o0Var.c) && this.d == b8o0Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f2165a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.g(this.c, ua80.b(this.f2165a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SyntheticSekiroUiModel(key=", this.f2165a, ", roundTitle=", this.b, ", description=");
        sbN.append(this.c);
        sbN.append(", background=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
