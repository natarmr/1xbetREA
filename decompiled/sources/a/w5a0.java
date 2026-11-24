package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w5a0 implements z5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5a0 f38574a;
    public final j9m0 b;
    public final String c;
    public final a4x d;

    public w5a0(t5a0 t5a0Var, j9m0 j9m0Var, String str, a4x a4xVar) {
        str.getClass();
        a4xVar.getClass();
        this.f38574a = t5a0Var;
        this.b = j9m0Var;
        this.c = str;
        this.d = a4xVar;
    }

    @Override // a.z5a0
    public final String a() {
        return this.c;
    }

    @Override // a.z5a0
    public final j9m0 b() {
        return this.b;
    }

    @Override // a.z5a0
    public final u5a0 c() {
        return this.f38574a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5a0)) {
            return false;
        }
        w5a0 w5a0Var = (w5a0) obj;
        return this.f38574a.equals(w5a0Var.f38574a) && this.b.equals(w5a0Var.b) && Intrinsics.d(this.c, w5a0Var.c) && Intrinsics.d(this.d, w5a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(w6x.h(this.b, this.f38574a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Content(playerMainHeaderUiModel=" + this.f38574a + ", statisticBackgroundUiModel=" + this.b + ", toolbarTitle=" + this.c + ", menuItemList=" + this.d + Separators.RPAREN;
    }
}
