package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class q4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28098a;
    public final ArrayList b;

    public q4i0(int i, ArrayList arrayList) {
        this.f28098a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4i0)) {
            return false;
        }
        q4i0 q4i0Var = (q4i0) obj;
        return this.f28098a == q4i0Var.f28098a && this.b.equals(q4i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f28098a) * 31);
    }

    public final String toString() {
        return "SelectedTabContentUiModel(selectedTabIndex=" + this.f28098a + ", tabs=" + this.b + Separators.RPAREN;
    }
}
