package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pjh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27091a;
    public final List b;

    public pjh0(int i, List list) {
        list.getClass();
        this.f27091a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjh0)) {
            return false;
        }
        pjh0 pjh0Var = (pjh0) obj;
        return this.f27091a == pjh0Var.f27091a && Intrinsics.d(this.b, pjh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27091a) * 31);
    }

    public final String toString() {
        return "SeasonsState(selectedYear=" + this.f27091a + ", years=" + this.b + Separators.RPAREN;
    }
}
