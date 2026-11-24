package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ce80 implements ee80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f4199a;

    public ce80(i4 i4Var) {
        i4Var.getClass();
        this.f4199a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce80) && Intrinsics.d(this.f4199a, ((ce80) obj).f4199a);
    }

    public final int hashCode() {
        return this.f4199a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f4199a, "CheckBoxOutcomesChoiceUiModel(outcomeButtons=", Separators.RPAREN);
    }
}
