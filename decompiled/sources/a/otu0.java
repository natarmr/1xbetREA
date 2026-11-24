package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class otu0 implements rtu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final stu0 f25847a;

    public otu0(stu0 stu0Var) {
        stu0Var.getClass();
        this.f25847a = stu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof otu0) && Intrinsics.d(this.f25847a, ((otu0) obj).f25847a);
    }

    public final int hashCode() {
        return this.f25847a.hashCode();
    }

    public final String toString() {
        return "Content(uiModel=" + this.f25847a + Separators.RPAREN;
    }
}
