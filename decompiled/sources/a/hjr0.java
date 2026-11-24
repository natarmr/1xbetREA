package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hjr0 implements ijr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f13174a;
    public final String b;
    public final smr0 c;
    public final boolean d;

    public hjr0(a4x a4xVar, String str, smr0 smr0Var, boolean z) {
        a4xVar.getClass();
        this.f13174a = a4xVar;
        this.b = str;
        this.c = smr0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjr0)) {
            return false;
        }
        hjr0 hjr0Var = (hjr0) obj;
        return Intrinsics.d(this.f13174a, hjr0Var.f13174a) && this.b.equals(hjr0Var.b) && this.c.equals(hjr0Var.c) && this.d == hjr0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua80.b(this.f13174a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "Success(totoActiveTirageUiItems=" + this.f13174a + ", totoName=" + this.b + ", totoBottomBarUiModel=" + this.c + ", showMakeBetLoader=" + this.d + Separators.RPAREN;
    }
}
