package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k4m0 implements m4m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17677a;
    public final String b;
    public final float c;
    public final float d;

    public k4m0(String str, String str2, float f, float f2) {
        str.getClass();
        this.f17677a = str;
        this.b = str2;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4m0)) {
            return false;
        }
        k4m0 k4m0Var = (k4m0) obj;
        return Intrinsics.d(this.f17677a, k4m0Var.f17677a) && this.b.equals(k4m0Var.b) && ycl.b(this.c, k4m0Var.c) && ycl.b(this.d, k4m0Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(ua80.b(this.f17677a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        return ua80.m(b1j.n("TeamCellUiModel(teamName=", this.f17677a, ", teamIcon=", this.b, ", startImagePadding="), ycl.c(this.c), ", width=", ycl.c(this.d), Separators.RPAREN);
    }
}
