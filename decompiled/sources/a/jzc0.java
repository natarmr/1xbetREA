package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17406a;
    public final gro0 b;

    public jzc0(String str, gro0 gro0Var) {
        str.getClass();
        this.f17406a = str;
        this.b = gro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzc0)) {
            return false;
        }
        jzc0 jzc0Var = (jzc0) obj;
        return Intrinsics.d(this.f17406a, jzc0Var.f17406a) && this.b.equals(jzc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17406a.hashCode() * 31);
    }

    public final String toString() {
        return "PromotionCardTagUiModel(tagText=" + this.f17406a + ", tagStyle=" + this.b + Separators.RPAREN;
    }
}
