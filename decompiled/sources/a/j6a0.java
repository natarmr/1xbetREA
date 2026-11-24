package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j6a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6a0 f15975a;
    public final a4x b;
    public final String c;
    public final udl0 d;

    public j6a0(h6a0 h6a0Var, a4x a4xVar, String str, udl0 udl0Var) {
        a4xVar.getClass();
        str.getClass();
        this.f15975a = h6a0Var;
        this.b = a4xVar;
        this.c = str;
        this.d = udl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6a0)) {
            return false;
        }
        j6a0 j6a0Var = (j6a0) obj;
        return this.f15975a.equals(j6a0Var.f15975a) && Intrinsics.d(this.b, j6a0Var.b) && Intrinsics.d(this.c, j6a0Var.c) && this.d == j6a0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(cs0.b(this.b, this.f15975a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "PlayerMarketGroupUiModel(header=" + this.f15975a + ", rows=" + this.b + ", key=" + this.c + ", sportGameType=" + this.d + Separators.RPAREN;
    }
}
