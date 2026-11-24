package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class env0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f8114a;
    public final a4x b;
    public final a4x c;
    public final vmv0 d;

    public env0(i4 i4Var, i4 i4Var2, i4 i4Var3, vmv0 vmv0Var) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        this.f8114a = i4Var;
        this.b = i4Var2;
        this.c = i4Var3;
        this.d = vmv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof env0)) {
            return false;
        }
        env0 env0Var = (env0) obj;
        return Intrinsics.d(this.f8114a, env0Var.f8114a) && Intrinsics.d(this.b, env0Var.b) && Intrinsics.d(this.c, env0Var.c) && this.d.equals(env0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f8114a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("WinterGamesResultsTableCellsUiModel(columnHeaderUiModelList=", this.f8114a, ", cellList=", this.b, ", rowHeaderList=");
        sbQ.append(this.c);
        sbQ.append(", cornerCell=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
