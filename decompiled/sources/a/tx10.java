package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lok0 f34677a;

    public tx10(lok0 lok0Var) {
        lok0Var.getClass();
        this.f34677a = lok0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx10) && Intrinsics.d(this.f34677a, ((tx10) obj).f34677a);
    }

    public final int hashCode() {
        return this.f34677a.hashCode();
    }

    public final String toString() {
        return "MenuItemSpecialEventModel(model=" + this.f34677a + Separators.RPAREN;
    }
}
