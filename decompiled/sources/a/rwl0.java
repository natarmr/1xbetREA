package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rwl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f31222a;
    public final a4x b;
    public final a4x c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public rwl0(a4x a4xVar, a4x a4xVar2, a4x a4xVar3, String str, boolean z, boolean z2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        str.getClass();
        this.f31222a = a4xVar;
        this.b = a4xVar2;
        this.c = a4xVar3;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwl0)) {
            return false;
        }
        rwl0 rwl0Var = (rwl0) obj;
        return Intrinsics.d(this.f31222a, rwl0Var.f31222a) && Intrinsics.d(this.b, rwl0Var.b) && Intrinsics.d(this.c, rwl0Var.c) && Intrinsics.d(this.d, rwl0Var.d) && this.e == rwl0Var.e && this.f == rwl0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(cs0.b(this.c, cs0.b(this.b, this.f31222a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("StadiumInfoUiModel(images=", this.f31222a, ", infoItemUiModelList=", this.b, ", circuitsList=");
        sbQ.append(this.c);
        sbQ.append(", circuitsTitle=");
        sbQ.append(this.d);
        sbQ.append(", hasInfo=");
        return ohs0.p(", isHideImages=", Separators.RPAREN, sbQ, this.e, this.f);
    }
}
