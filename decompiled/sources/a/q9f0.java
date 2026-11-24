package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9q0 f28344a;

    public q9f0(k9q0 k9q0Var) {
        k9q0Var.getClass();
        this.f28344a = k9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9f0) && Intrinsics.d(this.f28344a, ((q9f0) obj).f28344a);
    }

    public final int hashCode() {
        return this.f28344a.hashCode();
    }

    public final String toString() {
        return "OnTextPickerFieldClick(textPickerFieldUiModel=" + this.f28344a + Separators.RPAREN;
    }
}
