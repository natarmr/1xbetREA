package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lk60 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f20185a;
    public final String b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public lk60(int i, int i2, String str) {
        str.getClass();
        this.f20185a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk60)) {
            return false;
        }
        lk60 lk60Var = (lk60) obj;
        return this.f20185a == lk60Var.f20185a && Intrinsics.d(this.b, lk60Var.b) && this.c == lk60Var.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Integer.hashCode(this.f20185a) * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return null;
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, vqd.r(this.f20185a, "OnboardingSectionsUiModel(sectionTypeId=", ", title=", this.b, ", imageResId="));
    }
}
