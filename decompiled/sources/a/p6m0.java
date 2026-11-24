package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p6m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26463a;
    public final a4x b;

    public p6m0(a4x a4xVar, String str) {
        a4xVar.getClass();
        this.f26463a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6m0)) {
            return false;
        }
        p6m0 p6m0Var = (p6m0) obj;
        return this.f26463a.equals(p6m0Var.f26463a) && Intrinsics.d(this.b, p6m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26463a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("StartingLineupUiModel(title=", this.f26463a, ", playersList=", this.b, Separators.RPAREN);
    }
}
