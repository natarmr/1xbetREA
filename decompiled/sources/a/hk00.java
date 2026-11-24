package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hk00 implements ik00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f13186a;
    public final String b;
    public final mtl c;

    public hk00(a4x a4xVar, String str, mtl mtlVar) {
        a4xVar.getClass();
        str.getClass();
        this.f13186a = a4xVar;
        this.b = str;
        this.c = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk00)) {
            return false;
        }
        hk00 hk00Var = (hk00) obj;
        return Intrinsics.d(this.f13186a, hk00Var.f13186a) && Intrinsics.d(this.b, hk00Var.b) && Intrinsics.d(this.c, hk00Var.c);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f13186a.hashCode() * 31, 31, this.b);
        mtl mtlVar = this.c;
        return iB + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        return "Sports(items=" + this.f13186a + ", sportsSelectedTitle=" + this.b + ", bottomBar=" + this.c + Separators.RPAREN;
    }
}
