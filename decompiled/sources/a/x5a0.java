package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x5a0 implements z5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5a0 f40305a;
    public final j9m0 b;
    public final String c;
    public final mdm d;

    public x5a0(u5a0 u5a0Var, j9m0 j9m0Var, String str, mdm mdmVar) {
        str.getClass();
        this.f40305a = u5a0Var;
        this.b = j9m0Var;
        this.c = str;
        this.d = mdmVar;
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
        return this.f40305a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5a0)) {
            return false;
        }
        x5a0 x5a0Var = (x5a0) obj;
        return this.f40305a.equals(x5a0Var.f40305a) && this.b.equals(x5a0Var.b) && Intrinsics.d(this.c, x5a0Var.c) && this.d.equals(x5a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(w6x.h(this.b, this.f40305a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Error(playerMainHeaderUiModel=" + this.f40305a + ", statisticBackgroundUiModel=" + this.b + ", toolbarTitle=" + this.c + ", lottieConfig=" + this.d + Separators.RPAREN;
    }
}
