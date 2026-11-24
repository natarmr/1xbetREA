package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class spu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ipu0 f32602a;
    public final a4x b;
    public final boolean c;

    public spu0(ipu0 ipu0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f32602a = ipu0Var;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spu0)) {
            return false;
        }
        spu0 spu0Var = (spu0) obj;
        return Intrinsics.d(this.f32602a, spu0Var.f32602a) && Intrinsics.d(this.b, spu0Var.b) && this.c == spu0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f32602a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualGameCategoryMainScreenStateUiModel(contentState=");
        sb.append(this.f32602a);
        sb.append(", itemList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public spu0(hpu0 hpu0Var) {
        this(hpu0Var, lak0.c, false);
    }
}
