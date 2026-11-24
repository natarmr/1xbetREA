package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u7v0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35205a;
    public final moh b;

    public u7v0(String str, moh mohVar) {
        str.getClass();
        this.f35205a = str;
        this.b = mohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7v0)) {
            return false;
        }
        u7v0 u7v0Var = (u7v0) obj;
        return Intrinsics.d(this.f35205a, u7v0Var.f35205a) && this.b.equals(u7v0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f35205a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35205a.hashCode() * 31);
    }

    public final String toString() {
        return "WeightClassRatingItemUiModel(key=" + this.f35205a + ", model=" + this.b + Separators.RPAREN;
    }
}
