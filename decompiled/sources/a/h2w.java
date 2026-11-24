package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h2w implements i2w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s47 f12355a;
    public final ArrayList b;
    public final cxo0 c;

    public h2w(s47 s47Var, ArrayList arrayList, cxo0 cxo0Var) {
        this.f12355a = s47Var;
        this.b = arrayList;
        this.c = cxo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2w)) {
            return false;
        }
        h2w h2wVar = (h2w) obj;
        return this.f12355a.equals(h2wVar.f12355a) && this.b.equals(h2wVar.b) && this.c.equals(h2wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, this.f12355a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Success(historyInfoItemModel=" + this.f12355a + ", betEventModelList=" + this.b + ", taxUiModel=" + this.c + Separators.RPAREN;
    }
}
