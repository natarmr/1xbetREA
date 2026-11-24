package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j3n implements n3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f15843a;
    public final j83 b;
    public final qal0 c;
    public final ArrayList d;
    public final ArrayList e;
    public final x9l0 f;

    public j3n(j83 j83Var, j83 j83Var2, qal0 qal0Var, ArrayList arrayList, ArrayList arrayList2, x9l0 x9l0Var) {
        this.f15843a = j83Var;
        this.b = j83Var2;
        this.c = qal0Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = x9l0Var;
    }

    @Override // a.n3n
    public final j83 a() {
        return this.f15843a;
    }

    @Override // a.n3n
    public final j83 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3n)) {
            return false;
        }
        j3n j3nVar = (j3n) obj;
        return this.f15843a.equals(j3nVar.f15843a) && this.b.equals(j3nVar.b) && Intrinsics.d(this.c, j3nVar.c) && this.d.equals(j3nVar.d) && this.e.equals(j3nVar.e) && this.f.equals(j3nVar.f);
    }

    public final int hashCode() {
        int iF = brm0.f(this.b, this.f15843a.hashCode() * 31, 31);
        qal0 qal0Var = this.c;
        return this.f.hashCode() + twn.g(this.e, twn.g(this.d, (iF + (qal0Var == null ? 0 : qal0Var.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "Multi(topInfo=" + ((Object) this.f15843a) + ", bottomInfo=" + ((Object) this.b) + ", timer=" + this.c + ", teamOne=" + this.d + ", teamTwo=" + this.e + ", score=" + this.f + Separators.RPAREN;
    }
}
