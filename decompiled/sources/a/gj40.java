package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gj40 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6m f11379a;
    public final a4x b;
    public final int c;

    public gj40(x6m x6mVar, i4 i4Var, int i) {
        i4Var.getClass();
        this.f11379a = x6mVar;
        this.b = i4Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj40)) {
            return false;
        }
        gj40 gj40Var = (gj40) obj;
        return this.f11379a.equals(gj40Var.f11379a) && Intrinsics.d(this.b, gj40Var.b) && this.c == gj40Var.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "PICK_BAN";
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cs0.b(this.b, (this.f11379a.hashCode() + 1378822991) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MlbbPickBanUiModel(key=PICK_BAN, teamModel=");
        sb.append(this.f11379a);
        sb.append(", pickBanModelList=");
        sb.append(this.b);
        sb.append(", activeColumnIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
