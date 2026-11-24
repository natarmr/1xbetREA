package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3608a;
    public final vf10 b;

    public c250(String str, vf10 vf10Var) {
        str.getClass();
        this.f3608a = str;
        this.b = vf10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c250)) {
            return false;
        }
        c250 c250Var = (c250) obj;
        return Intrinsics.d(this.f3608a, c250Var.f3608a) && this.b.equals(c250Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f3608a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3608a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyProgramAlternativeWidget(key=" + this.f3608a + ", model=" + this.b + Separators.RPAREN;
    }
}
