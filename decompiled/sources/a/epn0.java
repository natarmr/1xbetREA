package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class epn0 {
    public static final dpn0 Companion = new dpn0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8198a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final boolean f;

    public /* synthetic */ epn0(int i, int i2, long j, long j2, String str, String str2, boolean z) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, cpn0.f4757a.getDescriptor());
            throw null;
        }
        this.f8198a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public static epn0 a(epn0 epn0Var, boolean z) {
        int i = epn0Var.f8198a;
        String str = epn0Var.b;
        String str2 = epn0Var.c;
        long j = epn0Var.d;
        long j2 = epn0Var.e;
        epn0Var.getClass();
        str.getClass();
        str2.getClass();
        return new epn0(i, j, j2, str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epn0)) {
            return false;
        }
        epn0 epn0Var = (epn0) obj;
        return this.f8198a == epn0Var.f8198a && Intrinsics.d(this.b, epn0Var.b) && Intrinsics.d(this.c, epn0Var.c) && this.d == epn0Var.d && this.e == epn0Var.e && this.f == epn0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + rw2.b(rw2.b(ua80.b(ua80.b(Integer.hashCode(this.f8198a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f8198a, "SwipeXFilterChampModel(id=", ", name=", this.b, ", image=");
        defpackage.c.i(sbR, this.d, this.c, ", sportId=");
        kng0.A(sbR, ", subSportId=", this.e, ", selected=");
        return rw2.p(sbR, this.f, Separators.RPAREN);
    }

    public epn0(int i, long j, long j2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f8198a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = z;
    }
}
