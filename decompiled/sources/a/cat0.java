package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cat0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gat0 f4030a;
    public final w9t0 b;
    public final a4x c;
    public final boolean d;

    public cat0(gat0 gat0Var, w9t0 w9t0Var, a4x a4xVar, boolean z) {
        gat0Var.getClass();
        this.f4030a = gat0Var;
        this.b = w9t0Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cat0)) {
            return false;
        }
        cat0 cat0Var = (cat0) obj;
        return Intrinsics.d(this.f4030a, cat0Var.f4030a) && this.b.equals(cat0Var.b) && this.c.equals(cat0Var.c) && this.d == cat0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f4030a.f10987a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalChampInfoUiState(navigationBarUiModel=");
        sb.append(this.f4030a);
        sb.append(", contentUiModel=");
        sb.append(this.b);
        sb.append(", uiItemList=");
        return rz4.m(sb, this.c, ", loading=", this.d, Separators.RPAREN);
    }
}
