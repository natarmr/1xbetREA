package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vkp0 implements wkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f37585a;
    public final a4x b;

    public vkp0(imm immVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f37585a = immVar;
        this.b = a4xVar;
    }

    @Override // a.wkp0
    public final imm a() {
        return this.f37585a;
    }

    @Override // a.wkp0
    public final a4x b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkp0)) {
            return false;
        }
        vkp0 vkp0Var = (vkp0) obj;
        return this.f37585a.equals(vkp0Var.f37585a) && Intrinsics.d(this.b, vkp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37585a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(navigationBarModel=" + this.f37585a + ", championshipFilterList=" + this.b + Separators.RPAREN;
    }
}
