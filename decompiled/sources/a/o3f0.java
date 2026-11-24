package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o3f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9q0 f24582a;

    public o3f0(m9q0 m9q0Var) {
        m9q0Var.getClass();
        this.f24582a = m9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3f0) && Intrinsics.d(this.f24582a, ((o3f0) obj).f24582a);
    }

    public final int hashCode() {
        return this.f24582a.hashCode();
    }

    public final String toString() {
        return "OnTextPickerFieldClick(textPickerFieldUiModel=" + this.f24582a + Separators.RPAREN;
    }
}
