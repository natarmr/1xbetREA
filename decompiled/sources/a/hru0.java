package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hru0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gru0 f13550a;
    public final bru0 b;
    public final a4x c;
    public final boolean d;

    public hru0(gru0 gru0Var, bru0 bru0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f13550a = gru0Var;
        this.b = bru0Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hru0)) {
            return false;
        }
        hru0 hru0Var = (hru0) obj;
        return this.f13550a.equals(hru0Var.f13550a) && this.b.equals(hru0Var.b) && Intrinsics.d(this.c, hru0Var.c) && this.d == hru0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f13550a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualGamesCategoriesListUiState(toolbarUiModel=");
        sb.append(this.f13550a);
        sb.append(", contentState=");
        sb.append(this.b);
        sb.append(", itemList=");
        return rz4.m(sb, this.c, ", loading=", this.d, Separators.RPAREN);
    }
}
