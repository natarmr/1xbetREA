package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wpu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39560a;
    public final int b;
    public final String c;

    public wpu0(String str, int i, String str2) {
        str2.getClass();
        this.f39560a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpu0)) {
            return false;
        }
        wpu0 wpu0Var = (wpu0) obj;
        return this.f39560a.equals(wpu0Var.f39560a) && this.b == wpu0Var.b && Intrinsics.d(this.c, wpu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f39560a.hashCode() * 31, 31);
    }

    public final String toString() {
        return axq.n(kng0.p(this.b, "VirtualGameCategoryMainToolbarUiModel(backgroundImageUrl=", this.f39560a, ", placeholderUrl=", ", name="), this.c, Separators.RPAREN);
    }
}
