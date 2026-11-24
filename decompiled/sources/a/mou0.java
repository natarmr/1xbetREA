package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lou0 f22149a;
    public final gou0 b;
    public final a4x c;
    public final boolean d;

    public mou0(lou0 lou0Var, gou0 gou0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f22149a = lou0Var;
        this.b = gou0Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mou0)) {
            return false;
        }
        mou0 mou0Var = (mou0) obj;
        return this.f22149a.equals(mou0Var.f22149a) && this.b.equals(mou0Var.b) && Intrinsics.d(this.c, mou0Var.c) && this.d == mou0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f22149a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualGameCategoryDisciplinesUiState(toolbarUiModel=");
        sb.append(this.f22149a);
        sb.append(", contentState=");
        sb.append(this.b);
        sb.append(", itemList=");
        return rz4.m(sb, this.c, ", loading=", this.d, Separators.RPAREN);
    }
}
