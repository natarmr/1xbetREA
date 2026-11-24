package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w12 f103a;

    public a22(w12 w12Var) {
        this.f103a = w12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a22) && Intrinsics.d(this.f103a, ((a22) obj).f103a);
    }

    public final int hashCode() {
        return this.f103a.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.f103a + Separators.RPAREN;
    }
}
