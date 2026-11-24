package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23874a;
    public final hom0 b;

    public nom0(String str, hom0 hom0Var) {
        str.getClass();
        this.f23874a = str;
        this.b = hom0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nom0)) {
            return false;
        }
        nom0 nom0Var = (nom0) obj;
        return Intrinsics.d(this.f23874a, nom0Var.f23874a) && this.b == nom0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23874a.hashCode() * 31);
    }

    public final String toString() {
        return "StatusUiModel(text=" + this.f23874a + ", style=" + this.b + Separators.RPAREN;
    }
}
