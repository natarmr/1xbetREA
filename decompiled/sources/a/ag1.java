package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ag1 implements gg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f806a;
    public final lq5 b;
    public final jjm c;
    public final boolean d;

    public ag1(a4x a4xVar, lq5 lq5Var, jjm jjmVar, boolean z) {
        a4xVar.getClass();
        this.f806a = a4xVar;
        this.b = lq5Var;
        this.c = jjmVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag1)) {
            return false;
        }
        ag1 ag1Var = (ag1) obj;
        return Intrinsics.d(this.f806a, ag1Var.f806a) && this.b.equals(ag1Var.b) && this.c.equals(ag1Var.c) && this.d == ag1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f806a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BannersContent(banners=" + this.f806a + ", style=" + this.b + ", header=" + this.c + ", isLoading=" + this.d + Separators.RPAREN;
    }
}
