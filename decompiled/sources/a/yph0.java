package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zvh0 f43030a;
    public final a4x b;
    public final int c;

    public yph0(zvh0 zvh0Var, a4x a4xVar, int i) {
        a4xVar.getClass();
        this.f43030a = zvh0Var;
        this.b = a4xVar;
        this.c = i;
    }

    public static yph0 a(yph0 yph0Var, zvh0 zvh0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            zvh0Var = yph0Var.f43030a;
        }
        a4x a4xVar = yph0Var.b;
        if ((i2 & 4) != 0) {
            i = yph0Var.c;
        }
        yph0Var.getClass();
        a4xVar.getClass();
        return new yph0(zvh0Var, a4xVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yph0)) {
            return false;
        }
        yph0 yph0Var = (yph0) obj;
        return this.f43030a == yph0Var.f43030a && Intrinsics.d(this.b, yph0Var.b) && this.c == yph0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cs0.b(this.b, this.f43030a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SecurityGiftContainerState(segmentedControlStyle=");
        sb.append(this.f43030a);
        sb.append(", segmentedControlPages=");
        sb.append(this.b);
        sb.append(", currentPage=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
