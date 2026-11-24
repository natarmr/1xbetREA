package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fwe0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9q0 f10255a;

    public fwe0(l9q0 l9q0Var) {
        l9q0Var.getClass();
        this.f10255a = l9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwe0) && Intrinsics.d(this.f10255a, ((fwe0) obj).f10255a);
    }

    public final int hashCode() {
        return this.f10255a.hashCode();
    }

    public final String toString() {
        return "OnTextPickerFieldClick(textPickerFieldUiModel=" + this.f10255a + Separators.RPAREN;
    }
}
