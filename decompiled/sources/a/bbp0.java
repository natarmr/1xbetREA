package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bbp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u8p0 f2319a;
    public final a4x b;
    public final boolean c;

    public bbp0(u8p0 u8p0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f2319a = u8p0Var;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbp0)) {
            return false;
        }
        bbp0 bbp0Var = (bbp0) obj;
        return Intrinsics.d(this.f2319a, bbp0Var.f2319a) && Intrinsics.d(this.b, bbp0Var.b) && this.c == bbp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f2319a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamDetailsScreenStateUiModel(contentState=");
        sb.append(this.f2319a);
        sb.append(", itemList=");
        sb.append(this.b);
        sb.append(", loading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }

    public bbp0(u8p0 u8p0Var, a4x a4xVar, int i) {
        this(u8p0Var, (i & 2) != 0 ? lak0.c : a4xVar, false);
    }
}
