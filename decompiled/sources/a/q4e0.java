package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q4e0 implements r4e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f28093a;
    public final dmm b;

    public q4e0(a4x a4xVar, dmm dmmVar) {
        a4xVar.getClass();
        this.f28093a = a4xVar;
        this.b = dmmVar;
    }

    @Override // a.r4e0
    public final gmm a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4e0)) {
            return false;
        }
        q4e0 q4e0Var = (q4e0) obj;
        return Intrinsics.d(this.f28093a, q4e0Var.f28093a) && this.b.equals(q4e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28093a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(selectorUiModelList=" + this.f28093a + ", appBarIconStyle=" + this.b + Separators.RPAREN;
    }
}
