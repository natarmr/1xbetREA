package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xat0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gat0 f40574a;
    public final sat0 b;
    public final a4x c;
    public final boolean d;

    public xat0(gat0 gat0Var, sat0 sat0Var, a4x a4xVar, boolean z) {
        gat0Var.getClass();
        this.f40574a = gat0Var;
        this.b = sat0Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xat0)) {
            return false;
        }
        xat0 xat0Var = (xat0) obj;
        return Intrinsics.d(this.f40574a, xat0Var.f40574a) && this.b.equals(xat0Var.b) && this.c.equals(xat0Var.c) && this.d == xat0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f40574a.f10987a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalChampPrizePoolUiState(navigationBarUiModel=");
        sb.append(this.f40574a);
        sb.append(", contentUiModel=");
        sb.append(this.b);
        sb.append(", uiItemList=");
        return rz4.m(sb, this.c, ", loading=", this.d, Separators.RPAREN);
    }
}
