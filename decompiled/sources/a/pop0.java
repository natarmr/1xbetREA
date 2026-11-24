package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pop0 implements sop0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mop0 f27341a;
    public final boolean b;
    public final ArrayList c;

    public pop0(mop0 mop0Var, boolean z, ArrayList arrayList) {
        this.f27341a = mop0Var;
        this.b = z;
        this.c = arrayList;
    }

    @Override // a.sop0
    public final boolean a() {
        return this.b;
    }

    @Override // a.sop0
    public final mop0 b() {
        return this.f27341a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pop0)) {
            return false;
        }
        pop0 pop0Var = (pop0) obj;
        return this.f27341a.equals(pop0Var.f27341a) && this.b == pop0Var.b && this.c.equals(pop0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f27341a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(headerUiState=");
        sb.append(this.f27341a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", items=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
