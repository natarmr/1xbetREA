package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ls9 implements ts9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f20566a;
    public final int b;
    public final boolean c;

    public ls9(a4x a4xVar, int i, boolean z) {
        a4xVar.getClass();
        this.f20566a = a4xVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls9)) {
            return false;
        }
        ls9 ls9Var = (ls9) obj;
        return Intrinsics.d(this.f20566a, ls9Var.f20566a) && this.b == ls9Var.b && this.c == ls9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f20566a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(items=");
        sb.append(this.f20566a);
        sb.append(", animatedItemIndex=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
