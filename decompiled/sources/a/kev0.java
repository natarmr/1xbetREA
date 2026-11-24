package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kev0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f18169a;
    public final String b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public kev0(int i, int i2, String str) {
        str.getClass();
        this.f18169a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kev0)) {
            return false;
        }
        kev0 kev0Var = (kev0) obj;
        return this.f18169a == kev0Var.f18169a && Intrinsics.d(this.b, kev0Var.b) && this.c == kev0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Integer.hashCode(this.f18169a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, vqd.r(this.f18169a, "WidgetSectionPreviewUiModel(type=", ", title=", this.b, ", image="));
    }
}
