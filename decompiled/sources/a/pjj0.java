package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pjj0 extends sjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27094a;
    public final int b;

    public pjj0(int i, List list) {
        list.getClass();
        this.f27094a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjj0)) {
            return false;
        }
        pjj0 pjj0Var = (pjj0) obj;
        return Intrinsics.d(this.f27094a, pjj0Var.f27094a) && this.b == pjj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f27094a.hashCode() * 31);
    }

    public final String toString() {
        return "Footer(items=" + this.f27094a + ", height=" + this.b + Separators.RPAREN;
    }
}
