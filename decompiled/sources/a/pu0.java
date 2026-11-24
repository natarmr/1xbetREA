package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27588a;
    public final av0 b;
    public final m0x c;
    public final int d;
    public final wui0 e;

    public pu0(String str, av0 av0Var, m0x m0xVar, int i, wui0 wui0Var) {
        str.getClass();
        this.f27588a = str;
        this.b = av0Var;
        this.c = m0xVar;
        this.d = i;
        this.e = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu0)) {
            return false;
        }
        pu0 pu0Var = (pu0) obj;
        return Intrinsics.d(this.f27588a, pu0Var.f27588a) && this.b == pu0Var.b && this.c.equals(pu0Var.c) && this.d == pu0Var.d && this.e == pu0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, cs0.a(this.c, (this.b.hashCode() + (this.f27588a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "AggregatorGameModeItemUiModel(title=" + this.f27588a + ", type=" + this.b + ", image=" + this.c + ", placeholder=" + this.d + ", position=" + this.e + Separators.RPAREN;
    }
}
