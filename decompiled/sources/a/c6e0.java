package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c6e0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3814a;
    public final ioh b;

    public c6e0(String str, ioh iohVar) {
        str.getClass();
        this.f3814a = str;
        this.b = iohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6e0)) {
            return false;
        }
        c6e0 c6e0Var = (c6e0) obj;
        return Intrinsics.d(this.f3814a, c6e0Var.f3814a) && this.b.equals(c6e0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f3814a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3814a.hashCode() * 31);
    }

    public final String toString() {
        return "RatingItemUiModel(key=" + this.f3814a + ", model=" + this.b + Separators.RPAREN;
    }
}
