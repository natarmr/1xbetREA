package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fao0 implements gao0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final en7 f9219a;

    public fao0(en7 en7Var) {
        en7Var.getClass();
        this.f9219a = en7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fao0) && Intrinsics.d(this.f9219a, ((fao0) obj).f9219a);
    }

    public final int hashCode() {
        return this.f9219a.hashCode();
    }

    public final String toString() {
        return "Visible(systemModel=" + this.f9219a + Separators.RPAREN;
    }
}
