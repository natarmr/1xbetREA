package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l9t0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19673a;
    public final jjm b;

    public l9t0(String str, jjm jjmVar) {
        str.getClass();
        this.f19673a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9t0)) {
            return false;
        }
        l9t0 l9t0Var = (l9t0) obj;
        return Intrinsics.d(this.f19673a, l9t0Var.f19673a) && this.b.equals(l9t0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f19673a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19673a.hashCode() * 31);
    }

    public final String toString() {
        return "UniversalChampHeaderUiModel(key=" + this.f19673a + ", dsModel=" + this.b + Separators.RPAREN;
    }
}
