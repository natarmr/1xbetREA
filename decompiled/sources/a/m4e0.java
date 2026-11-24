package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m4e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21166a;
    public final i6i0 b;

    public m4e0(List list, i6i0 i6i0Var) {
        list.getClass();
        this.f21166a = list;
        this.b = i6i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4e0)) {
            return false;
        }
        m4e0 m4e0Var = (m4e0) obj;
        return Intrinsics.d(this.f21166a, m4e0Var.f21166a) && this.b == m4e0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21166a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFilterSelectorDialog(selectors=" + this.f21166a + ", selectorUiType=" + this.b + Separators.RPAREN;
    }
}
