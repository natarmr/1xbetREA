package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oh00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ph00 f25242a;
    public final String b;

    public oh00(ph00 ph00Var, String str) {
        ph00Var.getClass();
        this.f25242a = ph00Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh00)) {
            return false;
        }
        oh00 oh00Var = (oh00) obj;
        return Intrinsics.d(this.f25242a, oh00Var.f25242a) && this.b.equals(oh00Var.b);
    }

    public final int hashCode() {
        this.f25242a.getClass();
        return this.b.hashCode() - 456898496;
    }

    public final String toString() {
        return "LiveAggregatorTipModel(screen=" + this.f25242a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
