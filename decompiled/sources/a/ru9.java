package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ru9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f31115a;
    public final dxh0 b;
    public final int c;

    public ru9(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        this.f31115a = a4xVar;
        this.b = dxh0Var;
        this.c = i;
    }

    public static ru9 a(ru9 ru9Var, dxh0 dxh0Var, int i, int i2) {
        a4x a4xVar = ru9Var.f31115a;
        if ((i2 & 2) != 0) {
            dxh0Var = ru9Var.b;
        }
        if ((i2 & 4) != 0) {
            i = ru9Var.c;
        }
        ru9Var.getClass();
        a4xVar.getClass();
        return new ru9(i, a4xVar, dxh0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru9)) {
            return false;
        }
        ru9 ru9Var = (ru9) obj;
        return Intrinsics.d(this.f31115a, ru9Var.f31115a) && this.b.equals(ru9Var.b) && this.c == ru9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hne.h(this.b, this.f31115a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackStateModel(segmentedControlPages=");
        sb.append(this.f31115a);
        sb.append(", segmentControlStyle=");
        sb.append(this.b);
        sb.append(", selectedPagePosition=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
