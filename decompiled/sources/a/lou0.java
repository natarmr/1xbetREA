package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20407a;
    public final String b;
    public final imm c;

    public lou0(boolean z, String str, imm immVar) {
        this.f20407a = z;
        this.b = str;
        this.c = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lou0)) {
            return false;
        }
        lou0 lou0Var = (lou0) obj;
        return this.f20407a == lou0Var.f20407a && this.b.equals(lou0Var.b) && this.c.equals(lou0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f20407a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("VirtualGameCategoryDisciplinesToolbarUiModel(toolbarExpandState=", ", searchText=", this.b, this.f20407a, ", navigationBarUiModel=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
