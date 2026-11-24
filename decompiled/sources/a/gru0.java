package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gru0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11799a;
    public final String b;
    public final imm c;

    public gru0(boolean z, String str, imm immVar) {
        this.f11799a = z;
        this.b = str;
        this.c = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gru0)) {
            return false;
        }
        gru0 gru0Var = (gru0) obj;
        return this.f11799a == gru0Var.f11799a && this.b.equals(gru0Var.b) && this.c.equals(gru0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f11799a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("VirtualGamesCategoriesListToolbarUiModel(toolbarExpandState=", ", searchText=", this.b, this.f11799a, ", navigationBarUiModel=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
