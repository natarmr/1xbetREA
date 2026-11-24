package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38835a;
    public final a4x b;

    public wam(i4 i4Var, a4x a4xVar) {
        i4Var.getClass();
        a4xVar.getClass();
        this.f38835a = i4Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wam)) {
            return false;
        }
        wam wamVar = (wam) obj;
        return Intrinsics.d(this.f38835a, wamVar.f38835a) && Intrinsics.d(this.b, wamVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38835a.hashCode() * 31);
    }

    public final String toString() {
        return "DsCyberSyntheticResultTableUiModel(labelColumns=" + this.f38835a + ", rows=" + this.b + Separators.RPAREN;
    }
}
